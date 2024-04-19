import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulito", 10.5);
        Triangulo triangulo = new Triangulo("Triangulito", 3, 5, 9);
        Rectangulo rectangulo = new Rectangulo("Rectangulito", 7, 5);


        ArrayList<Figura2D> listado = new ArrayList<>();
        listado.add(triangulo);
        listado.add(rectangulo);
        listado.add(circulo);

        for (Figura2D item : listado) {
            System.out.println(item.toString());
            item.calcularPerimetro();
        }


    }
}
