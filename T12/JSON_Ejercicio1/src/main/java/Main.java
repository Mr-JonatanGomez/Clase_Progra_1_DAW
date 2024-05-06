import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            //primero necesitamos un objeto tipo URL
            URL url = new URL("https://dummyjson.com/users");

            //luego necesitamos un HTTPConnection y castear
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();

            //leer la contestacion de la pagina con BufferedReader -> TXT
            //leemos un inputSt y leemos la conexion lo que nos da el Input
            bufferedReader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
            //y como un JSON es como si fuera una sola linea, se mete el buffered
            String linea = bufferedReader.readLine();
            //System.out.println(linea);
            // asi imprime la linea pero no se puedeb hacer busquedas


            //Pasar el texto a JSON con la libreria, para poder hacer busquedas
            JSONObject respuesta = new JSONObject(linea);
            //System.out.println(respuesta); imprime la respuesta ya en tipo json

            //para hacer busquedas de usuarios
            JSONArray usuarios = respuesta.getJSONArray("users");
            //System.out.println(usuarios); separa los tipos en solo usuarios, user, limit,...
            //CON UN FOR SEPARAMOS PARA LAS BUSQUEDAS
            for (int i = 0; i < usuarios.length(); i++) {
                JSONObject usuario = usuarios.getJSONObject(i);//devuelve el usuario 0
                String firstName = usuario.getString("firstName");
                String lastName = usuario.getString("lastName");
                int age = usuario.getInt("age");

                //metemos una concicion para solo sacar los mayores de 45
                if (age<20){
                    System.out.println(firstName+" "+lastName+" "+age);
                }
            }

        } catch (MalformedURLException e) {
            System.err.println("pudiera estar mal formada la URL");
        } catch (IOException e) {
            System.err.println("Error en internet");        }


    }
}
