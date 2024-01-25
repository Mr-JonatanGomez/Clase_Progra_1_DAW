import model.Usuario;

import java.util.Scanner;

public class Introduccion {
    public static void main(String[] args) {
        //primitiva -> ocupa poca memoria, solo guarda un dato
        int numero= 2;
        //compleja guarda dato y accion

        // aqui es cuando se instancia y construye el objeto
        Usuario usuario1 = new Usuario ("Jonatan","Gomez", "123456j");
        // nombre, dni, perfil, altura, correo, telefono
        Usuario usuario2 = new Usuario ("Ferrari","TestaRosa","2458","gggg@sdfsf");
        // nombre, dni, perfil, altura, correo, telefono
        // hasta que el constructor no igualas sus cualidades  los valores son null
        Usuario usuario0= new Usuario();
        Usuario usuario4= new Usuario("Calimero",652951);
        Usuario usuario3= new Usuario("Liam","Gomez","j200001","Liam@mail",6529511);

        Usuario usuario5= new Usuario("Sebas",)
        Usuario usuarioSeteado= new Usuario();
        usuarioSeteado.setNombre("Seteado");
        usuarioSeteado.setApellido("Setillas");


        /*Para imprimir, necesitamos setter y getter, porque el objeto es privado,
        esto se hace en el objeto
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println(usuario1.getNombre());//asi se imprime con el get
        usuario1.setNombre("Felipe");// cambia el nombre a usuario1
        System.out.println(usuario1.getNombre());
        System.out.println(usuario2.getNombre());

        System.out.println(usuario0.getNombre());
        System.out.println(usuario3.getNombre());
        System.out.println(usuario4.getNombre());

        // usamos el saludo
        usuario4.saludar("'Bienvenidos al apasionante mundo de la PROGRAMACION'");
        //usamos la accion mostrar datos
        usuario1.mostrarDatos();



    }
}
