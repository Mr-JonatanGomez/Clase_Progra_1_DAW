import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {


        Circulo c = new Circulo("circulo",0,8);
        Triangulo t = new Triangulo("triangulo",0,3,5,7);
        Rectangulo r = new Rectangulo("rectangulo",0,5,20);

        ArrayList<Figura2D> figurasLista = new ArrayList<>();

        figurasLista.add(c);
        figurasLista.add(t);
        figurasLista.add(r);

        for (Figura2D item:figurasLista) {
            if (item instanceof Circulo){
                ((Circulo)item).calcularPerimetro();
            } else if (item instanceof Rectangulo) {
                ((Rectangulo) item).calcularPerimetro();
            }else if (item instanceof Triangulo) {
                ((Triangulo) item).calcularPerimetro();
            }
            item.mostrarDatos();


        }
    }


}
