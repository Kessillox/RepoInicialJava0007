package techtitans.cintia;

import java.util.Scanner;
public class Individual19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;

        //Ciclo para dar la opción al usuario si quiere ingresar una nueva cadena de texto
        boolean finalizar = false;
        while (!finalizar) {

            System.out.println("Ingrese una cadena de texto");
            cadena = leer.nextLine();

            // Validar que la cadena ingresada no esté vacía
            while (cadena == "") {
                System.out.println("Se debe ingresar una cadena de texto, no puede quedar vacía");
                cadena = leer.nextLine();
            }

            // Crea un arreglo del tamaño del string ingresado y se ingresa él cada letra en
            // el mismo orden que fueron ingresadas por el usuario
            cadena = cadena.toLowerCase();
            char[] letras = new char[cadena.length()];
            int contadorLetras = 0;
            for (int i = 0; i < cadena.length(); i++) {
                char letra = cadena.charAt(i);
                if (Character.isLetter(letra)) {
                    letras[contadorLetras] = letra;
                    contadorLetras++;
                }

            }

            // Imprime sólo las letras ingresadas (en caso que el usuario haya ingresado
            // números por error)
            System.out.println("");
            System.out.println("Letras ingresadas:");
            for (char c : letras) {
                System.out.print(c + "  ");
            }
            System.out.println();

            // Arreglo de tamaño del abecedario completo (incluyendo la letra ñ)
            int[] abecedario = new int[27];
            String abcCompleto = "abcdefghijklmnñopqrstuvwxyz"; // String con el abecedario para considerar la Ñ
            for (char c : letras) {
                c = Character.toLowerCase(c);
                if (Character.isLetter(c)) {
                    int index = abcCompleto.indexOf(c); // Devuelve la posición del caracter que coincida con c
                    if (index >= 0) {
                        abecedario[index]++;
                    }
                }
            }

            // Imprime el abecedario contando cuantas letras ingresaron de cada una
            System.out.println("");
            System.out.println("Cantidad de letras encontradas de acuerdo a la cadena ingresada");
            for (int i = 0; i < 27; i++) {

                char letra = abcCompleto.charAt(i);
                int cantidad = abecedario[i];
                System.out.print(letra + ": " + cantidad + "  ");

            }
            System.out.println();

            // Preguntar al usuario si quiere ingresar otra cadena o finalizar
            System.out.println("");
            System.out.println("¿Desea ingresar otra cadena de texto? (s/n)");
            String opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                finalizar = true;
                System.out.println("Programa finalizado");
            }
        }
        leer.close();

    }

}
