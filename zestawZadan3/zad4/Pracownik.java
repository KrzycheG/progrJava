package zestawZadan3.zad4;

public class Pracownik {

    String imie;
    String nazwisko;
    String stanowisko;
    int stazPracy;
    double pensja;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, String stanowisko, int stazPracy) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.stazPracy = stazPracy;
        this.pensja = 4500.00 + 150.00 * stazPracy;
        if(stanowisko == "manager"){
            pensja += 500.0;
        }
        else if(stanowisko =="kierownik"){
            pensja += 1000.0;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    public void setStazPracy(int stazPracy) {
        this.stazPracy = stazPracy;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", stazPracy=" + stazPracy +
                ", pensja=" + pensja
                ;
    }

    public boolean zwiekszPensja(double wzrost){

        double result = pensja * wzrost + pensja;
        if(result > 10000){

            return false;

        }
        else{

            pensja = result;
            return true;

        }

    }

    public void zwiekszStaz(int x){

        stazPracy+= x;
        pensja += 150 * x;
    }
}
