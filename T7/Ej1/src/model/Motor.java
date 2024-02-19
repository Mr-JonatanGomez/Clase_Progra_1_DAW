package model;

public class Motor {
    /*


*/
    private int litrosAceite, cv;

    public Motor (int cv){
        this.cv=cv;
        this.litrosAceite=0;
    }


    //GETTER&SETTER


    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
