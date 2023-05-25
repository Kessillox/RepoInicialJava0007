package nerdsdigital;

public class TG11 {

    /*package Clase11; //Debe comenzar en minúscula
    public class $EjeMpl0_2 { // $ No está permitido y solo la primera letra en mayúscula a no ser que exista otra palabra.
        public static void main(String[] args) {
            final boolean valorconstante = false; //valorConstante , boolean no pueder ser final
            String mensaje = "Lorem ipsum dolor sit amet,
            consectetur adipiscing elit. Donec facilisis est ac ante viverra,
            vel efficitur leo consequat. Maecenas quis lorem sit amet diam
            consequat lacinia non nec lacus. Phasellus egestas quam non dui
            dictum, sed fermentum dolor efficitur. Aliquam volutpat ex
            sodales pulvinar scelerisque. Donec sodales cursus tortor eu
            aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in
            faucibus orci luctus et ultrices posuere cubilia curae;
            Suspendisse pretium, quam non consectetur scelerisque, diam
            tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at
            consequat enim. Orci varius natoque penatibus et magnis dis
            parturient montes, nascetur ridiculus mus. Donec sit amet
            ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

            //Mensaje no se toma como String

            int Ola; //Ola debe ser con minúscula y debe usarse una constante
            Ola = 10;
            for (int i=0;
                 i<Ola;i++) { //for debiera estar en una sola línea

                System.out.println("Valor: " + (i*i));
            }
//Esto es un comentario
//demasiado grande
//para que esté en una
//sola línea

// Debe usarse comentario para párrafo

            System.out.println( "El mensaje " + " es" + mensaje); //Concatena dos Strings seguidos
            System.out.println(" El valor de la constante es: " +
                    valorconstante); //valorConstante //Debe ser una sola línea
        }
    }*/

    //package clase11;
    public static class Ejemplo0_2 {
        public static void main(String[] args) {
            final boolean valorConstante = false;
            String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra, vel efficitur leo consequat. Maecenas quis lorem sit amet diam consequat lacinia non nec lacus. Phasellus egestas quam non dui dictum, sed fermentum dolor efficitur. Aliquam volutpat ex sodales pulvinar scelerisque. Donec sodales cursus tortor eu aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse pretium, quam non consectetur scelerisque, diam tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";
            int ola = 10;
            for (int i = 0; i < ola; i++) {

                System.out.println("Valor: " + (i * i));
            }
/*Esto es un comentario
demasiado grande
para que esté en una
sola línea*/
            System.out.println("El mensaje es " + mensaje);
            System.out.println(" El valor de la constante es: " + valorConstante);
        }
    }
}

