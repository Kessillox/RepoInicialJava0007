package techtitans.grupales.clase11;

public class Ejemplo02 {
    public static void main(String[] args) {
        final boolean VALOR_CONSTANTE = false;
        String mensaje = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra,\n";
        mensaje +=" vel efficitur leo consequat. Maecenas quis lorem sit amet diam consequat lacinia non nec lacus. \n";
        mensaje +="Phasellus egestas quam non dui dictum, sed fermentum dolor efficitur. Aliquam volutpat ex sodales \n";
        mensaje +="pulvinar scelerisque. Donec sodales cursus tortor eu aliquam. Curabitur id purus arcu. Vestibulum \n";
        mensaje +="ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse pretium, \n";
        mensaje +="quam non consectetur scelerisque, diam tortor iaculis arcu, nec tincidunt diam eros sed urna. \n";
        mensaje +="Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus \n";
        mensaje+="mus. Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        int hola = 10;

        System.out.println("===============================");
        System.out.println("Los valores de hola son: ");
        for (int i = 0; i < hola; i++) {
            System.out.println("Valor: " + (i * i));
        }
        /* Esto es un comentario
            demasiado grande
             para que esté en una
             sola línea*/

        System.out.println("===============================");
        System.out.println("El mensaje es: " + mensaje);
        System.out.println(" El valor de la constante es: " + VALOR_CONSTANTE);
    }
}
