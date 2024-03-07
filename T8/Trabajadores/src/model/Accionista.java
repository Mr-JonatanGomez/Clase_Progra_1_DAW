package model;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
public class Accionista extends Persona implements Responsable{


    public Accionista(String dni, String nombre, String correo) {
        super(dni, nombre, correo);

    }

    @Override
    public void realizarVotacion() {
        int votoAcc = (int)((int)(Math.random()*10)*2);
        System.out.println("\nAccionista "+getNombre()+" va a votar");
        System.out.println("El voto Supremo del accionista "+getNombre()+" es: "+votoAcc);
    }
}
