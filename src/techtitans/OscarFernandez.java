package techtitans;
import java.util.Scanner;
import java.lang.Character;
public class OscarFernandez {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[1];

        String palabra;
        do {
            System.out.println("Ingrese una palabra para contar sus caracteres:");
            palabra = sc.nextLine();
            if (palabra.length() == 0) {
                System.out.println("No ingresó nada. Inténtelo nuevamente.");
            }
        } while (palabra.length() == 0);

        palabras[0] = palabra;

        System.out.println("La palabra ingresada es: " + palabra);
        int vocales = 0;
        int consonantes = 0;
        int especiales = 0;
        for (int j = 0; j < palabra.length(); j++) {
            char letra = palabra.charAt(j);
            if (Character.isLetterOrDigit(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            } else {
                especiales++;
            }
        }
        System.out.println("Tiene: " + vocales + " Vocales");
        System.out.println("Tiene: " + consonantes + " Consonantes");
        System.out.println("Tiene: " + especiales + " Caracteres Especiales");
    }

}