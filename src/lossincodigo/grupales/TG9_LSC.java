package lossincodigo.grupales;
import java.util.Scanner;

public class TG9_LSC {
    private String rutEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoContacto;
    private String nombreUsuarioCliente;
    private String runUsuarioCliente;
    private String diaCapacitacion;
    private String horaCapacitacion;
    private String lugarCapacitacion;
    private int duracionCapacitacion;
    private int cantidadAsistentes;

    public void ingresarDatosCapacitacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUT de la empresa: ");
        rutEmpresa = scanner.nextLine();

        System.out.println("Ingrese el nombre de la empresa: ");
        nombreEmpresa = scanner.nextLine();

        System.out.println("Ingrese la dirección de la empresa: ");
        direccionEmpresa = scanner.nextLine();

        System.out.println("Ingrese el teléfono de contacto de la empresa: ");
        telefonoContacto = scanner.nextLine();

        System.out.println("Ingrese el nombre del usuario cliente: ");
        nombreUsuarioCliente = scanner.nextLine();

        System.out.println("Ingrese el RUN del usuario cliente: ");
        runUsuarioCliente = scanner.nextLine();

        System.out.println("Ingrese el día de la capacitación: ");
        diaCapacitacion = scanner.nextLine();

        // Validar la fecha ingresada
        while (!validarFecha(diaCapacitacion)) {
            System.out.println("Fecha ingresada no válida. Ingrese nuevamente (dd/mm/yyyy): ");
            diaCapacitacion = scanner.nextLine();
        }

        System.out.println("Ingrese la hora de la capacitación: ");
        horaCapacitacion = scanner.nextLine();

        System.out.println("Ingrese el lugar de la capacitación: ");
        lugarCapacitacion = scanner.nextLine();

        System.out.println("Ingrese la duración de la capacitación (en horas): ");
        duracionCapacitacion = scanner.nextInt();

        System.out.println("Ingrese la cantidad de asistentes: ");
        cantidadAsistentes = scanner.nextInt();

        while (cantidadAsistentes <= 0) {
            System.out.println("La cantidad de asistentes debe ser mayor que cero. Ingrese nuevamente: ");
            cantidadAsistentes = scanner.nextInt();
        }
    }

    public void ingresarDatosAsistentes() {
        Scanner scanner = new Scanner(System.in);

        int contadorMenores25 = 0;
        int contador26a35 = 0;
        int contadorMayores35 = 0;

        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("Ingrese el nombre del asistente " + (i + 1) + ": ");
            String nombreAsistente = scanner.nextLine();

            System.out.println("Ingrese la edad del asistente " + (i + 1) + ": ");
            String edadAsistenteString = scanner.nextLine();

            // Validar que la edad sea un número
            while (!esNumero(edadAsistenteString)) {
                System.out.println("Edad ingresada no válida. Ingrese nuevamente: ");
                edadAsistenteString = scanner.nextLine();
            }

            int edadAsistente = Integer.parseInt(edadAsistenteString);

            if (edadAsistente < 25) {
                contadorMenores25++;
            } else if (edadAsistente >= 26 && edadAsistente <= 35) {
                contador26a35++;
            } else {
                contadorMayores35++;
            }
        }

        System.out.println("Cantidad de personas menores a 25 años: " + contadorMenores25);
        System.out.println("Cantidad de personas entre 26 y 35 años: " + contador26a35);
        System.out.println("Cantidad de personas mayores a 35 años: " + contadorMayores35);
    }

    public void mostrarDatosCapacitacion() {
        System.out.println("Datos de la empresa:");
        System.out.println("RUT: " + rutEmpresa);
        System.out.println("Nombre: " + nombreEmpresa);
        System.out.println("Dirección: " + direccionEmpresa);
        System.out.println("Teléfono de contacto: " + telefonoContacto);
        System.out.println("Nombre del usuario cliente: " + nombreUsuarioCliente);
        System.out.println("RUN del usuario cliente: " + runUsuarioCliente);

        System.out.println("Datos de la capacitación:");
        System.out.println("Día: " + diaCapacitacion);
        System.out.println("Hora: " + horaCapacitacion);
        System.out.println("Lugar: " + lugarCapacitacion);
        System.out.println("Duración: " + duracionCapacitacion + " horas");
        System.out.println("Cantidad de asistentes: " + cantidadAsistentes);
    }

    private boolean validarFecha(String fecha) {
        try {
            String[] partesFecha = fecha.split("/");
            int dia = Integer.parseInt(partesFecha[0]);
            int mes = Integer.parseInt(partesFecha[1]);
            int anio = Integer.parseInt(partesFecha[2]);

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    private boolean esNumero(String valor) {
        try {
            Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TG9_LSC programa = new TG9_LSC();

        programa.ingresarDatosCapacitacion();
        programa.ingresarDatosAsistentes();
        programa.mostrarDatosCapacitacion();
    }
}