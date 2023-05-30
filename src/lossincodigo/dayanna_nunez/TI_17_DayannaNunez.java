package lossincodigo.dayanna_nunez;

import java.util.Scanner;

public class TI_17_DayannaNunez {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String cadena="a";
            int vocales=0;
            int consonantes=0;

            do {
                System.out.println(cadena.isEmpty()?"Ingrese un valor valido: ":"Ingrese el dato por favor:");
                cadena= sc.nextLine();
            }while (cadena.isEmpty());
            for (int i = 0; i < cadena.length(); i++) {
                String  caracter = String.valueOf(cadena.charAt(i));
                System.out.println(caracter);
                //contains: compara la izquierda con la derecha si existe es true sino es false
                if("aeiou".contains(caracter.toLowerCase()) ){
                    vocales=vocales+1;
                }
                //matches: compara caracteres y puede pregunar en rango
                //tolowercase:convierte en minusculas
                //
                //if((caracter.toLowerCase()).matches("[a-z&&[^aeiou]]")){
                else if((caracter.toLowerCase()).matches("[a-z]") || "Ññ".contains(caracter.toLowerCase())){
                    consonantes=consonantes+1;
                }
            }
            System.out.println("La cantidad de vocales son: "+vocales);
            System.out.println("La cantidad de consonantes son: "+consonantes);
        }
    }

}
