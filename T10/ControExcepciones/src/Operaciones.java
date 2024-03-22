public class Operaciones {
    public void accesoElemento(){
        String dato = null;
        try {

            System.out.println("longitud del dato"+dato.length());
        } catch(NullPointerException exception){
            System.out.println("SE HA EJECUTADO UN FALLO POR NULO");
        }
        System.out.println("Terminando ejecucion");
    }
}
