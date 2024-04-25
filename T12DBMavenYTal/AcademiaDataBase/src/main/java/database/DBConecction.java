package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//LA CONEX A MI DB!!!!!!!!!     //LA CONEX A MI DB!!!!!!!!!
public class DBConecction {
    //LA CONEX A MI DB!!!!!!!!!
    static Connection connection = null; // poner siempre la opcion java.sql

    //config para Base de Datos
    //static : accesible desde todos los sitios de forma directa
    // es un elemento que pertenece a la clase, no al objeto... clase.elemento


    //CREAR CONEXION
    private static void createConnection() {
        //cargar el driver en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver NO DISPONIBLE o NO DESCARGADO");
            System.out.println(e.getMessage());
        }

        //abrir conexion (1 crear uri y 2 abrir la conex desde una uri con user y pass)

        //la uri es la direccion, y la declaramos con String
        // siempre sera jdbc:mysql://DirIP:PUERTO/NombreDatabase
        String uri = "jdbc:mysql://127.0.0.1:3306/curso_ue";
        try {
            //para abrir la conexion necesitamos la connection igualada al DriverManager
            //y 3 parametros, uri user y password
            connection = DriverManager.getConnection(uri, "root", "");
        } catch (SQLException e) {
            System.err.println("Error ejecucion SQL");
            System.out.println(e.getMessage());
        }
    }


//PEDIR CONEXION
    public static Connection getConnection() {
        // al crear el getConnection, sale warning gigante, porque la conexion esta iniciada a nula, con lo que
        // hay que crearla si fuera nula
        if (connection == null) {
            createConnection();

        }
        return connection;
        // CUANDO ALGUIEN  PIDE CONEXION, LA CREA SI NO EXISTE, O LA RETORNA SI EXISTE, PERO NO CREA VARIAS...
    }

    //CERRAR CONEXION
    public static void closeConnection(){
        try {
            connection.close();
            connection= null; // para terminar de cerrarlo y crear un camino nuevo si se vuelve a solicitar
        } catch (SQLException e) {
            System.err.println("Error en cerrado db");
        }
    }

}
