package zestawZadan2;

import java.util.concurrent.ThreadLocalRandom;



public class zadDodatkowe1and2 {

    public static class CandlestickChart{

        int n;
        double[][] tab;

        public CandlestickChart(int n) {
            this.n = n;
            this.tab = new double[n][4];
        }

        public  void generateChart() {


            for (int i = 0; i < tab.length; i++) {

                double dif3;
                double dif5;
                double min;
                double max;
                if (i == 0) {

                    tab[i][0] = zad4.zad4Class.round(ThreadLocalRandom.current().nextDouble(40.0, 70.0), 2);

                } else {

                    tab[i][0] = zad4.zad4Class.round(tab[i - 1][1], 2);

                }

                dif3 = (3 / (double) 100) * tab[i][0];
                dif5 = (5 / (double) 100) * tab[i][0];
                double lowerd3 = tab[i][0] - dif3;
                double upperd3 = tab[i][0] + dif3;
                double lowerd5 = tab[i][0] - dif5;
                double upperd5 = tab[i][0] + dif5;
                if (lowerd3 < 40) {
                    lowerd3 = 40;
                }
                if (upperd3 > 70) {
                    upperd3 = 70;
                }
                if (lowerd5 < 40) {
                    lowerd5 = 40;
                }
                if (upperd5 > 70) {
                    upperd5 = 70;
                }

                tab[i][1] = zad4.zad4Class.round(ThreadLocalRandom.current()
                        .nextDouble(lowerd3, upperd3), 2);

                min = zad4.zad4Class.round(ThreadLocalRandom.current()
                        .nextDouble(lowerd5, tab[i][0]), 2);
                if(min > tab[i][1]){

                    min = tab[i][1];
                }

                tab[i][2] = min;

                max = zad4.zad4Class.round(ThreadLocalRandom.current()
                        .nextDouble(tab[i][0], upperd5), 2);

                if(max< tab[i][1]){

                    max = tab[i][1];

                }

                tab[i][3] =max;

            }

        }

        public  void showChart(){

            for (double[] doubles : tab)
                System.out.println("Open: " + doubles[0] + " Close: " + doubles[1] + " min: " + doubles[2] + " max: " + doubles[3]);
        }

        public double SredniaKroczaca(){

            double avg = 0;
            for (int i= 0 ;i<14;i++){

                avg += tab[i][1];

            }
            return zad4.zad4Class.round(avg/14,2);
        }

        public double SredniaKroczaca(int n){

            double avg = 0;
            for (int i= 0 ;i<n;i++){

                avg += tab[i][1];

            }
            return zad4.zad4Class.round(avg/n,2);
        }

        public double SredniaKroczaca(int n, boolean typical){

            double avg =0;
            if(typical){

                for(int i = 0 ; i<n;i++){
                    avg += tab[i][2]+tab[i][3] + tab[i][1];
                }
            }
            else {
                for(int i = 0 ; i<n;i++){

                    avg += tab[i][2]+tab[i][3] + tab[i][1] + tab[i][0];
                }
            }
            return zad4.zad4Class.round(avg/n,2);
        }
    }
    public static void main(String[] args){

        CandlestickChart chart = new CandlestickChart(50);
        chart.generateChart();
        chart.showChart();
        System.out.println(chart.SredniaKroczaca());
        System.out.println(chart.SredniaKroczaca(14));
        System.out.println(chart.SredniaKroczaca(5,true));
        System.out.println(chart.SredniaKroczaca(5,false));

    }
}

