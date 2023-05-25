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

        //char [] abecedario = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        int contador = 0;

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

                System.out.println("Lectura de la frase caracter por caracter y desplegado en consola:");
                System.out.println("");

                // Recorro la frase ingresada y se despliega en pantalla caracter por caracter
                for (int i = 0; i < frase.length(); i++) {
                    caracter = frase.charAt(i);
                    arreglo[i]= frase.charAt(i);
                    System.out.println(caracter);

                }

            }

            System.out.println("");
            System.out.println("Abecedario y cantidad de veces que se repite la letra:");
            System.out.println("");
            // Recorro la cantidad de caracteres que tenga la frase
            for (int i=0; i<abecedario.length(); i++){
                // Comparo caracter de la frase con caracter del abecedario, si coinciden sumo 1 al contador
                for (int j=0; j<frase.length();j++) {
                    if(abecedario.charAt(i) == frase.charAt(j) ) {
                        contador = contador +1;
                    }
                }
                // Imprime el abecedario: letra + cantidad de veces que figura en la frase
                System.out.println(abecedario.charAt(i) + ": " + contador);
                // Reseteo el contador
                contador = 0;


            }


        }





        entrada.close();
    }

}