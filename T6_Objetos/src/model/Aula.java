package model;

public class Aula {
    /* si aqui tengo dos objetos Usuario, se declaran y se genera el constructor
    con los usuarios, tambien uno vacio*/
    private Usuario usuario1, usuario2;

    public Aula() {
    }

    public Aula (Usuario usuario1, Usuario usuario2){
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }


    public void mostrarDatosUsuariosAula(){
        System.out.println("Datos del user 1:");
        usuario1.mostrarDatos();
        System.out.println("Datos del user 2: ");
        usuario2.mostrarDatos(); // 1 y 2 son referencias, luego en la realidad podemos usar 1 y 5 o el que sea
    }
    // SIEMPRE AÑADIR getter y setter porque necesitamos usuarios que son privados
    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }
}
