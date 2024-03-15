package model.elemento;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public abstract class Lectura extends Elemento {
    private int iSBN;


    public Lectura (){}

    public Lectura(int id, String titulo, String seccion, boolean disponible, int iSBN) {
        super(id, titulo, seccion, disponible);
        this.iSBN = iSBN;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN: "+getISBN());
    }

    @Override
    public void crearDatos() {
        Scanner sc = new Scanner(System.in);
        super.crearDatos();
        System.out.println("Introduce ISBN:");
        setISBN(sc.nextInt());
    }
}
