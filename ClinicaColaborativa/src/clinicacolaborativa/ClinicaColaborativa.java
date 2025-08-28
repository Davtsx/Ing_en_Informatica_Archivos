package clinicacolaborativa;
import java.util.Scanner;

public class ClinicaColaborativa {

    
    public static void main(String[] args) {
        Scanner intsc = new Scanner(System.in);
        Scanner stringsc = new Scanner(System.in);
        Scanner doublesc = new Scanner(System.in);
        
        int op = 0, edad;
        String nombre, genero, tipoPrevision;
        double estatura, peso;
        Ficha f = null;
        DatosPersonales dp = null;
        
        do {
            System.out.println("Clínica Olor a Clavel\n" +
        "1. Crear Paciente\n" +
        "2. Mostrar todos los datos\n" +
        "3. Estado del Paciente y su Metabolismo Basal\n" +
        "4. Total a pagar\n" +
        "5. Modificar el género del paciente (validar que no sea el mismo que tenía)\n" +
        "6. Salir");
            System.out.print("Ingrese su opcion: "); op = intsc.nextInt();
            switch (op) {
                case 1:
                    do {
                         System.out.print("Ingrese su nombre: "); nombre = stringsc.nextLine();
                         if(nombre.length() <4 )
                             System.out.println("El nombre debe tener al menos 4 caracteres");
                    } while (nombre.length() >=4); //si es mayor a 4 caracteres
                     do {
                        System.out.println("(femenino/masculino)\nIngrese su genero: "); genero = stringsc.nextLine();
                    } while (genero.compareToIgnoreCase("femenino") !=0 &&
                            genero.compareToIgnoreCase("masculino") !=0);
                     //ahora instancio datos personales
                    dp = new DatosPersonales(nombre, genero);
                    
                    System.out.print("Ingrese su edad: "); edad = intsc.nextInt();
                    System.out.print("Ingrese su estatura: "); estatura = doublesc.nextDouble();
                    System.out.println("Ingrese su peso en kg: "); peso = doublesc.nextDouble();
                    do {
                        System.out.println("Ingrese su tipo de prevision: "); tipoPrevision = stringsc.nextLine();
                    } while (tipoPrevision.compareToIgnoreCase("Isapre") !=0 &&
                            tipoPrevision.compareToIgnoreCase("Fonasa") !=0 &&
                            tipoPrevision.compareToIgnoreCase("Particular") !=0);
                    //ahora instancio la ficha
                    f = new Ficha(estatura, peso, dp, tipoPrevision);
                    break;
                case 2:
                    if(dp != null){
                        System.out.println(dp.toString());
                        System.out.println(f.toString());
                        break;
                    }
                case 3:
                    if(dp != null){
                        
                    }
                    
                
            }
        } while (op != 6);
        
    }
    
}
