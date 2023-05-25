package duality;

import java.util.Scanner;

public class TI17JonathanGajardo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = "";
        int vocales = 0;
        int consonantes = 0;


        while (texto.length() == 0) {
            System.out.println("Ingresar texto");
            texto = sc.nextLine();
        }

        String texto2 = texto.toLowerCase();

        char letra;
        for (int i = 0; i < texto2.length(); i++) {
            letra = texto2.charAt(i);
            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales += 1;
                } else {
                    consonantes += 1;
                }
            }
            System.out.println(texto.charAt(i));
        }

        System.out.println("Vocales: " + vocales + "\nConsonantes: " + consonantes);
    }
}
