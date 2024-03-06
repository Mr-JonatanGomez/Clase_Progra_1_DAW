package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Persona {
    protected String dni, nombre, correo;

    public void mostrarDatos(){
        System.out.println("dni "+dni);
        System.out.println();
    }

}
