package model;

import java.util.Scanner;

public class Coche {
    private String marca, modelo, matricula;
    private int cv, velocidad, kmRecorridos, puntosGeneral, puntosCarrera;

    private int posicionCarrera, posicionGeneral;

    public Coche() {
    }// Coche default

    public Coche(String marca, String modelo, String matricula, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = 0;
        this.kmRecorridos = 0;
        this.puntosGeneral = 0;
        this.puntosCarrera = 0;
        this.posicionCarrera = 0;
    }

    public void acelerar(int aceleracion) {

        int kmHechosConAcelerar;
        aceleracion = (int) (Math.random() * 50) + 10;


        if (cv < 100) {
            velocidad += (int) (Math.random() * aceleracion);
            kmHechosConAcelerar = velocidad / 2;

        } else if (cv >= 100 && cv <= 200) {
            velocidad += (int) (Math.random() * aceleracion) + 10;
            kmHechosConAcelerar = velocidad / 2;
        } else {
            velocidad += (int) (Math.random() * aceleracion) + 20;
            kmHechosConAcelerar = velocidad / 2;
        }

        kmRecorridos += kmHechosConAcelerar;

    }

    public void mostrarDatosCoche() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca y modelo: " + this.marca + this.modelo);// o nombre sin this, cuando acostumbremos
        System.out.println("Potencia: " + cv + "cv\n");
    }

    public void mostrarDatosCocheClasfCarrera() {

        if (posicionCarrera == 1) {
            System.out.println("🥇 " + posicionCarrera + "º " + matricula + " " + puntosCarrera + " puntos 🥇");
        } else if (posicionCarrera == 2) {
            System.out.println("🥈 " + posicionCarrera + "º " + matricula + " " + puntosCarrera + " puntos 🥈");
        } else if (posicionCarrera == 3) {
            System.out.println("🥉 " + posicionCarrera + "º " + matricula + " " + puntosCarrera + " puntos 🥉");
        } else {
            System.out.println(posicionCarrera + "º " + matricula + " " + puntosCarrera + " puntos");
        }

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

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuntosGeneral() {
        return puntosGeneral;
    }

    public void setPuntosGeneral(int puntosGeneral) {
        this.puntosGeneral = puntosGeneral;
    }

    public int getPuntosCarrera() {
        return puntosCarrera;
    }

    public void setPuntosCarrera(int puntosCarrera) {
        this.puntosCarrera = puntosCarrera;
    }

    public int getPosicionCarrera() {
        return posicionCarrera;
    }

    public void setPosicionCarrera(int posicionCarrera) {
        this.posicionCarrera = posicionCarrera;
    }

    public int getPosicionGeneral() {
        return posicionGeneral;
    }

    public void setPosicionGeneral(int posicionGeneral) {
        this.posicionGeneral = posicionGeneral;
    }
}


