package losmarinesespaciales.cristianindividuales;
import java.util.Scanner;
public class CristianIndividual23 {
    public static void main(String[] args){
        String texto= "";
        Scanner entrada  = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una palabra o frase: \n(se invertirán minúsculas por mayúsculas y viceversa)");
            texto = entrada.nextLine();
            String resultado = "";

                for (int i = 0; i < texto.length(); i++) {
                    char caracter = texto.charAt(i);

                    if (Character.isUpperCase(caracter)) {
                        resultado += Character.toLowerCase(caracter);
                    } else if (Character.isLowerCase(caracter)) {
                        resultado += Character.toUpperCase(caracter);
                    } else {
                        resultado += caracter;
                    }
                }

                System.out.println("Texto transformado: " + resultado);

                System.out.print("¿Desea ingresar una nueva frase? (Sí/No): ");
                String respuesta = entrada.nextLine();

                if (respuesta.equalsIgnoreCase("No")) {
                    break;
                }
            }
            entrada.close();
            System.out.println("Fin del programa");
        }
    }

