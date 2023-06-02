package loscomputines.grupal12m4.grupal09;

/**
 * la clase CentroCapacitaón sirve para poder "compilar" todas las otras clases funciones
 * @version 01-06-2023
 * @author Sergio, Livio, Geneis, Nazaly
 * @var
 * **/
public class CentroCapacitacion {

    public static void main(String[] args) {
        CapacitacionComputines capComputines = new CapacitacionComputines();

        capComputines.datosEmpresa();
        capComputines.datosCapacitacion();
        capComputines.mostrarDatosGenerales();
        capComputines.datosAsistentes();
        capComputines.pruebaDATOS();
        
        
    }
}
