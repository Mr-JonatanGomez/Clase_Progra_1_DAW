package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Autonomo extends  Trabajador {
    private int salario;//salario compartido con autonomo
    private boolean contratado;//compartido con Autonomo
    public Autonomo (String nombre, String apellido, String dni,int salario){
        super(nombre, apellido, dni);
        this.salario=salario;
        this.contratado=false;
    }
    @Override
    public void trabajar() {
        if (isContratado()){
        System.out.println(getNombre()+"Se dispone a llevar las piedras para picar o picadas");
        } else {
            System.out.println(getNombre()+"YO NO TRABAJO que no estoy contratado");

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
