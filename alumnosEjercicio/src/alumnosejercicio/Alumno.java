
package alumnosejercicio;


public class Alumno {
    private String nombre;
    private double nota1, nota2, control1, control2, control3;

    public Alumno(String nombre, double nota1, double nota2, double control1, double control2, double control3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.control1 = control1;
        this.control2 = control2;
        this.control3 = control3;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getControl1() {
        return control1;
    }

    public double getControl2() {
        return control2;
    }

    public double getControl3() {
        return control3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setControl1(double control1) {
        this.control1 = control1;
    }

    public void setControl2(double control2) {
        this.control2 = control2;
    }

    public void setControl3(double control3) {
        this.control3 = control3;
    }
    public double promedioControles(){
        return (control1+control2+control3)/3;
    }
    public double notaPresentacion(){
        return (nota1 * 0.35 + nota2 * 0.4 + promedioControles() * 0.25);
    }
    public double notaFinal(double examen){
        return notaPresentacion() * 0.6 + examen * 0.4;
    }
    public String aprobacion(double ee){
        if(notaFinal(ee) >= 3.95)
            return "Aprobo la asignatura";
        else
            return "Reprobo la asignatura";
    }
}