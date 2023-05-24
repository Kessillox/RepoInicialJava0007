package loscomputines.trabajo8grupal;

import java.util.Scanner;
public class CapacitacionComputines {


    //Datos capacitacion
    int rut;
    String nombre;
    String direccion;
    String comuna;
    int numeroTelefono;


    //Datos Instancia
    String dia;
    String hora;
    String lugar;
    int duracion;
    int asistenteCantidad;


    Scanner scan = new Scanner(System.in);

    public CapacitacionComputines() {
    }

    public CapacitacionComputines(int rut, String nombre, String direccion, String comuna, int numeroTelefono, String dia, String hora, String lugar, int duracion, Scanner scan, int asistenteCantidad) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        this.numeroTelefono = numeroTelefono;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.scan = scan;
        this.asistenteCantidad = asistenteCantidad;
    }

    public void datosCapacitacion () {


        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("=== INGRESE DATOS DE LA EMPRESA ====");
        System.out.println("Ingrese rut: ");
        rut = scan.nextInt (); scan.nextLine ();
        System.out.println("Ingrese Nombre: ");
        nombre = scan.nextLine ();
        System.out.println("Ingrese Direccion: ");
        direccion = scan.nextLine ();
        System.out.println("Ingrese  Comuna: ");
        comuna = scan.nextLine ();
        System.out.print("Número de teléfono: ");
        numeroTelefono = scan.nextInt ();
        System.out.println("=========================");
        System.out.println("=== DATOS GUARDADOS ===");
        System.out.println("=========================");

    }




    public void datosInstancia () {

        System.out.println("Ingrese dia capacitacion");
        dia = scan.nextLine (); scan.nextLine ();
        System.out.println("Inrese Hora de capacutacion");
        hora = scan.nextLine();
        System.out.println("Ingrese nombre de lugar");
        lugar = scan.nextLine();
        System.out.println("Ingrese Duracion capacitacion en horas");
        duracion = scan.nextInt ();
        System.out.println("Ingrese Cantidad Asistente");
        asistenteCantidad = scan.nextInt();

        //pude salir del bucle, pero no puedo hacer que el DO WHILE me repita hasta que sea mayor a 0
        if (asistenteCantidad <= 0){
            do {
                System.out.println("Numero de cantidad de asistente invalida, por favor ingrese numero valido");
                asistenteCantidad = scan.nextInt();
            }while (asistenteCantidad > 0);
        };



        /*while (asistenteCantidad <= 0)
            System.out.println("Deser ser mayor que cero la cantidad de los asistentes. Ingrese nuevamente: ");
            asistenteCantidad = scan.nextInt(); scan.nextLine();*/


    }


    public void muestraDatos (){

        // Mostrar resultados
        System.out.println("Datos de la empresa:");
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
        System.out.println("Número de teléfono: " + numeroTelefono);

        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("Cantidad de asistentes: " + asistenteCantidad);





    }

    @Override
    public String toString() {
        return "CapacitacionComputines{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", asistenteCantidad=" + asistenteCantidad +
                ", scan=" + scan +
                '}';
    }
}
