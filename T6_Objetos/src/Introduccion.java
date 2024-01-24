import model.Usuario;

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

        System.out.println(usuario1.getNombre());
        usuario1.setNombre("Felipe");// cambia el nombre a usuario1
        System.out.println(usuario1.getNombre());

    }
}
