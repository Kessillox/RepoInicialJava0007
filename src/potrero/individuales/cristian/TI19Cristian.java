package potrero.individuales.cristian;

import java.util.Scanner;

public class TI19Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean condicion = true;

        while (condicion) {
            System.out.println("----------- PROGRAMA DELETREO v2.0 -----------");
            System.out.println("-----  ***  Menú  ***  -----");
            System.out.println("[1] Invertir y deletrear una cadena de texto.");
            System.out.println("[0] Salir del programa.");
            System.out.println("----------------------------------------------");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Scanner et = new Scanner(System.in);

                    String entradaTexto = "";


                    String invertir = "";

                    char[] Arraycadena;

                    char caracter;

                    int contador = 0;

                    while (entradaTexto == null || entradaTexto.equals("")) {
                        System.out.println("\n-----   Opción 1   -----");
                        System.out.print("Ingrese la cadena de texto a invertir y deletrear: ");

                        entradaTexto = et.nextLine().trim().toLowerCase().replaceAll("\\s+", "");

                        if (entradaTexto.equals("")) {
                            System.out.println("\n Error! El valor ingresado no es válido.");
                            break;
                        }


                        for (int inv = entradaTexto.length() - 1; inv >= 0; inv--) {
                            invertir += entradaTexto.charAt(inv);
                        }

                        Arraycadena = invertir.toCharArray();

                        System.out.println("\n-----   Resultados   -----");
                        System.out.println("Texto invertido: " + invertir);
                        System.out.println("Ocurrencia de letras en la cadena de texto: ");

                        for (int i = 0; i < Arraycadena.length; i++) {

                            caracter = Arraycadena[i];

                            for (int j = 0; j < Arraycadena.length; j++) {
                                if (Arraycadena[j] == caracter) {
                                    contador++;
                                }
                            }
                            System.out.println(Arraycadena[i] + ": " + contador);
                            contador = 0;
                        }
                    }

                    break;
                case 0:
                    condicion = false;
                    System.out.println("\n-----   Opción 2   -----");
                    System.out.println(" Saliste del programa. ");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
