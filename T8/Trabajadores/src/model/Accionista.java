package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Accionista extends Persona implements Responsable{
    @Override
    public void realizarVotacion() {
        System.out.println("Accionistra tambien va a votar");
        int aleatorio = ((int)Math.random()*10)*2;
        System.out.println("El voto del accionista es "+aleatorio);
    }
}
