package techtitans;
import java.util.Scanner;
public class CintiaMunoz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;

        System.out.println("Ingrese una cadena de texto para indicar su  cantidad de vocales y de consonantes: ");
        cadena = leer.nextLine();

        //Se valida que la cadena ingresada no esté vacía mediante un ciclo while
        while (cadena == "") {
            System.out.println("Se debe ingresar una cadena de texto, no puede quedar vacía");
            cadena = leer.nextLine();
        }

// Se declaran 2 variables y se inicializan en 0
        int vocales = 0;
        int consonantes = 0;

        cadena = cadena.toLowerCase();

        //Ciclo for para recorrer cada caracter de la cadena
        for (int i = 0; i < cadena.length(); i++) {

            char letra = cadena.charAt(i);

        // Se verifica que sea una letra con el método isLetter
            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales++; //Si es vocal se incrementa el contador
                } else {
                    consonantes++; //Si es consonante se incrementa el contador
                }
            }
        }

        leer.close();

        //Mostrar cantidad de vocales y/o consonantes
        System.out.println("============================================");
        System.out.println("Resultados: ");
        System.out.println("La cantidad de vocales ingresadas es: " + vocales);
        System.out.println("La cantidad de consonantes ingresadas es: " + consonantes);

    }
}
