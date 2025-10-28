package co.uniquindio.poo.model;


public class Cita {
    private String id,fecha,hora;
    private Veterinario veterinario;
    private Mascota mascota;
    private Propietario propietario;

    public Cita(String id, String fecha, String hora, Veterinario veterinario, Mascota mascota, Propietario propietario){
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.propietario = propietario;
    }


    @Override
    public String toString() {
        return "Cita{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", veterinario=" + veterinario +
                ", mascota=" + mascota +
                ", propietario=" + propietario +
                '}';
    }
}
