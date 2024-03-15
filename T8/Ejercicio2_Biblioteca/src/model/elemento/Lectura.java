package model.elemento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Lectura extends Elemento {
    private int iSBN;


    public Lectura (){}

    public Lectura(int id, String titulo, String seccion, boolean disponible, int iSBN) {
        super(id, titulo, seccion, disponible);
        this.iSBN = iSBN;
    }
}
