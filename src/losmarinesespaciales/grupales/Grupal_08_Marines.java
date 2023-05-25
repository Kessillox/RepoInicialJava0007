package losmarinesespaciales.Grupales;

import java.util.Scanner;

public class Grupal_08_Marines {
    public static void main(String[] args) {
        String nombre, fecha_nacimiento, run;
        String direccion, telefono, cantidad_empleados;
        String anios_experiencia, departamento;
        String funcion, nombre_supervisor;
        String rut, nombreEmpresa;
        int perfil;

        Scanner entrada = new Scanner(System.in);
        System.out.println("******* Bienvenido ********");
        System.out.println();
        System.out.println("Ingrese su Nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su Fecha de Nacimiento:");
        fecha_nacimiento = entrada.nextLine();
        System.out.println("Ingrese su RUN:");
        run = entrada.nextLine();
        System.out.println("Ingrese su Perfil: 1- Cliente 2- Profesional 3- Administrativo");
        perfil = entrada.nextInt();


        switch (perfil) {
            case 1: {
                Scanner entrada1 = new Scanner(System.in);
                System.out.println("Ingrese su Dirección:");
                direccion = entrada1.nextLine();
                System.out.println("Ingrese su Teléfono:");
                telefono = entrada1.nextLine();
                System.out.println("Ingrese Cantidad de Empleados:");
                cantidad_empleados = entrada1.nextLine();
                System.out.println("Ingrese el RUT de la empresa");
                rut = entrada1.nextLine();
                System.out.println("Ingrese el nombre de la empresa");
                nombreEmpresa = entrada1.nextLine();

                System.out.println();
                System.out.println("******** SUS DATOS SON: ********");
                System.out.println("Perfil Cliente");
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de Nacimiento: " + fecha_nacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Dirección: " + direccion);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Cantidad de Empleados: " + cantidad_empleados);
                System.out.println("RUT de la empresa: " + rut);
                System.out.println("Nombre de la empresa: " + nombreEmpresa);


            }
            break;
            case 2: {
                Scanner entrada2 = new Scanner(System.in);
                System.out.println("Ingrese Años de Experiencia:");
                anios_experiencia = entrada2.nextLine();
                System.out.println("Ingrese Departamento:");
                departamento = entrada2.nextLine();

                System.out.println();
                System.out.println("******** SUS DATOS SON: ********");
                System.out.println("Perfil Profesional");
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de Nacimiento:" + fecha_nacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Años de Experiencia: " + anios_experiencia);
                System.out.println("Departamento: " + departamento);


            }
            break;
            case 3: {
                Scanner entrada3 = new Scanner(System.in);
                System.out.println("Ingrese su Función:");
                funcion = entrada3.nextLine();
                System.out.println("Ingrese el Nombre de Supervisor:");
                nombre_supervisor = entrada3.nextLine();

                System.out.println();
                System.out.println("******** SUS DATOS SON: ********");
                System.out.println("Perfil Administrativo");
                System.out.println("Nombre: " + nombre);
                System.out.println("Fecha de Nacimiento:" + fecha_nacimiento);
                System.out.println("RUN: " + run);
                System.out.println("Función: " + funcion);
                System.out.println("Nombre del Supervisor: " + nombre_supervisor);
            }

        }

    }
}
