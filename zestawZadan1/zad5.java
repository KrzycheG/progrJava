package zestawZadan1;


import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class zad5 {


    public static String cesarCipher(String str, int key){

        /*
        W odróznieniu od tradycyjnego szyfru cezara, metoda ta działa na znakach od
        Dec 33-126 z Tablicy kodu ASCII przesuwając znaki w tył.
        */

        byte key1 =(byte) key;
        char[] table = str.toCharArray();

        for(int i = 0; i<str.length();i++){

            if(table[i] != ' ') {

                byte Dif = (byte) (table[i] - key1);

                if (Dif < 33) {                         /// Wyjscie przesunięcia poza zakres dopuszczalnych liczb.

                    if (Dif < 0) {

                        table[i] = (char) (127 - ((Math.abs(Dif)) + 33));

                    } else {

                        table[i] = (char) (127 - (33 - Dif));

                    }
                } else {

                    table[i] = (char) (Dif);

                }

            }
        }

        return new String(table);
    }
    public static void main(String[] Args){

        Scanner scan = new Scanner(System.in);

        String sentence ;
        int number ;
        System.out.println("Podaj zdanie które chcesz zaszyfrować");
        sentence = scan.nextLine();
        while(true){
            System.out.println("Podaj liczbe z zakresu 1-127:");
            number = scan.nextInt();
            if(number >=1 && number <=127 ){
                break;
            }
            else{
                System.out.println("Podano liczbe z poza zakresu, proszę spróbój ponownie:");
            }
        }



        System.out.println(cesarCipher(sentence, number));

    }
}
