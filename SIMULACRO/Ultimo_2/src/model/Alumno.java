package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Alumno {
    String nombre, apellido, correo;
    double notaMedia;

    public Alumno(String nombre, String apellido, String correo, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
