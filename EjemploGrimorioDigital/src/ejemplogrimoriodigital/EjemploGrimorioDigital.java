package ejemplogrimoriodigital;
import java.util.Scanner; // importo scanner

public class EjemploGrimorioDigital {

    
    public static void main(String[] args) {
        Scanner scannersc = new Scanner(System.in);
        
        int op = 0, nivelRequerido, posicion;
        String nombreGrimorio, nombreHechizo, tipoHechizo, codigoHechizo;
        Hechizo he;
        System.out.print("Ingrese el nombre del libro de hechizos: "); nombreGrimorio = scannersc.nextLine();
        // ANTES DEL MENU DEBO INSTANCIAR LA MANEJADORA
        GrimorioManejadora gri = new GrimorioManejadora(nombreGrimorio); // instanciada gri JAMAS sera null
        
        do {
            System.out.println("Menu del Grimorio Digital " +nombreGrimorio);
            System.out.println("1. Agregar un nuevo hechizo\n" +
                    "2. Mostrar un hechizo\n" +
                    "3. Contar Hechizo por nombre\n" +
                    "4. Mostrar todos los hechizos\n" +
                    "5. Contar hechizos por tipo\n" +
                    "6. Eliminar un hechizo\n" +
                    "7. Salir");
            System.out.print("Elija su opcion: "); op = scannersc.nextInt();
            scannersc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Creandoystem.out.print(\"Nombre hechizo: \"); no un hechizo, ingrese datos");
                    System.out.print("Nombre hechizo: "); nombreHechizo = scannersc.nextLine();
                    System.out.print("Codigo hechizo: "); codigoHechizo = scannersc.nextLine();
                    System.out.print("Tipo hechizo: "); tipoHechizo = scannersc.nextLine();
                    System.out.print("Nivel requerido: "); nivelRequerido = scannersc.nextInt();
                    he = new Hechizo(nombreHechizo, tipoHechizo, codigoHechizo, nivelRequerido);
                    // ahora debo mandar el objeto instanciado a la manejadora
                    System.out.println(gri.agregarHechizo(he));
                    break;
                    
                case 2:
                    System.out.print("Ingrese codigo de hechizo a buscar: "); codigoHechizo = scannersc.nextLine();
                    posicion = gri.buscarHechizo(codigoHechizo);
                    if(posicion == -1)
                        System.out.println("No existe el hechizo que busca");
                    else{
                        //metodo carretero
                        System.out.println("Mostrando datos");
                        System.out.println("Nombre del Hechizo: " +gri.getHh().get(posicion).getNombreHechizo());
                        System.out.println("Tipo del Hechizo:   " +gri.getHh().get(posicion).getTipoHechizo());
                        System.out.println("Codigo Hechizo:     " +gri.getHh().get(posicion).getCodigoHechizo());
                        System.out.println("Niverl Energia:     " +gri.getHh().get(posicion).getNivelRequerido());
                        System.out.println("\n"); 
                        // ahora lo muestro con el to string
                        System.out.println(gri.getHh().get(posicion).toString());
                    }
                    break;
                    
                case 3:
                    // contar hechizos por nombre
                    System.out.print("Ingrese el nombre del hechizo a contar: "); nombreHechizo = scannersc.nextLine();
                    System.out.println("El conteo total de hechizo con el nombre " +nombreHechizo+ " son " +gri.contarPorNombre(nombreHechizo));
                    break;
                
                case 4:
                    // mostrar todos los hechizos
                    for (int i = 0; i < gri.getHh().size(); i++) {
                        System.out.println((i+1)+ " " +gri.getHh().get(i).getNombreHechizo()); //
                    }
                    break;
                    
                case 5:
                    // contar hechizos por tipo
                    System.out.print("Ingrese el tipo de hechizo a contar: "); tipoHechizo = scannersc.nextLine();
                    System.out.println("El conteo total de hechizos de tipo " +tipoHechizo+ " son " +gri.contarPorTipoH(tipoHechizo));
                    break;
                
                case 6:
                    // Eliminar un hechizo
                    System.out.print("Ingrese el codigo del hechizo que desea eliminar: "); codigoHechizo = scannersc.nextLine();
                    System.out.println(gri.eliminarHechizo(codigoHechizo)); // desde gri (grimorio) llamo a eliminar hechizo y con el parametro eliminar hechizo
                    break;
                
            }
        } while (op != 7);
        scannersc.close(); // cierro scanner 
        
    }
    
}
