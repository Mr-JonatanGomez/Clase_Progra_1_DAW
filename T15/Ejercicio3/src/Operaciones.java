import java.io.*;

public class Operaciones {
    public void leerFichero(){
        // File -- FileReader
        File file = new File("src/ejercicio3.txt");
        BufferedReader bufferedReader = null;


        try {
            bufferedReader=new BufferedReader(new FileReader(file));

            String linea;
            String[]palabras= null;
            String letras= null;

            while ((linea= bufferedReader.readLine())!=null){
                System.out.println(linea);

                palabras=linea.split(" ");
                System.out.println("El numera palabras: ");
                System.out.println(palabras.length);

                letras=linea.replace(" ","");
                letras=letras.replaceAll("\\.","");
                System.out.println("Numero de letras");
                System.out.println(letras.length());


            }



        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
