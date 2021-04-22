package prueba_instituto;

public class Alumno {
    String nombre;
    String apellido;
    String dni;
    int id;
    public static int idgnerator=1;
    String unidad;

    public Alumno(String nombre, String apellido, String dni, int id, String unidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = idgnerator;
        idgnerator++;
        this.unidad= unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                ", unidad='" + unidad + '\'' +
                '}';
    }
}
