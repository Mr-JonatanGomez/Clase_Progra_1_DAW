package model;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public abstract class Accionista extends Persona implements Responsable{
    @Override
    public void realizarVotacion() {
        System.out.println("Accionistra tambien va a votar");
        int aleatorio = ((int)Math.random()*10)*2;
        System.out.println("El voto del accionista es "+aleatorio);
    }
}
