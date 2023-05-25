package lossincodigo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DayannaNunez {

    public static void main(String[] args) {
        String cadena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        cadena = sc.nextLine();
        do {
            System.out.println("Ingrese valor valido");
        }while(cadena.isEmpty());
    }

}