package losmarinesespaciales.leandroindividuales;
import java.util.*;

/*

Desarrolle un programa en lenguaje Java tal que, al ingresar una cadena de texto o String por
teclado, tome dicha cadena y la lea carácter por carácter, y los despliegue por consola.

De acuerdo con la cantidad de caracteres del String, debe crear un arreglo del mismo tamaño, e
ingresar en él cada letra anterior, en el mismo orden en el que aparecen en la cadena. Esto
independiente del tipo de carácter.

Finalmente, debe desplegar las letras del abecedario por consola, y al costado de cada una debe
indicar la cantidad de letras encontradas, sin hacer diferencia entre mayúsculas y minúsculas para
estos efectos.

Nota 1: Se debe validar que la cadena ingresada no esté vacía; si eso sucede, debe pedirlo
nuevamente.

Nota 2: Recuerde que para obtener un carácter de un String puede usar el método CharAt

*/
public class individual19 {

    public static void main(String[] args) {
        // Inicializando variables
        String frase = "";
        char caracter = ' ';

        // Creando la variable tipo Scanner
        Scanner entrada = new Scanner(System.in);
        //Mientras la frase esté vacía pedir que se ingrese una frase
        while (frase.length() == 0) {
            System.out.println("Ingrese una palabra o frase:");
            frase = entrada.nextLine().toLowerCase();

            // Creando arreglo de caracteres para la frase ingresada
            char[] arreglo = new char[frase.length()];
            System.out.println("");

            if (frase.length() > 0) {

                System.out.println("Lectura caracter por caracter, desplegado en consola del String:");
                System.out.println("");

                // Recorro la frase ingresada, cada caracter es almacenado en el array de caracteres y se despliega en pantalla
                for (int i = 0; i < frase.length(); i++) {
                    caracter = frase.charAt(i);
                    arreglo[i] = frase.charAt(i);
                    System.out.println(caracter);

                }


                entrada.close();

            }


        }
    }

}