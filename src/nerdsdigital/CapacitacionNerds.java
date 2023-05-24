package nerdsdigital;

import javax.swing.*;

public class CapacitacionNerds {

    public static void main(String[] args) {
        //Datos identificacion capacitacion
        int id = 0;
        String rutCliente = "";
        String nombreCliente = "";
        String direcciónCliente = "";
        String comunaCliente = "";
        String numeroTelefonoCliente = "";

        //Datos informativos capacitacion
        String día = "";
        String hora = "";
        String lugar = "";
        String duración = "";
        int cantidadDeAsistentes = 0;

        // Datos Asistentes
        String nombreAsistente = "";
        int edadAsistente = 0;

        //Datos funcionamiento
        int nCapacitaciones = 0;

        nCapacitaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de capacitaciones que desea ingresar")
        );
        for (int i = 0; i < nCapacitaciones; i++) {
            id +=1;
            do {
                rutCliente = JOptionPane.showInputDialog("Ingrese el rut del cliente");
            }while (rutCliente.isBlank());
            do {
               nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
            }while (nombreCliente.isBlank());
            do {
               direcciónCliente = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
            }while (direcciónCliente.isBlank());
            do {
                comunaCliente = JOptionPane.showInputDialog("Ingrese la comuna del cliente");
            }while (comunaCliente.isBlank());
            do {
                numeroTelefonoCliente = JOptionPane.showInputDialog("Ingrese el telefono del cliente");
            }while(numeroTelefonoCliente.isBlank());


        }


    }

}
