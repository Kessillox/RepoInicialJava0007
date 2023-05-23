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

    Scanner scan = new Scanner(System.in);

    public CapacitacionComputines() {
    }

    public CapacitacionComputines(int rut, String nombre, String direccion, String comuna, int numeroTelefono, String dia, String hora, String lugar, int duracion, Scanner scan) {
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
    }

    public void datosCapacitacion () {

        System.out.println("Ingrese rut");
        rut = scan.nextInt ();
        System.out.println("Ingrese Nombre");
        nombre = scan.nextLine ();
        System.out.println("Ingrese Direccion");
        direccion = scan.nextLine ();
        System.out.println("Ingrese  Comuna");
        comuna = scan.nextLine ();
        numeroTelefono = scan.nextInt ();

    }

    public void datosInstancia () {

        System.out.println("Ingrese dia capacitacion");
        dia = scan.nextLine ();
        System.out.println("Inrese Hora de capacutacion");
        hora = scan.nextLine();
        System.out.println("Ingrese nombre de lugar");
        lugar = scan.nextLine();
        System.out.println("Ingrese Duracion capacitacion en horas");
        duracion = scan.nextInt ();
    }




}
