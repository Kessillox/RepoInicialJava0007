package nerdsdigital.nehemiasmunoz;

import javax.swing.JOptionPane;

public class
TI23 {

    public static void main(String[] args) throws Exception {
        String cadena;
        String nuevaCadena = "";
        String[] cadenaDividida;
        cadena = JOptionPane.showInputDialog("Ingrese la cadena de texto");
        cadenaDividida = cadena.split("");
        for (int i = 0; i < cadenaDividida.length; i++) {
            if (cadenaDividida[i].toUpperCase() == cadenaDividida[i]) {
                cadenaDividida[i] = cadenaDividida[i].toLowerCase();
            } else {
                cadenaDividida[i] = cadenaDividida[i].toUpperCase();
            }
            nuevaCadena += cadenaDividida[i];
        }
        System.out.println("Cadena Inicial: " + cadena + "\n Cadena Formateada: " + nuevaCadena);
    }

    // Nehemias Muñoz
}
