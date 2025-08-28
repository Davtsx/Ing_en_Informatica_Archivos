
package ejercicioestudiantecolaborativa;


public class DatosPersonales {
    private String nombre, rut, genero;

    public DatosPersonales(String nombre, String rut, String genero) {
        this.nombre = nombre;
        this.rut = rut;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", \nrut: " + rut + ", \ngenero: " + genero + '}';
    }
    
}
