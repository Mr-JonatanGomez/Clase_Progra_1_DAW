package model;

import java.util.Scanner;

public class Coche {
    private String marca, modelo, matricula;
    private int cv, velocidad, aceleracion, kmRecorridos, puntosGeneral, puntosCarrera;

    private int posicionCarrera, posicionGeneral, carrerasGanadas, carrerasSegundo, carrerasTercero, numeroPodios;
    private int carrerasGanadasTotales, carrerasSegundoTotales, carrerasTerceroTotales, podiosTotales, recordPersonal;

    private int  mundialesGanados, mundialesSegundo, mundialesTercero;

    public Coche() {
    }// Coche default

    public Coche(String marca, String modelo, String matricula, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = 0;
        this.aceleracion = 0;
        this.kmRecorridos = 0;
        this.puntosGeneral = 0;
        this.puntosCarrera = 0;
        this.posicionCarrera = 0;
        this.mundialesGanados = 0;
        this.mundialesSegundo = 0;
        this.mundialesTercero = 0;
        this.recordPersonal = 0;

    }

    public void acelerar() {

        int kmHechosConAcelerar;
        //para que las carreras vayan más acorde a los caballos, la aceleracion por aleatorio 0->cv
        aceleracion = (int) (Math.random() * (getCv() / 3));

        if (cv < 100) {
            velocidad += (int) (Math.random() * aceleracion)+13 ; // posible + ((cv/10)/3)
            kmHechosConAcelerar = velocidad / 2;

        } else if (cv >= 100 && cv <= 200) {
            velocidad += (int) (Math.random() * aceleracion)+8;
            kmHechosConAcelerar = velocidad / 2;
        } else {
            velocidad += (int) (Math.random() * aceleracion)+7;
            kmHechosConAcelerar = velocidad / 2;
        }

        kmRecorridos += kmHechosConAcelerar;

    }

    public void mostrarDatosCoche() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Marca y modelo: " + this.marca + this.modelo);// o nombre sin this, cuando acostumbremos
        System.out.println("Potencia: " + cv + "cv\n");
        System.out.println("Campeonatos mundiales ganados: " + mundialesGanados);
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

    public void mostrarDatosEstadistica() {//ENLAZAR con mostrarestadistica -Competicion

        System.out.println("\t"+matricula);
        System.out.println("🏆 CAMPEÓN WRC: "+ mundialesGanados +" veces 🏆;\t 2\uFE0F⃣  SUBCAMPEON WRC: "
                + mundialesSegundo +" veces 2\uFE0F⃣ ;\t 3\uFE0F⃣  TERCERO WRC: "+ mundialesTercero + " veces 3\uFE0F⃣ ");
        System.out.println("🥇 Carreras ganadas: "+carrerasGanadasTotales+ " 🥇;  🥈 Carreras segundo: "
                +carrerasSegundoTotales+" 🥈;  🥉 Carreras tercero: "+carrerasTerceroTotales+" 🥉");
        System.out.println("📦 Podios totales: " +podiosTotales+" 📦\n");
        System.out.println("🚀 Record de puntos en 1 temporada: " +recordPersonal+" 🚀\n");
    }


    // GETTER Y SETTER //

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

    public int getCarrerasGanadas() {
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(int carrerasGanadas) {
        this.carrerasGanadas = carrerasGanadas;
    }

    public int getCarrerasSegundo() {
        return carrerasSegundo;
    }

    public void setCarrerasSegundo(int carrerasSegundo) {
        this.carrerasSegundo = carrerasSegundo;
    }

    public int getCarrerasTercero() {
        return carrerasTercero;
    }

    public void setCarrerasTercero(int carrerasTercero) {
        this.carrerasTercero = carrerasTercero;
    }

    public int getMundialesGanados() {
        return mundialesGanados;
    }

    public void setMundialesGanados(int mundialesGanados) {
        this.mundialesGanados = mundialesGanados;
    }

    public int getNumeroPodios() {
        return numeroPodios;
    }

    public void setNumeroPodios(int numeroPodios) {
        this.numeroPodios = numeroPodios;
    }

    public int getCarrerasGanadasTotales() {
        return carrerasGanadasTotales;
    }

    public void setCarrerasGanadasTotales(int carrerasGanadasTotales) {
        this.carrerasGanadasTotales = carrerasGanadasTotales;
    }

    public int getCarrerasSegundoTotales() {
        return carrerasSegundoTotales;
    }

    public void setCarrerasSegundoTotales(int carrerasSegundoTotales) {
        this.carrerasSegundoTotales = carrerasSegundoTotales;
    }

    public int getCarrerasTerceroTotales() {
        return carrerasTerceroTotales;
    }

    public void setCarrerasTerceroTotales(int carrerasTerceroTotales) {
        this.carrerasTerceroTotales = carrerasTerceroTotales;
    }

    public int getPodiosTotales() {
        return podiosTotales;
    }

    public void setPodiosTotales(int podiosTotales) {
        this.podiosTotales = podiosTotales;
    }

    public int getMundialesSegundo() {
        return mundialesSegundo;
    }

    public void setMundialesSegundo(int mundialesSegundo) {
        this.mundialesSegundo = mundialesSegundo;
    }

    public int getMundialesTercero() {
        return mundialesTercero;
    }

    public void setMundialesTercero(int mundialesTercero) {
        this.mundialesTercero = mundialesTercero;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getRecordPersonal() {
        return recordPersonal;
    }

    public void setRecordPersonal(int recordPersonal) {
        this.recordPersonal = recordPersonal;
    }
}


