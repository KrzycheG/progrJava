package zestawZadan1;


public class zadanieDodatkowe {

    public static String increment(String str){

        long number = 0;
        char[] tab =  str.toCharArray();
        int [] tabInt = new int[str.length()];

        for(int i = 0 ; i<tab.length;i++){


            tabInt[i] = Character.getNumericValue(tab[i]);

        }

        for (int j : tabInt) {

            number = 10 * number + j;

        }

        number++;
        return Long.toString(number);

    }
    public static void main(String[] args){

        String result = "1239523523523535";
        System.out.println(increment(result));

    }
}
