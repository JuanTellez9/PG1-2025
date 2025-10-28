package co.edu.uniquindio.ejercicio1.model;

public class Caso {
    private int id;
    private String fechaI,prioridad;
    private TipoAtencion tipoAtencion;
    private Estado estado;

    public Caso(int id, String fechaI, String prioridad, TipoAtencion tipoAtencion, Estado estado) {
        this.id = id;
        this.fechaI = fechaI;
        this.prioridad = prioridad;
        this.estado=estado;
        this.tipoAtencion=tipoAtencion;

    }

    public TipoAtencion getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(TipoAtencion tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Caso{" +
                "id=" + id +
                ", fechaI='" + fechaI + '\'' +
                ", prioridad='" + prioridad + '\'' +
                '}';
    }
}
