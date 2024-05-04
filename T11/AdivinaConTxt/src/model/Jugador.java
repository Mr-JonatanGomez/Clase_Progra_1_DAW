package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jugador implements Serializable {
    @Serial
    private static final long serialVersionUID = 23694152658852L;
    private String nombre;
    private int puntuacionPartidaActual;
    private int recordPersonal;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.recordPersonal=99999;
    }

    @Override
    public String toString() {
        return "Jugador" + nombre + ", tiene su mejor record en " + recordPersonal + " intentos";
    }


}
