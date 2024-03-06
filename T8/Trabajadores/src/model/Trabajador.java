package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Trabajador extends Persona{
    private int salario;
    public abstract void trabajar();

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
