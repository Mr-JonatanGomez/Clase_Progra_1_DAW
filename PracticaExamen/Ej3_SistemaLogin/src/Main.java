import controller.Sistema;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        // 11 de mayo    17:08  --> 17:40
        Sistema sistema = new Sistema();
        Usuario user1= new Usuario("Liam","lg@mail","liam24");
        Usuario user2= new Usuario("Sandra","sn@mail","sandra3");
        Usuario user3= new Usuario("Jonatan","jg@mail","jonatan25");

        sistema.darAltaUsuario(user1);
        sistema.darAltaUsuario(user2);
        sistema.darAltaUsuario(user3);

        sistema.mostrarTodos();

        sistema.loginUser("jg@mail","jonatan25");
        sistema.loginUser("juli","jobhd");
    }
}
