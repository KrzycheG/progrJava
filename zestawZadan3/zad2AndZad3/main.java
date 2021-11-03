package zestawZadan3.zad2AndZad3;

public class main {

    public static void main(String[] args){

        Lancuch lanc1 = new Lancuch("aaaaa");
        Lancuch lanc2 = new Lancuch("bbbbb");
        lanc1.Merge(lanc2);
        System.out.println(lanc1);
        System.out.println("Suma ASCII: " + lanc2.IleASCII());

    }
}
