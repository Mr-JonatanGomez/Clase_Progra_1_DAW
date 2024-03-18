package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter@Setter
public class Actor extends Persona{
    private String actuar;

    public Actor() {}

    public Actor(String nombre, String dni, String actuar) {
        super(nombre, dni);
        this.actuar = actuar;
    }

    @Override
    public void insertarDatosPersona() {
        super.insertarDatosPersona();
        Scanner sc=new Scanner(System.in);


    }
}
