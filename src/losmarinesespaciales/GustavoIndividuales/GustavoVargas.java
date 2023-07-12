package losmarinesespaciales.GustavoIndividuales;

import java.util.Scanner;

public class GustavoVargas {
    public static void main(String[] args) {
        // Iniciación de Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        String cadena;
        int vocales = 0, consonantes = 0, caracteres = 0;

        // Uso de Hacer - Mientras
        do {
            // Ingreso del texto a verificar
            System.out.print("Ingrese una palabra o frase: ");
            // Datos se ingresan a una variable, cambiando a minúsculas para su análisis
            cadena = input.nextLine().toLowerCase().trim();
            // se suman los caracteres
            caracteres = cadena.length();

            // Mientras la cadena no sea vacía...
        } while (cadena.isEmpty());

        // Uso de Para, se inicializa un contador, que deberá ser menor al largo de la cadena
        for (int i = 0; i < caracteres; i++) {
            // se pasa a una variable char cada caracter de la cadena
            char caracter = cadena.charAt(i);

            // Uso de Si para revisar si cada caracter es una letra
            if (Character.isLetter(caracter)) {
                // Uso de Si - Sino para comparar si las letras son vocales o consonantes
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    // se van sumando las vocales
                    vocales++;
                } else {
                    // se van sumando las consonantes
                    consonantes++;
                }
                // Impresión de las letras separadas
                System.out.print(caracter + " ");
            }
        }

        // Impresión de los resultados
        System.out.println();
        System.out.println("Cantidad de caracteres: " + caracteres);
        System.out.println("Cantidad de letras totales: " + (vocales + consonantes));
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
        input.close();
    }
}
