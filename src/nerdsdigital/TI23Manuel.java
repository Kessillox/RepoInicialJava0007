package nerdsdigital;

import java.util.Scanner;

public class TI23Manuel {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese una cadena de texto: ");
            String cadena = scanner.nextLine();
            String resultado = convertirCadena(cadena);
            System.out.println("Resultado: " + resultado);
        }

        public static String convertirCadena(String cadena) {
            StringBuilder resultado = new StringBuilder();

            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);

                if (Character.isLowerCase(caracter)) {
                    resultado.append(Character.toUpperCase(caracter));
                } else if (Character.isUpperCase(caracter)) {
                    resultado.append(Character.toLowerCase(caracter));
                } else if (Character.isDigit(caracter) || Character.isWhitespace(caracter)) {
                    resultado.append(caracter);
                }
            }

            return resultado.toString();
        }
}


