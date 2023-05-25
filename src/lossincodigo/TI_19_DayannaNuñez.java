package lossincodigo;

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

        String[] array =new String[cadena.length()];
        for (int x=0; x< cadena.length(); x++ ){
            char caracter;
            caracter= cadena.charAt(x);

            array[x]= String.valueOf(caracter);
            System.out.println(array[x]);
        }
        for (char ch ='A'; ch<='Z'; ch++){
            System.out.print(ch);
        }
        }public static void main(String[] args) {
        capacitacion();
    }
}
