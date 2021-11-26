package zestawZadan3.zad8;

import java.io.Serializable;

public class Budynek implements Serializable {

    String nazwDom;
    int IKondygn;
    double cena;

    public Budynek() {
    }

    public Budynek(String nazwDom, int IKondygn, double cena) {
        this.nazwDom = nazwDom;
        this.IKondygn = IKondygn;
        this.cena = cena;
    }

    public String getNazwDom() {
        return nazwDom;
    }

    public void setNazwDom(String nazwDom) {
        this.nazwDom = nazwDom;
    }

    public int getIKondygn() {
        return IKondygn;
    }

    public void setIKondygn(int IKondygn) {
        this.IKondygn = IKondygn;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Budynek{" +
                "nazwDom='" + nazwDom + '\'' +
                ", IKondygn=" + IKondygn +
                ", cena=" + cena +
                '}';
    }

}
