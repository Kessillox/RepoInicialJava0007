package losmarinesespaciales.grupales;
import java.util.Scanner;
public class Grupal_10_Marines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, dia, cantidadAsistentes, duracion, calificacion, suma;
        double promedio;
        String hora, lugar, nombre;

        do {
            System.out.println("----- Ejercicio Grupal 10 | Marines Espaciales -----\n");
            System.out.println("----- MENÚ -----\n");
            System.out.println("Sistema de Capacitaciones\n");
            System.out.println("Que operacion deseas realizar?\n");
            System.out.println("1. Registrar Capacitacion");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al registro de capacitaciones.\n");
                    System.out.println("Ingresa el dia de la capacitacion (Numero de dia)");
                    dia = scanner.nextInt();
                    System.out.println("Ingresa la hora de la capacitacion");
                    hora = scanner.next();
                    System.out.println("Ingresa el lugar donde se realizara la capacitacion");
                    lugar = scanner.next();
                    System.out.println("Ingresa la duracion de la capacitacion (En dias)");
                    duracion = scanner.nextInt();
                    System.out.println("Ingresa la cantidad de asistentes a la capacitacion");
                    cantidadAsistentes = scanner.nextInt();

                    String [][] arreglo = new String[cantidadAsistentes][2]; // Arreglo bidimensional: nombre, calificación
                    int [] calificaciones = new int[cantidadAsistentes]; // Arreglo de calificaciones

                    for(int i=0; i<cantidadAsistentes; i++) {
                        System.out.println("Ingrese su nombre:");
                        arreglo[i][0] = nombre=scanner.next();

                        calificacion=0;

                        while(calificacion <1 || calificacion >7) {

                            System.out.println("Ingrese su calificación al evento (1 a 7):");
                            calificacion=scanner.nextInt();
                            String calificacionString = Integer.toString(calificacion);
                            arreglo[i][1]=calificacionString;
                            calificaciones[i] = calificacion;

                        }

                    }
                    System.out.println("");
                    /*
                    * Inicicializo la variable suma en 0
                    *
                    * Recorro arreglo de las calificaciones de los asistentes
                    *
                    * Calculo promedio*/

                    suma = 0;
                    for (int i=0; i<cantidadAsistentes; i++) {

                        suma = suma + calificaciones[i];
                        //System.out.println(suma);
                    }

                    promedio = suma / cantidadAsistentes;

                    System.out.println("Los datos ingresados fueron los siguientes: ");
                    System.out.println("Dia de capacitacion: " + dia);
                    System.out.println("Hora de capacitacion: " + hora);
                    System.out.println("Lugar de capacitacion: " + lugar);
                    System.out.println("Duracion de capacitacion: " + duracion);
                    System.out.println("Cantidad de asistentes a la capacitacion: " + cantidadAsistentes);
                    System.out.println("El promedio de las notas asignadas es: " + promedio);


                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 2);

        scanner.close();
    }
}
