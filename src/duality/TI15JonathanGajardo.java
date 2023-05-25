package duality;

import java.util.Scanner;

public class TI15JonathanGajardo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar primer operando");
        float n1 = sc.nextFloat();
        sc.nextLine();

        System.out.println("Ingresar segundo operando");
        float n2 = sc.nextFloat();
        sc.nextLine();

        String signo = "";
        while (!signo.equals("+") && !signo.equals("-") && !signo.equals("x") && !signo.equals(":") && !signo.equals("/")) {
            System.out.println("Ingresar uno de los siguientes simbolos: (+) (-) (x) (:) (/)");
            signo = sc.nextLine();
        }

        switch (signo) {
            case "+" -> System.out.print("Resultado: " + (n1 + n2));
            case "-" -> System.out.print("Resultado: " + (n1 - n2));
            case "x" -> System.out.print("Resultado: " + (n1 * n2));
            case ":" -> System.out.print("Resultado: " + (n1 / n2));
            case "/" -> System.out.print("Resultado: " + (n1 % n2));
        }
    }
}
