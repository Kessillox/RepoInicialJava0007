package nerdsdigital;

import java.util.Scanner;

public class ManuelPinot {

    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        double numero1, numero2, resultado;

        char operador;

        System.out.println("El primer número es: ");
        numero1 = calculadora.nextDouble();

        System.out.println("El segundo número es: ");
        numero2 = calculadora.nextDouble();

        System.out.println("Escriba el operador (+, -, *, /, %): ");
        operador = calculadora.next().charAt(0);


        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;

            case '/':
                resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
                break;

            case '%':
                resultado = numero1 % numero2;
                System.out.println("El resultado del resto es: " + resultado);
                break;

            default:
                System.out.println("El operador no es válido");
                break;
        }
    }
}

