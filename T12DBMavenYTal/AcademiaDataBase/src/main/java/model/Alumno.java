package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Alumno {
    private int id;// autoIncremental en la BASE DE DATOS
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;


    public Alumno(String nombre, String apellido, String correo, int telefono) {
        //NO NECESITAMOS ID, porque en la database será autoincremental
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
}
