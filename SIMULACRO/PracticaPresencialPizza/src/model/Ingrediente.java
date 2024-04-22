package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ingrediente {
    private String nombre;
    private double precio;


    public Ingrediente() {}

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
