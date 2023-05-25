package duality;
import java.util.Scanner;

public class TI19JonathanGajardo {
    public static void main(String[] args) {
        String texto = "";
        Scanner sc = new Scanner(System.in);

        while (texto == "") {
            System.out.println("Ingresar texto");
            texto = sc.nextLine();
        }

        char [] arreglo = new char[texto.length()];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(texto.charAt(i));
            arreglo[i] = Character.toUpperCase(texto.charAt(i));
        }

        char letra = 'A';
        for (int i = 0; i < 26; i++) {
            int contador = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == letra) {
                    contador++;
                }
            }
            System.out.println(letra + ": " + contador);
            letra++;
        }
    }
}
