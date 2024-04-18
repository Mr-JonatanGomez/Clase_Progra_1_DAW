import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Entrada {
    public static void main(String[] args) {
        FileInputStream fichero;
        try {
            //elejimos fichero donde leer el flujo
            fichero = new FileInputStream("fichero.txt");

            // InputStreamReader sirve de puente de byte a caracteres
            InputStreamReader noReader = new InputStreamReader(fichero);

            // vemos la condicion actual
            System.out.println(noReader.getEncoding());
        }catch (FileNotFoundException e){
            System.err.println("El fichero no existe");
        }
    }
}
