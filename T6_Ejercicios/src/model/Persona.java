package model;

import java.util.Scanner;

public class Persona {
    private String nombre, apellido, dni;
    private int altura, edad;
    private double peso;


    public Persona() {
        this.dni="11111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String dni) {
        /*un constructor que permita crear una persona con nombre y apellidos,
el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X*/
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "11111111X";

    }

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        Scanner sc = new Scanner(System.in);
        this.nombre=nombre;
        System.out.println("Establece el nombre de la persona");
        setNombre(sc.nextLine());

        this.apellido=apellido;
        System.out.println("Establece el nombre de la persona");
        setApellido(sc.nextLine());
        this.dni=dni;
        this.edad=edad;
        this.altura=altura;
        this.peso=peso;
    }

    public void mostrarDatos(){
        System.out.println("Los datos de la Persona son");
        System.out.println("Nombre completo: "+getNombre()+" "+getApellido());
        System.out.println("DNI: "+getDni());
        System.out.println("Edad: "+getEdad());
        System.out.println("Condiciones físicas: "+getAltura()+" cm y "+getPeso()+" kg.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
