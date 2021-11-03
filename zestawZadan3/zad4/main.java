package zestawZadan3.zad4;

public class main {

    public static void main (String[] args){

        Pracownik marcin = new Pracownik("Marcin","Kozik","noob",2);
        Pracownik andrzej = new Pracownik("andrzej","Kozik","kierownik",2);

        System.out.println(andrzej);
        System.out.println(marcin);
        System.out.println(marcin.zwiekszPensja(0.2));
        System.out.println("Pensja powiększona: ");
        System.out.println(marcin);

        marcin.zwiekszStaz(2);
        System.out.println("Staż powiększony: ");
        System.out.println(marcin);

    }
}
