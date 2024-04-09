package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Libro {
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


}
