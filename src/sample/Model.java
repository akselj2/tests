package sample;

/**
 * @author Aksel Jessen
 * @version 1.0.0 / 3.11.2020
 */

public class Model {

    int CHF;
    double EUR;
    double GBP;

    public Model(int CHF, double EUR, double GBP) {
        this.CHF = CHF;
        this.EUR = EUR;
        this.GBP = GBP;
    }

    public void setValue(){
        CHF = 1;
        EUR = 0.88;
        GBP = 0.787;
    }

    public int getCHF() {
        return CHF;
    }

    public void setCHF(int CHF) {
        this.CHF = CHF;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }
}
