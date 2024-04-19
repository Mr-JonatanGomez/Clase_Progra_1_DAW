package model;

import java.io.*;
import java.util.Scanner;

public class TrabajoFichero {

    public void leerDatosFichero() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Escribe direccion del fichero a leer");
        //escribe esta para que funcione CABRON: src/resources/fichero.txt
        //String direccion = sc.next();

        //coñazo meter direccion cada vez
        File file = new File("src/resources/fichero.txt");

        System.out.println("Nombre del fichero " + file.getName());
        System.out.println("Ruta con hipervinculo: " + file.getAbsoluteFile());
        System.out.println("Espacio Libre en Bytes: " + file.getFreeSpace());
        double kylobytesFree = (double) file.getFreeSpace() / 1024;
        System.out.println("Espacio Libre en KB: " + kylobytesFree);
        double gbytesF = (double) file.getFreeSpace() / 1073741824;
        System.out.println("Espacio Libre en GB: " + gbytesF);


        System.out.println("Espacio Ocupado en Bytes: " + file.length());
        double kylobytesOcu = (double) file.length() / 1024;
        System.out.println("Espacio Ocupado en KB: " + kylobytesOcu);
        double gbytesO = (double) file.length() / 1073741824;
        System.out.println("Espacio Ocupado en GB: " + gbytesO);


        System.out.println("Se puede leer? " + file.canRead());
        System.out.println("Se puede Escribir? " + file.canWrite());
        System.out.println("Se puede ejecutar? " + file.canExecute());

    }

    public void escribirFichero() {
        File nombre = new File("src/resources/datosNombre.txt");
        if (!nombre.exists()) {
            try {
                nombre.createNewFile();
            } catch (IOException e) {
                System.out.println("no se puede crear");
            }
        }

        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            //para no borrar lo que ya hay
            printWriter = new PrintWriter(new FileWriter(nombre, true));
            String linea = "Don José Jonatan Gómez Rodríguez";
            printWriter.println(linea);


        } catch (IOException e) {
            System.out.println("No se pudo escribir");
        } finally {
            try {
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (NullPointerException e) {
                System.out.println("cerrado con nulo");
            }
        }

    }

    public void leerFichero() {
        File nombre = new File("src/resources/datosNombre.txt");


        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(nombre));

            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            /*
            System.out.println(bufferedReader.readLine()); //lee primera linea
            System.out.println(bufferedReader.readLine()); //lee segunda linea
            System.out.println(bufferedReader.readLine()); //lee tercera linea
            */


        } catch (IOException e) {
            System.out.println("No se pudo escribir");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("no se pudo cerrar");
                }
            }
        }
    }

    public void leerFicheroScanner() {
        //File nombre = new File("src/resources/datosNombre.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(new File("src/resources/datosNombre.txt"));
            while (sc.hasNextLine()) { // mientras hay algo en prox.Linea
                String linea = sc.nextLine(); //declaramos string  e igualamos a nextLine
                System.out.println(linea); // imprimimos linea
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no existe, y no puedes leerlo");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }


    }


    public void buscarPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que palabra quieres buscar en el fichero??");
        //meter baila
        String palabraBuscada = sc.next();
        String linea;

        int numeroLinea = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/resources/fichero.txt"))) {

            while ((linea = bufferedReader.readLine()) != null) {

                numeroLinea++;
                if (linea.contains(palabraBuscada)) {
                    System.out.println("La palabra '" + palabraBuscada + "' se encuentra en la línea " + numeroLinea);
                    System.out.println(linea);
                    //variables para cuentas
                    String[] numPalabras = linea.split(" ");
                    int contadorPalabras = 0;
                    int posicion;
                    System.out.println("El numero de palabras en esta linea es " + numPalabras.length);
//ESTO DE LA POSICION NO ME VALE nO ME SALE
                   /* for (String item : numPalabras) {
                        contadorPalabras++;
                        if (item.equalsIgnoreCase(palabraBuscada)) {
                            posicion = contadorPalabras;
                        }
                    }

                    System.out.println("La posicion de " + palabraBuscada + " es la numero " + posicion);
                */
                }

            }
        } catch (IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public void escribirBinario() {
        File ficheroBinario = new File("src/resources/ficheroBinario.bin");
        ObjectOutputStream escribirBin = null;
        try {
            if (!ficheroBinario.exists()) {
                ficheroBinario.createNewFile();
            }


            escribirBin = new ObjectOutputStream(new FileOutputStream(ficheroBinario));
            //generamos variable escribir con var o ObjectOutputStream

            escribirBin.writeBoolean(true);
            escribirBin.writeDouble(7.77);
            escribirBin.writeInt(978);
            System.out.println("escrito queda");


        } catch (IOException e) {
            System.err.println("problemas con fichero");
        } finally {
            try {
                escribirBin.close();
            } catch (IOException e) {
                System.out.println("NO SE PUDO CERRAR FLUJO");
            }
        }
    }

    public void leerBinario() {
        File ficheroBinario = new File("src/resources/ficheroBinario.bin");
        ObjectInputStream leerBin = null;
        try {


            leerBin = new ObjectInputStream(new FileInputStream(ficheroBinario));
            //generamos variable escribir con var o ObjectOutputStream

            System.out.println(leerBin.readBoolean());
            System.out.println(leerBin.readDouble());
            System.out.println(leerBin.readInt());
            System.out.println("leido quedó");

            while (leerBin != null) {
                System.out.println(leerBin.read());
            }
            int linea = -1;
            while ((linea = leerBin.read()) != -1) {
                System.out.println(linea);
            }

// TODO: 18/04/2024 ES MUY IMPORTANTE meter el sout, porque si no NO IMPRIME UNA MIERDA


        } catch (IOException e) {
            System.err.println("problemas con fichero");
        } finally {
            try {
                leerBin.close();
            } catch (IOException e) {
                System.out.println("NO SE PUDO CERRAR FLUJO");
            }
        }
    }

    public void escribirObjetoEnBinarioPeroEnTxtYOUTUBER() {

        String[] youtuber = {"", "", "", ""};
        int[] fundacion = {2011, 2008, 2006, 2015};
        double[] seguidores = {39.9, 32.5, 28.1, 25.0};

        File file = new File("src/resources/youtubers.txt");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (int i = 0; i < 4; i++) {
                Youtuber item = new Youtuber(youtuber[i], fundacion[i], seguidores[i]);
                objectOutputStream.writeObject(youtuber);
            }


        } catch (FileNotFoundException e) {
            System.err.println("Error file no existe");
        } catch (IOException e) {
            System.err.println("Error de escritura");
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.err.println("Error en el cerrado");
            }
        }


    }

    public void lecturaObjBinTxtYoutuber() {
        File file = new File("src/resources/youtubers.txt");
        try {
            if (file.exists()) {
                FileInputStream fileInputStream = null;
                ObjectInputStream objectInputStream = null;

                while (true) {//mientras file existe
                    Youtuber youtuber = (Youtuber) objectInputStream.readObject();
                    System.out.println(youtuber);

                }


            } else {
                System.out.println("FICHERO NO EXISTE");
            }
        } catch (EOFException e) {
            System.err.println("FINAL ALCANZADO");
        } catch (ClassNotFoundException e) {
            System.err.println("TIPO OBJETO NO COMPATIBLE");
        } catch (IOException e) {
            System.err.println("Error IO");
        }

    }
}
