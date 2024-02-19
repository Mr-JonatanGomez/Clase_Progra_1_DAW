package model;

public class Garaje {
    /*

- Tendrá tres atributos, un coche, un String con la avería asociada y el número de coches que ha ido atendiendo.
- El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.
- Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada.
    El garaje solo podrá atender a un coche en cada momento. Si ya está atendiendo uno, que devuelva un false.
- Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.*/

    private Coche coche;
    private String averiaAsociada;
    private int numeroCochesAtendidos, cocheEnGaraje;



    public boolean cocheEnGaraje(){
        if (cocheEnGaraje==1){
            return true;
        } return false;
    }
    /*public boolean aceptarCoche (Coche coche, String averiaAsociada) {
        // verificar esto por AQUIif(cocheEnGaraje==null){
            // mirar codigo de edu
        }

    }*/

}
