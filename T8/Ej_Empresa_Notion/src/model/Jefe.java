package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
@NoArgsConstructor
public class Jefe extends Trabajador implements ResponsableDespidos{
    private int percAcciones, percBenef;

    public Jefe (String nombre, String apellido, String dni, int percAcciones, int percBenef){
        super(nombre, apellido, dni);
        this.percAcciones=percAcciones;
        this.percBenef=percBenef;
    }
    @Override
    public void trabajar() {
        System.out.println(getNombre()+"El jefe va a trabajar");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Porcentaje de acciones: "+getPercAcciones());
        System.out.println("Porcentaje de Beneficio: "+getPercBenef());
    }
    @Override
    public void agregarDatos(){
        Scanner sc =new Scanner(System.in);
        super.agregarDatos();
        //datos automaticos ⬇⬇
        setPercAcciones(5);
        setPercBenef(10);
    }
/*
    @Override
    public void despedirTrabajador(Trabajador trabajador) {

           // listaTrabajadores.remove(trabajador);
        if (!(trabajador instanceof Jefe)) {
            if (trabajador instanceof Autonomo) {
                ((Autonomo) trabajador).setContratado(false);
            } else if (trabajador instanceof Asalariado) {
                //casteamos trabajador que es de la SUPERclase a ASALARIADO
                ((Asalariado) trabajador).setContratado(false);
            }
        }
    }
    */ // copiado y modificado de empresa

/*
    public void despedirTrabajador(Trabajador trabajador) {


        listaTrabajadores.remove(trabajador);
        if (trabajador instanceof Autonomo) {
            ((Autonomo) trabajador).setContratado(false);
        } else if (trabajador instanceof Asalariado) {
            //casteamos trabajador que es de la SUPERclase a ASALARIADO
            ((Asalariado) trabajador).setContratado(false);
        }

    }*/ // copiado de empresa
}
