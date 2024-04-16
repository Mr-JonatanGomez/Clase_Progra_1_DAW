package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    private String nombre, apellido, dni;
    private int telefono, edad;

    public Usuario(String nombre, String apellido, String dni, int telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.edad = edad;
    }


    public void mostrarDatos() {
        System.out.println("nombre= " + nombre);
        System.out.println("apellido=" + apellido);
        System.out.println("dni=" + dni);
        System.out.println("telefono=" + telefono);
        System.out.println("edad=" + edad);

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
