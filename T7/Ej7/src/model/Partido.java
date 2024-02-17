package model;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private boolean finalizado;
    private int parte;

    public Partido() {
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.parte = parte;
        this.finalizado = finalizado;
    }


    public void iniciarPartido() {

        equipoLocal.setGoles(0);
        equipoVisitante.setGoles(0);
        parte = 1;
        finalizado = false;
        if (!finalizado) {

            System.out.println("\n\tEMPIEZA EL PARTIDO");
            for (int i = 0; i < 6; i++) {
                equipoLocal.atacarDefendido(equipoLocal, equipoVisitante);
                equipoVisitante.atacarDefendido(equipoVisitante, equipoLocal);


                if (i == 2) {
                    System.out.println("\nFINAL DEL PRIMER TIEMPO: \n"
                            + equipoLocal.getNombre() + " " + equipoLocal.getGoles() + " - " + equipoVisitante.getNombre() + " " + equipoVisitante.getGoles());

                    parte++;
                }
            }
        }
        System.out.println("\t FINAL DEL PARTIDO");
        System.out.println(equipoLocal.getNombre() + " " + equipoLocal.getGoles() + " - " + equipoVisitante.getNombre() + " " + equipoVisitante.getGoles());
        finalizado = true;
        if (equipoLocal.getGoles() > equipoVisitante.getGoles()) {
            equipoLocal.setPuntos(equipoLocal.getPuntos() + 3);
        } else if (equipoVisitante.getGoles() > equipoLocal.getGoles()) {
            equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 3);
        } else {
            equipoLocal.setPuntos(equipoLocal.getPuntos() + 1);
            equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 1);

        }
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
