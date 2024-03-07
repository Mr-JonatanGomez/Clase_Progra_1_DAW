package model;

import lombok.*;



@NoArgsConstructor
@Getter
@Setter

public abstract class Persona {
    protected String dni, nombre, correo;

    public Persona (String dni, String nombre, String correo){
        this.dni=dni;
        this.nombre=nombre;
        this.correo=correo;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("dni: "+dni);

    }


}
