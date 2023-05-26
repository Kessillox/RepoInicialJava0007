package nerdsdigital;

import java.util.Scanner;

public class NehemiasMunoz {


// Desarrolle un programa en lenguaje Java tal que, al ingresar una cadena de texto o String por
// teclado, tome dicha cadena y la lea carácter por carácter, y los despliegue por consola.

    //Al finalizar el programa, debe ser indicar la cantidad de vocales y la cantidad de consonantes.
// Nota 1: Se debe validar que la cadena ingresada no esté vacía; si eso sucede, debe pedirlo
// nuevamente.
// Nota 2: Recuerde que para obtener un carácter de un String puede usar el método CharAt.
    public static void main(String[] args) throws Exception {
        int cantVocales = 0;
        int cantConsonantes = 0;
        String cadena;
        char caracter;
        String vocales = "aeiou";
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra o cadena de texto:");
            cadena = scan.nextLine().trim();
        } while (cadena.isEmpty());
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.toLowerCase();
            caracter = cadena.charAt(i);
            if (vocales.indexOf(caracter) != -1) {
                cantVocales++;
            } else if (Character.isLetter(caracter)) {
                cantConsonantes++;
            }
        }
        System.out.println("La cantidad de vocales en la cadena son:" + cantVocales);
        System.out.println("La cantidad de consonantes en la cadena son:" + cantConsonantes);
    }

}
