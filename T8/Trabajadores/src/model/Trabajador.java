package model;

import lombok.*;


@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Trabajador extends Persona{
    private int salario;

    public Trabajador(String dni, String nombre, String correo, int salario) {
        super(dni, nombre, correo);
        this.salario = salario;
    }

    public abstract void trabajar();

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}
