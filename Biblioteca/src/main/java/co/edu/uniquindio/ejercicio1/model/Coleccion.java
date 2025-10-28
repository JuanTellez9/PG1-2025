package co.edu.uniquindio.ejercicio1.model;

import java.util.List;

public class Coleccion {

    private int id;
    private String nombre;
    private List<Recurso> listRecurso;

    public Coleccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
