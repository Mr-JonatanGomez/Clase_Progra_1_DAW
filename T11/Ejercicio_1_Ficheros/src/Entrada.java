
import controller.Registro;
import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.registroUser();
        registro.leerFichero();


        // registro.mostrarDatos();
        //  System.out.println("sacando listaUser con get");
        //2 System.out.println(registro.getListaUser());


    }
}
