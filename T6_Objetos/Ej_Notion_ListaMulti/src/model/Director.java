package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;


@Getter
@Setter
public class Director extends Persona{
    private String dirigir;


    public Director(){}
    public Director(String nombre, String dni, String dirigir) {
        super(nombre, dni);
        this.dirigir = dirigir;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("trabaja como director"+ dirigir);
    }

    @Override
    public void insertarDatosPersona() {
        Director d = new Director();
        super.insertarDatosPersona();
        Scanner sc=new Scanner(System.in);
        System.out.println("Que trabajo de direccion realizará");
        setDirigir(sc.next());
    }
}
