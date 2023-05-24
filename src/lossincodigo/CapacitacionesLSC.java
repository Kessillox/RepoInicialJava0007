package lossincodigo;

import java.util.Scanner;

public class CapacitacionesLSC {
    public static void capacitacion(){
        Scanner sc = new Scanner(System.in);
        String  rutEmpresa, nombreEmpresa, direccionEmpresa,comunaEmpresa, telefonoContactoE,
                nombreUsuarioCliente,runUsuarioCliente,dia,hora,lugar,duracion,asistente;
        int id,cantidadAsistentes,edades,contador=0,edadesContador25=0,edadesContador26=0,edadesContador35=0;
        id= (int)(Math.random()) ;
        System.out.println("Ingrese el RUT de la Empresa");
        rutEmpresa= sc.next();
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
        hora = sc.next();
        System.out.println("indique lugar de capacitacion: ");
        lugar = sc.next();
        System.out.println("Ingrese cantidad de asistentes: ");
        cantidadAsistentes = sc.nextInt();
        while(contador<cantidadAsistentes){
            contador=contador+1;
            System.out.println("Ingrese el nombre del asistente");
            asistente = sc.next();
            System.out.println("Ingrese la edad");
            edades = sc.nextInt();
            if(edades<=25){
                edadesContador25=edadesContador25+1;
            }
            else if(edades>25 && edades <=25){
                edadesContador26=edadesContador26+1;
            }
            else{
                edadesContador35=edadesContador35+1;
            }
        }
        System.out.println("Id: "+id+"\nNombre de la empresa: "+nombreEmpresa+"\nRut: "+rutEmpresa
                +"\nDirección empresa: "+direccionEmpresa+"\nComuna: "+comunaEmpresa+
                "\nTelefono de contacto:"+ telefonoContactoE+"\nNombre del usuario: "
                +nombreUsuarioCliente+"\nRUN: "+runUsuarioCliente+ "\nDía de la capacitación: "
                +dia+"\nLugar de la capacitacion: "+lugar+ "\nHora: "+hora+
                "\nLa cantidad de asistentes es: "+cantidadAsistentes+"\nLa cantidad de asistentes menores a 25 años es:"+
                edadesContador25+"\nLa cantidad de asistentes con edades entre 26 y 35 años son: "+edadesContador26+
                "\nLa cantidad de asistentes con edades mayores a 35 años son:"+edadesContador35);
    }
    public static void main(String[] args) {
        capacitacion();
    }
}
