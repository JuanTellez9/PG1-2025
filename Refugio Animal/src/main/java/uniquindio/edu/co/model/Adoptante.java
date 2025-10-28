package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Adoptante {
    private String nombreCompleto;
    private String direccion;
    private int tel;
    private String referenciaPersonal;
    private List<Animal> listAnimal;
    public Adoptante(String nombreCompleto, String direccion, int tel, String referenciaPersonal) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.tel = tel;
        this.referenciaPersonal = referenciaPersonal;
        this.listAnimal = new ArrayList<Animal>();

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getReferenciaPersonal() {
        return referenciaPersonal;
    }

    public void setReferenciaPersonal(String referenciaPersonal) {
        this.referenciaPersonal = referenciaPersonal;
    }

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(List<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    @Override
    public String toString() {
        return "Adoptante{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tel=" + tel +
                ", referenciaPersonal='" + referenciaPersonal + '\'' +
                ", listAnimal=" + listAnimal +
                '}';
    }
}
