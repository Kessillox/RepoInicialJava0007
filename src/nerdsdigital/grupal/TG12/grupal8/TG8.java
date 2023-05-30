package nerdsdigital.grupal.TG12.grupal8;
import javax.swing.*;
/*Integrantes: Gonzalo Alonzo
               Nehemías Muñoz
               Manuel Pinot
 */
public class TG8 {

    public static void main(String[] args) throws Exception {
        String nombre = "";
        String fechaDeNacimiento = "";
        String run = "";
        int numeroUsuarios = 0;
        String tipoUsuario = "";
        String direccion = "";
        String telefono = "";
        int cantidadEmpleados = 0;
        String aniosExperiencia = "";
        String departamento = "";
        String funcion = "";
        String nombreSuperior = "";
        numeroUsuarios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de clientes"));
        for (int i = 0; i < numeroUsuarios; i++) {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
            fechaDeNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del usuario");
            run = JOptionPane.showInputDialog("Ingrese el run del usuario");
            JOptionPane.showMessageDialog(null,"Ingrese el tipo de usuario");
            tipoUsuario = JOptionPane.showInputDialog(" - Cliente \n - Profesional \n - Administrativo");
            switch (tipoUsuario.toLowerCase().trim()){
                case "cliente":
                    direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
                    telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente");
                    cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Empleados del cliente"));
                    break;
                case "profesional":
                    aniosExperiencia = JOptionPane.showInputDialog("Ingrese los años de experiencia del profesional");
                    departamento = JOptionPane.showInputDialog("Ingrese el departamento del profesional");
                    break;
                case "administrativo":
                    funcion = JOptionPane.showInputDialog("Ingrese la funcion del administrativo");
                    nombreSuperior = JOptionPane.showInputDialog("Ingrese la funcion del administrativo");
                    break;
            }
        }
        String mensaje = nombre +" "+ fechaDeNacimiento +" "+ run +" "+ direccion+ " "+ telefono +" "+ cantidadEmpleados+ " "+ aniosExperiencia+ " "+ departamento + " "+ funcion +" "+ nombreSuperior;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
