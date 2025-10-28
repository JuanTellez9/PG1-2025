package uniquindio.edu.co.model;

public class Perro extends Animal {
    private String raza;
    private String nivelAdistramiento;
    public Perro(String nombre, String especie, int edad, String estadoSalud, String fechaIngreso,String raza,String nivelAdistramiento) {
        super(nombre, especie, edad, estadoSalud, fechaIngreso);
        this.raza = raza;
        this.nivelAdistramiento = nivelAdistramiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNivelAdistramiento() {
        return nivelAdistramiento;
    }

    public void setNivelAdistramiento(String nivelAdistramiento) {
        this.nivelAdistramiento = nivelAdistramiento;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nivelAdistramiento='" + nivelAdistramiento + '\'' +
                '}';
    }
}
