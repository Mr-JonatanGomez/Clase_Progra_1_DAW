import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;

@NoArgsConstructor
@Getter
@Setter
public class OperacionesFichero {
    public void leerFichero(){
        //F-FR-BF
        File file = new File("src/estudiantes.txt");
        BufferedReader bufferedReader= null;

        try {
            bufferedReader= new BufferedReader(new FileReader(file));
            String linea;
            while((linea=bufferedReader.readLine())!=null){
                System.out.println(linea);
                //me ha faltado meterlo al arraylist con el split
                String[]estudiantiles = linea.split(",");
                Estudiante estudiante = new Estudiante(estudiantiles[0],Integer.valueOf(estudiantiles[1]),Double.valueOf(estudiantiles[2]),Double.valueOf(estudiantiles[3]),Double.valueOf(estudiantiles[4]));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no existe");
        } catch (IOException e) {
            System.err.println("Error de lectura");
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Error de cerrado");
            }
        }


    }
}
