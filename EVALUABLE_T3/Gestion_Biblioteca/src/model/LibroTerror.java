package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LibroTerror extends Libro{
    private int calificacion;

    public LibroTerror() {}



    public LibroTerror(String titulo, String autor, int paginas, int isbn, int calificacion) {
        super(titulo, autor, paginas, isbn);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("calificacion: +" + calificacion);
    }
}
