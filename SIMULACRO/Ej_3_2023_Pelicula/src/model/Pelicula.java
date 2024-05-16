package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Pelicula {
    private String titulo;
    private String director;
    private double puntuacion1, puntuacion2, puntuacion3;
    private double media;
    public Pelicula(String titulo, String director, double puntuacion1, double puntuacion2, double puntuacion3) {
        this.titulo = titulo;
        this.director = director;
        this.puntuacion1 = puntuacion1;
        this.puntuacion2 = puntuacion2;
        this.puntuacion3 = puntuacion3;
    }

    public double puntuacionMedia(double punt1,double punt2, double punt3){
        media=punt1+punt2+punt3/3;
        return media;
    }

    @Override
    public String toString() {
        return "model.Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", puntuacion1=" + puntuacion1 +
                ", puntuacion2=" + puntuacion2 +
                ", puntuacion3=" + puntuacion3 +
                ", media=" + media +
                '}';
    }




}
