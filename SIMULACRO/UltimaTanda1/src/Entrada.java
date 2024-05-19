public class Entrada {
    // INICIO A LAS 16:20 // a mi modo, calificar sin parametros 16:47
    public static void main(String[] args) {
        Alumno alumno1= new Alumno("Jonatan", "Gomez", "123456s");
        Alumno alumno2= new Alumno("Sandra", "Nieves", "789012l");
        Alumno alumno3= new Alumno("Liam", "Gomez", "345678l");
        Alumno alumno4= new Alumno("Laia", "Gomez", "901234j");

        Colegio colegio = new Colegio();

        colegio.darAltaAlumno(alumno1);
        colegio.darAltaAlumno(alumno2);
        colegio.darAltaAlumno(alumno3);
        colegio.darAltaAlumno(alumno4);

        colegio.calificarAlumnos();

        for (Alumno item:colegio.getListadoAlumnos()) {
            item.mostrarDatos();
        }

    }
}
