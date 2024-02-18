package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Liga {

    private String nombre;
    private ArrayList<Equipo>listaEquipos;
    private ArrayList<Partido>listaJornadas;

    private int clasificacion;
    private int campeon;


    public Liga() {
        this.listaEquipos = new ArrayList<>();
        this.campeon=campeon;
    }

    public void inscribirEquipos(Equipo equipo){
        this.listaEquipos.add(equipo);
    }
    public void mostrarEquipos() {
        for (Equipo equipo : listaEquipos) {
            equipo.mostrarDatosParaClasificacion();
        }
    }
    public void hacerClasificacion(){// incluye mostrarEq
        listaEquipos.sort(new Comparator<Equipo>() {// sort solo ordena, luego un mostrarEquipos
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPuntos()>o2.getPuntos()) {
                    return -1;
                } else if (o1.getPuntos()<o2.getPuntos()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        //equipo.getIdEquipo

        int posicion =1;
        for (Equipo equipo : listaEquipos) {
            System.out.print(posicion+"º");
            equipo.mostrarDatosParaClasificacion();
            posicion++;

        }
    }


}
