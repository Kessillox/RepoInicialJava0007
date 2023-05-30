package losmarinesespaciales.grupales.grupal_11_marines;

public class Grupal_11_Marines {
    public static void main(String[] args) {

        final boolean VALOR_CONSTANTE = false;

        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac" +
                         "ante viverra, vel efficitur leo consequat. Maecenas quis lorem sit amet diam con" +
                         "sequat lacinia non nec lacus. Phasellus egestas quam non dui dictum, sed ferment" +
                         "um dolor efficitur. Aliquam volutpat ex sodales pulvinar scelerisque. Donec soda" +
                         "les cursus tortor eu aliquam. Curabitur id purus arcu. Vestibulum ante ipsum" +
                         "primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse" +
                         "pretium, quam non consectetur scelerisque, diam tortor iaculis arcu, nec" +
                         "tincidunt diam eros sed urna. Ut at consequat enim. Orci varius natoque" +
                         "penatibus et magnis dis parturient montes, nascetur ridiculus mus." +
                         "Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        int repetirHasta = 10;

        for (int i = 0; i < repetirHasta; i++) {

            System.out.println("Valor: " + (i * i));
        }
    }
}

/*

############## CODIGO ORIGINAL CON ERRORES ##########################

package Clase11; <-- El package siempre es minusculas y aca esta en Capitalize Format y tiene el nombre Clase cuando es un package (Ademas debe tener el nombre del paquete no de clase)
public class $EjeMpl0_2 { <-- El nombre de la clase debe ser en Capitalize Format (La priemra letra de la palabra en mayusculas) y no tener $ ni mayusculas entre letras.
public static void main(String[] args) {
final boolean valorconstante = false; <-- El nombre valorconstante esta mal, debe ser en mayusculas, por lo que seria VALOR_CONSTANTE
String mensaje = "Lorem ipsum dolor sit amet,...... <-- El mensaje se separo en diferentes concatenaciones para hacerlo mas legible ya que estaba ordenado por defecto de forma
                                                  erronea, ni siquiera formaba un String


int Ola; <-- Si bien una variable puede llevar cualquier nombre, por convencion se indica que debe ser una palabra existente y descriptiva de lo que se va a operar, sin embargo estaria bien
             Por lo menos escribir hola como corresponde. Ademas de eso la variable se inicializo en la misma linea, considero que se ajusta mas asi a los estandares.
Ola = 10; Se cambio el nombre de la variable de Ola a repetirHasta que es mas descriptivo e indica hasta donde debe repetir el for
for (int i=0;i<Ola;i++) { <-- El for en si esta bien sintacticamente, el problema radica en que es dificil de leer al estar todos los caracteres de la variable i sin espaciado entre expresioens y operadores

System.out.println("Valor: " + (i*i));
}

############################# FIN LUIS ########################################################################
//Esto es un comentario
//demasiado grande
//para que esté en una
//sola línea
System.out.println( "El mensaje " + " es" + mensaje);
System.out.println(" El valor de la constante es: " +
valorconstante);
}
}



*/