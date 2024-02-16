import model.Equipo;

public class Entrada {
    public static void main(String[] args) {

        Equipo atlMadrid = new Equipo("Atlético de Madrid");
        Equipo barcelona = new Equipo("Barcelona", 90, 85, 80);

        System.out.println("ATAQUE atleti "+atlMadrid.getNivelAtaque()+" , "+atlMadrid.getNivelMedia()+" , "+atlMadrid.getNivelDefensa());

        int periodo=0;
        for (int i = 0; i < 4; i++) {
            atlMadrid.atacar();
            barcelona.atacar();
            periodo++;
            System.out.println("\nResultado tras periodo "+periodo+" es de: \n"
            +atlMadrid.getNombre()+" "+atlMadrid.getGoles()+" - "+barcelona.getNombre()+" "+barcelona.getGoles());
        }

        System.out.println("\n\tResultado final fue de:"+atlMadrid.getNombre()+" "+atlMadrid.getGoles()+" - "+barcelona.getNombre()+" "+barcelona.getGoles());


    }
}
