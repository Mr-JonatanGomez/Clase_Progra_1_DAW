package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Asalariado extends Trabajador{

    private int salario, numeroPagas;//salario compartido con autonomo
    private boolean contratado;//compartido con Autonomo
    public Asalariado(String nombre, String apellido, String dni,int salario, int numeroPagas, boolean contratado){
        super(nombre, apellido, dni);
        this.salario=salario;
        this.numeroPagas=numeroPagas;
        this.contratado=false;
    }
    @Override
    public void trabajar() {
        if (isContratado()) {
            System.out.println(getNombre()+"Se dispone a picar piedras");
        } else {
            System.out.println("no esoty contratado, no puedo trabajar");
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println(getNombre());
        System.out.println(getApellido());
        System.out.println(getDni());
        System.out.println(getSalario());
        System.out.println(isContratado());
    }
}
