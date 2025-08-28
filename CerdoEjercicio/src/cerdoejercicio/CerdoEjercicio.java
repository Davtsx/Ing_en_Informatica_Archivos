package cerdoejercicio;
import java.util.Scanner;

public class CerdoEjercicio {

    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        
        String nombre;
        double peso, felicidad, nuevaFelicidad, faenarCarne;
        int puntos;
       
        System.out.println("Cerdo 1");
        System.out.println("---------------------------------");
        System.out.print("Ingresar el nombre del cerdo: ");
        nombre = scString.nextLine();
        System.out.print("Ingrese el peso: ");
        peso = scDouble.nextDouble();
        System.out.print("Ingrese el pocentaje de felicidad: ");
        felicidad = scDouble.nextDouble();
        
        Cerdo cerdo1 = new Cerdo (nombre, peso, felicidad);
        
        System.out.print("Ingresar el nombre del segundo nombre: ");
        nombre = scString.nextLine();
        System.out.print("Ingrese el peso del segundo cerdo: ");
        peso = scDouble.nextDouble();
        System.out.print("Ingrese la felicidad del cerdo 2: ");
        felicidad = scDouble.nextDouble();
        
        Cerdo cerdo2 = new Cerdo (nombre, peso, felicidad); 
        
        cerdo1.ficha(); //mostrar la ficha del primer cerdo
        cerdo2.ficha(); //mostrar la ficha del segundo cerdo
       
        cerdo1.jugar(); //jugamos con le primer cerdo
        
        //Modificar felicidad del segundo cerdo
        System.out.print("Ingrese la nueva felicidad del cerdo 2: ");
        nuevaFelicidad = scDouble.nextDouble(); //meto la nueva felicidad del cerdo en esta variable
        cerdo2.setFelicidad(nuevaFelicidad); //reemplazo la felicidad del cerdo 
        
        //premiar al primer cerdo y mostrar la cantidad de peso ganado
        System.out.print("Ingrese el nuevo nivel de felicidad cerdo 1: ");
        nuevaFelicidad = scDouble.nextDouble();
        cerdo2.setFelicidad(nuevaFelicidad); //le agrego la felicidad solicitada arriba
        System.out.println("Ingrese los puntos con los que premiara al cerdo 1: ");
        puntos = scDouble.nextInt(); //ingreso los puntos en la variable "puntos"
        System.out.println("El peso que ha ganado el cerdo es: "+cerdo1.premio(puntos)); 
        
        //faenar cerdo 2
        System.out.println("Ingrese el porcentaje de carne que quiere del cerdo 2: "); //pido el porcentaje a faenar
        faenarCarne = scDouble.nextDouble();
        System.out.println("La cantidad de carne faenada del cerdo 2 es de: "+cerdo2.faenar(faenarCarne)); //muestro el porcentaje faenado del cerdo 2
        
        //mostrar ambas fichas para ver los cambios
        cerdo1.ficha();
        cerdo2.ficha();     
    }
}