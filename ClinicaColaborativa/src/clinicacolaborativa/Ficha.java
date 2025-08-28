
package clinicacolaborativa;


public class Ficha {
    private double estatura, peso;
    private DatosPersonales datos;
    private String tipoPrevision;

    public Ficha(double estatura, double peso, DatosPersonales datos, String tipoPrevision) {
        this.estatura = estatura;
        this.peso = peso;
        this.datos = datos;
        this.tipoPrevision = tipoPrevision;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public DatosPersonales getDatos() {
        return datos;
    }

    public String getTipoPrevision() {
        return tipoPrevision;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDatos(DatosPersonales datos) {
        this.datos = datos;
    }

    public void setTipoPrevision(String tipoPrevision) {
        this.tipoPrevision = tipoPrevision;
    }
    public double imc(){
        return peso / estatura * estatura;
    }
    public String estadoPaciente() {
        if(imc() >= 18.5 && imc() <= 25.0)
            return ("Normal");
        else if(imc() >= 25 && imc() < 30)
            return ("Sobrepeso");
        else if(imc() > 30)
            return ("Obeso");
        else
            return ("Delgadez");                        
    }
    public double metabolismoBasal(int edad){
        if(datos.getGenero().compareToIgnoreCase("masculino") == 0)
            return (peso * 10) + (6.25 * estatura * 100) - (5 * edad) + 5;
        else
            return (peso * 10) + (6.25 * estatura * 100) - (5 * edad) + 161;
    }
    public int valorConsulta(){
        if(tipoPrevision.compareToIgnoreCase("Isapre") == 0)
            return 2500;
        else if(tipoPrevision.compareToIgnoreCase("Fonasa") == 0)
            return 4500;
        else
            return 7500;
    }
    public double rebaja(){
        if(estadoPaciente().compareToIgnoreCase("Sobrepeso") == 0)
            return valorConsulta() * 0.30;
        else if(estadoPaciente().compareToIgnoreCase("Obeso") == 0)
            return valorConsulta() * 0.30;
        else
            return 0;
    }
    public double totalAPagar(){
        return valorConsulta() - rebaja();
    }

    @Override
    public String toString() {
        return "Estatura: " + estatura + "\nPeso: " + peso + "\nDatos personales: " + datos + "\nTipo prevision " + tipoPrevision + '}';
    }
    
}
