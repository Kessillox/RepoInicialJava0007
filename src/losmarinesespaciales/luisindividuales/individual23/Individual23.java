package losmarinesespaciales.luisindividuales.individual23;

import java.util.ArrayList;
import java.util.Scanner;

public class Individual23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputText;
        int inputLarge;

        do {
            System.out.println("\n###### Ejercicio Individual 23 - Luis Zambrano ######");
            System.out.println("\nPor favor, ingresa un texto");
            inputText = scanner.nextLine();
            inputLarge = inputText.length();
        } while (inputText.isEmpty());

        if (inputText.isEmpty()) {
            System.out.println("No hay caracteres");
        } else {

            for (int i = 0; i < inputLarge; i++) {
                Character character = inputText.charAt(i);
                if (Character.isUpperCase(character)) {
                    System.out.print(Character.toLowerCase(character));
                } else if (Character.isLowerCase(character)) {
                    System.out.print(Character.toUpperCase(character));
                } else if (Character.isDigit(character)) {
                    System.out.print(character);
                } else if (Character.isWhitespace(character)) {
                    System.out.print(" ");
                }else{
                    System.out.println("\nFormato incorrecto. (Letras en mayúsculas, minúsculas, números o espacios en blanco)");
                    break;
                }
            }
        }

        // Nota: No sé si yo no entendí bien, pero el punto de que al ingresar una cadena en blanco (No espacio) se debe omitir, no sé como interpretarlo. :(
        //       Lo encontre un poco ambiguo.

    }
}
