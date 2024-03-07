package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Asalariado;
import model.Autonomo;
import model.Trabajador;

import java.util.ArrayList;


@Setter
@Getter
public class Empresa {
    private ArrayList<Trabajador> listaTrabajadores;

    public Empresa() {
        this.listaTrabajadores = new ArrayList<>();
    }

    public void contratarTrabajador(Trabajador trabajador) {
            listaTrabajadores.add(trabajador);
        for (Trabajador item:listaTrabajadores) {
            if (item instanceof Autonomo){
                ((Autonomo) item).setContratado(true);
            } else if (item instanceof Asalariado){
                ((Asalariado) item).setContratado(true);
            }
        }
    }
    public void despedirTrabajador(Trabajador trabajador) {
        listaTrabajadores.remove(trabajador);
            if (trabajador instanceof Autonomo){
                ((Autonomo) trabajador).setContratado(false);
            } else if (trabajador instanceof Asalariado){
                //casteamos trabajador que es de la SUPERclase a ASALARIADO
                ((Asalariado) trabajador).setContratado(false);
            }

    }

    public void iniciarJornada() {
        for (Trabajador item : listaTrabajadores) {
            item.trabajar();
        }
    }

    public void mostrarPlantillaActual(){
        for (Trabajador item:listaTrabajadores) {
            item.mostrarDatos();
        }
    }
}

