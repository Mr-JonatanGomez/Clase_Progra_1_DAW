import controller.Concesionario;
import model.*;

public class Entrada {
    public static void main(String[] args) {
        /*
        Vehiculo vehivulo = new Vehiculo(1,"ford","focus",25,200);
        vehivulo.mostrarDatos();
        */
        //vehiculo es generico y no lo necesitamos y hay que marcarla como abstrac
        // y entonces lo de arriba da fallo porque no es necesario
        Deportivo deportivo = new Deportivo(2,"ferrari","TestaRosa",5000,500,20);
        deportivo.mostrarDatos();
        Electrico electric = new Electrico(3,"Tesla","ju",200,200,3);
        electric.mostrarDatos();
        Todoterreno todoterreno = new Todoterreno(4,"Jeep","jak",5,5,5);
        todoterreno.mostrarDatos();
        MotoCarretera motoCarretera = new MotoCarretera(4,"Yamaha","999",5,5,"Michelin");
        motoCarretera.mostrarDatos();
        Concesionario concesionario= new Concesionario();
        concesionario.agregarVehiculos(deportivo);
        concesionario.agregarVehiculos(electric);
        concesionario.agregarVehiculos(todoterreno);
        concesionario.agregarVehiculos(motoCarretera);


        concesionario.acelerarStock();
        concesionario.listarStock();
    }
}
