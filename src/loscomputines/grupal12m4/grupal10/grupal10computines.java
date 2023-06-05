package loscomputines.grupal12m4.grupal10;
/**
 * en esta clase se utiliza para almacenar una capasita con dia, hora, lugar, duracion, nombre y nota
 * @version 01-06-2023
 * @author Sergio, Livio, Geneis, Nazaly
 * @var cantidadAsistentes, dia, nota, hora, lugar, duracion, i, scanner
 * **/
import java.util.Scanner;
public class grupal10computines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int cantidadAsistentes = 0,dia = 0, nota;
        String hora = null, lugar=null, duracion=null;

        System.out.println("Ingrese la cantidad de asistentes en la capacitación, por favor:");
        cantidadAsistentes = scanner.nextInt();

        String[][] matriz = new String[cantidadAsistentes][2];

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("Asistente " + (i + 1));

            // Ingresar datos de la capacitación
            do {
                System.out.println("Ingrese el día de la capacitación, por favor:");
                dia = scanner.nextInt();
            } while (dia <= 0);

            scanner.nextLine(); // Limpia el buffer

            System.out.println("Ingrese la Hora de la capacitación, por favor:");
            hora = scanner.nextLine();

            System.out.println("Ingrese el lugar de la capacitación, por favor:");
            lugar = scanner.nextLine();

            System.out.println("Ingrese la duración de la capacitación, por favor:");
            duracion = scanner.nextLine();

            // Ingresar datos del asistente y su calificación
            System.out.print("Ingrese el nombre del asistente: ");
            matriz[i][0] = scanner.nextLine();

            do {
                System.out.println("Ingrese la calificación del asistente (1-7):");
                System.out.println("Para ingresar una nota válida, use los valores enteros del 1 al 7.");
                nota = scanner.nextInt();
            } while (nota < 1 || nota > 7);

            scanner.nextLine(); // Limpia el buffer

            matriz[i][1] = String.valueOf(nota);
            System.out.println(); // Salto de línea

            // Mostrar datos de la capacitación y los asistentes
            System.out.println("Dia: " + dia);
            System.out.println("Hora: " + hora);
            System.out.println("Lugar: " + lugar);
            System.out.println("Duracion: " + duracion);
            System.out.println("Nombre: " + matriz[i][0]);
            System.out.println("Calificación: " + matriz[i][1]);
            System.out.println(); // Salto de línea
        }
    }
}
