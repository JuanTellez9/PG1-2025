package co.uniquindio.poo.model;

public class Veterinario {
    private String nombre, cedula,telefono;

    public Veterinario(String nombre, String cedula, String telefono) {
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
