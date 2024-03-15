package model.elemento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Libro extends Lectura{
    private int paginas;
    private String autor, editorial;

    public Libro (){}

    public Libro(int id, String titulo, String seccion, boolean disponible, int iSBN, int paginas, String autor, String editorial) {
        super(id, titulo, seccion, disponible, iSBN);
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }
}
