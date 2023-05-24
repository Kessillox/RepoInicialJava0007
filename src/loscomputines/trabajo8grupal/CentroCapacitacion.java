package loscomputines.trabajo8grupal;

public class CentroCapacitacion {

    public static void main(String[] args) {

        CapacitacionComputines capGeneral = new CapacitacionComputines();


        System.out.println("=========================");
        System.out.println("CENTRO DE CAPACITACIONES");
        System.out.println("=========================");

        //Toma los datos los asistente de la empresa
        capGeneral.datosCapacitacion();

        //Segunda toma de datos
        //Ahora toma los datos, de la capacitacion misma
        capGeneral.datosInstancia();

        //CUANDO HAGO LA IMPRESION DESDE EL METEDO DE ARRIBA, SE QUEDA PEGADO DESDE CUANDO PIDE "Ingrese Cantidad Asistente", asi que hasta ahi me quede
        //si quieres modificar el codifo y hacerlo de otra manera dale nomas

        //Muestra de datos
        //capGeneral.muestraDatos();
        capGeneral.toString();

        //no me sigue




    }

}
