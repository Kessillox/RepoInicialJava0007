package techtitans.grupales.clase11;

/* Integrantes : Cintia Muñoz
                 Joaquin Baeza
                 Hans Schiess
                 Oscar Fernandez*/

public class Ejemplo02 {
    public static void main(String[] args) {

        final boolean VALOR_CONSTANTE = false;

        String parrafoEjemplo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra,\n";
        parrafoEjemplo +=" vel efficitur leo consequat. Maecenas quis lorem sit amet diam consequat lacinia non nec lacus. \n";
        parrafoEjemplo +="Phasellus egestas quam non dui dictum, sed fermentum dolor efficitur. Aliquam volutpat ex sodales \n";
        parrafoEjemplo +="pulvinar scelerisque. Donec sodales cursus tortor eu aliquam. Curabitur id purus arcu. Vestibulum \n";
        parrafoEjemplo +="ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse pretium, \n";
        parrafoEjemplo +="quam non consectetur scelerisque, diam tortor iaculis arcu, nec tincidunt diam eros sed urna. \n";
        parrafoEjemplo +="Ut at consequat enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus \n";
        parrafoEjemplo+="mus. Donec sit amet ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";

        int conteoBucle = 10;

        System.out.println("===============================");
        System.out.println("Los valores son: ");

        for (int i = 0; i < conteoBucle; i++) {
            System.out.println("Valor: " + (i * i));
        }
        /* Esto es un comentario
            demasiado grande
             para que esté en una
             sola línea*/

        System.out.println("===============================");
        System.out.println("El parrafo de ejemplo es: ");
        System.out.println("");
        System.out.println(parrafoEjemplo);
        System.out.println(" El valor de la constante es: " + VALOR_CONSTANTE);
    }
}
