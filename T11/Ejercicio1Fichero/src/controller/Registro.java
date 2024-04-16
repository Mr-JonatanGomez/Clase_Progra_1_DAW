package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter

public class Registro {

    ArrayList<Usuario>listaUsers;

    public Registro() {
        this.listaUsers = new ArrayList<>();
    }

    public void registro() {
        Scanner sc = new Scanner(System.in);

        String nombre, apellido, dni;
        int telefono, edad;

        System.out.println("Introduce los datos para el usuario");
        System.out.println("nombre");
        nombre = sc.next();

        System.out.println("apellido");
        apellido = sc.next();

        System.out.println("telefono");
        telefono = sc.nextInt();

        System.out.println("DNI");
        dni = sc.next();

        System.out.println("edad");
        edad = sc.nextInt();

        Usuario usuario = new Usuario(nombre, apellido, dni, telefono, edad);
        listaUsers.add(usuario);

    }
    public void recorrer(){
        OperacionFichero op = new OperacionFichero();
        for (Usuario user:listaUsers) {
            user.mostrarDatos();
            op.
        }
    }
}
