import controller.Empresa;
import model.*;

public class Entrada {
    public static void main(String[] args) {
        //Persona persona = new Persona("122222","pedro","pedro@hick");
        //persona.mostrarDatos();
        Asalariado asalariado1= new Asalariado("1234Z","Pedro","cscscv",1200,14);
        Asalariado asalariado2= new Asalariado("2468C","Javier","cscscv",1100,14);
        Asalariado asalariado3= new Asalariado("1357S","Sara","cscscv",1300,14);
        Asalariado asalariado4= new Asalariado("9876A","Alba","cscscv",1000,14);

        Jefe jefe1= new Jefe("5555H","Serafin","nsdhdf",1900,1, Puesto.mando);
        Jefe jefe2= new Jefe("6666J","JoseManuel","nsdhdf",4100,1, Puesto.gerencia);

        Accionista accionista = new Accionista("2222d","Julia","ligghdg");

        Empresa empresa = new Empresa();
        empresa.agregarPersona(asalariado1);
        empresa.agregarPersona(asalariado2);
        empresa.agregarPersona(asalariado3);
        empresa.agregarPersona(asalariado4);
        empresa.agregarPersona(jefe1);
        empresa.agregarPersona(jefe2);
        empresa.agregarPersona(accionista);

        //empresa.empezarJornada();
        //empresa.realizarVotacion();
        jefe1.mostrarDatos();
    }
}
