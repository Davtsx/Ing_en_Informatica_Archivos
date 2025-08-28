
package ejercicioestudiantecolaborativa;


public class Estudiante {
    private double nota1, nota2, nota3;
    private DatosPersonales unDato;
    private String nomAsig;

    public Estudiante(double nota1, double nota2, double nota3, DatosPersonales unDato, String nomAsig) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.unDato = unDato;
        this.nomAsig = nomAsig;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public DatosPersonales getUnDato() {
        return unDato;
    }

    public String getNomAsig() {
        return nomAsig;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setUnDato(DatosPersonales unDato) {
        this.unDato = unDato;
    }

    public void setNomAsig(String nomAsig) {
        this.nomAsig = nomAsig;
    }
    public double notaPresentacion(){
        return nota1 * 0.35 + nota2 * 0.4 + nota3 * 0.25;
    }
    public double notaFinal(double examen){
        return notaPresentacion() * 0.6 + examen * 0.4;
    }
    public String situacion(double ee){
        if(notaFinal(ee) >= 3.95)
            return("Aprobo la asignatura "+nomAsig);
        else
            return("Reprobo la asignatura "+nomAsig);
    }

    @Override
    public String toString() {
        return "nota 1: " + nota1 + ", \nnota 2: " + nota2 + ", \nnota 3: " + nota3 + unDato.toString() + ", Asignatura: " + nomAsig + '}'; //tostring es una cadnea de caracteres
    }
    
}
