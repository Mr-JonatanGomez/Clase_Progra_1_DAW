import database.DBConecction;
import model.Alumno;
import model.Profesor;
import repositories.AlumnoRepository;
import repositories.GeneralRepository;
import repositories.ProfesorRepository;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {

        //INSTANCIA atributo tipo Connection de CLASE DBConnection,al ser STATIC no es NEW
        //y se pide Clase.Metodo en lugar del new
        //el metodo, nos devuelve la conexion, si no la hay la crea internamente
        Connection connection = DBConecction.getConnection();

        //comprobar CONEXION
        /*
        try {
            System.out.println(connection.getCatalog());// te devuelve el nombre de la database

        } catch (SQLException e) {
            System.err.println("Error en ejecucion SQL");
        } catch (NullPointerException e){
            System.err.println("connection es null");
        }
        */

        //instanciamos el repositories para poder usarlo
        AlumnoRepository alumnoRepository = new AlumnoRepository();
        GeneralRepository generalRepository = new GeneralRepository();
        ProfesorRepository profesorRepository=new ProfesorRepository();
        /* POR STATMENT concat
        alumnoRepository.insertarAlumno(new Alumno("Jonatan", "Gomez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Juanjo", "Avila", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Eduardo", "Afan", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Jonatan", "Gomez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Paco", "Dominguez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Ale", "Gonzalez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Eduardo", "Prieto", "no",1234));
        */
        //alumnoRepository.editarCorreoAlumno(); //si va por parametro hay que darle otra vuelta
        // alumnoRepository.insertarAlumnoPreparedStatmentSinCorreo(new Alumno());
        //alumnoRepository.editarCorreoAlumnoPorIDsc();
        //alumnoRepository.deleteAlumno();
        //alumnoRepository.insertarAlumnoPreparedStatment(new Alumno());
        //alumnoRepository.deleteAlumnosTODOS();
        //alumnoRepository.editarNombre(new Alumno());
        // generalRepository.crearTabla();
        profesorRepository.agregarProfesor(new Profesor());
    }
}
