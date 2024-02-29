package model;

public class Surtidor {
    private int capacidadTotal, capacidadActual;
    private String tipoCombustible;
    private boolean operativo;

    public Surtidor() {
    }

    public Surtidor(int capacidadTotal, String tipoCombustible) {
        this.capacidadTotal = capacidadTotal;
        this.capacidadActual = capacidadTotal;
        this.tipoCombustible = tipoCombustible;
        this.operativo = true;
    }

    public Surtidor(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.capacidadTotal = 0;
        this.capacidadActual = 0;
        this.operativo = false;
    }

    public void arreglar() {
        operativo = true;
    }

    public void rellenarTanque(int litrosARellenar) {
        capacidadActual += litrosARellenar;
    }

    public void extraerCombustible(int litrosAExtraer) {
        capacidadActual -= litrosAExtraer;
    }


    //GETTER & SETTER
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public boolean isOperativo() {
        return operativo;
    }

    public void setOperativo(boolean operativo) {
        this.operativo = operativo;
    }
}
