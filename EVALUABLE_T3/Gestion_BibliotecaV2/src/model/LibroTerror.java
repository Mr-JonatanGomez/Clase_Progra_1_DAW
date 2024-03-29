package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class LibroTerror extends Libro{
    private int calificacion;

    public LibroTerror() {}



    public LibroTerror(String titulo, String autor, String isbn, int paginas, int calificacion) {
        super(titulo, autor, isbn, paginas);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Calificacion: +" + calificacion+" años");
    }
}
