import database.DBConecction;
import model.Alumno;
import model.Profesor;
import repositories.AlumnoRepository;
import repositories.GeneralRepository;
import repositories.ProfesorRepository;

import java.sql.Connection;
import java.util.Scanner;

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
        */ //PRUEBA DE CONEXION

        //instanciamos el repositories para poder usarlo
        AlumnoRepository alumnoRepository = new AlumnoRepository();
        GeneralRepository generalRepository = new GeneralRepository();
        ProfesorRepository profesorRepository = new ProfesorRepository();

        Scanner sc = new Scanner(System.in);

        /* POR STATMENT concat
        alumnoRepository.insertarAlumno(new Alumno("Jonatan", "Gomez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Juanjo", "Avila", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Eduardo", "Afan", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Jonatan", "Gomez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Paco", "Dominguez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Ale", "Gonzalez", "no",1234));
        alumnoRepository.insertarAlumno(new Alumno("Eduardo", "Prieto", "no",1234));
        *///
        /*
        //alumnoRepository.editarCorreoAlumno(); //si va por parametro hay que darle otra vuelta
        // alumnoRepository.insertarAlumnoPreparedStatmentSinCorreo(new Alumno());
        //alumnoRepository.editarCorreoAlumnoPorIDsc();
        //alumnoRepository.deleteAlumno();
        //alumnoRepository.insertarAlumnoPreparedStatment(new Alumno());
        //alumnoRepository.deleteAlumnosTODOS();
        //alumnoRepository.editarNombre(new Alumno());
        // generalRepository.crearTabla();
        //profesorRepository.agregarProfesor(new Profesor());
        //profesorRepository.editarDato(new Profesor());
        //generalRepository.editarDato();
        //profesorRepository.deleteProfesor(new Profesor());
        //alumnoRepository.addNewAlumn(new Alumno());
*///TOCHACO de pruebas


        int opcion = -1;
        do {
            System.out.println("""
                    MENÚ CUD, ELIGE QUE QUIERES HACER:
                    1- AGREGAR NUEVO ALUMNO
                    2- AGREGAR NUEVO PROFESOR
                    3- EDITAR ALUMNO
                    4- EDITAR PROFESOR
                    5- ELIMINAR ALUMNO
                    6- ELIMINAR PROFESOR
                    7- LEER ALUMNOS
                    8- LEER PROFESORES
                    0- SALIR""");


            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    alumnoRepository.addNewAlumn(new Alumno());
                    break;
                case 2:
                    profesorRepository.agregarProfesor(new Profesor());
                    break;
                case 3:
                    alumnoRepository.updateAlumn(new Alumno());
                    break;
                case 4:
                    profesorRepository.editarDatosProfesor(new Profesor());
                    break;
                case 5:
                    alumnoRepository.deleteAlumn(new Alumno());
                    break;
                case 6:
                    profesorRepository.deleteProfesor(new Profesor());
                    break;
                case 0:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }
        } while (opcion != 0);
    }
}
