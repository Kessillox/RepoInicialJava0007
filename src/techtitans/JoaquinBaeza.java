package techtitans;

import java.util.Scanner;

public class JoaquinBaeza {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cadena: ");
        String cadena = leer.next();
        boolean esVacio = true;

        if (cadena == "") {
            while (esVacio) {
                System.out.print("Ingrese la cadena: ");
                cadena = leer.next();
                if (cadena != "") {
                    esVacio = false;
                }
            }
        }

        int largoCadena = cadena.length();
        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < largoCadena; i++) {
            if (Character.isLetter(cadena.toLowerCase().charAt(i))) {
                if (cadena.toLowerCase().charAt(i) == 'a' || cadena.toLowerCase().charAt(i) == 'e' || cadena.toLowerCase().charAt(i) == 'i' || cadena.toLowerCase().charAt(i) == 'o' || cadena.toLowerCase().charAt(i) == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
            
        }
        System.out.println("Vocales: " + vocales + " Consonantes: " + consonantes);
    }
    

}
