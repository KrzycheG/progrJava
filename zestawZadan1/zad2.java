package zestawZadan1;


public class zad2 {

    public static int compareStr(String str1, String str2){

        if(str1 == str2){
            return 0;
        }
        else if (str1.length()> str2.length()){
            return 1;
        }
        else{
            return -1;

        }
    }

    public static void main(String args[]){


        String A = " omggmg";
        String B = " mmbggm";

        System.out.println(compareStr(A,B));

    }

 }
