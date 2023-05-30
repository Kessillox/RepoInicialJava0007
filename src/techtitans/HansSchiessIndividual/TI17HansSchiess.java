package techtitans.HansSchiessIndividual;

import java.util.Scanner;

public class TI17HansSchiess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        do {
            System.out.print("Ingresa una cadena de texto: ");
            cadena = scanner.nextLine().trim();
        } while (cadena.isEmpty());

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("La cadena ingresada es: " + cadena);
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }
}
