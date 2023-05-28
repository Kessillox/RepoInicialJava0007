package potrero;

import java.util.Scanner;

public class IvanBecerra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto = "";
        int cantidadVocales = 0, cantidadConsonantes = 0;

        while (texto == null || texto.equals("")) {
            System.out.println("Ingrese una cadena de texto");
            texto = scanner.nextLine().trim();
            if (texto.equals("")) {
                System.out.println("Error, ingrese un valor");
            }
        }

        texto = texto.toLowerCase();
        System.out.println("Cadena de texto: ");
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i) + "   ");
            if (Character.isLetter(texto.charAt(i))) {
                if ( texto.charAt(i) == ('a') || texto.charAt(i) == ('e') || texto.charAt(i) == ('i') || texto.charAt(i) == ('o') || texto.charAt(i) == ('u') ) {
                    cantidadVocales++;
                } else {
                    cantidadConsonantes++;
                }
            }
        }

        System.out.println();
        System.out.println("Cantidad de vocales: " + cantidadVocales);
        System.out.println("Cantidad de consonantes: " + cantidadConsonantes);

    }
}
