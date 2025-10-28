package uniquindio.edu.co.model;

import java.util.ArrayList;

public class Veterinario extends Voluntario {

    private String ceerftificacion;
    private List<Revision> listRevision;

    public Veterinario(String nombre, int telefono, int id,String ceerftificacion) {
        super(nombre, telefono, id);
        this.ceerftificacion = ceerftificacion;
        this.listRevision = new ArrayList<>();
    }

    public String getCeerftificacion() {
        return ceerftificacion;
    }

    public void setCeerftificacion(String ceerftificacion) {
        this.ceerftificacion = ceerftificacion;
    }

    public List<Revision> getListRevision() {
        return listRevision;
    }

    public void setListRevision(List<Revision> listRevision) {
        this.listRevision = listRevision;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "ceerftificacion='" + ceerftificacion + '\'' +
                ", listRevision=" + listRevision +
                '}';
    }
}
