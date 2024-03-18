package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public abstract class Persona {
    private String nombre, dni;

    public Persona() {}

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
    }
    public void insertarDatosPersona(){
        Scanner sc= new Scanner(System.in);

        System.out.println("\nNombre: ");
        setNombre(sc.next());
        System.out.println("DNI: ");
        setNombre(sc.next());

    }

}
