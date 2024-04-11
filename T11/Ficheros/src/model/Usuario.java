package model;

import java.io.Serializable;

public class Usuario implements Serializable {// para poder guardar en fichero
    private static final long serialVersionUID = 1200883L;
    private String nombre, correo, ciudad;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String ciudad, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    @Override
    public String toString() {//usado para pasar datos entre sistemas
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
