import controller.Empresa;
import model.Asalariado;
import model.Autonomo;
import model.Jefe;

public class Entrada {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        Jefe jefe = new Jefe("Liam","Gomez","1234a",12,5);
        Asalariado asalariado1=new Asalariado("Pepe","Gotera","2345b",1100,12,false);
        Asalariado asalariado2=new Asalariado("Otilio","Gotera","2345b",1100,12,false);
        Asalariado asalariado3=new Asalariado("Mortadelo","Iba","2345b",1100,12,false);
        Asalariado asalariado4=new Asalariado("Filemon","Ñez","2345b",1100,12,false);
        Asalariado asalariado5=new Asalariado("Bacterio","Doc","2345b",1100,12,false);
        Autonomo autonomo1=new Autonomo("Juli","Otilio","2345b",1000);
        Autonomo autonomo2=new Autonomo("Pablo","Marmol","2345b",1200);


        empresa1.contratarTrabajador(jefe);
        empresa1.contratarTrabajador(asalariado1);
        empresa1.contratarTrabajador(asalariado2);
        empresa1.contratarTrabajador(asalariado3);
        empresa1.contratarTrabajador(asalariado4);
        empresa1.contratarTrabajador(asalariado5);
        empresa1.contratarTrabajador(autonomo1);
        empresa1.contratarTrabajador(autonomo2);

        empresa1.iniciarJornada();
        empresa1.despedirTrabajador(autonomo2);
        empresa1.despedirTrabajador(asalariado3);
        autonomo2.trabajar();


        empresa1.mostrarPlantillaActual();

    }
}
