package lossincodigo.tg12lossincodigo.grupal10;
import java.util.Scanner;

/**
 * @author Juan Merino
 * @version 1.0
 */
public class TG10_LSC {
    public static void main(String[] args) {
        /**
         * Solicita y almacena información sobre las capcitaciones.
         * Además, calcula promedio y nota más alta y más baja.
         * @param dia Variable que almacena el día de la cacapcitación.
         * @param hora Variable que almacena la hora de la capacitación.
         * @param lugar Variable que almacena el lugar de la capacitación.
         * @param duracion Variable que almacena la duración de la capacitación
         * @param cantidadAsistentes Variable numérica que almacena la cantidad de asistentes de la cap.
         * @param repetirCiclo Booleano que permite ingresar otra capacitación si usuario lo desea.
         * @param promedio Variable que almacena el promedio de las notas de los asistentes.
         * @param notaBaja Variable que almacena la nota más baja del curso.
         * @param notaAlta Variable que almacena la nota más alta del curso.
         */
        //Scanner
        Scanner sc = new Scanner(System.in);

        boolean repetirCiclo = false;
        do {
            // Variables
            String dia, hora, lugar, duracion;
            int cantidadAsistentes;

            // Entrada de información lineal
            System.out.println("Ingrese el día de la capacitación (ejemplo Martes): ");
            dia = sc.nextLine();
            System.out.println("Ingrese la hora de la capacitación (ejemplo 14:30): ");
            hora = sc.nextLine();
            System.out.println("Ingrese el lugar de la capacitación (ejemplo Sala 304): ");
            lugar = sc.nextLine();
            System.out.println("Ingrese la duración de la capacitación (minutos): ");
            duracion = sc.nextLine();
            System.out.println("Ingrese la cantidad de asistentes que tuvo la capacitación (sólo números): ");
            cantidadAsistentes = sc.nextInt();

            // Ciclo de ingreso de notas
            String[][] calificaciones = new String[cantidadAsistentes][2];
            double promedio = 0;
            int notaBaja = 7;
            int notaAlta = 1;
            for (String[] individuo : calificaciones) {
                System.out.println("Ingrese el nombre y la calificación separadas por un espacio (ejemplo: Juan 5)");
                individuo[0] = sc.next();
                int nota = sc.nextInt();
                individuo[1] = String.valueOf(nota);

                // suma las notas que van ingresando
                promedio = promedio + nota;
                // determina notas altas y bajas
                notaBaja = Math.min(notaBaja, nota);
                notaAlta = Math.max(notaAlta, nota);
            }

            // Divide la suma de las notas en la cantidad de notas o asistentes
            promedio = promedio / cantidadAsistentes;

            // Finalmente muestra en consola la información
            System.out.println("***** DATOS GUARDADOS *****");
            System.out.format("DÍA: %s   HORA: %s   LUGAR: %s   DURACIÓN: %smin.   N° ASISTENTES: %d%n", dia, hora, lugar, duracion, cantidadAsistentes);
            System.out.format("PROMEDIO: %.2f     NOTA MÁS BAJA: %d     NOTA MÁS ALTA: %d%n", promedio, notaBaja, notaAlta);

            //
            System.out.println("¿Deseas agregar una nueva capacitación? S/N");
            String repetir = sc.next();
            if (!repetir.isEmpty()) {
                if (repetir.equalsIgnoreCase("s")) {
                    repetirCiclo = true;
                }
            }
        } while (repetirCiclo);
    }
}