package zestawZadan2;

import java.util.concurrent.ThreadLocalRandom;

public class zad5c {

    public static double[][] eraseMinus(double[][] tab){

        for(int i = 0; i<tab.length;i++){

            for(int y = 0; y<tab.length ;y++){

                if(tab[i][y] < 0){

                    tab[i][y] = 0;
                }

            }
        }
        return tab;
    }

    public static double[][] erasePlus(double[][] tab){

        for(int i = 0; i<tab.length;i++){

            for(int y = 0; y<tab.length ;y++){

                if(tab[i][y] > 0){

                    tab[i][y] = 0;
                }

            }
        }
        return tab;
    }

    public static double artAverage(double[][] tab){

        double avg = 0 ;
        for (double[] doubles : tab) {

            for (int y = 0; y < tab.length; y++) {

                avg += doubles[y];

            }
        }
        return zad4.zad4Class.round(avg /(Math.pow(avg,2)),2);
    }

    public static double diagonalAverage(double[][] tab){

        double avg =0;
        int count = 0;
        for(int i = 0; i<tab.length;i++){

            for(int y = 0; y<tab.length ;y++){

                if(i == y){

                    avg+= tab[i][y];
                    count++;
                }

            }
        }
        return zad4.zad4Class.round(avg/count,2);
    }

    public static void showTable(double[][] tab){

        for (double[] doubles : tab) {

            for (int y = 0; y < tab.length; y++) {

                System.out.printf("%6s", doubles[y]);

            }
            System.out.println();
        }

    }


    public static void main(String[] args){

        double[][] tab = new double[10][10];

        for(int i = 0; i<tab.length;i++){

            for(int y = 0; y<tab.length ;y++){

                double x = ThreadLocalRandom.current().nextDouble(-0.5, 0.5);
                tab[i][y] = zad4.zad4Class.round(x,2); // statyczna metoda utworzona w Zad4.

                System.out.printf("%6s",tab[i][y]);

            }
            System.out.println();
        }

        System.out.println("Diagonal Average: " + diagonalAverage(tab));
        System.out.println("Arithmetic mean: " + artAverage(tab));
        System.out.println("Deleting negative numbers..." );
        eraseMinus(tab);
        showTable(tab);
        System.out.println("Deleting positive numbers...");
        erasePlus(tab);

        showTable(tab);



    }
}
