package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public abstract class Media {
    private int id, tamano;
    private String titulo, autor, formato;

    public Media() {
    }

    public Media(int id, int tamano, String titulo, String autor, String formato) {
        this.id = id;
        this.tamano = tamano;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

    public void mostrarDatos() {

        System.out.println("\nnumero id " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de Formato: " + formato);
        System.out.println("Tamaño del archivo: " + tamano);
    }
    public void insertarDatos() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce los datos que se pidan");
        System.out.print("\nnumero id: ");
        setId(sc.nextInt());
        System.out.print("Titulo: ");
        setTitulo(sc.next());
        System.out.print("Autor: ");
        setAutor(sc.next());
        System.out.print("Tipo de Formato: ");
        setFormato(sc.next());
        System.out.print("Tamaño del archivo: ");
        setTamano(sc.nextInt());
    }
    public void mostrarDaatosResumen(){
        System.out.println("\nTitulo: " + titulo);

    }

}