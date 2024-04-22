import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EntradaMio {
    public static void main(String[] args) {
        File file = new File("src/resources/ejercicio.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            int code = fileReader.read();
            System.out.println(code);
            System.out.println((char)code);
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
