package model;

public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelMedia, nivelDefensa;
    private int goles;


    public Equipo() {
    }//constructor vacio

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelDefensa = (int) (Math.random() * 101);
        this.nivelMedia = (int) (Math.random() * 101);
        this.nivelAtaque = (int) (Math.random() * 101);
        this.goles = 0;
    }

    public Equipo(String nombre, int nivelAtaque, int nivelMedia, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelDefensa = nivelDefensa;
        this.nivelMedia = nivelMedia;
        this.nivelAtaque = nivelAtaque;
    }

    public boolean atacar() {
        int ataque = (nivelAtaque * (int) (Math.random() * 2)) + ((nivelMedia * (int) (Math.random() * 2) / 2));

        if (ataque > 90) {
            goles++;
            return true;
        }else {
        return false;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelMedia() {
        return nivelMedia;
    }

    public void setNivelMedia(int nivelMedia) {
        this.nivelMedia = nivelMedia;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
