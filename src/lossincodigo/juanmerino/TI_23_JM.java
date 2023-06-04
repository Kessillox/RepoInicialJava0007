package lossincodigo.juanmerino;

import java.util.Scanner;

/**
 * Ejercicio Individual 23: Convertidor de texto.
 * @author Juan Merino
 * @version 1.0
 */
public class TI_23_JM {

    /**
     * Solicita una cadena de texto, si es mayuscula convierte a minuscula, si es minuscula convierte a mayuscula,
     * si es espacio en blanco omite
     * @param args  argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto: \n");
        String cadenaTxt = sc.nextLine();
        StringBuilder resultado = new StringBuilder(100);

        for (char ch: cadenaTxt.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                resultado.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                resultado.append(Character.toLowerCase(ch));
            } else if (ch != ' ') {
                resultado.append(ch);
            }
        }

        System.out.println(resultado.toString());
    }
}