package losmarinesespaciales.cristianindividuales;
import java.util.Scanner;
public class CristianIndividual19 {
    public static void main(String[] args){
        String frase= "";

        // Creando la variable tipo Scanner
        Scanner entrada  = new Scanner(System.in);

        // Mientras frase esté vacío, se pide que ingrese un texto
        while (frase.length() == 0 ){
            System.out.println("Ingrese una palabra o frase:");
            frase = entrada.nextLine().toLowerCase();
            if(frase.length() > 0){
                // Creando arreglo para frase ingresada
                char[] arreglo = new char[frase.length()];

                System.out.println("Lectura de la frase caracter por caracter y desplegado en consola:");

                // Recorriendo arreglo y mostrando caracter x caracter
                for (int i = 0; i<frase.length(); i++){
                    char caracter = frase.charAt(i);
                    arreglo[i] = caracter;
                    System.out.println(caracter);
                }
                System.out.println("\n Abecedario y cantidad de veces que se repite cada letra: \n");

                // Abecedario
                String abecedario = "abcdefghijklmnñopqrstuvwxyz";

                // recorriendo abecesario y contando la cantidad de letra x letra
                for (int i = 0; i < abecedario.length(); i++) {
                    char letra = abecedario.charAt(i);
                    int contador = 0;

                    // comparo letras abecedario en cada letra del arreglo de la frase
                    for (char c : arreglo) {
                        if (Character.toLowerCase(c) == letra) {
                            contador++;
                        }
                    }
                    // imprimir letra del abecedario y su conteo...
                    System.out.println(letra + ": "+ contador);
                }
            }else{
                System.out.println("La frase ingresada está vacía. Ingresa nuevamente.");
            }
        }
        entrada.close();
    }
}
