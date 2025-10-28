package co.edu.uniquindio.ejercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Habitaculos {
    private int id;
    private String area,temperatura,humedad;
    private List<Animal> listAnimal;
    private Tipo tipo;

    public Habitaculos(int id, String area, String temperatura, String humedad, Tipo tipo) {
        this.id = id;
        this.area = area;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.listAnimal = new ArrayList<>();
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(List<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    @Override
    public String toString() {
        return "Habitaculos{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", humedad='" + humedad + '\'' +
                ", listAnimal=" + listAnimal +
                '}';
    }
}
