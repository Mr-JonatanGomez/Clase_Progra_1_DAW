package model.elemento;

import lombok.Getter;
import lombok.Setter;
import model.Prestable;

import java.util.Scanner;

@Setter
@Getter
public abstract class Elemento implements Prestable {
    private int id = 1;
    private String titulo, seccion;
    boolean disponible;

    public Elemento(){}

    public Elemento(int id, String titulo, String seccion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.seccion = seccion;
        this.disponible = disponible;
    }

    public void mostrarDatos(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Nº Identificador: "+getId());
        System.out.println("Seccion: "+getId());
        System.out.println("Estado de disponibilidad: "+isDisponible());

    }
    public void crearDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce titulo");
        setTitulo(sc.next());
        id+=id;
        System.out.println("Introduce sección");
        setSeccion(sc.next());
        setDisponible(true);

    }
}
