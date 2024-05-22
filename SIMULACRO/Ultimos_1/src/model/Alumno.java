package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Alumno {
    /*1.	Crea un programa que permita gestionar los alumnos matriculados en un centro. Para ello crea las siguientes
      clases con sus métodos y atributos:
            a.	Alumno: cada uno de los alumnos tendrá nombre, apellido, calificación, dni y número de matrícula.
                Los métodos de los que dispondrá son mostrarDatos y los constructores que consideres necesarios
       */
    private String nombre, apellido, dni;
    private double calificacion;
    private int matricula;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("\nNumero de matricula = " + matricula);
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("calificacion = " + calificacion);

    }
}
