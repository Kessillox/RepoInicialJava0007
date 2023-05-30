package loscomputines.grupal10m4;

import java.util.Scanner;
public class grupal10computines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
        int dia, hora, duracion, cantidadAsistente, contador=0;
        String lugar="";

        //Pidiendo datos
       /* do {
            System.out.println("Ingrese dia de capasitacion por favor ");
            dia = scanner.nextInt();
        }while (dia <= 0);

        //Problema, al poner por ejemplo 18:00 los : dan error
        do {
            System.out.println("Ingrese la Hora de la capacitacion, por favor");
            hora = scanner.nextInt();
        }while (hora<=0);

        do {
            System.out.println("Ingrese el lugar de la capacitacion, por favor");
            lugar=scanner.next();
        }while (lugar == "");

        do {
            System.out.println("Ingrese la duracion de la capasitacion, por favor");
            duracion=scanner.nextInt();
        }while (duracion<=0);*/

        do {
            System.out.println("Ingrese cantidad de asistentes en la capasitacion, por favor");
            //Pidiendo el numero de asistente
            cantidadAsistente=scanner.nextInt();

            //Creando Array para almacenar los nombres de los asistentes
            String [] nombreAsistente = new String[cantidadAsistente];
            scanner.nextLine();//limpia el scanner

            //Recorrriendo el Array
            for (int f = 0; f < cantidadAsistente; f++){
                System.out.print("Ingrese el nombre del asistente y nota " + (f + 1) + ": ");
                String nombreIngresado = scanner.nextLine();
                nombreAsistente[f]=nombreIngresado;
            }

            //Mostrando el array
            for (int f = 0; f < cantidadAsistente; f++){
                System.out.println();
                System.out.println("Nombres de los asistentes");
                System.out.println();
                System.out.println(nombreAsistente[f]);
            }
        }while (cantidadAsistente<=0);
    }

}
