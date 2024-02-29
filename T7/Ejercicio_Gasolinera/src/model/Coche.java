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
        System.out.println("\nSURTIDOR: "+surtidor.getNumeroSurtidor());
        System.out.println("litros que vas a intentar poner:"+cantidadLitrosARepostar);

        if (surtidor.getCapacidadActual()==0 || surtidor.getCapacidadActual()<cantidadLitrosARepostar){
            System.out.println("El surtidor no tiene suficiente combustible\n");
        } else if (!surtidor.isOperativo()) {
            System.out.println("El surtidor ESTÁ AVERIADO\n");
        } else if (surtidor.getTipoCombustible()!= tipoCombustible) {
            System.out.println("⚠ Estas intentando echar un combustible equivocado ⚠");
            System.out.println("tu vehiculo usa "+getTipoCombustible()+" y estas intentando poner "+surtidor.getTipoCombustible()+"\n");
        } else {
            litrosDeposito+=cantidadLitrosARepostar;//habria que meter topes MAXIMOS
            surtidor.extraerCombustible(cantidadLitrosARepostar);//este metodo resta lo extraido
            System.out.println("Has repostado con exito "+cantidadLitrosARepostar+" de "+tipoCombustible);
        }
    }
    public void mostrarDatosCoche(){
        System.out.println("El coche tiene: "+litrosDeposito+" de "+tipoCombustible);
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getLitrosDeposito() {
        return litrosDeposito;
    }

    public void setLitrosDeposito(int litrosDeposito) {
        this.litrosDeposito = litrosDeposito;
    }
}
