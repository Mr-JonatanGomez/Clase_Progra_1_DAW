
import controller.Registro;
import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Registro registro = new Registro();

        String registraMas="Si";
        while(registraMas.equalsIgnoreCase("SI")) {
            System.out.println("Introduce Nombre, Apellido, Dni, Telefono, edad");
            registro.addUser(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
            System.out.println("Quieres introducir más usuarios? ( SI  o  NO )");
            registraMas = scanner.next();
            if (registraMas.equalsIgnoreCase("no")){
                // metododo para volcar los users al fichero
                registro.escribirFichero();
            }
        }


        // registro.mostrarDatos();
        //  System.out.println("sacando listaUser con get");
        //2 System.out.println(registro.getListaUser());



    }
}
