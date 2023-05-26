package nerdsdigital;
import java.util.Scanner;

public class TI19Manuel {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String texto;

            do {
                System.out.print("Ingrese una cadena de texto: ");
                texto = scanner.nextLine();
            } while (texto.isEmpty());

            char[] charArray = new char[texto.length()];

            for (int i = 0; i < texto.length(); i++) {
                charArray[i] = texto.charAt(i);
            }

            System.out.println("Caracteres ingresados:");
            for (char c : charArray) {
                System.out.print(c + " ");
            }

            System.out.println("\n\nLetras del abecedario encontradas:");
            int[] letterCount = new int[26];

            for (char c : charArray) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    letterCount[c - 'a']++;
                }
            }

            for (char c = 'a'; c <= 'z'; c++) {
                int count = letterCount[c - 'a'];
                if (count > 0) {
                    System.out.println(c + ": " + count);
                }
            }
        }
    }


