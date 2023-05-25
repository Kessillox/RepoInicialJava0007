package loscomputines;

import java.util.Scanner;

//Investigar bien para que sirve Map y HashMap y como es su funcionamiento
import java.util.HashMap;
import java.util.Map;
public class TI19Livio {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        String palabra = "";

        //Varaibles del abecedario

        System.out.println("Escriba su palabra");
        palabra= scaner.nextLine();
        if (palabra == ""){
            do {
                System.out.println("Porfavor ingrese una palabra");
                palabra= scaner.nextLine();
            }while (palabra == "");
        }

        System.out.println("Palabra: " + palabra);
        palabra = palabra.toLowerCase();

        Map<Character, Integer> conteo = new HashMap<>();

        //Creando  array y almacenando caracter por caracter
        char [] palabraIngresada = new char[palabra.length()];

        //Recorriendo palabra caracter por caracter
        for (char letra = 'a'; letra <= 'z'; letra++){
            conteo.put(letra,0);
        }

        for (int in=0; in < palabra.length(); in++ ){
            char caracteres = palabra.charAt(in);
            System.out.println(palabra.charAt(in));

            if (conteo.containsKey(caracteres)){
                conteo.put(caracteres, conteo.get(caracteres)+1);
            }
        };

        for (char letra = 'a'; letra <= 'z'; letra++){
            int conteoLetra = conteo.getOrDefault(letra, 0);
            System.out.println(letra+": " + conteoLetra );
        }

    }
}
