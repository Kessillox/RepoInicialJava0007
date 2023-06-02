package loscomputines.grupal12m4.grupal10;
/**
 * en esta clase tuvimos que correguir algunos errores y malas practicas
 * @version 01-06-2023
 * @author Sergio, Livio, Geneis, Nazaly
 * @var ola, i, mensaje, constante
 * **/
import java.util.Scanner;
public class grupal10computines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
        int dia = 0, cantidadAsistente=0, nota=0, contador=0;
        String lugar = null, hora = null, duracion=null;

        System.out.println("Ingrese cantidad de asistentes en la capasitacion, por favor");
        //Pidiendo el numero de asistente
        cantidadAsistente=scanner.nextInt();
        do {

            contador++;
            System.out.println("Numero de Asistente: "+contador);
            do {
                System.out.println("Ingrese dia de capasitacion por favor ");
                dia = scanner.nextInt();
            }while (dia <= 0);
            scanner.nextLine();

            do {
                System.out.println("Ingrese la Hora de la capacitacion, por favor");
                hora = scanner.next();
            }while (hora == "");
            scanner.nextLine();

            do {
                System.out.println("Ingrese el lugar de la capacitacion, por favor");
                lugar=scanner.next();
            }while (lugar == "");
            scanner.nextLine();

            do {
                System.out.println("Ingrese la duracion de la capasitacion, por favor");
                duracion=scanner.next();
            }while (duracion == "");
            //Pidiendo datos

            do {
                //Creando Array para almacenar los nombres de los asistentes
                String [][] matriz = new String[cantidadAsistente][2];
                scanner.nextLine();//limpia el scanner

                //Recorrriendo el Array
                for (int i=0; i<cantidadAsistente; i++){

                    for (int j=0; j<2; j++){

                        if (j==0){
                            System.out.print("Ingrese su nombre: ");
                            matriz[i][j]= scanner.next();
                        }
                        if (j==1){
                            do {
                                System.out.print("Ingrese su calificaion: ");
                                System.out.println("Para un bueno resultado escriba su nota asi:" + "10,20,30,40,50,60,70" + ", asi no tendra errores en su promedio");
                                nota = Integer.parseInt(matriz[i][j]= scanner.next());

                                if (nota<=9 || nota>70){
                                    System.out.println("Numero ingresado incorrecto");
                                }
                            }while (nota<=9|| nota>70);

                        }
                    }
                }

                for (int i=0; i<cantidadAsistente; i++){
                    System.out.println("Dia: " + dia);
                    System.out.println("Hora: " + hora);
                    System.out.println("Lugar: " + lugar);
                    System.out.println("Duracion: " + duracion);
                    for (int j=0; j<2; j++){
                        System.out.print(matriz[i][j] + " " );
                        System.out.println("");
                    }

                }

            }while (cantidadAsistente<=0);

        }while (contador < cantidadAsistente);

    }

}
