package database;

import java.net.URI;
import java.sql.Connection;

public class DBConnectionMia {
    static Connection connectionMia= null;

    public static Connection createConnection(){
        //primero metemos el driver de jdbc (conectorJ) en el POM dependecies
        //eso ya estaba de antes

        //Creamos el Class.forName y dentro cargamos el Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver no encontrado");
            System.out.println(e.getMessage());
        }

        //ABRIMOS LA CONEX
            // PRIMERO CREAR URI, y LUEGO ABRIR CONEX con USER y PASS

            // jdbc:mysql:direccionSERVER:nºPUERTO/NombreDATABASE
        // TODO: 09/05/2024 aqui me quede con la conex
        String uri=("jdbc:mysql://127.0.0.1:3304/curso_ue");

        return connectionMia;
    }
}
