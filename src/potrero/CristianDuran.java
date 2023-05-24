package potrero;

import java.util.Scanner;

public class CristianDuran {
    public static void main(String[] args) {

        System.out.println("Ingrese palabra o texto:");

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        String letras = "";

        int n_letras = 0;
        int n_espacios= 0;

        for ( int i=0; i<entrada.length(); i++){
            if(Character.isLetter(entrada.charAt(i))){
                n_letras++;
                letras+=entrada.charAt(i) + " - ";
            }
            if(Character.isSpaceChar(entrada.charAt(i))){
                n_espacios++;
            }
        }

        System.out.println("Deletreo:" + letras);
        System.out.println("Cantidad de letras:" + n_letras);
        System.out.println("Cantidad de espacios:" + n_espacios);


        //Solo deletrea

        // Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese cadena de texto:");

        // String cadenaTexto = sc.nextLine();

        //for (int i = 0; i < cadenaTexto.length(); i++) {

        // System.out.println(cadenaTexto.charAt(i));
        //}
    }
}