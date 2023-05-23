package lossincodigo;
import java.util.Scanner;

public class JuanMerino {

    // INDIVIDUAL 15
    public static void individual15() {
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("***** Simulador de Calculadora *****\n");

        // componentes
        System.out.println("Ingresa el primer operando:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo operando:");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el símbolo de la operación que deseas realizar entre los operandos");
        String operando = sc.next();
        // System.out.println("Operación a realizar: " + Integer.toString(num1) + " " + operando + " " + Integer.toString(num2));
        System.out.format("Operación a realizar: %d %s %d%n", num1, operando, num2);

        // operaciones
        int resultado = switch (operando) {
            case "+" -> num1 + num2; // suma
            case "-" -> num1 - num2; // resta
            case "x" -> num1 * num2; // multiplicación
            case ":" -> num1 / num2; // división
            case "/" -> num1 % num2; // módulo
            default -> 0;
        };

        System.out.format("RESULTADO: %d", resultado);
    }

    public static void main(String[] args) {
        individual15();
    }
}
