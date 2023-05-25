import java.util.Scanner;

public class Usocharat {
    public static void main(String[] args) {
        String ingreso ="";
        while(ingreso.isEmpty()) {

            System.out.println("Ingrese una Frase o Palabra:");
            Scanner sf = new Scanner(System.in);
            ingreso = sf.nextLine();
            if (!(ingreso.isEmpty())) {
                for (int i = 0; i < ingreso.length(); i++) {
                    System.out.println(ingreso.charAt(i));
                }
            }else{
                System.out.println("***************************");
                System.out.println("Ingrese una Frase o Palabra");
                System.out.println("****************************");
            }
        }

    }
}