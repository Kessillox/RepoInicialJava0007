package nerdsdigital;

import java.util.Scanner;

public class TI19Manuel{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        // Solicitar la cadena de texto
        do {
            System.out.print("Ingrese una cadena de texto: ");
            cadena = scanner.nextLine();
        } while (cadena.isEmpty());

        // Leer la cadena carácter por carácter y crear el arreglo
        char[] caracteres = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            caracteres[i] = caracter;
        }

        // Desplegar los caracteres del arreglo
        System.out.println("\nCaracteres encontrados:");
        for (char caracter : caracteres) {
            System.out.print(caracter + " ");
        }
        System.out.println();

        // Contar las letras del abecedario
        int[] conteoLetras = new int[26];

        for (char caracter : caracteres) {
            if (Character.isLetter(caracter)) {
                caracter = Character.toLowerCase(caracter);
                int indice = caracter - 'a';
                conteoLetras[indice]++;
            }
        }

        // Desplegar el conteo de letras
        System.out.println("\nCantidad de letras encontradas:");
        char letra = 'a';
        for (int conteo : conteoLetras) {
            System.out.println(letra + ": " + conteo);
            letra++;
        }

        scanner.close();
    }
}




