package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
@NoArgsConstructor
public abstract class Trabajador {
    private String nombre, apellido, dni;

    public Trabajador(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public abstract void trabajar();
    public void mostrarDatos(){
        System.out.println("\nNombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("DNI: "+getDni());
    }

    public void agregarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre");
        setNombre(sc.next());
        System.out.println("Introduce apelliedo");
        setApellido(sc.next());
        System.out.println("Introduce DNI");

        setDni(sc.next());

    }
}
