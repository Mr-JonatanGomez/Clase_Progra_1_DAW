package model.elemento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DVD extends Media{
    private String director, actores;

    public DVD() {}

    public DVD(int id, String titulo, String seccion, boolean disponible, int yearEdicion, String director, String actores) {
        super(id, titulo, seccion, disponible, yearEdicion);
        this.director = director;
        this.actores = actores;
    }
}
