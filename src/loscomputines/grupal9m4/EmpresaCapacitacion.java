package loscomputines.grupal9m4;


//OBJETO EMPRESA QUE CONTENDRA INFORMACION (ATRIBUTOS)
public class EmpresaCapacitacion {

    // ATRIBUTOS PROPIAS DE LA CLASE
    private int rut;
    private String nombre;
    private String direccion;
    private String comuna;
    private int numeroTelefono;

    //CONSTRUCTORES VACIOS Y CON DATOS
    public EmpresaCapacitacion() { }

    public EmpresaCapacitacion(int rut, String nombre, String direccion, String comuna, int numeroTelefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        this.numeroTelefono = numeroTelefono;
    }

    //SETTERS
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    //GETTERS
    public String getComuna() {
        return comuna;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getRut() {
        return rut;
    }

    //TO STRING
    @Override
    public String toString() {
        return super.toString();
    }

    





}
