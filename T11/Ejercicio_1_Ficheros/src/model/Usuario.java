package model;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;

@Getter
@Setter
public class Usuario implements Serializable {
    private static final long serialVersionUID  = 188694844646455564L;
    private String nombre, apellido, dni;
    private int telefono, edad;

    public Usuario(String nombre, String apellido,String dni, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.edad=edad;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                '}';
    }


}
