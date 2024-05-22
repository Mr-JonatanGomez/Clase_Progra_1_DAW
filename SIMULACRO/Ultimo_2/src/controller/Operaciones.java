package controller;

import lombok.Getter;
import lombok.Setter;
import model.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

@Setter
@Getter
public class Operaciones {
    private ArrayList<Alumno>listaAlumnos;

    public Operaciones() {
        listaAlumnos= new ArrayList<>();
    }

    public Operaciones(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos= new ArrayList<>();
    }

    public void leerFicheroYconvertirAlumnos(){
        //F-FR-BF

        File file = new File("src/resources/alumnos.txt");
        BufferedReader bufferedReader=null;

        try {
            String line= null;
            bufferedReader= new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine())!=null){
                String [] molde = line.split(", ");
                Alumno alumno = new Alumno(molde[0],molde[1],molde[2],Double.valueOf(molde[3]) );
                listaAlumnos.add(alumno);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found or not exists");
        } catch (IOException e) {
            System.err.println("read Error");
        }


    }
    public void mostrarTodosAlumnos(){
        for (Alumno item:listaAlumnos) {
            System.out.println(item.toString());
        }
    }

    public void mostrarNotaMasAltayBaja(){
        listaAlumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                if (o1.getNotaMedia()> o2.getNotaMedia()){
                    return -1;
                }
                else if (o1.getNotaMedia()< o2.getNotaMedia()){
                    return 1;
                }else{
                return 0;
                }
            }
        });

        System.out.println("La nota mas alta es"+ listaAlumnos.get(0));
        System.out.println("La nota mas baja es"+ listaAlumnos.get(listaAlumnos.size()-1));
    }

}









