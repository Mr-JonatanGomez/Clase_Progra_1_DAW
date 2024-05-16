package controller;

import lombok.Getter;
import lombok.Setter;
import model.Usuario;

import java.util.ArrayList;

@Setter
@Getter
public class Sistema {
    private ArrayList<Usuario>listaUsers;


    public Sistema() {
        listaUsers= new ArrayList<>();
    }

    public void darAltaUsuario(Usuario usuario){
        
        listaUsers.add(usuario);
    }

    public boolean loginUser(String correo, String password){
        boolean existeUser=false;
        for (Usuario item:listaUsers) {
            if (item.getCorreo().equalsIgnoreCase(correo) && item.getPassword().equalsIgnoreCase(password)){
                existeUser=true;
                System.out.println("LOGIN CON EXITO");
            }

        }
        if (!existeUser){
            System.err.println("correo o contraseña incorrectas");

        }
        return existeUser;
    }



    public void mostrarTodos(){
        for (Usuario item:listaUsers) {
            item.mostrarDatos();
        }
    }
}
