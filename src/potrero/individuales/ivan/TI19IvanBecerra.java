package potrero.individuales.ivan;

import java.util.Scanner;

/**
 * Recibe una cadena de texto por consola y cuenta las letras del abecedario.
 * Por favor no copiar este código, si desea estudiarlo ¡lo felicito!
 * @author Iván Becerra
 */
public class TI19IvanBecerra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto = "";

        while (texto == null || texto.equals("")) {
            System.out.println("Ingrese una cadena de texto");
            texto = scanner.nextLine().trim();
            if (texto.equals("")) {
                System.out.println("Error, ingrese un valor");
            }
        }

        String[] caracteres = new String[texto.length()];

        System.out.println("Cadena de texto: ");

        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i) + "   ");
            caracteres[i] = String.valueOf(texto.charAt(i));
        }
        System.out.println();

        int[] abecedario = new int[26];
        for (String caracter : caracteres) {
            char c = caracter.toLowerCase().charAt(0);
            if (c >= 'a' && c <= 'z') {
                abecedario[c - 'a']++;
            }
        }

        System.out.println("Letras del abecedario:");
        for (char c = 'a'; c <= 'z'; c++) {
            int contador = abecedario[c - 'a'];
            System.out.println(c + ": " + contador);
        }

    }
}
