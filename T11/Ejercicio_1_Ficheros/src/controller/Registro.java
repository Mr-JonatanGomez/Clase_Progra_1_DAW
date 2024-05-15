package controller;

import lombok.Getter;
import lombok.Setter;
import model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@Setter
@Getter
public class Registro {
    private ArrayList<Usuario> listaUser;

    public Registro() {
        this.listaUser = new ArrayList<>();

    }

    public Registro(ArrayList<Usuario> listaUser) {
        this.listaUser = new ArrayList<>();

    }
    //AGREGAR USUARIO
    public void addUser(String nombre, String apellido,String dni, int telefono, int edad){
        listaUser.add(new Usuario(nombre, apellido, dni, telefono, edad));
    }

    public void mostrarDatos (){
        for (Usuario item:listaUser) {
            System.out.println(item.toString());
        }
    }
    public void escribirFichero(){
        //FILE - FILE WRITER - PrintWriter
        var file = new File("src/resources/usuarios.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter= null;

        //CREAMOS FICHERO SI NO EXISTE

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("No se pudo crear el file");
            }
        }

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);

            for (Usuario user:listaUser) {
                printWriter.println(user);
            }
        } catch (IOException e) {
            System.err.println("No se pudo escribir");
        } catch (NullPointerException e){
            System.err.println("Nulo");
        } finally {
            try {
                printWriter.close();
            }catch (NullPointerException e){
                System.err.println("cerro scaner nulo");
            }
        }


    }
}
