package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class LibroComedia extends Libro{
    private TipoHumor tipoHumor;

    public LibroComedia() {}


    public LibroComedia(String titulo, String autor, String isbn, int paginas, TipoHumor tipoHumor) {
        super(titulo, autor, isbn, paginas);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de humor: " + tipoHumor);
    }
}
