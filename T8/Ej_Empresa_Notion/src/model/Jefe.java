package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Jefe extends Trabajador {
    private int percAcciones, percBenef;

    public Jefe (String nombre, String apellido, String dni, int percAcciones, int percBenef){
        super(nombre, apellido, dni);
        this.percAcciones=percAcciones;
        this.percBenef=percBenef;
    }
    @Override
    public void trabajar() {
        System.out.println(getNombre()+"El jefe va a trabajar");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(getNombre());
        System.out.println(getApellido());
        System.out.println(getDni());
        System.out.println(getPercAcciones());
        System.out.println(getPercAcciones());
    }
}
