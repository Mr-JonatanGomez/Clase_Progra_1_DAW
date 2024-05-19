package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private String correo;
    private int media;


    public Alumno(String nombre, String apellido, String correo, int media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", media='" + media + '\'' +
                '}';
    }
}
