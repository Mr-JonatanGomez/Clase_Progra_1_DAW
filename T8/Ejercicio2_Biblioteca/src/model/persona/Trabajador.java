package model.persona;

import lombok.Getter;
import lombok.Setter;
import model.persona.Persona;

@Setter
@Getter

public class Trabajador extends Persona {

    public Trabajador(){}

    public Trabajador(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);

    }
}
