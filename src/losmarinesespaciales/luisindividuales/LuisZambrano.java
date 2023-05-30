package losmarinesespaciales.luisindividuales;
import java.util.Scanner;

public class LuisZambrano {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        String cadena;
        int cantidadVocales = 0, cantidadConsonantes = 0;

        do {
            System.out.print("Ingrese una cadena de texto: ");
            cadena = entrada.nextLine().toLowerCase();

            if (cadena.isEmpty()) {
                System.out.println("La cadena ingresada está vacía. Inténtelo nuevamente.");
            }

        } while (cadena.isEmpty());

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);

            if (esVocal(caracterActual)) {
                cantidadVocales++;
            } else if (esConsonante(caracterActual)) {
                cantidadConsonantes++;
            }

            System.out.print(caracterActual);
        }

        System.out.println("\nCantidad de vocales: " + cantidadVocales);
        System.out.println("Cantidad de consonantes: " + cantidadConsonantes);
    }

    private static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean esConsonante(char c) {
        return Character.isLetter(c) && !esVocal(c);
    }

}

