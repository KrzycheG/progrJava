package zestawZadan2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;


public class zad4 {


    public static class zad4Class {


        public int n;
        double[] db;

        public zad4Class(int n) {

            this.n = n;
            this.db = new double[n];
        }

        public static double round(double value, int places) {
            double scale = Math.pow(10, places);
            return Math.round(value * scale) / scale;
        }

        public void generate(){



            for(int i = 0 ; i<db.length ; i++  ){

                double x = ThreadLocalRandom.current().nextDouble(-5.0, 5.0);
                db[i] = round(x,1);

            }

        }

        public double avg(){

            double avg = 0;

            for (double v : db) {

                avg += v;

            }

            return  round((avg / db.length),1);
        }

        public double median(){

            double median;
            Arrays.sort(db);
            if (db.length % 2 == 0)
                median = (db[db.length/2] + db[db.length/2 - 1])/2;
            else
                median = db[db.length/2];

            return round(median,1);
        }

        public double max(){

            double max = 0;
            for(double x :db){

                if(x>max){

                    max = x;
                }

            }
            return max;
        }

        public double min(){

            double min = db[0];

            for(double x :db){

                if(x<min){

                    min = x;

                }
            }
            return min;
        }

        public int avgEven() {

            List<Integer> ab = new ArrayList<>();

            for (double v : db) {

                if ( v != 0 && v % 2 ==0 ) {

                    ab.add((int) v);

                }
            }
            Integer sum = 0;
            for(Integer x: ab){

                sum+= x;

            }
            if (ab.size() == 0){
                return 0;
            }
            else {
                return sum / ab.size();
            }
        }

        @Override
        public String toString() {
            return "zad4Class{" +
                    "db=" + Arrays.toString(db) +
                    '}';
        }

    }

    public static void main(String[] args){


        zad4Class lol = new zad4Class(10);
        lol.generate();


        System.out.println("---Srednia---");
        System.out.println(lol.avg());
        System.out.println("---Mediana---");
        System.out.println(lol.median());
        System.out.println("---Min---");
        System.out.println(lol.min());
        System.out.println("---Max---");
        System.out.println(lol.max());
        System.out.println("---Srednia Liczba parzystych niezerowych ---");
        System.out.println(lol.avgEven());



    }

}
