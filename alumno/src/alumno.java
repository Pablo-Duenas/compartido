public class alumno {

    private String nia;
    private String dni;
    private String nombre;

    public alumno(String nia, String dni, String nombre) {
        this.nia = nia;
        this.dni = dni;
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "alumno{" +
                "nia='" + nia + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
