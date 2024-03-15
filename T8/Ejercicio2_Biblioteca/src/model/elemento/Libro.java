package model.elemento;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Libro extends Lectura {
    private int paginas;
    private String autor, editorial;

    public Libro() {
    }

    public Libro(int id, String titulo, String seccion, boolean disponible, int iSBN, int paginas, String autor, String editorial) {
        super(id, titulo, seccion, disponible, iSBN);
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Autor del libro: " + getAutor());
        System.out.println("Editorial: " + getEditorial());
        System.out.println("Nº de paginas: " + getPaginas());
    }

    @Override
    public void crearDatos() {
        Scanner sc = new Scanner(System.in);
        super.crearDatos();
        System.out.println("Autor del libro: ");
        setAutor(sc.next());
        System.out.println("Editorial: ");
        setEditorial(sc.next());
        System.out.println("Nº de paginas: ");
        setPaginas(sc.nextInt());
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
