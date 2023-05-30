package losprofes.clases;

import java.util.List;

/**
 * Esta es la clase que define al objeto Alumno, contiene 7 atributos.....
 * @author felipekessibustos
 * @version 1.0
 * @see losprofes.clases.Persona
 * @see <a href="https://koders.cl">Koders.cl</a>
 */
public class Alumno extends Persona{
    //Atributos de la clase
    private int id;
    private String strNombreColegio;
    private String strCurso;
    private String strProfesorJefe;
    private int intSala;
    private float fltPromedio;
    /**
     * Atributo notas, tipo Lista de Nota
     */
    private List<Nota> notas;

    /**
     * Constructor de la clase Alumno
     * @param id
     * @param strNombreColegio
     * @param strCurso
     * @param strProfesorJefe
     * @param intSala
     * @param fltPromedio
     * @param notas
     */
    public Alumno(int id, String strNombreColegio, String strCurso, String strProfesorJefe, int intSala, float fltPromedio, List<Nota> notas) {
        this.id = id;
        this.strNombreColegio = strNombreColegio;
        this.strCurso = strCurso;
        this.strProfesorJefe = strProfesorJefe;
        this.intSala = intSala;
        this.fltPromedio = fltPromedio;
        this.notas = notas;
    }

    /**
     * Constructor de la clase con herencia
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param edad
     * @param altura
     * @param id
     * @param strNombreColegio
     * @param strCurso
     * @param strProfesorJefe
     * @param intSala
     * @param fltPromedio
     * @param notas
     */
    public Alumno(String nombre, String apellido1, String apellido2, int edad, float altura, int id, String strNombreColegio, String strCurso, String strProfesorJefe, int intSala, float fltPromedio, List<Nota> notas) {
        super(nombre, apellido1, apellido2, edad, altura);
        this.id = id;
        this.strNombreColegio = strNombreColegio;
        this.strCurso = strCurso;
        this.strProfesorJefe = strProfesorJefe;
        this.intSala = intSala;
        this.fltPromedio = fltPromedio;
        this.notas = notas;
    }

    /**
     * Constructor vacío
     */
    public Alumno() {
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrNombreColegio() {
        return strNombreColegio;
    }

    public void setStrNombreColegio(String strNombreColegio) {
        this.strNombreColegio = strNombreColegio;
    }

    public String getStrCurso() {
        return strCurso;
    }

    public void setStrCurso(String strCurso) {
        this.strCurso = strCurso;
    }

    public String getStrProfesorJefe() {
        return strProfesorJefe;
    }

    public void setStrProfesorJefe(String strProfesorJefe) {
        this.strProfesorJefe = strProfesorJefe;
    }

    public int getIntSala() {
        return intSala;
    }

    public void setIntSala(int intSala) {
        this.intSala = intSala;
    }

    public float getFltPromedio() {
        return fltPromedio;
    }

    public void setFltPromedio(float fltPromedio) {
        this.fltPromedio = fltPromedio;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    /**
     * Metodo toString
     * @return toString de la calse
     */
    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", strNombreColegio='" + strNombreColegio + '\'' +
                ", strCurso='" + strCurso + '\'' +
                ", strProfesorJefe='" + strProfesorJefe + '\'' +
                ", intSala=" + intSala +
                ", fltPromedio=" + fltPromedio +
                ", notas=" + notas +
                '}';
    }

    /**
     *
     * @param notas lista de notas obtenidas por el alumno
     * @return Devuelve aprobacion tipo boolean, true para mayores o iguales a 4.0
     * @author Jonathan
     */
    public Boolean apobar(List<Nota> notas){
        boolean aprobacion = false;
        float promedio = 0;
        for (Nota nota : notas) {
            promedio += nota.getNota();
        }
        if (promedio / notas.size() >= 4.0) {
            aprobacion = true;
        }
        return aprobacion;
    }
}
