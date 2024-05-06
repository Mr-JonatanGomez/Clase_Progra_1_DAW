package repositories;

import database.DBConecction;
import model.Profesor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProfesorRepository {
    private Connection connection;
    Scanner sc = new Scanner(System.in);

    public void agregarProfesor(Profesor profesor) {
        connection = DBConecction.getConnection();
        PreparedStatement preparedStatement = null;
        System.out.println("AGREGANDO UN PROFESOR A LA TABLA");
        String masProfesores = null;

        do {

            try {
                String query = "INSERT INTO profesores (nombre, correo, sueldo) VALUES (?,?,?)";
                preparedStatement = connection.prepareStatement(query);

                System.out.println("Introduce el nombre");
                profesor.setNombre(sc.next());
                System.out.println("Introduce el correo");
                profesor.setCorreo(sc.next());
                System.out.println("Introduce el sueldo(decimales con coma)");
                profesor.setSueldo(sc.nextDouble());

                preparedStatement.setString(1, profesor.getNombre());
                preparedStatement.setString(2, profesor.getCorreo());
                preparedStatement.setDouble(3, profesor.getSueldo());
                preparedStatement.execute();
                preparedStatement.close();


            } catch (SQLException e) {
                System.err.println("Error SQLException");
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.err.println("Error tipo de datos");
                System.out.println(e.getMessage());
            }
            System.out.println("Quieres registrar más profesores?");
            masProfesores = sc.next();
        } while (masProfesores.equalsIgnoreCase("SI"));

        DBConecction.closeConnection();
        sc.close();
    }
}
