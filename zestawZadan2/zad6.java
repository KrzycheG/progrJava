package zestawZadan2;

import java.util.Random;

public class zad6 {

    public static void main(String[] args){

        int[][] tab = new int [5][4];
        int[] tab1 = new int[tab.length];
        Random rand = new Random();
        int max ;
        int min ;

        // wypelnienie tablicy liczbami
        for(int i = 0 ; i<tab.length;i++) {
            for (int y = 0; y < tab[i].length; y++) {

                tab[i][y] = rand.nextInt(20);

            }
        }

        //Wpisywanie do tablicy wartosci max i min.
        for(int i = 0; i< tab.length;i++){
            max = 0;
            min = 0;
            for(int y = 0; y < tab[i].length; y++){

                if(i % 2 == 0){
                    if(tab[i][y] > max ) {
                        max = tab[i][y];
                        tab1[i] = max;
                    }
                }

                else if (y == 0){

                    min = tab[i][y];
                    tab1[i] = min;
                }
                else if (tab[i][y] < min){
                    min = tab[i][y];
                    tab1[i] = min;
                }
            }

            System.out.println();
        }

        // wyswietlanie
        for (int[] ints : tab) {
            for (int anInt : ints) {
                System.out.printf("%5d", anInt);

            }
            System.out.println();
        }


        for(int x :tab1){

            System.out.print(" " +x);
        }



    }
}
