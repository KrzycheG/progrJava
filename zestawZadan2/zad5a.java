package zestawZadan2;

public class zad5a {

    public static int[][] multiTab(int[][] b){

        for (int i = 0; i < b.length; i++) {

            for (int y = 0; y < b[i].length; y++) {
                if(i == 0){
                    b[0][y] = y+1;

                }
                else if( y == 0) {

                    b[i][0] = i+1;

                }
                else{
                    b[i][y] = b[i][0] * b[0][y];
                }

                System.out.printf("%5s",b[i][y]);
            }
            System.out.println();
        }
        return b;
    }


    public static void main(String[] args) {

        int[][] b = new int[10][10];
        multiTab(b);



    }

}
