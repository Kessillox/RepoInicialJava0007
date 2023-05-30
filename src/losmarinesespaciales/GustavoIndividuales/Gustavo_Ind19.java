package losmarinesespaciales.gustavoindividuales;

import java.util.Scanner;

public class Gustavo_Ind19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "";

        while (cadena.isEmpty()) {
            System.out.println("Ingresa una palabra o frase: ");
            cadena = scanner.nextLine();
        }
        char[] arreglito = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            arreglito[i] = cadena.charAt(i);
            System.out.print(arreglito[i] + " ");
        }
        System.out.println();
        int[] conteoLetras = new int[26];

        for (int i = 0; i < arreglito.length; i++) {
            char letrita = Character.toLowerCase(arreglito[i]);
            if (letrita >= 'a' && letrita <= 'z') {
                conteoLetras[letrita - 'a']++;
            }
        }
        for (int i = 0; i < conteoLetras.length; i++) {
            char letraABC = (char) ('A' + i);
            int contador = conteoLetras[i];
            System.out.println(letraABC + ": " + contador);
        }
    }
}