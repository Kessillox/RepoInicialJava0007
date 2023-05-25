package nerdsdigital;

import java.util.Scanner;

public class TI19Nehemias {
    public static void main(String[] args) throws Exception {
        String cadena;
        String[] arrayCadena;
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        int coincidencia = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese una cadena:");
            cadena = scan.nextLine().trim();
        } while (cadena.isEmpty() != false);
        arrayCadena = new String[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            arrayCadena[i] = Character.toString(cadena.charAt(i));
        }

        for (int i = 0; i < abecedario.length(); i++) {
            for (String caracter : arrayCadena) {
                if (Character.toString(abecedario.charAt(i)).compareTo(caracter.toLowerCase()) == 0) {
                    coincidencia++;
                }
            }
            System.out.println(abecedario.charAt(i) + ": " + coincidencia);
            coincidencia = 0;
        }

    }
}
