package loscomputines;

import java.util.Scanner;

//Investigar bien para que sirve Map y HashMap y como es su funcionamiento
import java.util.HashMap;
import java.util.Map;
public class TI19Livio {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        String palabra = "";

        //pidiendo palabra
        System.out.println("Escriba su palabra");
        palabra= scaner.nextLine();

        //verificando que no este vacia
        if (palabra == ""){
            do {
                System.out.println("Porfavor ingrese una palabra");
                palabra= scaner.nextLine();
            }while (palabra == "");
        }

        //Conviertiendo las mayusculas en minisculas
        palabra = palabra.toLowerCase();

        //creando el mapa donde pondremos un char y un numero
        Map<Character, Integer> conteo = new HashMap<>();

        //Creando  array y almacenando caracter por caracter
        char [] palabraIngresada = new char[palabra.length()];

        //creando las letras del abecedario con valor 0
        for (char letra = 'a'; letra <= 'z'; letra++){
            conteo.put(letra,0);
        }

        //Recorriendo palabra caracter por caracter
        for (int in=0; in < palabra.length(); in++ ){
            //almacenandole a la variable caracteres la palabra y sus caracteres
            char caracteres = palabra.charAt(in);
            //Imprimiendo por consola la palabra caracter por caracter
            System.out.println(palabra.charAt(in));

            //comprobando que es se alla ingresado un caracter
            if (conteo.containsKey(caracteres)){
                //si hay un caracter se le suma 1
                conteo.put(caracteres, conteo.get(caracteres)+1);
            }
        };

        System.out.println();
        System.out.println("Letras del abecedario repetidas");
        //creando las letras de labesedario
        for (char letra = 'a'; letra <= 'z'; letra++){
            //
            int conteoLetra = conteo.getOrDefault(letra, 0);
            //imprimiendo los resultados de letras con la cantidad de letras repetidas
            System.out.println(letra+": " + conteoLetra );
        }

    }
}
