package model;

import lombok.*;



@NoArgsConstructor
@Getter
@Setter
public class Asalariado extends Trabajador{
public int numeroPagas;

    public Asalariado(String dni, String nombre, String correo, int salario, int numeroPagas) {
        super(dni, nombre, correo, salario);
        this.setSalario(1000);
        this.numeroPagas = numeroPagas;
    }



    @Override
    public void trabajar() {
        System.out.println("inicia jornada "+getNombre()+", empieza a picar piedra\n");

    }
}
