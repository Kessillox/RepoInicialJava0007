package potrero;

import java.util.Scanner;

public class CapacitacionesPotreroTerreneitor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = 0;
        String rut = "";
        String nombre = "";
        String direccion = "";
        String telefono = "";

        String nombreAsistente = "";
        String runAsistente = "";
        int edadAsistente = 0;

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
        while (telefono.trim().equals("") || telefono.equals(null)) {
            System.out.println("Ingresar telefono de empresa");
            telefono = sc.nextLine();
            if (telefono.trim().equals("") || telefono.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }
        while (direccion.trim().equals("") || direccion.equals(null)) {
            System.out.println("Ingresar direccion de la empresa");
            direccion = sc.nextLine();
            if (direccion.trim().equals("") || direccion.equals(null)) {
                System.out.println("Error ingresar dato válido");
            }
        }
        String[] nombres = new String[cantidadAsistentes];
        String[] runs = new String[cantidadAsistentes];
        Integer[] edades = new Integer[cantidadAsistentes];
        for (int i = 0; i < cantidadAsistentes; i++) {
            while (nombreAsistente.trim().equals("") || nombreAsistente.equals(null)) {
                System.out.println("Ingresar nombre del asistente");
                nombreAsistente = sc.nextLine();
                if (nombreAsistente.trim().equals("") || nombreAsistente.equals(null)) {
                    System.out.println("Error ingresar dato válido");
                }
            }
            while (runAsistente.trim().equals("") || runAsistente.equals(null)) {
                System.out.println("Ingresar run del asistente");
                runAsistente = sc.nextLine();
                if (runAsistente.trim().equals("") || runAsistente.equals(null)) {
                    System.out.println("Error ingresar dato válido");
                }
            }
            while (edadAsistente <= 0) {
                System.out.println("Ingresar edad del asistente");
                String aux = sc.nextLine();
                try {
                    edadAsistente = Integer.parseInt(aux);
                    if (edadAsistente <= 0) {
                        System.out.println("Error ingresar dato válido, la duración debe ser mayor a 0");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("error al ingresar un valor no numérico");
                }
            }

            nombres[i] = nombreAsistente;
            runs[i] = runAsistente;
            edades[i] = edadAsistente;
            nombreAsistente = "";
            runAsistente = "";
            edadAsistente = 0;
        }

        System.out.println("día " + dia + " hora: " + hora + ", lugar: " + lugar + ", duración : " + duracion
                + "hrs. \nEmpresa: " + nombre + ", rut: " + rut + ", dirección: " + direccion + ", teléfono: " + telefono + "\nCantidad de asistentes: " + cantidadAsistentes);

        System.out.println("Personas que asisten menores a 25 años");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] < 25) {
                System.out.println("nombre: " + nombres[i] + ", run: " + runs[i] + ", edad: " + edades[i]);
            }
        }

        System.out.println("Personas que asisten entre 26 y 35 años");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] >= 26 && edades[i] <= 35) {
                System.out.println("nombre: " + nombres[i] + ", run: " + runs[i] + ", edad: " + edades[i]);
            }
        }

        System.out.println("Personas que asisten mayores a 35 años");
        for (int i = 0; i < nombres.length; i++) {
            if (edades[i] > 35) {
                System.out.println("nombre: " + nombres[i] + ", run: " + runs[i] + ", edad: " + edades[i]);
            }
        }

    }
}
