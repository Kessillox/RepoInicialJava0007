package lossincodigo.JuanMerino;
import java.util.ArrayList;
import java.util.Scanner;

public class TI_19_JuanMerino {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // entrada de la cadena de texto
        String entrada;
        do {
            System.out.println("Ingresa la cadena de texto:");
            entrada = sc.nextLine();
        } while (entrada.equals(""));

        // Arrays
        ArrayList<Character> vocAnt = new ArrayList<>();
        int[][] matrizAbecedario = new int[26][2];

        // Ciclo del abecedario
        for (int i = 65; i <= 90; i++) {
            matrizAbecedario[i - 65][0] = i;
        }

        // ciclo de la cadena
        for (char ch: entrada.toCharArray()) {
            System.out.println(ch);
            vocAnt.add((char) (ch - 1));
            if (Character.isLetter(ch)) {
                ch = String.valueOf(ch).toUpperCase().charAt(0);
                matrizAbecedario[ch - 65][1]++;
            }
        }
        // ciclo que muestra el conteo del abecedario
        System.out.println("Arreglo de caracteres anteriores: "+ vocAnt);
        for (int[] letras: matrizAbecedario) {
            System.out.println((char) letras[0] + ": " + letras[1]);
        }
    }
}