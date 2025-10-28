package co.edu.uniquindio.ejercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class CentroR {
    private int id,telefono;
    private String nombre,departamento,licencia;
    private List<Caso> listcaso;
    private List<Clinica> listclinicas;
    private List<Animal> listanimal;
    public CentroR(int id, int telefono, String nombre, String departamento, String licencia) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.departamento = departamento;
        this.licencia = licencia;
        this.listcaso = new ArrayList<Caso>();
        this.listclinicas = new ArrayList<Clinica>();
        this.listanimal = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Caso> getListcaso() {
        return listcaso;
    }

    public void setListcaso(List<Caso> listcaso) {
        this.listcaso = listcaso;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public List<Clinica> getListclinicas() {
        return listclinicas;
    }

    public void setListclinicas(List<Clinica> listclinicas) {
        this.listclinicas = listclinicas;
    }

    public List<Animal> getListanimal() {
        return listanimal;
    }

    public void setListanimal(List<Animal> listanimal) {
        this.listanimal = listanimal;
    }

    @Override
    public String toString() {
        return "CentroR{" +
                "id=" + id +
                ", telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", licencia='" + licencia + '\'' +
                ", listcaso=" + listcaso +
                ", listclinicas=" + listclinicas +
                ", listanimal=" + listanimal +
                '}';
    }
}
