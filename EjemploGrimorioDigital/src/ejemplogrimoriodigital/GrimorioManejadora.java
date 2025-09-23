package ejemplogrimoriodigital;
import java.util.ArrayList; // Importo ArrayList


public class GrimorioManejadora {
    private String nombreGrimorio;
    private ArrayList<Hechizo> hh = new ArrayList<Hechizo>(); // ya esta instanciado aqui por eso no sale en el constructor

    public GrimorioManejadora(String nombreGrimorio) {
        this.nombreGrimorio = nombreGrimorio;
    }

    public GrimorioManejadora() {
    }

    public String getNombreGrimorio() {
        return nombreGrimorio;
    }

    public void setNombreGrimorio(String nombreGrimorio) {
        this.nombreGrimorio = nombreGrimorio;
    }

    public ArrayList<Hechizo> getHh() {
        return hh;
    }

    public void setHh(ArrayList<Hechizo> hh) {
        this.hh = hh;
    }
    
    public int buscarHechizo(String codigo){
        for (int i = 0; i < hh.size(); i++) { // size para el tamaño de lo que haya en hh
            if(hh.get(i).getCodigoHechizo().compareToIgnoreCase(codigo) == 0)
                return i;
        }
        return -1; // si me retorna -1 significa que no encontro nada
    }
    
    public String agregarHechizo(Hechizo h){ // manejara la clase Hechizo y es string porque mandara un mensaje si se agrego el hechizo
        if(buscarHechizo(h.getCodigoHechizo()) == -1){ // si no encontro el CodigoHechizo agreagare con add el codigo agregado
            hh.add(h);
            return "Hechizo agregado con exito";
        }
        return "Ya existe el codigo ingresado, imposible agregar hechizo";
    }
    
    public String eliminarHechizo(String codigo){
        int posicion = buscarHechizo(codigo); // creo variable posicion dentro del codigo
        if(posicion == -1)
            return "No existe el hechizo que busca, es imposible eliminarlo\n";
        else{
            hh.remove(posicion);// remove lo elimina
            return "Hechizo eliminado\n";
        }
    }
    
    // metodo que cuenta cuantos hechizos tienen un nombre X
    public int contarPorNombre(String nombre){
        int contador = 0; // defino variable contador dentro del codigo
        for (int i = 0; i < hh.size(); i++) {
            if (hh.get(i).getNombreHechizo().compareToIgnoreCase(nombre) == 0)
                contador ++;
        }
        return contador;
    }
    
    // contado por tipo Hechizo
    public int contarPorTipoH(String tipoH){
        int contador = 0;
        for (int i = 0; i < hh.size(); i++) {
            if(hh.get(i).getTipoHechizo().compareToIgnoreCase(tipoH) == 0)
                contador ++;
        }
        return contador;
    }
}
