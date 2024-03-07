package model;

import lombok.*;



@NoArgsConstructor
@Setter
@Getter
public class Jefe extends Trabajador implements Responsable{

    public Jefe(String dni, String nombre, String correo, int salario, int percentAcciones, Puesto puesto) {
        super(dni, nombre, correo, salario);
        this.percentAcciones = percentAcciones;
        this.puesto = puesto;
        setSalario(getSalario()+puesto.getSalarioAdicional());
    }

    private int percentAcciones;
    //se declara Puesto y puesto, y se pone en construct
    private Puesto puesto;

    @Override
    public void trabajar() {
        System.out.println("El jefe "+getNombre()+" empieza a trabajar, y echar broncas");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("numero acciones: "+percentAcciones);
        System.out.println("Descripcion: "+puesto.getDescripcion());
        System.out.println("puesto: "+puesto);
    }

    @Override//viene desde la interfaz RESPONSABLE
    public void realizarVotacion() {
        int votoJef = (int) ((int)( Math.random()*5)/2);
        System.out.println("El jefe "+getNombre()+" va a votar");
        System.out.println("El voto Supremo del accionista "+getNombre()+" es: "+votoJef);
    }
}
