package model;

public class Usuario {

    // esto es el molde de lo que sera un usuario -> su manual de instrucciones

    //tiene atributos -> caracteristicas que quiero manejar en el programa ( cualifican)
    // nombre, dni, perfil, altura, correo, telefono
    // y se colocan primero, todos son privados(por el encapsulamiento), solo el mismo puede ver sus cualidades


    /*
     para dar por defecto a todos una contraseña.
     root1234 se pone el valor en el constructor
     NO ES NECESARIO TENER PASSWORD dentro del constructor

     this.password = "root1234";

     tambien se puede igualar a DNI por ejemplo

     this.password = this.dni;
     */
    private String nombre, apellido, dni, correo, password;
    private int telefono;


    //metodos -> funcionalidades que el objeto tiene ( usuario puede caminar,
    // saludar, mandar correo...)

    //metodo constructor -> construye el objeto. Por defecto el constructor
    // esta vacio Usuario(); siempre que no tengas alguno con parametros

    // public nombreMetodo (param1, param2, param3){} //sin void

    // CON THIS.nombre hacemos referencia al STRING principal, y es para diferenciar del parametro

    public Usuario(){
        this.password= this.dni;
    }// recomendable TENER CONSTRUCTOR VACIO
    /*
    MUY IMPORTANTE, si creamos un constructor de USUARIO, con dos String (Nombre y Apellidos),
    ya no podemos crear otro con dos String (Nombre y Correo), tendriamos que crear al usuario
    desde main, y setearlo

     */
    public Usuario(String nombre, String apellido, String dni){
        // si no metemos estas igualaciones, en el main luego aunque este puesto el nombre sigue sin hacer efecto
        this.nombre = nombre; // con el this.nombre coge String de clase, = nombre (referenciado)
        this.apellido = apellido;
        this.dni=dni;
        this.password= this.dni;
    }
    public Usuario (String nombre, String apellido, String dni, String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.correo=correo;
        this.password= this.dni;
    }
    public Usuario (String nombre, String apellido, String dni, String correo, int telefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.correo=correo;
        this.telefono=telefono;
        this.password= this.dni;
    }
    public Usuario (String nombre, int telefono){
        this.nombre=nombre;
        this.telefono=telefono;
        this.password= this.dni;
    }

    public Usuario(String nombre, String correo){
        // si no metemos estas igualaciones, en el main luego aunque este puesto el nombre sigue sin hacer efecto
        this.nombre = nombre;
        this.correo = correo;
        this.password= this.dni;
    }

    // cosas que puede hacer un usuario
    public void saludar(String mensaje){
        System.out.println("El user con nombre "+this.nombre+" te está diciendo "+mensaje);
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);// o nombre sin this, cuando acostumbremos
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+dni);
        System.out.println("Correo: "+correo);
        System.out.println("Password: "+password);
        System.out.println("Telefono: "+telefono);
    }

    //settet y getter (para hacer de modo indirecto las cosas) 1 por cada variable
    //setter cambia el valor de una variable (private-public)
    //getter lo da


    // metiendo GET o SET se escribe casi solo (get lleva el tipo, set solo void)
    /*
    se puede construir automaticamente mediante seleccion por atajo
    ALT+INS elegimos getter&setter y selecciono todos, o los que quiera

    tambien se puede construir el objeto seleccionando constructor, y todas las cualidades
    (atributos)que pusimos al principio, primero generamos el none, para hacer el objeto vacio


    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
