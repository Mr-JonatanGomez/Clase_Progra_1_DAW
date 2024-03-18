package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter@Getter
public class Libro extends Media{
    private int iSBN, paginas;

    public Libro(int id, int tamano, String titulo, String autor, String formato, int iSBN, int paginas) {
        super(id, tamano, titulo, autor, formato);
        this.iSBN = iSBN;
        this.paginas = paginas;
    }

    public Libro() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+getISBN());
        System.out.println("Nº de paginas: : "+getPaginas());
    }
    @Override
    public void insertarDatos() {

        super.insertarDatos();
        Scanner sc= new Scanner(System.in);
        System.out.print("ISBN: ");
        setISBN(sc.nextInt());
        System.out.print("Paginas: ");
        setPaginas(sc.nextInt());
    }
    @Override
    public void mostrarDaatosResumen() {
        super.mostrarDaatosResumen();
        System.out.println("Tipo: Libro");
    }
}
