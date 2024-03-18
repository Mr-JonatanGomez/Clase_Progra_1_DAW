package model;

import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

@Getter@Setter
public class Video extends Media{
    private Director director;
    private Actor actor;
    private ArrayList<Actor>listaActores;
    private ArrayList<Director>listaDirectores;



    public Video() {

        this.listaActores = new ArrayList<>();
        this.listaDirectores = new ArrayList<>();

    }

    public Video(int id, int tamano, String titulo, String autor, String formato, Director director, ArrayList<Actor> listaActores) {
        super(id, tamano, titulo, autor, formato);
        this.director = director;
        this.listaActores = new ArrayList<>();
        this.listaDirectores = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: "+director);
        System.out.println("Actores: ");
        for (Actor item:listaActores) {
            System.out.print(item+",");
        }
    }

    @Override
    public void insertarDatos() {

        super.insertarDatos();
        Director d = new Director();
        Actor ac = new Actor();

        System.out.print(" DATOS DEL DIRECTOR ");
        d.insertarDatosPersona();
        listaDirectores.add(d);
        System.out.print("Cuantos actores hay?:");
        Scanner sc= new Scanner(System.in);
        int opcion=sc.nextInt();
        int contadorActor=1;
        for (int i = 0; i < opcion; i++) {
            System.out.println("INTRODUCE LOS DATOS DEL ACTOR "+contadorActor);
            contadorActor++;
            ac.insertarDatosPersona();
            listaActores.add(ac);
        }
    }

    @Override
    public void mostrarDaatosResumen() {
        super.mostrarDaatosResumen();
        System.out.println("Tipo: Video");
        for (Director item:listaDirectores) {
            System.out.println("Director:\n"+item.getNombre());
        }
        System.out.println("Actores:");

        for (Actor item:listaActores) {
            System.out.println(item.getNombre());
        }
    }
}
