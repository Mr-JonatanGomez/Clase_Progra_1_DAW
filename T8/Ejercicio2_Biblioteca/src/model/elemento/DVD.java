package model.elemento;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

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

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: "+getDirector());
        System.out.println("Actores: "+getActores());
    }

    @Override
    public void crearDatos() {
        super.crearDatos();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de Director:");
        setDirector(sc.next());
        System.out.println("Introduce nombre de Actores:");
        setActores(sc.next());
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
}
