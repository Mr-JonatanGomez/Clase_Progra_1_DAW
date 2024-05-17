import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        //////
        /// 22:30------22:52
        ////
        Circulo circulo = new Circulo("circle",7);
        Triangulo triangulo = new Triangulo("triangle", 5,10,20);
        Rectangulo rectangulo = new Rectangulo("rectangle",5,7);
        ArrayList<Figura2D>listaFiguras= new ArrayList<>();
        listaFiguras.add(circulo);
        listaFiguras.add(triangulo);
        listaFiguras.add(rectangulo);

        for (Figura2D item:listaFiguras) {
            System.out.println(item.toString());
        }

    }
}
