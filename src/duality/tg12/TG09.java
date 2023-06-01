package duality.tg12;
import java.util.Scanner;
/**
 * @autor Jonathan Gajardo, Valentin Urrea, Natalia Perez
 * @version 1.0
 * @see https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
 * Clase TG09, contiene variables y el metodo main de invocacion
* */
public class TG09 {
    /**
     * @var id
     * @var rut
     * @var nombreEmpresa
     * @var direccion
     * @var telefono
     * @var nombreUsuario
     * @var run
     * @var fecha
     * @var hora
     * @var lugar
     * @var duracionHoras
     * @var cantidadAsistentes
     * @var edad
     * Variables pedidas por consola al usuario, para su posterior utilizacion en el programa. Con los datos
     * ingresados se realizan operaciones las que luego seran imprimidas por pantalla.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("= = = = DATOS DEL CLIENTE = = = =");

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("RUT de la empresa: ");
        String rut = sc.nextLine();

        System.out.print("Nombre de la empresa: ");
        String nombreEmpresa = sc.nextLine();

        System.out.print("Dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Teléfono de contacto: ");
        String telefono = sc.nextLine();

        System.out.print("Nombre del usuario: ");
        String nombreUsuario = sc.nextLine();

        System.out.print("RUN del usuario: ");
        String run = sc.nextLine();


        System.out.println("= = = = DATOS DE LA CAPACITACIÓN = = = =");

        System.out.print("Fecha de realización: ");
        String fecha = sc.nextLine();

        System.out.print("Hora: ");
        String hora = sc.nextLine();

        System.out.print("Lugar: ");
        String lugar = sc.nextLine();

        System.out.print("Duracion (En horas): ");
        int duracionHoras = sc.nextInt();

        System.out.print("Cantidad de asistentes: ");
        int cantidadAsistentes = sc.nextInt();
        sc.nextLine();


        int grupo1 = 0, grupo2 = 0, grupo3 = 0;
        System.out.println("= = = = DATOS DE LOS ASISTENTES = = = =");

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println(" = = = USUARIO N° " + (i + 1) + " = = =");

            System.out.print("Nombre: ");
            sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            if (edad < 25) {
                grupo1 += 1;
            } else if (edad >= 26 && edad <= 35) {
                grupo2 += 1;
            } else {
                grupo3 += 1;
            }
        }

        System.out.println("= = = = CLIENTE = = = =");
        System.out.println("ID: " + id);
        System.out.println("RUT de la empresa: " + rut);
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Nombre del usuario: " + nombreUsuario);
        System.out.println("RUN del usuario: " + run);


        System.out.println("= = = = CAPACITACIÓN = = = =");
        System.out.println("Fecha de realización: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar de realización: " + lugar);
        System.out.println("Duración (En horas): " + duracionHoras);
        System.out.println("Cantidad de asistentes: " + cantidadAsistentes);


        System.out.println("= = = = ASISTENTES = = = =");
        System.out.println("Menores de 25: " + grupo1);
        System.out.println("Mayores de 25 y menores de 35: " + grupo2);
        System.out.println("Mayores de 35: " + grupo3);
    }

}
