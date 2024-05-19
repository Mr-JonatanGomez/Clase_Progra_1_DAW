package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;


@Getter
@Setter
public class Operaciones {
    private ArrayList<Alumno> listadoAlumnos;

    public Operaciones() {
        listadoAlumnos = new ArrayList<>();
    }

    public Operaciones(ArrayList<Alumno> listadoAlumnos) {
        listadoAlumnos = new ArrayList<>();
    }

    public void leerFichero() {
        File file = new File("src/resources/alumnos.txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            //alumniEdit = linea.split(",");

            while ((linea = bufferedReader.readLine()) != null) {

                String[] alumniEdit= linea.split(",");
                Alumno alumno = new Alumno((alumniEdit[0]), (alumniEdit[1]),(alumniEdit[2]), (Integer.valueOf(alumniEdit[3])));
               /*



                alumno.setNombre(alumniEdit[0]);
                alumno.setApellido(alumniEdit[1]);
                alumno.setCorreo(alumniEdit[2]);
                alumno.setMedia(Integer.valueOf(alumniEdit[3]));
                */

                listadoAlumnos.add(alumno);
                System.out.println(linea);

            }

        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado");
        } catch (IOException e) {
            System.err.println("Error en la lectura");
        } catch (NullPointerException e){
            System.err.println("Null");
        }
    }

    public void mostrarAlumnoMejorNota() {
        System.out.println("MOSTRAREMOS ALUMNO CON MEJOR NOTA");
        listadoAlumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                if (o1.getMedia() > o2.getMedia()) {
                    return -1;
                }
                if (o1.getMedia() < o2.getMedia()) {
                    return 1;
                }
                else {

                    return 0;
                }
            }
        });
        System.out.println(listadoAlumnos.get(0));
    }

    public void mostrarTodos(){
        System.out.println("MOSTRAREMOS TODOS LOS ALUMNOS");

        for (Alumno item:listadoAlumnos) {
            System.out.println(item.toString());
        }
    }
}
