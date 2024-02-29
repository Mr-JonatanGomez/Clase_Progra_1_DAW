package model;

import java.util.Scanner;

public class Coche {
    private String tipoCombustible;
    private int litrosDeposito;

    public Coche (){}
    public Coche(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
        this.litrosDeposito=0;
    }

    public void ponerCombustible (Surtidor surtidor, int cantidadLitrosARepostar){
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos litros quiere poner al coche");
        int extraccion=sc.nextInt();
        surtidor.extraerCombustible(extraccion);
        if (surtidor.getCapacidadActual()==0 || surtidor.getCapacidadActual()<sc.nextInt()){
            System.out.println("El surtidor no tiene suficiente combustible");
        } else if (!surtidor.isOperativo()) {
            System.out.println("El surtidor ESTÁ AVERIADO");
        } else if (surtidor.getTipoCombustible().equalsIgnoreCase(tipoCombustible)) {
            System.out.println("⚠ Estas intentando echar un combustible equivocado ⚠");
        } else {
            litrosDeposito+=extraccion;//habria que meter topes MAXIMOS
            surtidor.extraerCombustible(extraccion);//este metodo resta lo extraido
        }
    }
}
