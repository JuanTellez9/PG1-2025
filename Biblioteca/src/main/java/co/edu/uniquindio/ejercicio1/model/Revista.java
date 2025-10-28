package co.edu.uniquindio.ejercicio1.model;

public class Revista extends Recurso {

    private int numeroEdicion;
    private String periodicidad;

    public Revista(int numeroEdicion, String periodicidad,int id, String titulo, String autor, String anoPublicacion) {
        super(id,titulo,autor,anoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
    }
}
