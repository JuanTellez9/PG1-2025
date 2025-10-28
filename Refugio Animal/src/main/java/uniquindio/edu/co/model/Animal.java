package uniquindio.edu.co.model;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;
    private String estadoSalud;
    private String fechaIngreso;
    private boolean adoptado;
    private Nacio nacio;

    public Animal(String nombre, String especie, int edad, String estadoSalud, String fechaIngreso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
        this.fechaIngreso = fechaIngreso;
        this.adoptado = false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", estadoSalud='" + estadoSalud + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", adoptado=" + adoptado +
                '}';
    }
}
