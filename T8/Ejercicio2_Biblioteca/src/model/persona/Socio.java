package model.persona;

import controller.Biblioteca;
import lombok.Getter;
import lombok.Setter;
import model.elemento.Elemento;

import java.util.ArrayList;

@Setter
@Getter

public class Socio extends Persona {
    private int numeroSocio=1;
    private ArrayList<Elemento>listaTotalPrestamos;

    public Socio (){
        this.listaTotalPrestamos = new ArrayList<>();
    }

    public Socio(String nombre, String apellido, String dni, int numeroSocio, ArrayList<Elemento>listaTotalPrestamos) {
        super(nombre, apellido, dni);
        //this.numeroSocio = numeroSocio;
        this.numeroSocio += numeroSocio;
        numeroSocio++;
        this.listaTotalPrestamos = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de socio: "+getNumeroSocio());
        for (Elemento item:listaTotalPrestamos) {
            System.out.println(getClass()+": "+item);
        }
    }

    @Override
    public void crearDatos() {
        super.crearDatos();
        setNumeroSocio(numeroSocio+=numeroSocio);
        numeroSocio++;

    }
}
