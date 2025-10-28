package uniquindio.edu.co.model;

public class Medicamento {
    private String nombre;
    private int id;
    private Categoria categoria;

    public Medicamento(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", categoria=" + categoria +
                '}';
    }
}
