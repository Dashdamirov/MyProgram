package homeWork;

public class Car {
    private int speed;
    private String colour;
    private int probeg;
    private int kolvoDverey;
    private int kolvoKoles;

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public int getProbeg() {
        return probeg;
    }

    public int getKolvoDverey() {
        return kolvoDverey;
    }

    public int getKolvoKoles() {
        return kolvoKoles;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    public void setKolvoDverey(int kolvoDverey) {
        this.kolvoDverey = kolvoDverey;
    }

    public void setKolvoKoles(int kolvoKoles) {
        this.kolvoKoles = kolvoKoles;
    }

    public void setSpeed(int speed){speed = speed;}
}
