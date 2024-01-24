package model;

public class Usuario {

    // esto es el molde de lo que sera un usuario -> su manual de instrucciones

    //tiene atributos -> caracteristicas que quiero manejar en el programa ( cualifican)
    // nombre, dni, perfil, altura, correo, telefono
    // y se colocan primero, todos son privados(por el encapsulamiento), solo el mismo puede ver sus cualidades

    private String nombre, apellido, dni, correo, password;
    private int telefono;


    //metodos -> funcionalidades que el objeto tiene ( usuario puede caminar,
    // saludar, mandar correo...)

    //metodo constructor -> construye el objeto. Por defecto el constructor
    // esta vacio Usuario(); siempre que no tengas alguno con parametros

    // public nombreMetodo (param1, param2, param3){} //sin void

    // CON THIS.nombre hacemos referencia al STRING principal, y es para diferenciar del parametro

    public Usuario(){}// recomendable TENER CONSTRUCTOR VACIO

    public Usuario(String nombre1, String apellido1, String dni1){
        // si no metemos estas igualaciones, en el main luego aunque este puesto el nombre sigue sin hacer efecto
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.dni=dni1;
    }
    public Usuario (String nombre, String apellido, String dni, String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.correo=correo;

    }

    //settet y getter (para hacer de modo indirecto las cosas) 1 por cada variable
    //setter cambia el valor de una variable (private-pubñic)
    //getter lo da


    // metiendo GET o SET se escribe casi solo
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
