package model;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private boolean finalizado;
    private int parte;

    public Partido(){}
    public Partido (Equipo equipoLocal, Equipo equipoVisitante){
        this.equipoLocal=equipoLocal;
        this.equipoVisitante=equipoVisitante;
        this.parte=parte;
        this.finalizado=finalizado;
    }


    public void iniciarPartido(){

        parte=1;
        finalizado=false;
        if(!finalizado) {

            for (int i = 0; i < 6; i++) {
                equipoLocal.atacar();
                equipoVisitante.atacar();


                System.out.println("\nResultado tras la " + parte + " parte es de: \n"
                        + equipoLocal.getNombre() + " " + equipoLocal.getGoles() + " - " + equipoVisitante.getNombre() + " " + equipoVisitante.getGoles());

                if (i == 2) {
                    parte++;
                }
            }
        }
        finalizado=true;

    }

    public void mostrarResultado(){
        System.out.println("\nResultado final del partido es de: \n"
                +equipoLocal.getNombre()+" "+equipoLocal.getGoles()+" - "+equipoVisitante.getNombre()+" "+equipoVisitante.getGoles());

    }


    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public int getParte() {
        return parte;
    }

    public void setParte(int parte) {
        this.parte = parte;
    }
}
