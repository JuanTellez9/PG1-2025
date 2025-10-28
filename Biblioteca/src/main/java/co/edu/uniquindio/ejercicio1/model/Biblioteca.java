package co.edu.uniquindio.ejercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String ubicacion;
    private int telefono;
    private List<Usario> listUsario;
    private List<Coleccion> listColeccion;

    public Biblioteca(String nombre, String ubicacion, int telefono) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.listUsario = new ArrayList<Usario>();
    }
}
