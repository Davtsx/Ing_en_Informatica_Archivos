
package clinicacolaborativa;


public class DatosPersonales {
    private String nombre, genero;

    public DatosPersonales(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nGenero: " + genero + '}';
    }
    
}
