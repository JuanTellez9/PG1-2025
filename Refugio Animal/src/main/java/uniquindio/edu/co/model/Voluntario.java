package uniquindio.edu.co.model;

public class Voluntario {
    private String nombre;
    private int telefono;
    private int id;
    private Tarea tarea;

    public Voluntario(String nombre, int telefono, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
        this.tarea = null;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Voluntario{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", id=" + id +
                ", tarea=" + tarea +
                '}';
    }
}
