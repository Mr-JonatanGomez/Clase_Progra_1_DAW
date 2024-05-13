package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {

    private String nombre, correo, password;

    public Usuario() {}

    public Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre+", " +
                "correo = " + correo+ ", " +
                "password = " + password);

    }
    /**
     *
     */
}
