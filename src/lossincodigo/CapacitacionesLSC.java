package lossincodigo;

import java.util.Scanner;

public class CapacitacionesLSC {
    public static void  capacitacion(){
        Scanner sc = new Scanner(System.in);
        String id, rutEmpresa, nombreEmpresa, direccionEmpresa,comunaEmpresa, telefonoContactoE,
                nombreUsuarioCliente,runUsuarioCliente,dia,hora,lugar,duracion;
        int cantidadAsistentes,edades;
        System.out.println("Ingrese el nombre Empresa");
        nombreEmpresa= sc.next();
        System.out.println("Ingrese el dirección Empresa");
        direccionEmpresa = sc.next();
        System.out.println("Ingrese comuna Empresa");
        comunaEmpresa = sc.next();
        System.out.println("Ingrese telefono");
        telefonoContactoE = sc.next();
        System.out.println("Ingrese nombre de usuario");
        nombreUsuarioCliente = sc.next();
        System.out.println("Ingrese el run de usuario");
        runUsuarioCliente = sc.next();
        System.out.println("Ingrese el dia de la capacitacion: ");
        dia = sc.next();
        System.out.println("la hora capacitacion: ");
        lugar = sc.next();
        System.out.println("indique lugar de capacitacion: ");
        duracion = sc.next();
        System.out.println("Ingrese cantidad de asistentes: ");
        cantidadAsistentes = sc.nextInt();
        System.out.println("Ingrese la edad");
        edades = sc.nextInt();




    }
}
