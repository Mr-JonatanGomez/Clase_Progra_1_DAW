package model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class Youtuber implements Serializable {
    private String nombre;
    private int anoCanal;
    private transient double seguidores;


    public Youtuber() {}

    public Youtuber(String nombre, int anoCanal, double seguidores) {
        this.nombre = nombre;
        this.anoCanal = anoCanal;
        this.seguidores = seguidores;
    }

    //toString, para imprimir directamente

    @Override
    public String toString() {
        return "Youtuber{" +
                "nombre='" + nombre + '\'' +
                ", anoCanal=" + anoCanal +
                ", seguidores=" + seguidores +
                '}';
    }
}
