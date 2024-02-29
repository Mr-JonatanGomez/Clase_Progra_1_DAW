package model;

public class Surtidor {
    private int numeroSurtidor, capacidadTotal, capacidadActual;
    private String tipoCombustible;
    private boolean operativo;

    public Surtidor() {
    }

    public Surtidor(int numeroSurtidor, int capacidadTotal, String tipoCombustible) {
        this.numeroSurtidor= numeroSurtidor;
        this.capacidadTotal = capacidadTotal;
        this.capacidadActual = capacidadTotal;
        this.tipoCombustible = tipoCombustible;
        this.operativo = true;
    }

    public Surtidor(int numeroSurtidor, String tipoCombustible) {
        this.numeroSurtidor= numeroSurtidor;
        this.tipoCombustible = tipoCombustible;
        this.capacidadTotal = 0;
        this.capacidadActual = 0;
        if (capacidadActual==0){
            operativo=false;
        }
    }

    public void arreglar() {
        operativo = true;
    }

    public void rellenarTanque(int litrosARellenar) {
        capacidadActual += litrosARellenar;
    }

    public void extraerCombustible(int litrosAExtraer) {
        if (litrosAExtraer<=capacidadActual ) {
            capacidadActual -= litrosAExtraer;
        }else {
           // System.out.println("No hay suficiente en el TANQUE, metodo EN SURTIDOR");
        }
    }

    public void mostrarDatos(){
        System.out.println("El surtidor numero: "+getNumeroSurtidor());
        System.out.println("Tipo combustible: "+getTipoCombustible());
        System.out.println("Litros Combustible Actual: "+getCapacidadActual());
        System.out.println("Capacidad máxima: "+getCapacidadTotal()+"\n");
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

    public int getNumeroSurtidor() {
        return numeroSurtidor;
    }

    public void setNumeroSurtidor(int numeroSurtidor) {
        this.numeroSurtidor = numeroSurtidor;
    }
}
