package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Jefe extends Trabajador implements Responsable{

    private int percentAcciones;

    @Override
    public void trabajar() {
        System.out.println("El jefe empieza a trabajar");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numero acciones"+percentAcciones);
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe va a votar");
        int aleatorio = (int) Math.random()*5+2/2;
    }
}
