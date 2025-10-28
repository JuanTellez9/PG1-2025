package co.uniquindio.poo.model;

public class Mascota {
    private String nombre, raza;
    private int id, edad;

    public Mascota(String nombre, String raza, int id, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "mascota{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
