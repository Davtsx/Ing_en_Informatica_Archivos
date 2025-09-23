package ejemplogrimoriodigital;


public class Hechizo {
    private String nombreHechizo, tipoHechizo, codigoHechizo;
    private int nivelRequerido;

    public Hechizo(String nombreHechizo, String tipoHechizo, String codigoHechizo, int nivelRequerido) {
        this.nombreHechizo = nombreHechizo;
        this.tipoHechizo = tipoHechizo;
        this.codigoHechizo = codigoHechizo;
        this.nivelRequerido = nivelRequerido;
    }

    public Hechizo() {
    }

    public String getNombreHechizo() {
        return nombreHechizo;
    }

    public void setNombreHechizo(String nombreHechizo) {
        this.nombreHechizo = nombreHechizo;
    }

    public String getTipoHechizo() {
        return tipoHechizo;
    }

    public void setTipoHechizo(String tipoHechizo) {
        this.tipoHechizo = tipoHechizo;
    }

    public String getCodigoHechizo() {
        return codigoHechizo;
    }

    public void setCodigoHechizo(String codigoHechizo) {
        this.codigoHechizo = codigoHechizo;
    }

    public int getNivelRequerido() {
        return nivelRequerido;
    }

    public void setNivelRequerido(int nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }

    @Override
    public String toString() {
        return "Hechizo\n" + 
                "nombre = " + nombreHechizo + 
                "\ntipoHechizo = " + tipoHechizo + 
                "\ncodigoHechizo = " + codigoHechizo + 
                "\nnivelRequerido = " + nivelRequerido;
    }
    
}
