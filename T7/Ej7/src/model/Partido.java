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

                if (i > 2) {
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

}
