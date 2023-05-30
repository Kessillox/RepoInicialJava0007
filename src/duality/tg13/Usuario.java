package duality.tg13;

public class Usuario {
    private String rut;
    private String nombre;
    private String fechaNac;

    public Usuario(){}

    public Usuario(String rut, String nombre, String fechaNac){
        this.rut=rut;
        this.nombre=nombre;
        this.fechaNac=fechaNac;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                '}';
    }
}



