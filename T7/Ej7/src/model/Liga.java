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

   //EN PRUEBAS

    public void calcularMostrarCalidadEquipos() {
        for (Equipo equipo : listaEquipos) {
            equipo.calcularNivelHabilidad();
            equipo.mostrarDatosCalidad();
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


        int posicion =1;
        for (Equipo equipo : listaEquipos) {
            System.out.print(posicion+"º");
            equipo.mostrarDatosParaClasificacion();
            posicion++;

        }
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public ArrayList<Partido> getListaJornadas() {
        return listaJornadas;
    }

    public void setListaJornadas(ArrayList<Partido> listaJornadas) {
        this.listaJornadas = listaJornadas;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCampeon() {
        return campeon;
    }

    public void setCampeon(int campeon) {
        this.campeon = campeon;
    }


}
