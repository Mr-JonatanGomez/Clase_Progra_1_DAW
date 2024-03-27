import model.Carrera;
import model.Coche;
import model.Competicion;

import java.util.ArrayList;

// tengo que cambiar formula de la velocidad que no esta sumando ni sirve por ahora
public class Entrada {
    public static void main(String[] args) {

        //CREACION DE COCHES
        Coche coche1 = new Coche("Citroen", "Xsara", "\uD83D\uDE99 JuanJ.A", 80);
        Coche coche2 = new Coche("Hyundai", "i30", "\uD83D\uDE97 Mario.V", 110);
        Coche coche3 = new Coche("Seat", "Panda", "\uD83D\uDE99 Paco.DP", 30);
        Coche coche4 = new Coche("Citroen", "2CV_Trucado", "\uD83C\uDFCE\uFE0F Borja.M", 201);
        Coche coche5 = new Coche("Toyota", "Corolla", "\uD83D\uDE97 Ale.Lis", 150);
        Coche coche6 = new Coche("Subaru", "Impreza", "\uD83C\uDFCE\uFE0F J.Gomez", 221);
        Coche coche7 = new Coche("Opel", "Corsa", "\uD83D\uDE97 Vic.Bul", 162);
        Coche coche8 = new Coche("Renault", "5 CopaTurbo", "\uD83D\uDE99 J.Ventu", 70);
        Coche coche9 = new Coche("Subaru", "Impreza", "\uD83C\uDFCE\uFE0F Edu.AdR", 275);


        Competicion mundial = new Competicion();//ya estan añadidas las carreras desde la CLASE COMPETICION

        // añado coches al mundial
//AQUI COMO NO SUPE VINCULAR CARRERA AL MUNDIAL Y COCHES AL MUNDIAL, AL METER LAS CARRERAS EN LA CLASE,
// AL APUNTAR LOS COCHES AL MUNDIAL, YA ESTAN VINCULADOS
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

        mundial.clasificacionGeneral();

        mundial.mostrarContain();


    }
}
