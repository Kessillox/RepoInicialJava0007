package loscomputines.grupal12m4.grupal11;
/**
 * en esta clase tuvimos que correguir algunos errores y malas practicas
 * @version 01-06-2023
 * @author Sergio, Livio, Geneis, Nazaly
 * @var ola, i, mensaje, constante
 * **/
public class Ejempl02   {
    public static void main(String[] args) {
        final boolean constante = false;
        String mensaje = "Loream ipsumdolor sit amet, consectetur adipiscing elit. Donec facilisis est ac ante viverra," +
                "vel efficitur leo consequat lacinia non nec lacus." +
                "Phasllus egestas quam non dui dictum, sed fermentum dolor effecitur. Aliquam volutpat ex sodales" +
                "pulvinar scelerisque.Donec sodales cursus tortor eu aliquam. Curabitur id purus arcu." +
                "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;" +
                "Suspendisse pretium, quam non consectetur scelerisque, diam tortor iaculis arcu," +
                "nec tincidunt diam eroa sed urna. ut at consecuat enim. Orci varius natoque penatibus et" +
                "magnis dis parturient montes, nascetur ridiculus mus. Donec sit amet ultricies dui." +
                "Donec aliquet rhoncus velit et sollicitudin";
        int ola = 10;
        for (int i = 0; i<ola; i++); {
            System.out.println("Valor:" + ola);
        }
        /**Esto es un comentario demasiado grande
        para que este en una sola linea**/
        System.out.println("El mensaje es:" + mensaje);

        System.out.println("El Valor de la constante es" + constante);
        }
    }
