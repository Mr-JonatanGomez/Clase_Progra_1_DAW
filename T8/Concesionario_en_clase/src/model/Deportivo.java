package model;

public class Deportivo extends Vehiculo{
    //hereda todo lo que tiene vehiculo y lo puedo usar son problema, sus metodos...etc
    //en el caso de querer usar un constructor hay que llamarlo EXPLICITAMENTE,
    // si no creas constructor vacio no funcionara

    private int par;

    public Deportivo(){}

    public Deportivo(int bastidor, String marca, String modelo, int cc, int cv, int par){
        super(bastidor, marca, modelo, cc, cv);//SIEMPRE EN PRIMERA LINEA
        this.par=par;

    }

    @Override
    public void acelerar(int velocidad) {
        setVelocidad(getVelocidad()+velocidad+(int)(Math.random()*30)+20);
    }

    public void activarSportMode (){
        System.out.println("Estás en modo Sport");
    }

    @Override // sobreescribe el metodo
    public void mostrarDatos(){
        super.mostrarDatos();// para no volver a meter todos los Sout
        System.out.println("Par"+par+"\n");
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
