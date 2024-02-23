import model.CampeonatoMundial;
import model.CarreraCircuito;
import model.Coche;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        //DECLARAR COCHES


        //DECLARAR CARRERAS


        // DECLARAR CAMPEONATO
        // AGREGAR CARRERA(MetodoMostrardatos incluido)
        // AGREGAR COCHES (MetodoMostrar datos incluido)

        CampeonatoMundial mundial = new CampeonatoMundial();

        //generar carrera y coches



        Coche coche1= new Coche("Citroen","Xsara","\uD83D\uDE99 C.McRae_1",80);
        Coche coche2= new Coche("Hyundai","i30","\uD83D\uDE97 B.Codd_2",110);
        Coche coche3= new Coche("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_3",30);
        Coche coche4= new Coche("Citroen","2CV_Trucado","\uD83C\uDFCE\uFE0F B.Martin_4",201);
        Coche coche5= new Coche("Toyota","Corolla","\uD83D\uDE97 C.Sainz_5",150);
        Coche coche6= new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F J.Gomez_6",221);
        Coche coche7= new Coche("Opel","Corsa","\uD83D\uDE97 V.Bullido_7",162);
        Coche coche8= new Coche("Renault","5 CopaTurbo","\uD83D\uDE99 J.Ventura_8",70);
        Coche coche9= new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F S.Nieves_9",275);

        ArrayList<Coche>listadoCochesPRUEBA= new ArrayList<>();

        listadoCochesPRUEBA.add(coche1);
        listadoCochesPRUEBA.add(coche2);
        listadoCochesPRUEBA.add(coche3);
        listadoCochesPRUEBA.add(coche4);
        listadoCochesPRUEBA.add(coche5);
        listadoCochesPRUEBA.add(coche6);
        listadoCochesPRUEBA.add(coche7);
        listadoCochesPRUEBA.add(coche8);
        listadoCochesPRUEBA.add(coche9);


        CarreraCircuito carrera1 =new CarreraCircuito("RallyRACC Catalonia",457,7);
        CarreraCircuito carrera2 =new CarreraCircuito("Wales Rally GB",571,10);
        CarreraCircuito carrera3 =new CarreraCircuito("Rally Indianapolis",1200,24);
        CarreraCircuito carrera4 =new CarreraCircuito("Rally Italy Sardegna",552,8);
        CarreraCircuito carrera5 =new CarreraCircuito("Rally New Zealand",720,4);
        CarreraCircuito carrera6 =new CarreraCircuito("Rally Monte Carlo",312,3);
        CarreraCircuito carrera7 =new CarreraCircuito("Safari Rally Kenya",1157,12);
        CarreraCircuito carrera8 =new CarreraCircuito("Rally Argentina",883,9);
        CarreraCircuito carrera9 =new CarreraCircuito("Rally Japan",661,7);
        CarreraCircuito carrera10 =new CarreraCircuito("Rally LeMans",1883,29);

        ArrayList<CarreraCircuito>listadoCarrerasPRUEBA= new ArrayList<>();
        listadoCarrerasPRUEBA.add(carrera1);
        listadoCarrerasPRUEBA.add(carrera2);
        listadoCarrerasPRUEBA.add(carrera3);
        listadoCarrerasPRUEBA.add(carrera4);
        listadoCarrerasPRUEBA.add(carrera5);
        listadoCarrerasPRUEBA.add(carrera6);
        listadoCarrerasPRUEBA.add(carrera7);
        listadoCarrerasPRUEBA.add(carrera8);
        listadoCarrerasPRUEBA.add(carrera9);

        mundial.getListadoCarrerasPRUEBA();

        //MUNDIAL AGREGAR CARRERA pasado con puntos suspensivos y poder agregar las que sean
        /*
        mundial.inscribirCoches(coche1, coche2, coche3, coche4, coche5, coche6, coche7, coche8, coche9);
        mundial.agregarCarrerasYdisputarlas(carrera1, carrera2, carrera3, carrera4, carrera5, carrera6, carrera7, carrera8, carrera9, carrera10);
        mundial.iniciarCarreras(carrera1, carrera2, carrera3, carrera4, carrera5, carrera6, carrera7, carrera8, carrera9, carrera10);
*/


        /* AGREGAR CARRERAS DE UNA VEZ
        mundial.agregarCarrera(new CarreraCircuito("RallyRACC Catalonia",457,7));
        mundial.agregarCarrera(new CarreraCircuito("Wales Rally GB",571,10));
        mundial.agregarCarrera(new CarreraCircuito("Rally Italy Sardegna",552,8));
        mundial.agregarCarrera(new CarreraCircuito("Rally New Zealand",720,4));
        mundial.agregarCarrera(new CarreraCircuito("Rally Monte Carlo",312,3));
        mundial.agregarCarrera(new CarreraCircuito("Safari Rally Kenya",1157,12));
        mundial.agregarCarrera(new CarreraCircuito("Rally Argentina",883,9));
        mundial.agregarCarrera(new CarreraCircuito("Rally Japan",661,7));
        mundial.agregarCarrera(new CarreraCircuito("Rally LeMans",1883,29));
        mundial.agregarCarrera(new CarreraCircuito("Rally Indianapolis",1200,24));
*/
/*
        mundial.inscribirCoche(new Coche("Citroen","Xsara","\uD83D\uDE99 C.McRae_1",80));
        mundial.inscribirCoche(new Coche("Hyundai","i30","\uD83D\uDE97 B.Codd_2",110));
        mundial.inscribirCoche(new Coche("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_3",30));
        mundial.inscribirCoche(new Coche("Citroen","2CV_Trucado","\uD83C\uDFCE\uFE0F B.Martin_4",201));
        mundial.inscribirCoche(new Coche("Toyota","Corolla","\uD83D\uDE97 C.Sainz_5",150));
        mundial.inscribirCoche(new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F J.Gomez_6",221));
        mundial.inscribirCoche(new Coche("Opel","Corsa","\uD83D\uDE97 V.Bullido_7",162));
        mundial.inscribirCoche(new Coche("Renault","5 CopaTurbo","\uD83D\uDE99 J.Ventura_8",70));
        mundial.inscribirCoche(new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F S.Nieves_9",275));

        mundial.
*/








    }

}
