package co.uniquindio.poo;

import co.uniquindio.poo.model.Mascota;
import co.uniquindio.poo.model.Cita;
import co.uniquindio.poo.model.Veterinario;
import co.uniquindio.poo.model.Propietario;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario("juan", "123", "122122");
        Veterinario veterinario2 = new Veterinario("pato", "1233", "2121221");

        Propietario propietario = new Propietario("Jose", "222", "1213131", "jchwiheidhwi");
        Propietario propietario1 = new Propietario("luis", "3231", "1323313", "ajsdjadaj");

        Mascota mascota = new Mascota("farruko","gato",5 ,3);
        Mascota mascota1 = new Mascota("farruko","gato",5,3);

        Cita cita = new Cita("3456","28/08/2025","8:00",veterinario,mascota,propietario);

        System.out.println(cita.toString());

    }
}