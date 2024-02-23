package model;

import java.util.ArrayList;
import java.util.Comparator;

public class Competicion {
    private ArrayList<Coche>listadoCoches;// no se inicializa aquí
    private ArrayList<Carrera>listadoCarreras;

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
        listadoCarreras.add(new Carrera("🏁 RALLY LEMANS 🏁", 1883, 29, listadoCoches));

    }

    public void apuntarCoche(Coche coche){
        this.listadoCoches.add(coche);
        coche.mostrarDatosCoche();
    }
    public void agregarCarrera(Carrera carrera){
        this.listadoCarreras.add(carrera);
        carrera.mostrarDatosCarrera();
    }

    public void mostrarCarreras(){
        for (Carrera carrera:listadoCarreras) {
            carrera.mostrarDatosCarrera();
        }
    }



    public void generarCompeticion() {

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
