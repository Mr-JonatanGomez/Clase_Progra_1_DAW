package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class LibroPoliciaco extends Libro{
    private Trama trama;

    public LibroPoliciaco() {}


    public LibroPoliciaco(String titulo, String autor, String isbn, int paginas, Trama trama) {
        super(titulo, autor, isbn, paginas);
        this.trama = trama;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trama: " + trama);
    }
}
