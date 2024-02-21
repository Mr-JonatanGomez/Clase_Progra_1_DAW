package model;

public class Garaje {


    private Coche coche;
    private String averiaAsociada;
    private int numeroCochesAtendidos;


    public void aceptarCoche(Coche coche, String averiaAsociada) {
        if (coche == null) {
            this.coche = coche;
            this.averiaAsociada=averiaAsociada;
            this.numeroCochesAtendidos=numeroCochesAtendidos;
            numeroCochesAtendidos++;
        }
    }

    public void devolverCoche(Coche coche, String averiaAsociada) {
            this.coche = coche;
            coche = null;

    }
}

