package potrero.grupales.dia9;

import java.util.Scanner;

/**
 * Lee datos de la capacitación, la empresa y los asistentes de la capacitación
 * pide las notas y muestra la nota más baja, más alta y el promedio
 * @author Iván Becerra, Cristian Durán y Ignacio Aránguiz
 * @version 1.0.1
 */
public class TG10Potrero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables Capacitación, Empresa y Asistentes.
        String diaCapacitacion = "";
        String horaCapacitacion = "";
        String lugarCapacitacion = "";
        Double duracionCapacitacion = 0d;
        Integer cantidadAsistentesCapacitacion = 0;

        String nombreEmpresa = "";

        String nombreAsistente = "";
        double calificacionAsistente = 0;

        // Pedir y validar datos por consola de Capacitación
        while (diaCapacitacion.trim().equals("") || diaCapacitacion.equals(null)) {
            System.out.println("Ingresar día Capacitación");
            diaCapacitacion = sc.nextLine();
            if (diaCapacitacion.trim().equals("") || diaCapacitacion.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (horaCapacitacion.trim().equals("") || horaCapacitacion.equals(null)) {
            System.out.println("Ingresar hora Capacitación");
            horaCapacitacion = sc.nextLine();
            if (horaCapacitacion.trim().equals("") || horaCapacitacion.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (lugarCapacitacion.trim().equals("") || lugarCapacitacion.equals(null)) {
            System.out.println("Ingresar lugar Capacitación");
            lugarCapacitacion = sc.nextLine();
            if (lugarCapacitacion.trim().equals("") || lugarCapacitacion.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (duracionCapacitacion <= 0) {
            System.out.println("Ingresar horas de duración de la Capacitación");
            String aux = sc.nextLine();
            try {
                duracionCapacitacion = Double.parseDouble(aux);
                if (duracionCapacitacion <= 0) {
                    System.out.println("Error ingresar dato válido, la duración debe ser mayor a 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("error al ingresar un valor no numérico");
            }
        }

        while (cantidadAsistentesCapacitacion <= 0) {
            System.out.println("Ingresar cantidadAsistentesCapacitacion Capacitación");
            String aux = sc.nextLine();
            try {
                cantidadAsistentesCapacitacion = Integer.parseInt(aux);
                if (cantidadAsistentesCapacitacion <= 0) {
                    System.out.println("Error, ingresar dato válido, la cantidadAsistentesCapacitacion debe ser mayor a 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("error al ingresar un valor no numérico");
            }
        }

        // Pedir y validar datos por consola de Empresa
        while (nombreEmpresa.trim().equals("") || nombreEmpresa.equals(null)) {
            System.out.println("Ingresar nombreEmpresa Capacitación");
            nombreEmpresa = sc.nextLine();
            if (nombreEmpresa.trim().equals("") || nombreEmpresa.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        // Arreglos de variables para los asistentes
        String[][] asistentes = new String[cantidadAsistentesCapacitacion][2];
        double sumPromedio = 0d, calificacionMayor = 0d, calificacionMenor = 999d;

        // Pedir y validar datos por consola de Asistentes
        for (int i = 0; i < cantidadAsistentesCapacitacion; i++) {
            while (nombreAsistente.trim().equals("") || nombreAsistente.equals(null)) {
                System.out.println("Ingresar nombre del asistente");
                nombreAsistente = sc.nextLine();
                if (nombreAsistente.trim().equals("") || nombreAsistente.equals(null)) {
                    System.out.println("Error ingresar dato válido");
                }
            }
            while (calificacionAsistente <= 0 || calificacionAsistente > 7) {
                System.out.println("Ingresar calificación del asistente de 1 - 7");
                String aux = sc.nextLine();
                try {
                    calificacionAsistente = Double.parseDouble(aux);
                    if (calificacionAsistente <= 0 || calificacionAsistente > 7) {
                        System.out.println("Error ingresar dato válido, la calificación debe ser entre 1 a 7");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("error al ingresar un valor no numérico");
                }
            }
            // if de solo una instrucción, no es necesario las llaves, pero es mejor con llaves por buenas prácticas.
            if (calificacionAsistente > calificacionMayor) calificacionMayor = calificacionAsistente;
            // Operador ternario
            calificacionMenor = calificacionAsistente < calificacionMenor ? calificacionAsistente : calificacionMenor;
            // sumar calificaciones
            sumPromedio += calificacionAsistente;
            // Almacenar los datos ingresados en la matriz asistentes
            asistentes[i][0] = nombreAsistente;
            asistentes[i][1] = String.valueOf(calificacionAsistente);
            // setear variables del asistente para que entre en los while
            nombreAsistente = "";
            calificacionAsistente = 0;
        }

        // Imprimir por consola los datos de la capacitación
        System.out.println("------------- Información Capacitación -------------");
        System.out.println("día " + diaCapacitacion + " horaCapacitacion: " + horaCapacitacion + ", lugarCapacitacion: " + lugarCapacitacion + ", duración : " + duracionCapacitacion
                + "hrs. \nEmpresa: " + nombreEmpresa + "\nCantidad de asistentes: " + cantidadAsistentesCapacitacion);

        System.out.println("Personas que asisten a la capacitación");
        for (int i = 0; i < asistentes.length; i++) {
            System.out.println("nombre: " + asistentes[i][0] + ", calificación: " + asistentes[i][1]);
        }

        System.out.println("Calificación Menor: " + calificacionMenor);
        System.out.println("Calificación Mayor: " + calificacionMayor);
        System.out.println("Promedio de las calificaciones: " + (sumPromedio/cantidadAsistentesCapacitacion));

    }

}
