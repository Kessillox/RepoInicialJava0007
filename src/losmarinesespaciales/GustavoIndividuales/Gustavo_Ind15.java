package losmarinesespaciales.gustavoindividuales;
import java.util.Scanner;

public class Gustavo_Ind15 {
    public static void main(String[] args) {
        float resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        float numero1 = Float.parseFloat(scanner.next());

        System.out.print("Digite el segundo número: ");
        float numero2 = Float.parseFloat(scanner.next());

        System.out.print("Seleccione la Operación: ");
        System.out.print("Suma (+);");
        System.out.print(" Resta (-);");
        System.out.print(" Multiplicación (x);");
        System.out.print(" División (:);");
        System.out.print(" Módulo (/)  ");

        String signo = scanner.next();

        if (signo.equals("+")) {
            resultado = numero1 + numero2;
        } else if (signo.equals("-")) {
            resultado = numero1 - numero2;
        } else if (signo.equals("x")) {
            resultado = numero1 * numero2;
        } else if (signo.equals(":")) {
            resultado = numero1 / numero2;
        } else if (signo.equals("/")) {
            resultado = numero1 % numero2;
        } else {
            System.out.println("Operador no válido");
        }

        System.out.println("El resultado es: " + String.format("%.2f", resultado));

    }

}
