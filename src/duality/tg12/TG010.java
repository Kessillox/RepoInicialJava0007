package duality.tg12;
import java.util.Scanner;
/**
 * @autor Jonathan Gajardo, Valentin Urrea, Natalia Perez
 * @version 1.0
 * Clase TG10, contiene variables y el metodo main de invocacion
 * */
public class TG010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("= = = = DATOS DE LA CAPACITACIÓN = = = =");
        System.out.print("Ingresar día: ");
        String fechaRealizacion = sc.nextLine();

        System.out.print("Ingresar hora: ");
        String hora = sc.nextLine();

        System.out.print("Ingresar lugar: ");
        String lugar = sc.nextLine();

        System.out.println("Ingresar duración (En horas): ");
        float duracion = sc.nextFloat();

        System.out.println("Ingresar cantidad de asistenes: ");
        int asistentes = sc.nextInt();
        sc.nextLine();


        Object[][] calificaciones = new Object[asistentes][2];

        for (int i = 0; i < asistentes; i++) {
            for (int k = 0; k < 2; k++) {
                calificaciones[i][k] = 0;
            }
        }

        int totalCalificaciones = 0;
        int notaMasAlta = 0;
        int notaMasBaja = 7;
        for (int i = 0; i < asistentes; i++) {
            System.out.println(" = = = USUARIO N° " + (i + 1) + " = = =");
            for (int k = 0; k < 2; k++) {
                if (k  == 0) {
                    System.out.print("Nombre: ");
                    calificaciones[i][k] = sc.nextLine();
                } else {
                    while ((int) calificaciones[i][k] < 1 || (int) calificaciones[i][k] > 7) {
                        System.out.print("Calificación (1 - 7): ");
                        calificaciones[i][k] = sc.nextInt();
                        sc.nextLine();
                    }
                    totalCalificaciones += (int) calificaciones[i][k];
                    if ((int) calificaciones[i][k] > notaMasAlta) {
                        notaMasAlta = (int) calificaciones[i][k];
                    }
                    if ((int) calificaciones[i][k] < notaMasBaja) {
                        notaMasBaja = (int) calificaciones[i][k];
                    }
                }
            }

        }

        System.out.println("= = = = CAPACITACIÓN = = = =");
        System.out.println("Fecha de realización: " + fechaRealizacion);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar de realización: " + lugar);
        System.out.println("Duración (En horas): " + duracion);
        System.out.println("Cantidad de asistentes: " + asistentes);
        System.out.println("Promedio de notas: " + ((float) totalCalificaciones / (float) asistentes));
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);

    }

}
