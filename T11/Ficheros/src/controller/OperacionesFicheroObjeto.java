package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class OperacionesFicheroObjeto {
    public void escrituraObjeto() {
        // ObjectOutPutStream -> FileOutPutStream -> File
        ObjectOutputStream objectOutputStream = null;
        File file = new File("src/resources/ejemplos/usuarios.obj");


        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

            //MEJOR CON UN ARRAY
            ArrayList listaUsuarios = new ArrayList();
            listaUsuarios.add(new Usuario("Carlos", "Lopez@mail.com", "Madrid", 30));
            listaUsuarios.add(new Usuario("Javier", "Perez@mail.com", "Valencia", 22));
            listaUsuarios.add(new Usuario("Laura", "Martinez@mail.com", "Sevilla", 28));
            listaUsuarios.add(new Usuario("Maria", "Rodriguez@mail.com", "Barcelona", 45));
            listaUsuarios.add(new Usuario("Jonatan", "Gomez@mail.com", "Guadalajara", 37));

            objectOutputStream.writeObject(listaUsuarios);

            //para ahorrar codigo creamos el FileOut dentro del parametro
            //ESCRIBIMOS UN OBJETO
            //objectOutputStream.writeInt(12);   objeto 12
            //objectOutputStream.writeChars("a");   objeto de String
            //objectOutputStream.writeObject();   guardamos objeto, pero solo los que son SERIALIZABLE

            //LISTA USER PARA ESCRIBIR USER 1 a 1
            /*
            objectOutputStream.writeObject(new Usuario("Jonatan", "Gomez@mail.com", "Guadalajara", 37));
            objectOutputStream.writeObject(new Usuario("Carlos", "Lopez@mail.com", "Madrid", 30));
            objectOutputStream.writeObject(new Usuario("Maria", "Rodriguez@mail.com", "Barcelona", 45));
            objectOutputStream.writeObject(new Usuario("Javier", "Perez@mail.com", "Valencia", 22));
            objectOutputStream.writeObject(new Usuario("Laura", "Martinez@mail.com", "Sevilla", 28));
            */

            //HACER UN ARRAY


        } catch (IOException e) {
            System.out.println("Error en la salida del objeto");


        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            } catch (NullPointerException e) {
                System.out.println("Cerrado en nulo");
            }
        }
    }


    public void lecturaObjeto() {
        //FLUJO ESCRITURA ObjectOutPutStream -> FileOutPutStream -> File
        //FLUJO LECTURA ObjectInPutStream -> FileInPutStream -> File
        ObjectInputStream objectInputStream = null;
        File file = new File("src/resources/ejemplos/usuarios.obj");

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            //AQUI INICIAMOS LA LECTURA, pero primero se rellena TODOS LOS CATCH, FINALLy
            // objectInputStream.readObject(); y con este tipo agregamos el objeto Y CASTEAMOS

            ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) objectInputStream.readObject();

            // Imprimir los usuarios leídos
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario);
            }


            Usuario usuario = (Usuario) objectInputStream.readObject();
            //probamos que funciona haciendo un sout de usuario, y COMO TENEMOS EL TO STRING, los puede leer y mostrar
            //System.out.println(usuario); LEEMOS EL PRIMERO

            //PARA LEER TODOS; un while hasta que el objeto sea null y CASTEAMOS
            while ((usuario = (Usuario) objectInputStream.readObject()) != null) {
                System.out.println(usuario);
            }


        } catch (IOException e) {
            System.out.println("El objeto no existe o no se puede leer");
        } catch (ClassCastException e) {
            System.out.println("Error en casteo de clase");//para coger los posibles errores de CASTEO
        } catch (ClassNotFoundException e) {
            System.out.println("La clase no esta encontrada en el sistema");
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            } finally {
                System.out.println("Cerrado a Nulo");
            }
        }

    }
}
