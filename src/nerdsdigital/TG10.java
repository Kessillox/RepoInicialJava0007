package nerdsdigital;

import javax.swing.*;

/*Integrantes: Gonzalo Alonzo
               Nehemías Muñoz
               Manuel Pinot
 */
public class TG10 {

    public static void main(String[] args) {
        //Datos identificacion capacitacion
        int id = 0;
        String rutCliente = "";
        String nombreCliente = "";
        String direccionCliente = "";
        String comunaCliente = "";
        String numeroTelefonoCliente = "";

        //Datos informativos capacitacion
        String diaCapacitacion = "";
        String horaCapacitacion = "";
        String lugarCapacitacion = "";
        String duracionCapacitacion = "";
        //int cantidadAsistentes = 0;

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
                direccionCliente = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
            }while (direccionCliente.isBlank());
            do {
                comunaCliente = JOptionPane.showInputDialog("Ingrese la comuna del cliente");
            }while (comunaCliente.isBlank());
            do {
                numeroTelefonoCliente = JOptionPane.showInputDialog("Ingrese el telefono del cliente");
            }while(numeroTelefonoCliente.isBlank());
            do {
                diaCapacitacion = JOptionPane.showInputDialog("Ingrese el dia de la capacitacion");
            }while(diaCapacitacion.isBlank());
            do {
                horaCapacitacion = JOptionPane.showInputDialog("Ingrese el hora de la capacitacion");
            }while(horaCapacitacion.isBlank());
            do {
                lugarCapacitacion = JOptionPane.showInputDialog("Ingrese el lugar de la capacitacion");
            }while(lugarCapacitacion.isBlank());
            do {
                duracionCapacitacion =  JOptionPane.showInputDialog("Ingrese la duración de la capacitacion en minutos");
            }while(duracionCapacitacion.isBlank());

        }
        int cantidadAsistentes = 0;
        int menores25 = 0;
        int entre26y35 = 0;
        int mayores35 = 0;

        cantidadAsistentes = Integer.parseInt(JOptionPane.showInputDialog("cantidad de asistentes")
        );
        for (int i = 0; i < cantidadAsistentes; i++) {
            id +=1;

            do {
                nombreAsistente = JOptionPane.showInputDialog("Ingrese el nombre del asistente");
            }while(nombreAsistente.isBlank());
            do {
                edadAsistente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del asistente"));

                if (edadAsistente <= 25) {
                    menores25++;
                } else if (edadAsistente >= 26 && edadAsistente <= 35) {
                    entre26y35++;
                } else {
                    mayores35++;
                }
            }while (edadAsistente < 18 || edadAsistente > 60);


        }

        System.out.println("Datos de la empresa:");
        System.out.println("RUT: " + rutCliente);
        System.out.println("Nombre: " + nombreCliente);
        System.out.println("Dirección: " + direccionCliente);
        System.out.println("Comuna: " + comunaCliente);
        System.out.println("Teléfono: " + numeroTelefonoCliente);

        System.out.println("Datos de la capacitación:");
        System.out.println("Día: " + diaCapacitacion);
        System.out.println("Hora: " + horaCapacitacion);
        System.out.println("Cantidad de asistentes: " + cantidadAsistentes);
        System.out.println("Menores de 25 años: " + menores25);
        System.out.println("Entre 26 y 35 años: " + entre26y35);
        System.out.println("Mayores de 35 años: " + mayores35);

    }
}
