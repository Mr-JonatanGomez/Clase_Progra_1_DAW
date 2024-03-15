package model.persona;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public abstract class Persona {
    private String nombre, apellido, dni;

    public Persona() {}

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("DNI: "+getDni());

    }
    public void crearDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        setNombre(sc.next());
        System.out.println("Apellido: ");
        setApellido(sc.next());
        System.out.println("DNI: ");
        setDni(sc.next());

    }
}
