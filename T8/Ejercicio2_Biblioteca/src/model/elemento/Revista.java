package model.elemento;

public class Revista extends Lectura{


    public Revista() {}

    public Revista(int id, String titulo, String seccion, boolean disponible, int iSBN) {
        super(id, titulo, seccion, disponible, iSBN);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }

    @Override
    public void crearDatos() {
        super.crearDatos();
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
