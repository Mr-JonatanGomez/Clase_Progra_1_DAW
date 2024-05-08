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
            } catch (InputMismatchException e) {
                System.err.println("Error tipo de datos");
                System.out.println(e.getMessage());
            }
            System.out.println("Quieres registrar más profesores?");
            masProfesores = sc.next();
        } while (masProfesores.equalsIgnoreCase("SI"));

        DBConecction.closeConnection();

    }

    public void editarDatosProfesor(Profesor profesor) {
        String quieresEditarMas = null;

        connection = DBConecction.getConnection();
        Statement statement = null;

        System.out.println("EDITANDO DATOS DEL PROFESOR");

        do {
            System.out.println("¿Que id tiene el profesor que quieres editar?");
            int idEdit = sc.nextInt();

            System.out.println("Por seguridad, ¿Cual es el nombre del profesor que quieres editar?");
            String nombrEdit = sc.next();

            System.out.println("Introduce el nuevo nombre");
            String nombreN = sc.next();

            System.out.println("Introduce el nuevo correo");
            String correoN = sc.next();

            System.out.println("Introduce el nuevo salario");
            int salarioN = sc.nextInt();


            String querySelectDatabase = "USE curso_ue;";
            String query = "UPDATE profesores SET nombre ='" + nombreN + "',correo ='" + correoN + "',sueldo =" + salarioN + ", WHERE id =" + idEdit + " AND nombre = '" + nombrEdit + "';";


            try {
                statement = connection.createStatement();

                statement.execute(querySelectDatabase);
                statement.execute(query);
                statement.close();

            } catch (SQLException e) {
                System.err.println("SQL exception");
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.err.println("Puede no existir la database");
            }
            System.out.println("Quieres editar más datos?? SI/NO - S/N");
            quieresEditarMas = sc.next();
        } while (quieresEditarMas.equalsIgnoreCase("SI") || quieresEditarMas.equalsIgnoreCase("S"));

        DBConecction.closeConnection();


    }

    public void deleteProfesor(Profesor profesor) {
        connection = DBConecction.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();

            System.out.println("Introduce el id el profesor que quieras eliminar");
            int idEliminar = sc.nextInt();
            System.out.println("Por SEGURIDAD introduce el nombre el profesor que quieras eliminar");
            String nombreP = sc.next();

            String query = "DELETE FROM curso_ue.profesores WHERE id =" + idEliminar + " AND nombre ='" + nombreP + "';";
            //String query = "DELETE FROM curso_ue.alumnos WHERE id ="+idEliminar;

            statement.execute(query);
            statement.close();
            System.out.println(nombreP + " ha sido eliminado con exito");

        } catch (SQLException e) {
            System.err.println("Error conexion");
            System.out.println(e.getMessage());
        }


        DBConecction.closeConnection();
    }
}
