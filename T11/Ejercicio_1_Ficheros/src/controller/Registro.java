package controller;

import lombok.Getter;
import lombok.Setter;
import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
            printWriter = new PrintWriter(new FileWriter(file, true));

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

    public void leerFichero(){
        File file = new File("src/resources/usuarios.txt");
        FileReader fileReader= null;
        BufferedReader bufferedReader= null;

        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }
            //
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            System.err.println("Error IO");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error Salida");
            }
        }
    }
    public  void registroUser(){
        Scanner scanner =new Scanner(System.in);
        String registraMas="Si";
        while(registraMas.equalsIgnoreCase("SI")) {
            System.out.println("Introduce Nombre, Apellido, Dni, Telefono, edad");

            addUser(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
            System.out.println("Quieres introducir más usuarios? ( SI  o  NO )");
            registraMas = scanner.next();
            escribirFichero();

        }
    }
}
