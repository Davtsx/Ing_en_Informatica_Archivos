package ejercicioestudiantecolaborativa;
import java.util.Scanner;

public class EjercicioEstudianteColaborativa {

    
    public static void main(String[] args) {
        Scanner intsc = new Scanner(System.in);
        Scanner doublesc = new Scanner(System.in);
        Scanner stringsc = new Scanner(System.in);
        
        int op = 0;
        String nombre, rut, genero, asignatura;
        double nota1, nota2, nota3, examen;
        DatosPersonales d = null;
        Estudiante es = null;
       
        do {
            System.out.println("Estudiante\n" +
                "1. Crear estudiante\n" +
                "2. Mostrar toda la información del del estudiante (nombre, rut, género y notas)\n" +
                "3. Modificar el nombre de la asignatura, verificando que no sea el mismo nombre que tenía antes.\n" +
                "4. Modificar la nota3.\n" +
                "5. Nota final.\n" +
                "6. Aprobación.\n" +
                "7. Salir");
            System.out.println("Elija su opcion: "); op = intsc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Creando un estudiante, ingrese datos");
                    System.out.print("Nombre: "); nombre = stringsc.nextLine();
                    System.out.print("Rut: "); rut = stringsc.nextLine();
                    do {
                        System.out.println("Genero: (femenino/masculino) "); genero = stringsc.nextLine();
                    } while (genero.compareToIgnoreCase("femenino") !=0 && // compareToIgnoreCase compara la variable sin importar las mayusculas o minusculas, solo con la palabra
                            genero.compareToIgnoreCase("masculino") !=0);  // la comparo con 0 pq si son igual a femenino o masculino me dara 0
                    //ahora instancio datos personales 
                    d = new DatosPersonales(nombre, rut, genero);
                    //ahora pido datos del estudiante
                    System.out.print("Nombre asignatura: "); asignatura = stringsc.nextLine();
                    System.out.print("Nota 1: "); nota1 = doublesc.nextDouble();
                    System.out.print("Nota 2: "); nota2 = doublesc.nextDouble();
                    System.out.print("Nota 3: "); nota3 = doublesc.nextDouble();
                    //ahora instancio estudiantes iwiqwi awawa uwawa no¿¿¿¿¿¿
                    es = new Estudiante(nota1, nota2, nota3, d, asignatura);
                    System.out.println("Estudiante creado");
                    break;
                case 2:
                    if(es != null){
                        System.out.println(es.toString()); //muestra los datos que hay en el toString de la clase estudiantes
                    }
                    else
                        System.out.println("Debe crear antes el estudiante");
                    break;
                case 3:
                    if(es != null){
                        do {
                            System.out.println("Asignele un nuevo nombre a la asignatura"); asignatura = stringsc.nextLine();
                        } while (asignatura.compareToIgnoreCase(asignatura) != 0);
                        es.setNomAsig(asignatura);
                        System.out.println("El nuevo nombre de la asignatura es: "+es.getNomAsig());
                        break;
                    }
                    else
                        System.out.println("Debe crear antes el estudiante");
                    break;
                case 4:
                    if(es != null){
                        System.out.print("Ingrese la nueva nota de la prueba 3: "); nota2 = doublesc.nextDouble();
                        es.setNota2(nota2);
                        System.out.print("La nota de la prueba 3 acutalizada es "+es.getNota2());
                    }
                    else
                        System.out.println("Debe crear antes el estudiante");
                    break;
                case 5:
                    if(es != null){
                        System.out.print("Ingrese nota del examen: "); examen = doublesc.nextDouble();
                        System.out.println("Su nota final es: "+es.notaFinal(examen));
                    }
                    else
                        System.out.println("Debe crear antes el estudiante");
                    break;
                case 6:
                    if(es != null){
                        System.out.print("Vuelva a ingresar la nota del examen: "); examen = doublesc.nextDouble();
                        System.out.println(es.situacion(examen));
                    }
                    else
                        System.out.println("Debe crear antes el estudiante");
                    break;
            }
        } while (op != 7);
        
    }
    
}
