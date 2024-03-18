package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter@Setter
public class Audio extends Media{
    private int duracion;
    private String soporte;

    public Audio() {}



    public Audio(int id, int tamano, String titulo, String autor, String formato, int duracion, String soporte) {
        super(id, tamano, titulo, autor, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.print("Duracion: "+getDuracion());
        System.out.print("Soporte: "+getSoporte());

    }
    @Override
    public void insertarDatos() {
        super.insertarDatos();
        Scanner sc= new Scanner(System.in);
        System.out.print("Duracion: ");
        setDuracion(sc.nextInt());
        System.out.print("Soporte: ");
        setSoporte(sc.next());
    }
    @Override
    public void mostrarDaatosResumen() {
        super.mostrarDaatosResumen();
        System.out.println("Tipo: Audio");
    }

}
