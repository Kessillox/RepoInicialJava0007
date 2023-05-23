public class Main {
    public static void main(String[] args) {

        /*Puedo comentar en parrafo
         * utilizando saltos de linea
         * */

        //Tipos de Datos

        //Instanciar la variable y definirla
        //Tipo de dato, nombre de la variable
        int h;

        int x = 2147483647;
        long z = 2147483650l ;
        boolean y = true;
        boolean a = false;
        float b = 1299384789327432.390328490328403984032948320984304983204983204932840398403455f;
        double c = 49449084948392893049032849023.93844484945589598d;
        char v = 'l';
        char t = 'h';
        char d = 'a';
        char f = 'o';
        System.out.println("Esto es un hola con char: " + t+f+v+d);
        System.out.println("hola");

        String num1 = "1";
        String num2 = "10";

        int n1 = 1;
        int n2 = 10;
        String suma = num1 + num2;
        int suma2 = n1+n2;
        System.out.println(suma);
        System.out.println(suma2);

        String str = "Cadena de char";
        Integer integer = 23;
        Long lonng = 2393920l;
        Double dou = 4234.324;
        Float flo = 349.234f;
        //los nombres de las Clases, SIEMPRE van con Mayúscula
        //los metodo y funciones son minúscula

        /* *************** Condicionales y Ciclos en Java************** */

        double num3 = Math.random()*100+1;
        System.out.println((int) num3);

        if (num3<=5){
            System.out.println("Entramos al if, porque num3 es menor que 5");

        }

    }
}