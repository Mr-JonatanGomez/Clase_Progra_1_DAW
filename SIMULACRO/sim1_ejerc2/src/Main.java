import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //EMPEZAMOS 12:27 12:57
        ArrayList<Figura2D>listaFiguras=new ArrayList<>();
        Circulo circulo = new Circulo("circle",10);
        Rectangulo rectangulo= new Rectangulo("rectangle", 5,10);
        Triangulo triangulo = new Triangulo("triangle", 1,2,7);

        listaFiguras.add(circulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo);

        for (Figura2D item:listaFiguras) {
            System.out.println(item.toString());
        }

        if (circulo.equals(triangulo)){
            System.out.println("es la misma Figura");
        }else {
            System.out.println(" no es la misma Figura");
        }
        if (circulo.equals(rectangulo)){
            System.out.println("es la misma Figura");
        }else {
            System.out.println(" no es la misma Figura");
        }
        if (rectangulo.equals(triangulo)){
            System.out.println("es la misma Figura");
        }else {
            System.out.println(" no es la misma Figura");
        }




    }
}
