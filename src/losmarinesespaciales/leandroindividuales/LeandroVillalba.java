package losmarinesespaciales.leandroindividuales;
import java.util.*;

public class LeandroVillalba {
    public static void main(String[] args) {


        String frase;
        char caracter;
        int vocales, consonantes, espacios;
        vocales = 0;
        consonantes = 0;
        espacios = 0;
        frase = "";
        Scanner entrada = new Scanner(System.in);


        while(frase.length() == 0)
        {


            System.out.println("Ingrese una palabra o frase:");
            frase = entrada.nextLine();
            System.out.println("");




            if (frase.length()>0) {
                System.out.println("");
                for (int i=0; i < frase.length(); i++) {
                    caracter = frase.charAt(i);
                    System.out.println(caracter);
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        vocales++;

                    }
                    else if (caracter == ' ') {
                        espacios++;
                    }

                    else {
                        consonantes++;
                    }

                }

                System.out.println("");
                System.out.println("*****************************************************");
                System.out.println("");
                System.out.println("La cantidad de vocales es: " + vocales);
                System.out.println("La cantidad de consonantes es: " + consonantes);
                System.out.println("La cantidad de espacios es: " + espacios);
                System.out.println("");
                System.out.println("*****************************************************");
            }


        }
        entrada.close();

    }
}
