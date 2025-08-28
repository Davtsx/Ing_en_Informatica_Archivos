package cerdoejercicio;


public class Cerdo {
    private String nombre;
    private double peso, felicidad;

    public Cerdo() {
    }

    public Cerdo(String nombre, double peso, double felicidad) {
        this.nombre = nombre;
        this.peso = peso;
        this.felicidad = felicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(double felicidad) {
        this.felicidad = felicidad;
    }
    
    public void jugar(){
        felicidad = felicidad * 1.15;
        peso = peso * 0.95;
    }
    public double premio(int puntoFelicidad){
        peso = peso * 0.5;
        felicidad = 0;
        return 0.5 * puntoFelicidad;
    }
    public void ficha(){
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("    Cerdo: "+nombre);
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("Peso:               "+peso);
        System.out.println("Nivel de felicidad  "+felicidad);     
    }
    public double faenar(double porcentajeFaenar){ //llamo el peso porque depende del porcentaje del peso cuanto sobrara para faenar
        return peso * (porcentajeFaenar/100);
    }
}