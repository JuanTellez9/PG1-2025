package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Refugio {
    private String nombre;
    private String ubicacion;
    private int telefono;
    private List<Animal> listAnimal;
    private List<Voluntario> listVoluntario;

    public Refugio(String nombre, String ubicacion, int telefono) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.listAnimal = new ArrayList<>();
        this.listVoluntario = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(List<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    public List<Voluntario> getListVoluntario() {
        return listVoluntario;
    }

    public void setListVoluntario(List<Voluntario> listVoluntario) {
        this.listVoluntario = listVoluntario;
    }

    @Override
    public String toString() {
        return "Refugio{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", telefono=" + telefono +
                ", listAnimal=" + listAnimal +
                ", listVoluntario=" + listVoluntario +
                '}';
    }
}
