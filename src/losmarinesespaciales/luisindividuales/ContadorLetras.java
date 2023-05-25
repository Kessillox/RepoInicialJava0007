package losmarinesespaciales.luisindividuales;
import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        do {
            System.out.print("Ingrese una cadena de texto: ");
            cadena = scanner.nextLine();
        } while (cadena.isEmpty());

        int longitud = cadena.length();
        char[] arregloLetras = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            char letra = cadena.charAt(i);
            arregloLetras[i] = letra;
            System.out.print(letra);
        }

        System.out.println("\n");

        int[] contadorLetras = new int[26]; // Arreglo para contar las letras del abecedario

        for (int i = 0; i < longitud; i++) {
            char letra = Character.toLowerCase(arregloLetras[i]);
            if (Character.isLetter(letra)) {
                int indice = letra - 'a';
                contadorLetras[indice]++;
            }
        }

        for (char letra = 'a'; letra <= 'z'; letra++) {
            int indice = letra - 'a';
            System.out.println(letra + ": " + contadorLetras[indice]);
        }
    }
}
