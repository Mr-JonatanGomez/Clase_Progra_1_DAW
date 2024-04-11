package Ejercicio;

import Ejercicio.model.Estudiante;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Borja", 4,6,3);
        Estudiante estudiante2 = new Estudiante("Jon", 5,6,9);

        ArrayList<Estudiante>listaEst = new ArrayList<>();
        listaEst.add(estudiante1);
        listaEst.add(estudiante2);


        for (Estudiante estudiante:listaEst) {
            System.out.println(estudiante.getNombre());
            System.out.println(estudiante.getNota1());
            System.out.println(estudiante.getNota2());
            System.out.println(estudiante.getNota3());
            estudiante.calcularMedia();
        }
    }

}
