package model.persona;

import lombok.Getter;
import lombok.Setter;
import model.elemento.Elemento;

import java.util.ArrayList;

@Setter
@Getter

public class Socio extends Persona {
    private int numeroSocio;
    private ArrayList<Elemento>listaTotalPrestamos;

    public Socio (){
        this.listaTotalPrestamos = new ArrayList<>();
    }

    public Socio(String nombre, String apellido, String dni, int numeroSocio, ArrayList<Elemento> listaTotalPrestamos) {
        super(nombre, apellido, dni);
        this.numeroSocio = numeroSocio;
        this.listaTotalPrestamos = new ArrayList<>();
    }
}
