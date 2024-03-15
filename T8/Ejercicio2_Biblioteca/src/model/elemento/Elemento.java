package model.elemento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Elemento {
    private int id;
    private String titulo, seccion;
    boolean disponible;

    public Elemento(){}

    public Elemento(int id, String titulo, String seccion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.seccion = seccion;
        this.disponible = disponible;
    }
}
