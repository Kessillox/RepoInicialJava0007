package losmarinesespaciales.grupales.grupal_11_marines;

public class Grupal_11_Marines {
    public static void main(String[] args) {
        final boolean VALOR_CONSTANTE = false;

        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra," +
                " vel efficitur leo consequat." +
                " Maecenas quis lorem sit amet diam consequat lacinia non nec lacus." +
                " Phasellus egestas quam non dui dictum, sed fermentum dolor efficitur." +
                " Aliquam volutpat ex sodales pulvinar scelerisque. Donec sodales cursus tortor eu aliquam." +
                " Curabitur id purus arcu." +
                " Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;" +
                " Suspendisse pretium, quam non consectetur scelerisque, diam tortor iaculis arcu, nec tincidunt diam" +
                " eros sed urna." +
                " Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur" +
                " ridiculus mus." +
                " Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        int repetirHasta = 10;

        for (int i = 0; i < repetirHasta; i++) {

            System.out.println("Valor: " + (i * i));
        }
        /*
        Esto es un comentario
        demasiado grande
        para que esté en una
        sola línea
        */
        System.out.println("El mensaje es" + mensaje);
        System.out.println(" El valor de la constante es: " + VALOR_CONSTANTE);
    }
}

/*

############## CODIGO ORIGINAL CON ERRORES ##########################

package Clase11; <-- El package siempre es minúscula y aca está en Capitalize Format.

public class $EjeMpl0_2 { <-- El nombre de la clase debe ser en Capitalize Format (La primera letra de la palabra en
        mayúsculas) o PascalCase, y no tener caracteres como la "$", ni mayúsculas entre letras.

public static void main(String[] args) {

final boolean valorconstante = false; <-- El nombre valorconstante está mal, al declararse con "final" se asume que es
        una constante, por lo que sería con mayúscula y separado por guion bajo: VALOR_CONSTANTE.

String mensaje = "Lorem ipsum dolor sit amet,...... <-- El mensaje se separó en diferentes concatenaciones para hacerlo
        más legible (máximo 80 caracteres), ya que estaba escrito en forma lineal.

int Ola; <-- Si bien una variable puede llevar cualquier nombre en camelCase, debe ser una palabra existente y
        descriptiva de lo que se va a operar. Además, la indentación debe ser igual a la fila superior si son del mismo
        nivel.
Ola = 10; <-- Por otro lado, la variable se inicializó en la misma línea, consideramos que se ajusta más asi a los
        estandares. Se cambió el nombre de la variable de "Ola" a "repetirHasta" que es más descriptivo e indica hasta donde
        debe repetir el for.

for (int i=0;i<Ola;i++) { <-- El for en sí está bien sintácticamente, el problema radica en que es difícil de leer al
        estar todos los caracteres de la variable i sin espaciado entre expresiones y operadores.

System.out.println("Valor: " + (i*i)); <-- Al igual que la fila anterior, se separa los operadores binarios de sus
        operandos para una mejor legibilidad.
}

//Esto es un comentario  <-- Aquí es necesario utilizar un comentario en bloque, y no uno por cada línea.
//demasiado grande
//para que esté en una
//sola línea

System.out.println( "El mensaje " + " es" + mensaje); <-- Se elimina el espacio delante del string, y se unen las cadenas
        para tener un código más limpio.
System.out.println(" El valor de la constante es: " + valorconstante); <-- Se ajusta la instrucción a una sola fila, y
        además el nombre de la constante: VALOR_CONSTANTE
}
}



*/