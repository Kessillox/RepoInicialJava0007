package losmarinesespaciales.cristianindividuales;

import java.util.Scanner;
public class CristianIndividual17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto;

        do {
            System.out.print("Ingrese un texto: ");
            texto = scanner.nextLine().toLowerCase().trim();
        } while (texto.isEmpty());

        int vocales = 0;
        int consonantes = 0;


        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Verificar si carácter es letra
            if (Character.isLetter(c)) {
                if (esVocal(c)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println();
        System.out.println("<<< Cantidad de vocales y consonantes >>>");
        System.out.println("Texto ingresado: "+texto);
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

        scanner.close();
    }

    // verificando si es vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
