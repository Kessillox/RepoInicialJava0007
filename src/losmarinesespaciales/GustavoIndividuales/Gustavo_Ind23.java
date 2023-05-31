package losmarinesespaciales.gustavoindividuales;

import java.util.Scanner;

public class Gustavo_Ind23 {
    /**
     * CAMBIA LAS LETRAS DE UNA CADENA DE MAYÚSCULAS A MINúSCULAS Y VICEVERSA.
     * @autor Gustavo Vargas
     * @version 1.0
     *
     */
    public static void main(String[] args) {

        // Uso de Scanner para leer la entrada del usuario por consola
        Scanner input = new Scanner(System.in);

        String texto = "";
        char letra;
        boolean volver = true;

        // Uso del do while para reiniciar el programa
        do {
            // Uso de while para forzar un texto
            while (texto.isEmpty()) {
                System.out.println("##########################################################################");
                System.out.println("##########          INGRESA UNA CADENA DE TEXTO O FRASE         ##########");
                System.out.println("##                                                                      ##");
                System.out.println("        (Las Mayúsculas se convertirán a Minúsculas, y viceversa)");
                System.out.println("(También puedes usar caracteres especiales, los cuales no tendrán cambios)");
                texto = input.nextLine();
            }

            // Uso del for para recorrer los caracteres
            for (int i = 0; i < texto.length(); i++) {
                letra = texto.charAt(i);

                // Uso de los if para determinar las mayúsculas y minúsculas
                if (Character.isLowerCase(letra)) {
                    letra = Character.toUpperCase(letra);
                    System.out.print(letra);
                } else if (Character.isUpperCase(letra)) {
                    letra = Character.toLowerCase(letra);
                    System.out.print(letra);
                } else {
                    System.out.print(letra);
                }
            }
            // Preguntar si desea volver a ingresar otra frase
            System.out.println("\n¿Desea volver a ingresar otra frase? (S/N)");
            String respuesta = input.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                volver = false;
            } else {
                texto = "";
            }
        } while (volver);
    }
}
