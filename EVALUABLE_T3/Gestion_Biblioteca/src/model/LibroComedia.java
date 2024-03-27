package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LibroComedia extends Libro{
    private TipoHumor tipoHumor;

    public LibroComedia() {}


    public LibroComedia(String titulo, String autor, int paginas, int isbn, TipoHumor tipoHumor) {
        super(titulo, autor, paginas, isbn);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de humor: " + tipoHumor);
    }
}
