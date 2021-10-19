package zestawZadan1;
import java.lang.String;
import java.util.ArrayList;


public class zad6 {
    public static String[] Splitter(String str, char[] ch){


        byte b = (char) '\0';
        char[] tab = str.toCharArray();
        int strleng = 0;

        for (char c : ch) {               //// Zamiana wszystkich podzielników na wartości puste

            for (int j = 0; j < tab.length; j++) {

                if (tab[j] == c) {
                    tab[j] = '\0';
                    strleng++;

                }
            }
        }

        String abc = String.valueOf(tab);
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0;i<strleng+1;i++){              // podzielenie na osobne zdania z uzyciem listy.

            int inx = abc.indexOf(b);

            if(inx == -1){             // indexOf daje wynik -1 gdy nie znajdzie danej wartosci w stringu.

                lista.add(abc);
                break;                // Wyjście z pętli gdy stanie się powyższe.
            }

            else if(inx == 0) {                             // gdy puste pole jest na 1 indexie nie dodajemy nic.
                                                            // Przy użyciu array nie dodając nic index zapełniał się pustą wartością
                abc = abc.substring(inx + 1);               // co było problematyczne więc zmieniłem na ArrayList.
            }

            else{

                lista.add(abc.substring(0, inx));
                abc = abc.substring(inx + 1);

            }

        }

            return lista.toArray(new String[0]);

    }



    public static void main(String[] Args){

        char[] arr = { 'c', 'b','f','d'};
        String[] lista1 = Splitter("acccccbbfdcsdfga", arr);
        for(String x:lista1){
            System.out.print(x+ ' ');
        }


    }
}
