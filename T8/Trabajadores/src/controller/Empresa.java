package controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Persona;
import model.Responsable;
import model.Trabajador;

import java.util.ArrayList;


@NoArgsConstructor
@Getter
@Setter
public class Empresa {
    ArrayList<Persona> listaPersonas=new ArrayList<>();


    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public void empezarJornada() {
        for (Persona item : listaPersonas) {
            if (item instanceof Trabajador) {// se castea con el instance a TRABAJADOR
                ((Trabajador) item).trabajar();
            }
        }
    }
    public void realizarVotacion() {
        for (Persona item : listaPersonas) {
            if (item instanceof Responsable){
                ((Responsable)item).realizarVotacion();
            }
        }
    }
}
