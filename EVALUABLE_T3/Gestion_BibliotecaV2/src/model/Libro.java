package model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public abstract class Libro implements Serializable {
    private static final long serialVersionUID= 123456789876543210L;
    private String titulo, autor, isbn;
    private int paginas;

    public Libro() {}

    public Libro(String titulo, String autor, String isbn, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public void mostrarDatos(){
        System.out.println("\nTitulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + paginas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
