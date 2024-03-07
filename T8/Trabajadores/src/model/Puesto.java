package model;


import lombok.NoArgsConstructor;


@NoArgsConstructor

public enum Puesto {
    //DATOS FIJOS COMO SI FUERAN ATRIBUTO

    //Hay que declararlo como atributo a cada clase que lo tenga
    // y si tiene atributos ponerlo a modo constructor
    directivo("Este puesto es el dueño",10000),
    gerencia("Este puesto es el responsable maximo", 1350),
    mando("El tipico encargadillo",300);
    //EJEMPLO EN JEFE

    private String descripcion;
    private int salarioAdicional;

    Puesto (String descripcion, int salarioAdicional){
        this.descripcion=descripcion;
        this.salarioAdicional=salarioAdicional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSalarioAdicional() {
        return salarioAdicional;
    }

    public void setSalarioAdicional(int salarioAdicional) {
        this.salarioAdicional = salarioAdicional;
    }
}
