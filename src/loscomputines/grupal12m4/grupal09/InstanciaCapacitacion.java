package loscomputines.grupal12m4.grupal09;

/**
 * esta clase sirve para almacenar la informacion sobre las capacitacions
 * @version 01-06-2023
 * @author Sergio, Livio, Geneis, Nazaly
 * @var dia, hora, lugar, duracion
 * **/

//OBJETO INSTANCIA
public class InstanciaCapacitacion {
    
    //ATRIBUTOS
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;

    //CONSTRUSCTOR VACIO Y CON DATOS
    public InstanciaCapacitacion() { }

    public InstanciaCapacitacion(String dia, String hora, String lugar, int duracion) {
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    //SETTERS
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    //GETTERS
    public String getDia() {
        return dia;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    

    //TO STRING
    @Override
    public String toString() {
        return super.toString();
    }

    



}
