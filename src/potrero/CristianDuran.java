package potrero;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CristianDuran {
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO A DELETREO ===");
        System.out.println("");
        System.out.println("Ingrese palabra o texto:");

        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        String letras = "";
        int vocales = 0;
        int consonantes;
        int n_letras = 0;
        int n_espacios= 0;

            for ( int i=0; i<entrada.length(); i++){
                if(Character.isLetter(entrada.charAt(i))){
                    letras+=entrada.charAt(i) + " - ";
                }
                if((entrada.charAt(i) == 'a') || (entrada.charAt(i) == 'e') || (entrada.charAt(i) == 'i') || (entrada.charAt(i) == 'o') || (entrada.charAt(i) == 'u')){
                    vocales++;
                }
                if(Character.isLetter(entrada.charAt(i))){
                    n_letras++;
                }
                if(Character.isSpaceChar(entrada.charAt(i))){
                    n_espacios++;
                }
            }
            //Resta de las variables vocales y n_letras
            consonantes = n_letras - vocales;



        System.out.println("Deletreo: " + letras);
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
        System.out.println("Cantidad de letras totales: " + n_letras);
        System.out.println("Cantidad de espacios: " + n_espacios);


        //Solo deletrea

        // Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese cadena de texto:");

        // String cadenaTexto = sc.nextLine();

        //for (int i = 0; i < cadenaTexto.length(); i++) {

        // System.out.println(cadenaTexto.charAt(i));
        //}
    }
}