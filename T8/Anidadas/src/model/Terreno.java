package model;

public class Terreno {
    private int metros;
    private Casa casa; // como puede tener casa, se pone

    public Terreno() {
    }

    public Terreno(int metros, Casa casa) {
        this.metros = metros;
        this.casa = casa;
    }

    // CLASE ANIDADA, DEPENDE EXCLUSIVAMENTE DE LA GENERAL
    //SI NO EXISTE Terreno  no puede existir

    public void mostrarDatos(){
        System.out.println("Datos del terreno");
        System.out.println("El terreno tiene "+ metros+" metros");
    }
    public void construirCasa(){
        this.casa = new Casa(3,true);
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public class Casa { //para que pueda existir, necesita existir el Terreno
        // public puede ser llamado desde main
        // si no es public solo es accedible desde aqui
        int numeroHabitaciones;
        boolean piscina;

        public Casa() {
        }

        public Casa(int numeroHabitaciones, boolean piscina) {
            this.numeroHabitaciones = numeroHabitaciones;
            this.piscina = piscina;
        }

        public void construirAnexo(){
            System.out.println("construyendo anexo");
        }

        public void mostrarDatos() {
            System.out.println("Sacando datos casa");
            System.out.println("N. habitaciones" + numeroHabitaciones);
            System.out.println("Sacando datos casa" + piscina);
        }

        public int getNumeroHabitaciones() {
            return numeroHabitaciones;
        }

        public void setNumeroHabitaciones(int numeroHabitaciones) {
            this.numeroHabitaciones = numeroHabitaciones;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }
    }

}
