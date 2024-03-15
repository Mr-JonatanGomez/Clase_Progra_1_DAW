package model.elemento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CD extends Media{

    public CD() {}

    public CD(int id, String titulo, String seccion, boolean disponible, int yearEdicion) {
        super(id, titulo, seccion, disponible, yearEdicion);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
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
