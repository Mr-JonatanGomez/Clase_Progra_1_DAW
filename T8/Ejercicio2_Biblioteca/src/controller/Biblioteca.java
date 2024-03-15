package controller;

import lombok.Getter;
import lombok.Setter;
import model.elemento.*;
import model.persona.Persona;
import model.persona.Trabajador;
import model.persona.Socio;

import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public class Biblioteca {
    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Socio> listaSocios;
    private ArrayList<Elemento> listaPrestadosActualmente;
    private ArrayList<Libro> listaLibros;
    private ArrayList<Revista> listaRevistas;
    private ArrayList<DVD> listaDVDs;
    private ArrayList<CD> listaCDs;


    public Biblioteca() {
        this.listaTrabajadores = new ArrayList<>();
        this.listaSocios = new ArrayList<>();
        this.listaPrestadosActualmente= new ArrayList<>();
    }

    public void registrarPersona(Persona persona) {

        System.out.println("Estas registrando una Persona, elige una opción\n1- Trabajador\n2-Socio");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    ((Persona)persona).crearDatos();
                    listaTrabajadores.add((Trabajador) persona);// OU YEAH CONSEGUIDO YO SOLO EL CASTEO
                    break;
                case 2:
                    ((Socio)persona).crearDatos();
                    listaSocios.add((Socio) persona);
                    break;
                default:
                    break;
            }
        } while (opcion != 1 && opcion != 2);
    }

    public void registrarElemento(Elemento elemento) {
        System.out.println("Estas Registrando un elemento, elige una opcion" +
                "\n1- Libro\n2- Revista\3- DVD\4- CD");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    ((Libro)elemento).crearDatos();
                    listaLibros.add((Libro) elemento);
                    break;
                case 2:
                    ((Revista)elemento).crearDatos();
                    listaRevistas.add((Revista) elemento);
                     break;
                case 3:
                    ((DVD)elemento).crearDatos();
                    listaDVDs.add((DVD) elemento);
                    break;
                case 4:
                    ((CD)elemento).crearDatos();
                    listaCDs.add((CD) elemento);
                    break;
                default:
                    break;
            }

        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);
    }

}
