package uniquindio.edu.co.model;

public class Gato extends Animal {
    private String tipopelaje;
    private String comportamiento;

    public Gato(String nombre, String especie, int edad, String estadoSalud, String fechaIngreso, String tipopelaje, String comportamiento) {
        super(nombre, especie, edad, estadoSalud, fechaIngreso);
        this.tipopelaje = tipopelaje;
        this.comportamiento = comportamiento;
    }

    public String getTipopelaje() {
        return tipopelaje;
    }

    public void setTipopelaje(String tipopelaje) {
        this.tipopelaje = tipopelaje;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "tipopelaje='" + tipopelaje + '\'' +
                ", comportamiento='" + comportamiento + '\'' +
                '}';
    }
}
