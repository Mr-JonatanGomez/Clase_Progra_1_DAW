package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Competicion {
    private ArrayList<Coche> listadoCoches;// no se inicializa aquí
    private ArrayList<Carrera> listadoCarreras;

    public Competicion() {
        this.listadoCoches = new ArrayList<>();//aqui inicializo, si no no puedo gestionar coches
        this.listadoCarreras = new ArrayList<>();
        //Como la competicion es cerrada y no se hacerlo de otro modo
        // las 10 carreras de la competicion estan de serie en la competicion
        // con el listado agregado al final por arraylist, creado en el constructor
        listadoCarreras.add(new Carrera("🏁 RALLYRACC CATALONIA 🏁", 457, 7, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 WALES RALLY GB 🏁", 571, 10, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY INDIANAPOLIS 🏁", 1200, 24, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY ITALY SARDEGNA 🏁", 552, 8, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY NEW ZEALAND 🏁", 720, 4, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY MONTE CARLO 🏁", 312, 3, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 SAFARI RALLY KENYA 🏁", 1157, 12, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY ARGENTINA 🏁", 883, 9, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY JAPAN 🏁", 661, 7, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY LEMANS 🏁", 2400, 24, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 RALLY DELTA 🏁", 25, 1, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 GRAND PRIX SPRINT 🏁", 150, 3, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 THUNDER CIRCUIT 🏁", 160, 4, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 SUNSET SPEEDWAY 🏁", 120, 2, listadoCoches));
        listadoCarreras.add(new Carrera("🏁 WILLOW RACEWAY 🏁", 140, 3, listadoCoches));

    }

    public void apuntarCoche(Coche coche) {
        this.listadoCoches.add(coche);
        coche.mostrarDatosCoche();
    }

    public void agregarCarrera(Carrera carrera) {
        this.listadoCarreras.add(carrera);
        carrera.mostrarDatosCarrera();
    }

    public void mostrarCarreras() {
        for (Carrera carrera : listadoCarreras) {
            carrera.mostrarDatosCarrera();
        }
    }

    public void clasificacionGeneral() {
        listadoCoches.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                if (o1.getPuntosGeneral() > o2.getPuntosGeneral()) {
                    return -1;
                } else if (o1.getPuntosGeneral() < o2.getPuntosGeneral()) {
                    return 1;
                } else {
                   // PARA EL DESEMPATE if (){}
                    return 0;
                }
            }
        });
        mostrarDatosClasGen();
    }


    public void mostrarDatosClasGen() {
        System.out.println("\n\t CLASIFICACION FINAL WRC");
        int posicionGen = 1;
        for (Coche coche : listadoCoches) {
            coche.setPosicionGeneral(posicionGen);
            posicionGen++;
            if(coche.getPosicionGeneral()==1) {
                System.out.println("\uD83C\uDFC6 " + coche.getPosicionGeneral() + "º " + coche.getMatricula()+" "  + coche.getPuntosGeneral() + " puntos \uD83C\uDFC6"+ "\tCarreras ganadas 🥇: "+coche.getCarrerasGanadas()+ ", Carreras segundo 🥈: "+coche.getCarrerasSegundo()+ ", Carreras tercero 🥉: "+coche.getCarrerasTercero()+", Podios conseguidos: "+coche.getNumeroPodios());
            } else if (coche.getPosicionGeneral()==2) {
                System.out.println("🥈 " + coche.getPosicionGeneral() + "º " + coche.getMatricula()+" "  + coche.getPuntosGeneral() + " puntos 🥈"+ "\tCarreras ganadas 🥇: "+coche.getCarrerasGanadas()+ ", Carreras segundo 🥈: "+coche.getCarrerasSegundo()+ ", Carreras tercero 🥉: "+coche.getCarrerasTercero()+", Podios conseguidos: "+coche.getNumeroPodios());
            } else if (coche.getPosicionGeneral()==3) {
                System.out.println("🥉 " + coche.getPosicionGeneral() + "º " + coche.getMatricula()+" "  + coche.getPuntosGeneral() + " puntos 🥉"+ "\tCarreras ganadas 🥇: "+coche.getCarrerasGanadas()+ ", Carreras segundo 🥈: "+coche.getCarrerasSegundo()+ ", Carreras tercero 🥉: "+coche.getCarrerasTercero()+", Podios conseguidos: "+coche.getNumeroPodios());
            } else if(coche.getPosicionGeneral()==9){
                System.out.println("💩 " + coche.getPosicionGeneral() + "º " + coche.getMatricula()+" "  + coche.getPuntosGeneral() + " puntos 💩"+ "\tCarreras ganadas 🥇: "+coche.getCarrerasGanadas()+ ", Carreras segundo 🥈: "+coche.getCarrerasSegundo()+ ", Carreras tercero 🥉: "+coche.getCarrerasTercero()+", Podios conseguidos: "+coche.getNumeroPodios());
            }else if(coche.getPosicionGeneral()==8){
                System.out.println("😭 " + coche.getPosicionGeneral() + "º " + coche.getMatricula()+" "  + coche.getPuntosGeneral() + " puntos 😭"+ "\tCarreras ganadas 🥇: "+coche.getCarrerasGanadas()+ ", Carreras segundo 🥈: "+coche.getCarrerasSegundo()+ ", Carreras tercero 🥉: "+coche.getCarrerasTercero()+", Podios conseguidos: "+coche.getNumeroPodios());
            }else {
                System.out.println("😐 " + coche.getPosicionGeneral() + "º " + coche.getMatricula()+" " + coche.getPuntosGeneral() + " puntos 😐"+ "\tCarreras ganadas 🥇: "+coche.getCarrerasGanadas()+ ", Carreras segundo 🥈: "+coche.getCarrerasSegundo()+ ", Carreras tercero 🥉: "+coche.getCarrerasTercero()+", Podios conseguidos: "+coche.getNumeroPodios());
            }


        }
    }


    public ArrayList<Coche> getListadoCoches() {
        return listadoCoches;
    }

    public void setListadoCoches(ArrayList<Coche> listadoCoches) {
        this.listadoCoches = listadoCoches;
    }

    public ArrayList<Carrera> getListadoCarreras() {
        return listadoCarreras;
    }

    public void setListadoCarreras(ArrayList<Carrera> listadoCarreras) {
        this.listadoCarreras = listadoCarreras;
    }


}
