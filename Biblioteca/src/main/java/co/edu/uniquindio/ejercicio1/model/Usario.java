package co.edu.uniquindio.ejercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Usario {
    private String nombre;
    private String correo;
    private int id;
    private List<Prestamo> listPrestamo;

    public Usario(String nombre, String correo, int id) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.listPrestamo = new ArrayList<Prestamo>();
    }
}
