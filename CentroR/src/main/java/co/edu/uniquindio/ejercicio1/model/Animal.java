package co.edu.uniquindio.ejercicio1.model;

import java.util.List;

public class Animal {
    private int id;
    private String especie,sexo,peso,edadM;
    private List<Caso> listcaso;

    public Animal(int id, String especie, String sexo, String peso, String edadM) {
        this.id = id;
        this.especie = especie;
        this.sexo = sexo;
        this.peso = peso;
        this.edadM = edadM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdadM() {
        return edadM;
    }

    public void setEdadM(String edadM) {
        this.edadM = edadM;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso='" + peso + '\'' +
                ", edadM='" + edadM + '\'' +
                ", listcaso=" + listcaso +
                '}';
    }
}
