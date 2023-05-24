package duality;
import java.util.Scanner;
public class ValentinUrrea {
    // Ejercicio individual 17
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vocales = 0, consonante = 0;
        String cadena;

        System.out.println("Escriba un texto o palabra:");
        cadena = scanner.nextLine();

        do {
            if (cadena.equals("")) {
                System.out.println("Error. Texto vacío. Escriba nuevamente:");
                cadena = scanner.nextLine();
            }
        } while (cadena.equals(""));

        cadena= cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print("[" + cadena.charAt(i) + "]");
            if (Character.isLetter(cadena.charAt(i))) {
                switch (cadena.charAt(i)) {
                    case 'a',
                            'e',
                            'i',
                            'o',
                            'u':
                        vocales ++;
                        break;

                    default:
                        consonante ++;
                        break;
                }
            }

        }
        System.out.println("");
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonante);

        scanner.close();
    }

}
