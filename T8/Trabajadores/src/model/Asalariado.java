package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Asalariado extends Trabajador{
public int numeroPagas;
    @Override
    public void trabajar() {
        System.out.println("inicia jornada");
        System.out.println("eres un trabajador");
    }
}
