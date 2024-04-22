import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        File file = new File("src/resources/ejercicio.txt");
        FileReader fileReader = null;

        try {


            fileReader = new FileReader(file);
            int codigo = -1;
            while((codigo= fileReader.read())!=-1){

                System.out.println(codigo);
                System.out.println((char) codigo);
            }

            //System.out.println(fileReader.read());
            //System.out.println(fileReader.read());
            /*do {
                codigo = fileReader.read();
                System.out.println(fileReader.read());
                System.out.println((char) fileReader.read());
            } while (codigo != -1);*/


        } catch (FileNotFoundException e) {
            System.out.println("File dont exist");
        } catch (IOException e) {
            System.out.println("Fallo de lectura");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error Cerrado");
            } catch (NullPointerException e) {
                System.out.println("Cazando Null");
            }
        }
    }
}
