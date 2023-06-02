package loscomputines.grupal12m4.grupal09;

/**
 * esta clase sirve para almacenar los datos de los asistentes
 * @version 01-06-2023
 * @author Sergio, Livio, Geneis, Nazaly
 * @var nombreAsistente, edadAsistente
 * **/

//OBJETO ASISTENTE
public class AsistenteCapacitacion {
    
    //ATRIBUTOS
    private String nombreAsistente;
    private int edadAsistente;

    //CONSTRUCTOR VACIO Y CON DATOS
    public AsistenteCapacitacion() { }

    public AsistenteCapacitacion(String nombreAsistente, int edadAsistente) {
        this.nombreAsistente = nombreAsistente;
        this.edadAsistente = edadAsistente;
    }

    //SETTERS
    public void setEdadAsistente(int edadAsistente) {
        this.edadAsistente = edadAsistente;
    }

    public void setNombreAsistente(String nombreAsistente) {
        this.nombreAsistente = nombreAsistente;
    }

    //GETTERS
    public int getEdadAsistente() {
        return edadAsistente;
    }

    public String getNombreAsistente() {
        return nombreAsistente;
    }

    //TO STRING
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
