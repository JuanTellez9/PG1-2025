package co.edu.uniquindio.ejercicio1.model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private int id;
    private String nombre,capacidad,equipoRayosX;
    private List<Habitaculos> listhabitaculos;
    private Turno turno;

    public Clinica(int id, String nombre, String capacidad, String equipoRayosX,Turno turno) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipoRayosX = equipoRayosX;
        this.listhabitaculos = new ArrayList<Habitaculos>();
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEquipoRayosX() {
        return equipoRayosX;
    }

    public void setEquipoRayosX(String equipoRayosX) {
        this.equipoRayosX = equipoRayosX;
    }

    public List<Habitaculos> getListhabitaculos() {
        return listhabitaculos;
    }

    public void setListhabitaculos(List<Habitaculos> listhabitaculos) {
        this.listhabitaculos = listhabitaculos;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", equipoRayosX='" + equipoRayosX + '\'' +
                ", listhabitaculos=" + listhabitaculos +
                '}';
    }
}
