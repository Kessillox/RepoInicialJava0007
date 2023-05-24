package potrero;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CapacitacionesPotreroTerreneitor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = 0;
        String rut = "";
        String nombre = "";

        String direccion = "";
        String telefono = "";
        String nombreCliente = "";
        String runCliente = "";
        List<String> clientes = new ArrayList();

        String dia = "";
        String hora = "";
        String lugar = "";
        Double duracion = 0d;
        Integer cantidadAsistentes = 0;

        while (dia.trim().equals("") || dia.equals(null)) {
            System.out.println("Ingresar día Capacitación");
            dia = sc.nextLine();
            if (dia.trim().equals("") || dia.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (hora.trim().equals("") || hora.equals(null)) {
            System.out.println("Ingresar hora Capacitación");
            hora = sc.nextLine();
            if (hora.trim().equals("") || hora.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (lugar.trim().equals("") || lugar.equals(null)) {
            System.out.println("Ingresar lugar Capacitación");
            lugar = sc.nextLine();
            if (lugar.trim().equals("") || lugar.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (duracion <= 0) {
            System.out.println("Ingresar duración Capacitación");
            String aux = sc.nextLine();
            try {
                duracion = Double.parseDouble(aux);
                if (duracion <= 0) {
                    System.out.println("Error ingresar dato válido, la duración debe ser mayor a 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("error al ingresar un valor no numérico");
            }
        }

        while (cantidadAsistentes <= 0) {
            System.out.println("Ingresar cantidadAsistentes Capacitación");
            String aux = sc.nextLine();
            try {
                cantidadAsistentes = Integer.parseInt(aux);
                if (cantidadAsistentes <= 0) {
                    System.out.println("Error, ingresar dato válido, la cantidadAsistentes debe ser mayor a 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("error al ingresar un valor no numérico");
            }
        }

        while (id <= 0) {
            System.out.println("Ingresar id Capacitación");
            String aux = sc.nextLine();
            try {
                id = Integer.parseInt(aux);
                if (id <= 0) {
                    System.out.println("Error, ingresar dato válido, el id debe ser mayor a 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("error al ingresar un valor no numérico");
            }
        }

        while (nombre.trim().equals("") || nombre.equals(null)) {
            System.out.println("Ingresar nombre de empresa Capacitación");
            nombre = sc.nextLine();
            if (nombre.trim().equals("") || nombre.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }

        while (rut.trim().equals("") || rut.equals(null)) {
            System.out.println("Ingresar rut Capacitación");
            rut = sc.nextLine();
            if (rut.trim().equals("") || rut.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }




    }
}
