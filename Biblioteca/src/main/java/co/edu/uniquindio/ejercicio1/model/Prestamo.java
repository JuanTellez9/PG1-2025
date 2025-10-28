package co.edu.uniquindio.ejercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private int codigo;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private List<Recurso> listRecurso;

    public Prestamo (int codigo, String fechaInicio, String fechaFin, String estado) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.listRecurso = new ArrayList<>();
    }
}
