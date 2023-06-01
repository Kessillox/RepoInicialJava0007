package lossincodigo;

/**
 * Clase del ejercicio grupal 11 reescrita para aplicar buenas prácticas y convenciones.
 */
public class TG11_LSC {
    private boolean valorConstante;
    private String mensaje;
    private int ola;

    /**
     * Constructor vacío de la clase Ejemplo2.
     */
    public TG11_LSC() {
        this.valorConstante = false;
        this.mensaje = "";
        this.ola = 0;
    }

    /**
     * Constructor de la clase Ejemplo2.
     * @param mensaje El mensaje del ejemplo.
     * @param ola     El valor de Ola.
     */
    public TG11_LSC(String mensaje, int ola) {
        this.valorConstante = false;
        this.mensaje = mensaje;
        this.ola = ola;
    }

    /**
     * Método principal que ejecuta el ejemplo.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        String mensaje = "Loremipsumdolorsitamet,consecteturadipiscingelit.Donecfacilisisestacanteviverra,"
                + "velefficiturleoconsequat.Maecenasquisloremsitametdiamconsequatlacinianonneclacus."
                + "Phasellusegestasquamnonduidictum,sedfermentumdolorefficitur.Aliquamvolutpatexsodales"
                + "pulvinarscelerisque.Donecsodalescursustortoreualiquam.Curabituridpurusarcu.Vestibulum"
                + "anteipsumprimisinfaucibusorciluctusetultricesposuerecubiliacurae;Suspendissepretium,"
                + "quamnonconsecteturscelerisque,diamtortoriaculisarcu,nectinciduntdiamerossedurna.Ut"
                + "atconsequatenim.Orcivariusnatoquepenatibusetmagnisdisparturientmontes,nascetur"
                + "ridiculusmus.Donecsitametultriciesdui.Donecaliquetrhoncusvelitet";
        int ola = 10;
        lossincodigo.tg12lossincodigo.Clase11.Ejemplo2 example = new lossincodigo.tg12lossincodigo.Clase11.Ejemplo2(mensaje, ola);
        example.runExample();
    }

    /**
     * Ejecuta el ejemplo.
     */
    public void runExample() {
        for (int i = 0; i < ola; i++) {
            System.out.println("Valor:" + (i * i));
        }
        System.out.println("Elmensajees:" + mensaje);
        System.out.println("Elvalor delaconstantees:" + valorConstante);
    }

    /**
     * Establece el mensaje del ejemplo.
     * @param mensaje El mensaje a establecer.
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Obtiene el mensaje del ejemplo.
     * @return El mensaje del ejemplo.
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Establece el valor de ola.
     * @param ola El valor de ola a establecer.
     */
    public void setOla(int ola) {
        this.ola = ola;
    }

    /**
     * Obtiene el valor de ola.
     * @return El valor de ola.
     */
    public int getOla() {
        return ola;
    }
}
