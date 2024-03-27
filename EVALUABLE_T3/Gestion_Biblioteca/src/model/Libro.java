package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Libro {
    private String titulo, autor;
    private int paginas, isbn;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
    }


    public void mostrarDatos() {
        System.out.println("\ntitulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("paginas: " + paginas);
        System.out.println("ISBN: " + isbn);

    }
}
