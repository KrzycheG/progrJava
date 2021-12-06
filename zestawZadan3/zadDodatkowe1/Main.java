package zestawZadan3.zadDodatkowe1;

public class Main {


    public static String arabskieDoRzymskie(int liczba){

        String rzymski = "";
        String liczb = String.valueOf(liczba);

        String[][] liczbRzymskie = {

                {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "XI"},
                {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC","CM"}};

        int z = 0;
        if(liczb.length() == 4){

            int j = Character.getNumericValue(liczb.charAt(0));

            for (int i = 0 ; i<j;i++){

                rzymski = rzymski +  "M";

            }
            z++;
        }

        for(int i = z ; i<liczb.length();i++){

            if(Character.getNumericValue(liczb.charAt(i))== 0){
                continue;
            }

            rzymski = rzymski + liczbRzymskie[liczb.length()-i-1][Character.getNumericValue(liczb.charAt(i))-1];

        }

        return rzymski;

    }

    public static String rzymskieDoArabskie(String str){

        return "b";
    }

    public static void main(String[] args){
        System.out.println(arabskieDoRzymskie(2021));

    }
}
