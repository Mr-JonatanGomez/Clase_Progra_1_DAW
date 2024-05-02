package controller;

import lombok.Getter;
import lombok.Setter;
import model.Jugador;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class JuegoYGuardadoFicheros {
    private Jugador jugador;
    private ArrayList<Jugador> listadoJugadores;
    private int mejorRecord = 150;

    public JuegoYGuardadoFicheros() {
        this.listadoJugadores = new ArrayList<>();
    }

    public void crearFicheros() {
        File fileRecord = new File("src/resources/recordMaximo.obj");
        File fileHistorial = new File("src/resources/historialJugadores.obj");
        if (!fileRecord.exists()) {
            try {
                fileRecord.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
        if (!fileHistorial.exists()) {
            try {
                fileRecord.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo, No se puede crear el fichero o ya EXISTE");
            }
        }
    }

    public void guardarRecord (Jugador jugador){
        //  var guardarRecord = new ObjectOutputStream();
        ObjectOutputStream fileRecord = null;
        File file = new File("src/resources/recordMaximo.obj");


        try {
            fileRecord=new ObjectOutputStream(new FileOutputStream(file));
            fileRecord.writeObject(jugador);
            System.out.println("JUGADOR ESCRITO");
        } catch (IOException e) {
            System.err.println("error en la escritura");//
        } catch (NullPointerException e){
            System.err.println("error NullPointer");
        } finally {
            try {
                assert fileRecord != null;
                fileRecord.close();
            } catch (IOException e) {
                System.err.println("Error en cierre de fichero");
            }
        }
    }

    public void leerRecord(){
        //HACER SIEMPRE AL COMENZAR PARTIDA para IGUALAR RECORD
        ObjectInputStream objectRecord;
        objectRecord = null;
        File file = new File("src/resources/recordMaximo.obj");

        try {
            objectRecord = new ObjectInputStream(new FileInputStream(file));
            Jugador jugador= (Jugador) objectRecord.readObject();
            mejorRecord = jugador.getRecordPersonal();//igualamos record al mejor guardado
            System.out.println("El actual record lo ostenta: ");
            System.out.println(jugador.getNombre());
            System.out.println("Acertando el numero oculto en "+jugador.getRecordPersonal()+ " intentos");

        } catch (IOException e) {
            System.err.println("");
        } catch (NullPointerException e) {
            System.err.println("Error Null Pointer");
        }catch (ClassNotFoundException e) {
            System.err.println("Error Class Not Found");
        } finally {
            try {
                assert objectRecord != null;
                objectRecord.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar flujo lectura");
            }catch (NullPointerException e) {
                System.err.println("1ª PARTIDA, NO EXISTE RECORD");
            }
        }
    }


    public void guardarHistorial (Jugador jugador){
        //  var guardarRecord = new ObjectOutputStream();
        ObjectOutputStream fileHistorial = null;
        File file = new File("src/resources/historialJugadores.obj");


        try {
            fileHistorial=new ObjectOutputStream(new FileOutputStream(file, true));
            fileHistorial.writeObject(jugador);
        } catch (IOException e) {
            System.err.println("error en la escritura");//
        } catch (NullPointerException e){
            System.err.println("error NullPointer");
        } finally {
            try {
                assert fileHistorial != null;
                fileHistorial.close();
            } catch (IOException e) {
                System.err.println("Error en cierre de fichero");
            }
        }
    }

    public void partida() {
        // antes de iniciar creamos instancia a fichero


        crearFicheros();

        leerRecord();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador");
        String nombre = sc.next();
        Jugador jugador = new Jugador(nombre);


        int numeroAleatorio;
        int intentos = 0;
        int numeroUser = 0;
        int puntosPartida = -1;
        int recordActual = -1;

        numeroAleatorio = (int) (Math.random() * 20) + 1;
        System.out.println(numeroAleatorio);
        do {


            intentos++;
            do {
                System.out.println("Introduce numero entre el 1 y el 20");
                numeroUser= sc.nextInt();
                if (numeroUser < 1 || numeroUser > 20) {
                    System.err.println("Numero fuera del rango del juego");
                }
            } while (numeroUser < 1 || numeroUser > 20);

            if (numeroUser==numeroAleatorio){
                System.out.println("Enhorabuena, has acertado el número oculto (" + numeroAleatorio + ") en un total de " + intentos);
                puntosPartida = intentos;

                jugador.setPuntuacionActual(intentos);
            }

        } while (numeroUser!= numeroAleatorio);

        // SI SUPERA RECORD PERSONAL LO ESTABLECEMOS
        if (jugador.getPuntuacionActual()< jugador.getRecordPersonal()){
            jugador.setRecordPersonal(jugador.getPuntuacionActual());

        }

        //SI SE SUPERA EL RECORD INSCRIBIR RECORD
        if (jugador.getPuntuacionActual()<=mejorRecord){
            guardarRecord(jugador);
        }

        // DE CUALQUIER MODO LO INSCRIBIMOS AL HISTORIAL
        // A FUTURO:
        // -SIEMPRE SI NO HAY NADIE CON ESE NOMBRE
        // -SI EXISTE, SOLO SI MEJORA RECORD

        guardarHistorial(jugador);

    }

}
