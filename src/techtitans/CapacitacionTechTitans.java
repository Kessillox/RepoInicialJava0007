package techtitans;
import java.util.Scanner;
import java.lang.System;

public class CapacitacionTechTitans {

    public static void main(String[] args) {



        Scanner leer = new Scanner(System.in);


        System.out.println("ingrese id");
        int id = leer.nextInt();
        System.out.println("ingrese rut");
        String rut = leer.nextLine();
        System.out.println("ingrese nombre de la empresa");
        String nombreEmpresa = leer.nextLine();
        System.out.println("ingrese la direccion");
        String direccion = leer.nextLine();
        System.out.println("ingrese telefono");
        int telefono = leer.nextInt();
        System.out.println("Ingrese nombre de usuario");
        String nombreUsuario = leer.nextLine();
        System.out.println("ingrese run");
        String run = leer.nextLine();
        System.out.println("ingrese dia");
        String dia = leer.nextLine();
        System.out.println("hora");
        String hora = leer.nextLine();
        System.out.println("ingrese lugar");
        String lugar = leer.nextLine();
        System.out.println("duracion");
        String duracion = leer.nextLine();
        System.out.println("ingrese numero de asistentes");
        int asistentes = leer.nextInt();

        int[ ] nombreAsistentes = new int[asistentes];
        if( asistentes >0){
           for(int i=0; i<=asistentes; i++) {
               System.out.println("Ingrese nombre de asistente");
               String nombreAsistente = leer.next();

               System.out.println("ingrese edad");
               int edadAsistente = leer.nextInt();
             }
           }else{
               System.out.println("debe ingresar un numero de asistente Valido");
        }


        System.out.println("Los datos de la empresa son los siguientes: "+id+","+nombreEmpresa+","+direccion+","+telefono+","+nombreUsuario+","+run);
        System.out.println("Los datos de la capacitacion: "+dia+","+hora+","+lugar+","+duracion+","+asistentes);
        System.out.println("");


    }


}
