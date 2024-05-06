package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Profesor {
    private int id;
    private String nombre;
    private String correo;
    private double sueldo;

    public Profesor(String nombre, String correo, double sueldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.sueldo = sueldo;
    }
}
