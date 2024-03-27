package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LibroPoliciaco extends Libro{
    private Trama trama;

    public LibroPoliciaco() {}


    public LibroPoliciaco(String titulo, String autor, int paginas, int isbn, Trama trama) {
        super(titulo, autor, paginas, isbn);
        this.trama = trama;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trama: " + trama);
    }
}
