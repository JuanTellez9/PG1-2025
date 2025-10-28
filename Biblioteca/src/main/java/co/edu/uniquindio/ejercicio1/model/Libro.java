package co.edu.uniquindio.ejercicio1.model;

public class Libro extends Recurso{

    private String isbn;
    private String NumeroPg;

    public Libro(String isbn,String NumeroPg,int id,String titulo, String autor, String anoPublicacion) {
       super(id,titulo,autor,anoPublicacion);
       this.isbn = isbn;
       this.NumeroPg = NumeroPg;
    }
}
