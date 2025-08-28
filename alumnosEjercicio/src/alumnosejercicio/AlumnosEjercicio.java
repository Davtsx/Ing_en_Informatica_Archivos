package alumnosejercicio;
import java.util.Scanner;

public class AlumnosEjercicio {

    public static void main(String[] args) {
        Scanner intsc = new Scanner(System.in);
        Scanner stringsc = new Scanner(System.in);
        Scanner doublesc = new Scanner(System.in);
        
        int op = 0;
        String nom;
        double nota1, nota2, control1, control2 , control3, promControles, notaFinal, examen;
        Alumno al = null; 
        
        do {
            System.out.println("Alumnos\n" +
            "1. Crear alumno\n" +
            "2. Mostrar toda la información del alumno (nombre y notas de pruebas y controles)\n" +
            "3. Modificar la nota de la prueba 2, mostrando la nueva nota\n" +
            "4. Promedio de controles\n" +
            "5. Nota final y si aprobó o no la asignatura\n" +
            "6. Salir");
            System.out.print("Elija su opcion: "); op = intsc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Creando un alumno"); 
                    System.out.print("Ingrese nombre: "); nom = stringsc.nextLine();
                    System.out.print("Ingrese nota 1: "); nota1 = doublesc.nextDouble();
                    System.out.print("Ingrese nota 2: "); nota2 = doublesc.nextDouble();
                    System.out.print("Ingrese control 1: "); control1 = doublesc.nextDouble();
                    System.out.print("Ingrese control 2: "); control2 = doublesc.nextDouble();
                    System.out.print("Ingrese control 3: "); control3 = doublesc.nextDouble();
                    //ahora vamos a instanciasr all alumno
                    al = new Alumno(nom, nota1, nota2, control1, control2, control3);
                    System.out.println("Alumno creado");
                    break;
                    
                case 2:
                    if(al!=null){
                        System.out.print("Mostrando datos del alumno");
                        System.out.println("Nombre:               "+al.getNombre()); //get me recibe y/o busca los datos
                        System.out.println("Nota 1:               "+al.getNota1());
                        System.out.println("Nota 2:               "+al.getNota2());
                        System.out.println("Contro l:             "+al.getControl1());
                        System.out.println("Control 2:            "+al.getControl2());
                        System.out.println("Control 3:            "+al.getControl3());
                    }
                    else {
                        System.out.print("Debe crear antes al alumno");
                    }
                    break;
                
                case 3:
                    if(al!=null){
                        System.out.print("Ingrese la nueva nota de la prueba 2: "); nota2 = doublesc.nextDouble();
                        al.setNota2(nota2);
                        System.out.print("La nota de la prueba 2 acutalizada es "+al.getNota2());
                        break;
                    }
                    
                case 4:
                    if(al != null){
                        promControles = al.promedioControles();
                        System.out.print("El promedio de los controles 1,2 y 3 es: "+promControles); //Opcion 1 de como mostrarla creando una variable
                        System.out.print("proemedio: "+al.promedioControles()); //Opcion 2 de como mostrarla llamando al metodo
                    }
                case 5:
                    if(al!=null){
                        System.out.print("Ingrese la nota del examen: "); examen = doublesc.nextDouble();
                        notaFinal = al.notaFinal(examen);
                        System.out.println("La nota del exmaen es: "+examen);
                        System.out.println("El alumno "+al.aprobacion(examen)+" con un "+examen);  
                    }
            }
            
        } while (op!=6);
        
    }    
}