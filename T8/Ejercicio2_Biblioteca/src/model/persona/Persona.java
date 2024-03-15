package model.persona;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Persona {
    private String nombre, apellido, dni;

    public Persona() {}

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
