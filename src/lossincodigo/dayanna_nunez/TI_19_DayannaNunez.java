package lossincodigo.dayanna_nunez;

import java.util.ArrayList;
import java.util.Scanner;

public class TI_19_DayannaNunez {
    public static void capacitacion(){

        String cadena="a";

        Scanner sc = new Scanner(System.in);
        do {
            if(!cadena.isEmpty()){
                System.out.println("Ingrese valor  ");
                cadena = sc.nextLine();
            }else{
                System.out.println("Ingrese valor valido ");
                cadena = sc.nextLine();
            }
            /*System.out.println(!cadena.isEmpty()?"Ingrese valor  ":"Ingrese valor valido ");
            cadena = sc.nextLine();*/
        }while(cadena.isEmpty());
        //Una clase string de tipo array
        //Primero va el tipo de dato y como este es cadena queda []
        //Esto es para ingresar un string:
        String[] arrayTextoACaracter =new String[cadena.length()];
        //para el integer seria asi: Integer[] arrEntero= new Integer[obligatorioIngresarDimensiones];
        // Estas son otros tipos de clase: Character, Double, Float, Long...
        //Cuando es Arraylist no es necesario ingresar la dimension
        ArrayList nombreCliente = new ArrayList();
        for (int x=0; x< cadena.length(); x++ ){
            char caracter;
            caracter= cadena.charAt(x);

            arrayTextoACaracter[x]= String.valueOf(caracter);
            System.out.println(arrayTextoACaracter[x]);
        }
        //nuestro array abecedario llenaremos desde la a hasta la z
        ArrayList<Character> arrayAbecedario= new ArrayList<>();
        for (char ch ='A'; ch<='Z'; ch++){
            arrayAbecedario.add(ch);
        }
        ArrayList<Integer> arrayContador = new ArrayList<>();
        for (int p = 0; p < arrayAbecedario.toArray().length ;p++){
            //como es una clase objeto el arrylist se agregan datos en el add en este caso se inicializa
            //el contenido en 0
            arrayContador.add(0);
            //este for recorrera el temaño de nuestro array textocaracter
            //como este array es tipo string el for de manera diferente
            for (int i = 0; i < arrayTextoACaracter.length; i++) {

                //equuals ignore case: ignora si es mayusculas o minusculas
                //array tipo string :arrayTextoACaracter[i]
                //array tipo arraylist: arrayAbecedario.get(p)
                if(arrayTextoACaracter[i].equalsIgnoreCase(String.valueOf(arrayAbecedario.get(p)))){
                    /*con el array.set atualizamos el valor y le sumamos lo que cintiene array +1*/
                    arrayContador.set(p, arrayContador.get(p)+1);

                }
            }
        }
        for (int k =0;k<arrayAbecedario.toArray().length; k++){
            System.out.print(k%5!=0 ? arrayAbecedario.get(k) + " = " + arrayContador.get(k)+" |":"\n"+arrayAbecedario.get(k) + " = " + arrayContador.get(k)+" |");
        }
        System.out.println();
        /*for (char x: arrayAbecedario){
            System.out.print(x);
        }
        for (int c: arrayContador){
            System.out.print(c);
        }*/
        /*for (char u:arrayAbecedario) {
            if(u=='A'||u=='B'|| u=='C'){
                System.out.println(u);
            }
        }*/
        /*for (char u:arrayAbecedario) {
            for (int g:arrayContador) {
                System.out.print(u+" "+g+" ");
            }
            System.out.println();
        }*/
    }public static void main(String[] args) {
        capacitacion();
    }
}
