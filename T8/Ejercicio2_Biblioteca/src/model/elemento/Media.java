package model.elemento;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public abstract class Media extends Elemento {
    private int yearEdicion;

    public Media() {
    }

    public Media(int id, String titulo, String seccion, boolean disponible, int yearEdicion) {
        super(id, titulo, seccion, disponible);
        this.yearEdicion = yearEdicion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Año de edición: " + getYearEdicion());
    }

    @Override
    public void crearDatos() {
        super.crearDatos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce año de edición:");
        setYearEdicion(sc.nextInt());
    }
}
