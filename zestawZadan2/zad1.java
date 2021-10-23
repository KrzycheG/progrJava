package zestawZadan2;

import java.util.Random;

public class zad1 {

    public static String generate(int lth) {

        Random myRandom = new Random();
        char[] tab = new char[lth];
        for (int i = 0 ; i< lth; i++){

            tab[i] = (char) (myRandom.nextInt(26) + 'A');


        }return String.valueOf(tab);

    }

    public static void main(String[] args){


        System.out.println(generate(4));
    }

}
