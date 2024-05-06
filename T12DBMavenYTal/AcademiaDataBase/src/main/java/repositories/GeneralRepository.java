package repositories;

import database.DBConecction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GeneralRepository {
    private Connection connection;
    Scanner sc = new Scanner(System.in);
    public void crearTabla(){
        //poner un condicional si la tabla profesores existe...
        connection = DBConecction.getConnection();
        Statement statement= null;
//id, nombre, correo, sueldo
        try {
            statement = connection.createStatement();
            System.out.println("Selecciona nombre de la DATABASE donde quieres crear la tabla");
            String database= sc.nextLine();
            String querySeleccionDatabase = "USE "+database+";";


            System.out.println("Selecciona nombre de la tabla que quieres crear");
            String nombreTabla= sc.nextLine();

            //PARA LOS CAMPOS DE LA TABLA NUEVA
            System.out.println("Ademas del Id Autoincremental(PK), especifica que campos tendra la tabla?" +
                    "\n (Debera´s especificar tambien su tipo...INT, VARCHAR(), CHAR()..." +
                    "\n Además cada campo debera separarse del siguiente mediante una coma." +
                    "\n EJEMPLO: nombre VARCHAR (100), correo VARCHAR (100), sueldo INT(11)");
            String camposAdd= sc.nextLine();




            String query = "CREATE TABLE IF NOT EXISTS "+nombreTabla+" (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR (100), correo VARCHAR (100), sueldo INT(11));";

            //String query = "CREATE TABLE IF NOT EXISTS "+nombreTabla+" (id INT AUTO_INCREMENT PRIMARY KEY, "+camposAdd+");";



            statement.execute(querySeleccionDatabase);
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error SQLConnection");
            System.out.println(e.getMessage());

        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion");
            }
        }
    }

}
