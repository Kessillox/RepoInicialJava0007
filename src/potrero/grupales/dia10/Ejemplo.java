package potrero.grupales.dia10;

public class Ejemplo {
    public static void main(String[] args) {

        final boolean FALSO = false;

        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing" +
                " elit. Donec facilisis est ac ante viverra, vel efficitur " +
                "leo consequat. Maecenas quis lorem sit amet diam consequat " +
                "lacinia non nec lacus. Phasellus egestas quam non dui " +
                "dictum, sed fermentum dolor efficitur. Aliquam volutpat ex " +
                "sodales pulvinar scelerisque. Donec sodales cursus tortor " +
                "eu aliquam. Curabitur id purus arcu. Vestibulum ante ipsum " +
                "primis in faucibus orci luctus et ultrices posuere cubilia " +
                "curae; Suspendisse pretium, quam non consectetur " +
                "scelerisque, diam tortor iaculis arcu, nec tincidunt diam " +
                "eros sed urna. Ut at consequat enim. Orci varius natoque " +
                "penatibus et magnis dis parturient montes, nascetur " +
                "ridiculus mus. Donec sit amet ultricies dui. Donec aliquet" +
                " rhoncus velit et sollicitudin.";

        int valor = 10;

        for (int i = 0; i < valor; i++) {
            System.out.println("Valor: " + (i * i));
        }

        /* Esto es un comentario
           demasiado grande
           para que esté en una
           sola línea */

        System.out.println("El mensaje es: " + mensaje);
        System.out.println("El valor de la constante es: " + FALSO);
    }
}
