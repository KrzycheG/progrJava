package zestawZadan2;

import java.util.Random;

public class zad2 {

    /* Uzytkownik podaje długosc tablicy oraz element do policzenia.

     */

    public static int randTab (int length, char ch){

        Random random = new Random();
        char[] tab = new char[length];
        int count = 0;
        for(int i = 0 ; i<length;i++){

            tab[i] = (char) (random.nextInt(94) +32);
            if(tab[i] == ch){
                count ++;
            }

        }

        for(char x:tab){
            System.out.print(x);
        }

        return count;
    }

    public static void main(String[] args){

        System.out.println("  Liczba wystąpien podanego znaku: " + (randTab(20,'4')));

    }
}
