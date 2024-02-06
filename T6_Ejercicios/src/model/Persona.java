package model;

import java.util.Scanner;

public class Persona {
    private String nombre, apellido, dni, genero;
    private int edad;
    private double altura, peso;


    public Persona() {
        this.dni = "11111111X";
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

    public Persona(String nombre, String apellido, String dni, String genero, int edad, double altura, double peso) {
        Scanner sc = new Scanner(System.in);
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public void mostrarDatos() {
        System.out.println("Los datos de la Persona son");
        System.out.println("Nombre completo: " + getNombre() + " " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Edad: " + getEdad());
        System.out.println("Condiciones físicas: " + getAltura() + " cm y " + getPeso() + " kg.");
    }

    public void incrementoEdad(int incremento) {
        edad += incremento;
    }

    public double iMC(double peso, double altura) {

        double alturaEnMetros = altura / 100;
        double indiceMasaCorporal = peso / (alturaEnMetros * alturaEnMetros);
        System.out.println("El IMC es:❤ ❤\uFE0F" + indiceMasaCorporal);
        return indiceMasaCorporal;
    }

    public void estadoFisico() {
        double imcEstadoFisico= iMC(getPeso(),getAltura());
        if (genero.equalsIgnoreCase("hombre")) {
            if (imcEstadoFisico > 37) {
                System.out.println("¡¡Cuidado!! Tienes Obesidad grado III,Obesidad Morbida");
            } else if (imcEstadoFisico >= 32 && imcEstadoFisico <= 36.99) {
                System.out.println("Tienes Obesidad gradoII, Obesidad");
            } else if (imcEstadoFisico >= 26.99 && imcEstadoFisico <= 31.99) {
                System.out.println("Tienes Obesidad gradoI,Sobrepeso más comunmente FOFISANO");
            } else if (imcEstadoFisico >= 20 && imcEstadoFisico <= 26.99) {
                System.out.println("Tienes peso normal");
            } else {
                System.out.println("¡¡Cuidado!!, estas en delgadez");
            }
        } else if (genero.equalsIgnoreCase("mujer")) {
            if (imcEstadoFisico > 34) {
                System.out.println("¡¡Cuidado!! Tienes Obesidad grado III,Obesidad Morbida");
            } else if (imcEstadoFisico >= 29 && imcEstadoFisico <= 33.99) {
                System.out.println("Tienes Obesidad gradoII, Obesidad");
            } else if (imcEstadoFisico >= 24 && imcEstadoFisico <= 28.99) {
                System.out.println("Tienes Obesidad gradoI,Sobrepeso más comunmente FOFISANO");
            } else if (imcEstadoFisico >= 18.5 && imcEstadoFisico <= 23.99) {
                System.out.println("Tienes peso normal");
            } else {
                System.out.println("¡¡Cuidado!!, estas en delgadez");
            }
        }

        /*-
        Peso inferior al normal		Menos de 18.5
- Normal		18.5 – 24.9
- Peso superior al normal		25.0 – 29.9
- Obesidad		Más de 30.0*/
    }
    /*
    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica
    la siguiente formula IMC = peso / (altura * altura)*/

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
