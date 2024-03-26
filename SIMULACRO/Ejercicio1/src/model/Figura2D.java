package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Figura2D{
    private String nombre;
    private double perimetro=0;

    public Figura2D() {}

    public Figura2D(String nombre, double perimetro) {
        this.nombre = nombre;
        this.perimetro = perimetro;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("perimetro = " + perimetro);
    }





}
