package lossincodigo.DayannaNuñez;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TI_19_DayannaNuñez {
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

        String[] arrayTextoACaracter =new String[cadena.length()];
        for (int x=0; x< cadena.length(); x++ ){
            char caracter;
            caracter= cadena.charAt(x);

            arrayTextoACaracter[x]= String.valueOf(caracter);
            System.out.println(arrayTextoACaracter[x]);
        }
        ArrayList<Character> arrayAbecedario= new ArrayList<>();
        for (char ch ='A'; ch<='Z'; ch++){
            arrayAbecedario.add(ch);
        }
        ArrayList arrayContador = new ArrayList();
        for (int p = 0; p < arrayAbecedario.toArray().length ;p++){
            arrayContador.add(0);
            for (int i = 0; i < arrayTextoACaracter.length; i++) {
                if(arrayTextoACaracter[i].equalsIgnoreCase(String.valueOf(arrayAbecedario.get(p)))){
                    arrayContador.set(p,1+ ((int)(arrayContador.get(p))));
                }
            }
        }
        for (int k =0;k<arrayAbecedario.toArray().length; k++){
            System.out.print(k%5!=0 ? arrayAbecedario.get(k) + " = " + arrayContador.get(k)+" |":"\n"+arrayAbecedario.get(k) + " = " + arrayContador.get(k)+" |");
        }
    }public static void main(String[] args) {
        capacitacion();
    }
}
