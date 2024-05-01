package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter

@AllArgsConstructor
public class Jugador implements Serializable {
    @Serial
    private static final long serialVersionUID = 1258099726424862121L;
    private String nombre;

    private int puntuacionAct;
    private int recordPersonal=150;

    public Jugador() {

    }

    public Jugador(String nombre) {
        this.nombre = nombre;

    }
    public void mostrarDatos(){
        System.out.println("Nombre del jugador: "+getNombre());
        System.out.println("Menor nº de intentos para acertar: "+getRecordPersonal()+ " 🏆");
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "Nombre: " + nombre  +
                ", Record Personal: " + recordPersonal +
                '}';
    }
}
