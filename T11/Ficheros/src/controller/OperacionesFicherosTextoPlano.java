package controller;

import java.io.*;

public class OperacionesFicherosTextoPlano {
    public void lecturaInformacion() {
        //obtener info de un fichero
        // copy path desde Path Content Root es desde el SRC
        //si este file no existe, no da el NullPointer, porque la ruta existe pero no hay nada en ella
        File lecturaFileInfo = new File("src\\resources\\informacion1.txt");
        //como este si existe
        //sacamos nombre, ruta, puedo leerlo, existe?
        File lecturaFileFolder = new File("src/resources/ejemplos");


        System.out.println(lecturaFileInfo.getName());
        System.out.println(lecturaFileInfo.getAbsoluteFile());
        //si existe el fichero te saca hipervinculo, si no, solo la ryta
        System.out.println(lecturaFileInfo.canRead());
        System.out.println(lecturaFileInfo.canWrite());
        System.out.println(lecturaFileInfo.canExecute());
        System.out.println(lecturaFileInfo.exists());

        //si el fichero no existe
        if (!lecturaFileInfo.exists()) {
            //hay que capturar IOException (in/Out) porque no existe o no hay permisos
            //y es obligatorio capturarlo, porque quizas lecturaFile no existe
            try {
                lecturaFileInfo.createNewFile();//para crearlo, createNewFile
                System.out.println("El fichero ha sido creado");
            } catch (IOException e) {
                //puede salir el lanzamiento Runtime, que lo sustituimos por mensaje y no detiene la app
                System.out.println("Fallo en creacion, quizás ya existe");
            }
        }

        //para lo mismo pero crear Carpetas
        if (!lecturaFileFolder.exists()) {
            System.out.println("Creando la carpeta que no existia");
            lecturaFileFolder.mkdir();//crea carpeta final con mkdir

            //mkdirs, si en la ruta ("src\\resources\\ejemplos") hubiera
            // entre resources y ejemplos mas carpetas entre medias, las crea tambien


        }

        // para sacar los ficheros de dentro de una carpeta
        if (lecturaFileFolder.isDirectory()) {
            //2 opciones:
            // -Sacar todos los nombres que tienes dentro
            String[] nombres = lecturaFileFolder.list();
            System.out.println("Sacando los nombres que hay en el directorio");
            for (String nombre : nombres) {
                System.out.println(nombre);
            }
            //            -Sacar todos los ficheros que tienes dentro

            File[] ficheros = lecturaFileFolder.listFiles();// Esto muestra un ARRAY de los ficheros de dentro
            System.out.println("\nSacando array(nombre) de los ficheros");
            for (File fichero : ficheros) {
                //metemos la condicion que si el File es directorio, sacamos subcarpetas
                if (fichero.isDirectory()) {
                    System.out.println("directorio: " + fichero.getName() + "    ");
                }
                // System.out.println(fichero.getName());
            }
        }
    }

    public void leerFichero() {
        File file = new File("src/resources/ejemplos/lectura.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;// para poder cerrarlo (se cierra en FINALLY que siempre ejecuta)
        //pero hay que igualar a nulo fuera del try/catch para que el FINALLY pueda acceder

        try {
            fileReader = new FileReader(file);// al hacer esto, nos pedira un try/catch, porque aun no existe
            bufferedReader = new BufferedReader(fileReader);
            //CON EL BUFFERED READER LEEMOS LINEA A LINEA (While sera diferente y el metodo readLine())

            // con el FileReader era  int codigo =....ahora es String linea...
            // String linea = bufferedReader.readLine();
            // System.out.println(linea);leeria 1ª linea, para leer entero:
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }


            //LEER CARACTER A CARACTER con fileReader
            /*

            //si existe, lee, se crea un int codigo =...

           int codigo = fileReader.read();//saldra el metodo leer en rojo, metemos otra clausula catch con la IO

            System.out.println((char)codigo);//leemos codigo, OJO, un caracter 69 que equivale a la E
            //por eso le añadimos el caste (char) para convertir

            codigo=fileReader.read();//LEEMOS CARACTER numero 2
            System.out.println((char)codigo);
            //pero para leer asi todo el fichero, hay que hacerlo hasta que codigo = -1
*/

            //LEER CARACTER A CARACTER fileReader pero hasta el fin de linea
            /*

            int codigo = -1;//indica ausencia de datos

            while ((codigo = fileReader.read()) != -1) {
                // entre parentesis igualamos codigo al fileReader, si es diferente a -1 ejecutamos while
                System.out.print((char)codigo);
            }

             */
        } catch (FileNotFoundException e) {
            //si no existe
            System.out.println("Error, file no encontrada o no existe");
        } catch (IOException e) {
            System.out.println("El fichero no se puede leer");
        } finally {
            try {
                bufferedReader.close();// se lanza otro try, porque puede no existir.
                //SIEMPRE CERRAR EL ULTIMO FLUJO, se dan por cerrados los demas
            } catch (IOException e) {
                System.out.println("Error en cerrado");
            } catch (NullPointerException e) { // no obliga este catch, pero es recomendable cubrir el nulo
                System.out.println("Cerrado en nulo");
            }
        }


    }

    public void escrituraFichero() {
        //creamos File - FileWritter - PrintWriter

        //Es igual que lectura

        File file = new File("src/resources/ejemplos/escritura.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file, true);//el true es para escribir al final de lo que ya hay
            printWriter = new PrintWriter(fileWriter);
            //ESCRIBIENDO POR FILE
            /*
            fileWriter.write("Salala lalala, Siek\n");
            //si quieres meter dos lineas hay que darle el salto de linea al anterior \n
            fileWriter.write("Haremos la segunda linea...\n");
            //PARA NO TENER QUE USAR EL \n, USAREMOS EL ULTIMO FLUJO, PRINTWRITER, liena COMPLETA
*/
            //ESCRIBIENDO POR PRINT
            printWriter.println("Esto es la frase desde printWritter, si quieres sobreescribir cada frase quita el append del file");
            printWriter.println("Esto es la frase 2 printWritter");

            //obligado cerrar flijo, o no escribiremos nada
        } catch (IOException e) {
            System.out.println("Error de Escritura");
        } finally {
            try {
                fileWriter.close();
                printWriter.close();//si no cierras no escribe, cerramos ultimo con print hay que cerrar ambos
            } catch (IOException e) {
                System.out.println("Error al cerrar");
            } catch (NullPointerException e) {
                System.out.println("Cerrado con nulo");
            }
        }
    }


}
