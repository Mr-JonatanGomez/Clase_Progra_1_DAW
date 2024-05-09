package repositories;

import database.DBConecction;
import database.EsquemaDB;
import model.Alumno;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlumnoRepository {
    //todas las acciones CRUD que necesitamos de alumno, Create, Read, Update, Delete--> CONNECTION
    private Connection connection;
    Scanner sc = new Scanner(System.in);
    public void insertarAlumnoStatment(Alumno alumno) {
        //Lo 1º necesitamos la conexion que es Static y se puede llamar abiertamente
        //abrir conex
        connection = DBConecction.getConnection();
        // trabajar
        //INSERT INTO alumnos (nombre, apellido, correo, telefono) si no insertamos todas hay que especificar cuales
        //VALUES ('borja','martin','correo',1234)
        Statement statement = null;


        try {

            statement = connection.createStatement();
            //String query = "INSERT INTO alumnos (nombre, apellido, correo, telefono) VALUES ('Bor','Mar','cor','12')";
            String query = "INSERT INTO alumnos (nombre, apellido, correo, telefono) VALUES ('" + alumno.getNombre() + "','" + alumno.getApellido() + "','" + alumno.getCorreo() + "'," + alumno.getTelefono() + ")";
            statement.execute(query);
            statement.close();

        } catch (SQLException e) {
            System.err.println("fallo en sentencia SQL");
        }


        // - cerrar
        DBConecction.closeConnection();
    }

    public void insertarAlumnoPreparedStatment(Alumno alumno) {
        //Lo 1º necesitamos la conexion que es Static y se puede llamar abiertamente
        //abrir conex
        connection = DBConecction.getConnection();
        // trabajar
        //INSERT INTO alumnos (nombre, apellido, correo, telefono) si no insertamos todas hay que especificar cuales
        //VALUES ('borja','martin','correo',1234)

        PreparedStatement preparedStatement = null;
        Scanner sc = new Scanner(System.in);

        String masAlumnos = null;

        do {
        try {
            String query = "INSERT INTO alumnos (nombre, apellido, correo, telefono) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);//pide directamente la QUERY

            String nombre, apellido, correo;
            int telefono;
            System.out.println("Introduce nombre");
            alumno.setNombre(sc.next());
            System.out.println("Introduce apellido");
            alumno.setApellido(sc.next());
            System.out.println("Introduce correo");
            alumno.setCorreo(sc.next());
            System.out.println("Introduce telefono");
            alumno.setTelefono(sc.nextInt());

            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4, alumno.getTelefono());
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            System.err.println("fallo en sentencia SQL");
        }
            System.out.println("Quieres registrar más alumnos?");
            masAlumnos = sc.next();
        } while (masAlumnos.equalsIgnoreCase("SI"));

        // - cerrar
        DBConecction.closeConnection();
        sc.close();

    }

    public void insertarAlumnoPreparedStatmentSinCorreo(Alumno alumno) {
        //Lo 1º necesitamos la conexion que es Static y se puede llamar abiertamente
        //abrir conex
        connection = DBConecction.getConnection();
        // trabajar
        //INSERT INTO alumnos (nombre, apellido, correo, telefono) si no insertamos todas hay que especificar cuales
        //VALUES ('borja','martin','correo',1234)
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        String masAlumnos = null;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                String query = "INSERT INTO alumnos (nombre, apellido, telefono) VALUES (?,?,?)";
                preparedStatement = connection.prepareStatement(query);//pide directamente la QUERY

                String nombre, apellido, correo;
                int telefono;
                System.out.println("Introduce nombre");
                alumno.setNombre(sc.next());
                System.out.println("Introduce apellido");
                alumno.setApellido(sc.next());
                System.out.println("Introduce telefono");
                alumno.setTelefono(sc.nextInt());

                preparedStatement.setString(1, alumno.getNombre());
                preparedStatement.setString(2, alumno.getApellido());
                preparedStatement.setInt(3, alumno.getTelefono());
                preparedStatement.execute();
                preparedStatement.close();

            } catch (SQLException e) {
                System.err.println("fallo en sentencia SQL");
            }

            System.out.println("Quieres registrar más alumnos?");
            masAlumnos= sc.next();
        }while(masAlumnos.equalsIgnoreCase("SI"));



        // - cerrar
        DBConecction.closeConnection();
        sc.close();
    }

    public void editarCorreoAlumno(Alumno alumno) {
        connection = DBConecction.getConnection(); //ABRIENDO CONEX


        Statement statment = null;

        try {
            statment = connection.createStatement();
            String query = "UPDATE alumnos SET correo = 'probando@mail.com' WHERE nombre ='Jonatan' AND apellido = 'Gomez'";
            statment.execute(query);
            statment.close();
        } catch (SQLException e) {
            System.err.println("Fallo en la sentencia SQL QUERY");
            System.out.println(e.getMessage());
        }


        DBConecction.closeConnection();//CERRANDO CONEX
    }

    public void editarCorreoAlumnoPorIDsc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el ID del alumno que quieras modificar el correo");
        int id = sc.nextInt();
        System.out.println("Por seguridad, introduce tambien el nombre");
        String seguridadCasera = sc.next();
        System.out.println("Introduzca nuevo correo para el user con ID: " + id + ", y nombre: " + seguridadCasera);
        String correo = sc.next();

        connection = DBConecction.getConnection(); //ABRIENDO CONEX


        Statement statment = null;

        try {
            statment = connection.createStatement();
            String query = "UPDATE alumnos SET correo = '" + correo + "' WHERE id = " + id + " AND nombre = '" + seguridadCasera + "'";
            statment.execute(query);
            statment.close();
            sc.close();
        } catch (SQLException e) {
            System.err.println("Fallo en la sentencia SQL QUERY");
            System.out.println(e.getMessage());
        }


        DBConecction.closeConnection();//CERRANDO CONEX
    }

    public void deleteAlumno() {
        Scanner sc = new Scanner(System.in);
        connection = DBConecction.getConnection();
        Statement statement = null;

        System.out.println("Introduce el nombre de la DATABASE y la TABLE donde está el dato que quieres eliminar" +
                "\n⚠ introducelo separado por un punto, como en SQL⚠");
        String dataBaseTable = sc.next();

        System.out.println("Introduce el ID del alumno que quieres eliminar");
        int idEliminar = sc.nextInt();


        //String query = "DELETE FROM curso_ue.alumnos WHERE id=22;";

        try {
            statement = connection.createStatement();
            //String query = "DELETE FROM curso_ue.alumnos WHERE id ="+idEliminar;
            String query = "DELETE FROM "+dataBaseTable+" WHERE id =" + idEliminar;
            // "UPDATE alumnos SET correo = '" + correo + "' WHERE id = " + id + " AND nombre = '" + seguridadCasera + "'";
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            System.err.println("Fallo en eliminado");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("null");
        }

        DBConecction.closeConnection();
        sc.close();
    }

    public void deleteAlumnosTODOS(){
        Scanner sc = new Scanner(System.in);
        connection=DBConecction.getConnection();
        Statement statement = null;


        try {
            statement=connection.createStatement();
            String seguro;
            String query ="DELETE FROM alumnos";
            System.out.println("VAS A ELIMINAR TODOS LOS ALUMNOS ¿ SEGURO ? SI/NO");
            seguro = sc.next();
            if (seguro.equalsIgnoreCase("SI") || seguro.equalsIgnoreCase("S")){
                System.out.println("⛔INSISTO...⛔ VAS A ELIMINAR TODOS LOS ALUMNOS ¿ SEGURO ? SI/NO");
                seguro = sc.next();
                if (seguro.equalsIgnoreCase("SI") || seguro.equalsIgnoreCase("S")){
                    statement.execute(query);
                    statement.close();
                }
            }


        } catch (SQLException e) {
            System.err.println("Error al crear Statment");
        }


        DBConecction.closeConnection();
        sc.close();


    }
    public void editarNombre(Alumno alumno){
        connection = DBConecction.getConnection();
        Statement statement= null;

        try {
            statement= connection.createStatement();

            System.out.println("Introduce el nuevo nombre");
            String nombre=sc.next();
            System.out.println("Introduce el id del nombre a modificar");
            String id=sc.next();
            String query = "UPDATE alumnos SET nombre = '" + nombre + "' WHERE id = " + id;

            statement.execute(query);

        } catch (SQLException e) {
            System.err.println("Error al crear el statment");
            System.out.println(e.getMessage());
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conex");
            }
        }


    }

//
    public void addNewAlumn(Alumno alumno){
        connection=DBConecction.getConnection();
        Statement statement = null;

        try {
            statement=connection.createStatement();
            String nombre, apellido, correo;
            int telefono;

            System.out.println("Agregando nuevo alumno a la database");
            System.out.println("Introduce su nombre");
            nombre = sc.next();
            System.out.println("Introduce su apellido");
            apellido = sc.next();
            System.out.println("Introduce su correo");
            correo = sc.next();
            System.out.println("Introduce su telefono");
            telefono = sc.nextInt();

            String queryData="USE curso_ue;";
            String query = "INSERT INTO alumnos (nombre, apellido, correo, telefono) VALUES ('"+nombre+"','"+apellido+"','"+correo+"',"+telefono+");";

            statement.execute(queryData);
            statement.execute(query);
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error al crear statment");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("El tipo de datos introducido no es correcto");
        }

        DBConecction.closeConnection();
    }

    public void deleteAlumn(Alumno alumno){
        connection=DBConecction.getConnection();
        Statement statement= null;

        try {
            statement= connection.createStatement();

            System.out.println("¿Cual es el ID del alumno que deseas eliminar?");
            int idDelete = sc.nextInt();
            System.out.println("Por seguridad, ¿cual es el nombre del alumno a eliminar?");
            String nombreD= sc.next();

            String query="DELETE FROM alumnos WHERE id="+idDelete+" AND nombre ='"+nombreD+"';";

            statement.execute(query);
            statement.close();
            System.out.println("Alumno eliminado correctamente");

        } catch (SQLException e) {
            System.err.println("Error en el statement");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.err.println("Tipo de dato no valido");
            System.out.println(e.getMessage());
        }

        DBConecction.closeConnection();
    }

    public void updateAlumn(Alumno alumno){//
        connection=DBConecction.getConnection();
        Statement statement= null;

        try {
            statement=connection.createStatement();
            System.out.println("Introduce el ID del alumno que quieras editar sus datos");
            int idChan= sc.nextInt();
            System.out.println("Por seguridad, introduce el nombre del alumno que quieras modificar los datos");
            String nameChan= sc.next();

            System.out.println("Introduce el nuevo nombre");
            String nombre= sc.next();
            System.out.println("Introduce el nuevo apellido");
            String apellido= sc.next();
            System.out.println("Introduce el nuevo correo");
            String correo= sc.next();
            System.out.println("Introduce el nuevo telefono");
            int telefono= sc.nextInt();

            String query= "UPDATE alumnos SET nombre ='"+nombre+"', apellido ='"+apellido+"',correo ='"+correo+"',telefono ="+telefono+" WHERE nombre='"+nameChan+"';";
            //String query= "UPDATE alumnos SET nombre ='"+nombre+"', apellido ='"+apellido+"',correo ='"+correo+"',telefono ="+telefono;
            // TODO: 09/05/2024 probar esto
            String query2 = String.format("UPDATE %s " +
                    "SET %s = '%s', " +
                            "%s = '%s'," +
                            "%s = '%s'," +
                            "%s = %s " +
                            "WHERE %s = %s " +
                            "AND %s = '%s'",
                    EsquemaDB.TAB_ALUMNOS,//update
                    EsquemaDB.COL_NAME, nombre,
                    EsquemaDB.COL_SURNAME,apellido,
                    EsquemaDB.COL_MAIL, correo,
                    EsquemaDB.COL_PHONE, telefono,
                    EsquemaDB.COL_ID,idChan,
                    EsquemaDB.COL_NAME,nameChan
                    );

// Sacamos variable, e igualamos el update
            int numero = statement.executeUpdate(query2);
            System.out.println("El numero de filas afectadas por el update fue: "+numero+"");
            statement.close();

            System.out.println(" Los datos fuero cambiado con exito!");

        } catch (SQLException e) {
            System.err.println("Error SQL");
            System.out.println(e.getMessage());
        }


        DBConecction.closeConnection();
    }

    public void obtenerAlumnos(){
        // SELECT * FROM alumnos
        //necesitamos el RESULTSET--> que es el conjunto de datos que se obtienen de una seleccion
        // r1,R2,R3...
        //R1-> [id, nombre, apellido, correo, telefono]
        connection= DBConecction.getConnection();
        try {
            Statement statement = connection.createStatement();
          //  statement.executeQuery("SELECT * FROM alumnos;"); HAY QUE IGUALARLO con ResultSet
            ResultSet resultado = statement.executeQuery("SELECT * FROM alumnos;");
            while(resultado.next()){
                //el bucle se realiza mientras haya sigueinte

                String nombre =resultado.getString("nombre");//tambien puedes decirle el index
                String apellido=resultado.getString("apellido");
                int telefono= resultado.getInt("telefono");
                // SE PUEDE CREAR OBJETO ALUMNO y darle esos datos
                // TODO: 08/05/2024  minuto 26 de grabacion
                //Alumno alumno = new Alumno(nombre, apellido, telefono)

                System.out.println(nombre+", "+apellido+", "+telefono);
            }
        } catch (SQLException e) {
            System.err.println("Error SQL");
        }finally{
            DBConecction.closeConnection();
            connection=null;
        }
    }
    public void obtenerAlumnosRangoId(){
        connection=DBConecction.getConnection();
        Statement statement= null;

        try {

            System.out.println("Introduce el primer numero del rango");
            int rango1= sc.nextInt();
            System.out.println("Introduce el final del rango");
            int rango2= sc.nextInt();
            System.out.println(" SACANDO LOS ALUMNOS CON ID COMPRENDIDOS ENTRE "+rango1+" y"+rango2+" inclusive");

            statement=connection.createStatement();
            String query = String.format("SELECT * FROM %s WHERE %s BETWEEN %s AND %s",
                    EsquemaDB.TAB_ALUMNOS,
                    EsquemaDB.COL_ID, rango1, rango2);

            ResultSet resultado = statement.executeQuery(query);

            while(resultado.next()){
                //Aqui metemos los datos que queremos obtener con variables
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String correo = resultado.getString("correo");
                int telefono = resultado.getInt("telefono");

                Alumno alumno = new Alumno(id, nombre, apellido, correo, telefono);
                System.out.println(alumno.getId()+", "+alumno.getNombre()+", "+alumno.getApellido()+", "+alumno.getCorreo()+", "+alumno.getTelefono()+", ");

            }
        } catch (SQLException e) {
            System.err.println("Error SQL");
        }catch (InputMismatchException e){
            System.err.println("Tipo de dato no valido");
        } finally {
            connection=null;
            DBConecction.closeConnection();
        }

    }
    public boolean existeAlumno(String nombre, String correo){
        //SIRVE PARA VERIFICAR SI YA EXISTE EL ALUMNO

        //por si se cambia la database no hay que cambiar aqui PONEMOS BANDERAS
        //metemos enter para aclara
        boolean hayAlumno=false;
        String query = String.format("SELECT * FROM %s " +
                        "WHERE %s = '%s' " +
                        "AND %s = '%s' ",
                EsquemaDB.TAB_ALUMNOS,
                EsquemaDB.COL_NAME, nombre,
                EsquemaDB.COL_MAIL, correo);

        connection=DBConecction.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            hayAlumno= resultSet.next();
            // el retorno no se pone aqui porque no cerraria la conex
        } catch (SQLException e) {
            System.err.println("ERROR SQL");
        } finally {
            DBConecction.closeConnection();
            connection=null;
        }
//true cuando usuarios cumplen condicion
        return hayAlumno;
    }



}
