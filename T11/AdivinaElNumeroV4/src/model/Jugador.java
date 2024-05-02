package model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter

public class Jugador implements Serializable {
    @Serial
    private static final long serialVersionUID = 1245893670852L;
    private String nombre;
    private int recordPersonal=100;
    private int puntuacionActual;

    public void mostrarDatos(){
        System.out.println("Nombre del jugador: "+getNombre());
        System.out.println("Menor nº de intentos para acertar: "+getRecordPersonal()+ " 🏆");
    }

    public Jugador() {

    }

    public Jugador(String nombre) {
        this.nombre = nombre;


    }
}
