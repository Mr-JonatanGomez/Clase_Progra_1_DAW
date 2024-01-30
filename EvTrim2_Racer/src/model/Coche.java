package model;

import java.util.Scanner;

public class Coche {
    //las opciones que tiene el coche
    private String marca, modelo, matricula;
    private int cv, velocidad, kmRecorridos;

    public Coche() {
    }// Coche default

    public Coche(String marca, String modelo, String matricula, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

    public int aceleron(int aceleracion) {
        Scanner sc = new Scanner(System.in);


        int kmPorRecorrer;


/*
        System.out.println("Indica cuanto quieres acelerar esta vuelta");
        aceleracion = sc.nextInt();
*/

        if (cv < 100) {
            velocidad += (int) (Math.random() * aceleracion);
            kmPorRecorrer = velocidad / 2;
            System.out.println("entra por -100 los km:"+kmPorRecorrer);

        } else {
            velocidad += (int) (Math.random() * aceleracion)+10;
            kmPorRecorrer = velocidad / 2;
            System.out.println("entra por +100 los km:"+kmPorRecorrer);
        }

        kmRecorridos += kmPorRecorrer;

        System.out.println("Los kilometros recorridos hasta ahora por coche son" + kmRecorridos);
        return kmRecorridos;// ESTO ES OK, funciona bien
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + this.marca);// o nombre sin this, cuando acostumbremos
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + cv + " cv");
        System.out.println("Matricula: " + matricula);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidadMaxima(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}


