package losmarinesespaciales.Grupales;
import java.util.Scanner;
public class Grupal_10_Marines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, dia, cantidadAsistentes, duracion;
        String hora, lugar;

        do {
            System.out.println("----- Ejercicio Grupal 10 | Marines Espaciales -----\n");
            System.out.println("----- MENÚ -----\n");
            System.out.println("Sistema de Capacitaciones\n");
            System.out.println("Que operacion deseas realizar?\n");
            System.out.println("1. Registrar Capacitacion");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al registro de capacitaciones.\n");
                    System.out.println("Ingresa el dia de la capacitacion (Numero de dia)");
                    dia = scanner.nextInt();
                    System.out.println("Ingresa la hora de la capacitacion");
                    hora = scanner.nextLine();
                    System.out.println("Ingresa el lugar donde se realizara la capacitacion");
                    lugar = scanner.nextLine();
                    System.out.println("Ingresa la duracion de la capacitacion (En dias)");
                    duracion = scanner.nextInt();
                    System.out.println("Ingresa la cantidad de asistentes a la capacitacion");
                    cantidadAsistentes = scanner.nextInt();
                    System.out.println("Datos registrados correctamente!");
                    System.out.println("Los datos ingresados fueron los siguientes: ");
                    System.out.println("Dia de capacitacion: " + dia);
                    System.out.println("Hora de capacitacion: " + hora);
                    System.out.println("Lugar de capacitacion: " + lugar);
                    System.out.println("Duracion de capacitacion: " + duracion);
                    System.out.println("Cantidad de asistentes a la capacitacion: " + cantidadAsistentes);


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
