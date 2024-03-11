package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Asalariado extends Trabajador{

    private int salarioMes, numeroPagas;//salario compartido con autonomo
    private boolean contratado;//compartido con Autonomo
    public Asalariado(String nombre, String apellido, String dni,int salarioMes, int numeroPagas){
        super(nombre, apellido, dni);
        this.salarioMes=salarioMes;
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
        super.mostrarDatos();
        System.out.println("Salario mensual: "+getSalarioMes());
        System.out.println("Numero de Pagas: "+getNumeroPagas());
        //System.out.println(isContratado());
    }

    @Override
    public void agregarDatos(){
        Scanner sc =new Scanner(System.in);
        super.agregarDatos();
        //datos automaticos ⬇⬇
        setSalarioMes(1100);
        setNumeroPagas(14);

    }
}
