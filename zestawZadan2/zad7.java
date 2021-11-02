package zestawZadan2;

import java.util.ArrayList;
import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

public class zad7 {

    public static void generate(int[][] tab,int begin, int end){

        for(int i = 0 ; i<tab.length ; i++){
            for(int y = 0 ; y<tab.length;y++){

                tab[i][y] = ThreadLocalRandom.current().nextInt(begin,end);

            }

        }
    }

    public static int[][] matrixAddition (int[][] tab1, int[][] tab2){

        int[][] endResult = new int [tab1.length][tab1.length];

        for(int i = 0; i<endResult.length;i++){
            for(int y = 0; y< endResult.length;y++){

                endResult[i][y] = tab1[i][y] + tab2[i][y];

            }
        }
        return endResult;
    }

    public static void showTable(int[][] tab){

        for (int[] ints : tab) {

            for (int y = 0; y < tab.length; y++) {

                System.out.printf("%6s", ints[y]);

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void showChArray(char[][] tab){

        for (int i = 0; i< tab.length;i++) {

            for (int y = 0; y < tab[i].length; y++) {

                System.out.printf("%3c", tab[i][y]);

            }
            System.out.println();
        }
        System.out.println();

    }

    public static char[][] charArr(int n){

        char[][] ch = new char[n][n];
        Random rand = new Random();
        for(int i = 0 ; i<ch.length; i++){
            for(int y = 0; y< ch.length;y++){

                ch[i][y] = (char)(rand.nextInt(26) + 'a');

            }
        }

        return ch;
    }

    public static String listToString(ArrayList<Character> list)
    {
        StringBuilder builder = new StringBuilder(list.size());
        for(int i = 0 ; i<list.size() ;i++)
        {
            builder.append(list.get(i));
            if( i<list.size()-1)
            builder.append(',');
        }
        return builder.toString();
    }

    public static char[][] notSureIfIUnderstand(String str, int n){

        char[][] chArr = new char[n][10];

        int index = 0;
        for(int i = 0; i< chArr.length; i++){
            for(int y = 0; y<chArr[i].length;y++){

                if(index >str.length()-1){
                    chArr[i][y] = '0';

                }
                else {

                    chArr[i][y] = str.charAt(index);

                }
                index ++;

            }
        }

        return chArr;
    }

    public static double[][] randomDouble2Dim(double[][] doubles, double origin, double bound){

        for(int i = 0; i<doubles.length;i++){

            for(int y = 0; y<doubles.length ;y++){

                double x = ThreadLocalRandom.current().nextDouble(origin, bound);
                doubles[i][y] = zad4.zad4Class.round(x,2); // statyczna metoda utworzona w Zad4.

                System.out.printf("%6s",doubles[i][y]);

            }
            System.out.println();
        }
        System.out.println();
        return doubles;
    }

    public static double[][] divide2DimDouble(double[][] doubles1,double[][] doubles2){

        double[][] result = new double[doubles1.length][doubles1[1].length];
        for(int i = 0; i<doubles1.length;i++){

            for(int y = 0; y<doubles1.length ;y++){

                if(doubles1[i][y] == 0.0 && doubles2[i][y] == 0.0){
                    result[i][y] = 0.0;
                }
                else if(doubles1[i][y] == 0.0){
                   result[i][y]= zad4.zad4Class.round(doubles2[i][y],2);
                }
                else if(doubles2[i][y]== 0.0){
                    result[i][y] = zad4.zad4Class.round(doubles1[i][y],2);
                }
                else{
                    result[i][y] = zad4.zad4Class.round(doubles1[i][y]/doubles2[i][y],2);
                }
                System.out.printf("%7s",result[i][y]);
            }
            System.out.println();
        }

        return result;
    }

    public static void main(String[] args){


        /*Utwórz dwie tablice dwuwymiarowe 4x4. Wypełnij je losowymi
        danymi typu int z przedziałów zadanych przez użytkownika. Utwórz
        trzecią tablicę i wypełnij ją tak, że element na pozycji [i, j] będzie
        sumą odpowiednich elementów z dwóch poprzednich tablic (suma
        macierzowa).  */

        int[][] intTab1 = new int[4][4];
        int[][] intTab2 = new int[4][4];

        generate(intTab1,0,5);
        generate(intTab2,0,5);
        System.out.println("First matrix:");
        showTable(intTab1);
        System.out.println("Second matrix:");
        showTable(intTab2);

        int[][] result = matrixAddition(intTab1,intTab2);
        System.out.println("Sum of given matrixes");
        showTable(result);

        /* tablicę nxn (n podane przez użytkownika) wypełnić losowo małymi
        literami alfabetu + wyświetlić tablicę. Następnie, przedstawić litery
        w postaci dwóch łańcuchów: samogłosek: a,e,i,o,u,y oraz reszty
        (czyli spółgłosek).
         */

        char[][] chTab = charArr(5);
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();

        for(int i = 0 ; i<chTab.length; i++){
            for(int y = 0; y< chTab.length;y++){

                if(chTab[i][y] == 'a'||
                        chTab[i][y] == 'e'||
                        chTab[i][y] == 'i'||
                        chTab[i][y] == 'o'||
                        chTab[i][y] == 'u'){

                    vowels.add(chTab[i][y]);

                }
                else{
                    consonant.add(chTab[i][y]);
                }

            }
        }
        showChArray(chTab);
        System.out.println("Vowels: " +listToString(vowels));
        System.out.println("Consonant: " +listToString(consonant));

        /*Podany łańcuch przedstawić w postaci tablicy nx10 tak, aby w
        każdej komórce tablicy znajdowała się jedna litera. Dodatkowo,
        minimalna liczba znaków w stringu nie może być mniejsza niż 16.
        Jeżeli liter jest mniej, należy dokleić dodatkowe zera na końcu.
        */

        String smthStr = "qweqweqweqweqwe";
        char[][] endt = notSureIfIUnderstand(smthStr,5);
        showChArray(endt);

        /*
        Utwórz dwie tablice dwuwymiarowe 4x4. Wypełnij je losowymi
        danymi typu double z przedziałów zadanych przez użytkownika.
        Utwórz trzecią tablicę i wypełnij ją tak, że element na pozycji [i, j]
        będzie wynikiem dzielenia odpowiednich elementów z dwóch
        poprzednich tablic (suma macierzowa) (pamiętaj o dzieleniu przez
        zero).
         */

        double[][] matrix1 = new double[4][4];
        double[][] matrix2 = new double[4][4];

        System.out.println("First matrix: ");
        randomDouble2Dim(matrix1,-2.0,10.0);
        System.out.println("Second Matrix: ");
        randomDouble2Dim(matrix2,-2.0,10.0);
        System.out.println("Matrix after divide: ");
        divide2DimDouble(matrix1,matrix2);

    }
}
