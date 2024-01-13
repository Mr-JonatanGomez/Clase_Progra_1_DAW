import java.util.Random;

public class ArrayBase2 {
    /*Crea un programa que cree un ArrayList
       con los nombres de todos los compañeros de clase.
       Una vez creado, sacará el nombre de uno de los compañeros
       (aleatorio)*/
    public static void main(String[] args) {
        String[] companeros = new String []{
                " Eduardo"," Paco"," Mario"," Beatriz"," Diana"," Noelia"," Javier"," Profesor Chiflado"," Jaime"," Jonatan",
        };
        Random random = new Random();
        //for (String elegido:companeros) {
            int aleatorio = random.nextInt(companeros.length);
            // entre parentesis donde queremos buscar
            String elegido=companeros[aleatorio];
            System.out.println(elegido);
        //}

    }
}
