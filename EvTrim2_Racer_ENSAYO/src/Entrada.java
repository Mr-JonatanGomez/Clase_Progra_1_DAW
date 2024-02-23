import model.Carrera;
import model.Coche;
import model.Competicion;

import java.util.ArrayList;

// tengo que cambiar formula de la velocidad que no esta sumando ni sirve por ahora
public class Entrada {
    public static void main(String[] args) {

        //CREACION DE COCHES
        Coche coche1= new Coche("Citroen","Xsara","\uD83D\uDE99 C.McRae_1",80);
        Coche coche2= new Coche("Hyundai","i30","\uD83D\uDE97 M.Villanueva_2",110);
        Coche coche3= new Coche("Seat","Panda","\uD83D\uDE99 M.Fibonnacci_3",30);
        Coche coche4= new Coche("Citroen","2CV_Trucado","\uD83C\uDFCE\uFE0F B.Martin_4",201);
        Coche coche5= new Coche("Toyota","Corolla","\uD83D\uDE97 A.Lisbeth_5",150);
        Coche coche6= new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F J.Gomez_6",221);
        Coche coche7= new Coche("Opel","Corsa","\uD83D\uDE97 V.Bullido_7",162);
        Coche coche8= new Coche("Renault","5 CopaTurbo","\uD83D\uDE99 J.Ventura_8",70);
        Coche coche9= new Coche("Subaru","Impreza","\uD83C\uDFCE\uFE0F E.AfanRivera_9",275);



        Competicion mundial=new Competicion();//ya estan añadidas las carreras

        // añado coches al mundial

        mundial.apuntarCoche(coche1);
        mundial.apuntarCoche(coche2);
        mundial.apuntarCoche(coche3);
        mundial.apuntarCoche(coche4);
        mundial.apuntarCoche(coche5);
        mundial.apuntarCoche(coche6);
        mundial.apuntarCoche(coche7);
        mundial.apuntarCoche(coche8);
        mundial.apuntarCoche(coche9);

        // añado carreras al mundial

        mundial.mostrarCarreras();

        for (Carrera carrera : mundial.getListadoCarreras()) {
            carrera.iniciarCarrera(carrera);
        }

        System.out.println("coche1"+coche1.getPuntosGeneral());



    }
}
