package co.edu.uniquindio.ejercicio1.model;

public class Tesis extends Recurso{

    private String programaAcademico;
    private String director;

    public Tesis(String programaAcademico, String director,int id,String titulo,String autor,String anoPublicacion) {
        super(id,titulo,autor,anoPublicacion);
        this.programaAcademico=programaAcademico;
        this.director=director;
    }
}
