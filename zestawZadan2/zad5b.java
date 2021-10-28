package zestawZadan2;

import java.util.Random;

public class zad5b {

    public static void main (String[] args){

        int[][] tab = new int[10][5];
        Random rand = new Random();
        int rowMax = 0;
        int row ;
        int index= 0;
        for(int i = 0 ; i<tab.length;i++){

            row = 0;
            for(int y = 0 ; y< tab[i].length; y++){

               tab[i][y] = rand.nextInt(20);
               row += tab[i][y];

            }

            System.out.println("Sum of "+ i + " row is " + row);
            if(row> rowMax){
                rowMax = row;
                index = i;
            }
        }
        System.out.println("the biggest sum is located at: "+ index + " row and totals:  "+ rowMax);
    }
}
