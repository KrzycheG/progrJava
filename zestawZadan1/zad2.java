
package zestawZadan1;
import java.lang.*;
import java.math.*;

public class zad2 {

    public static int compareStr(String str1, String str2){
        int a = str1.charAt(0);
        int b = str2.charAt(0);
        return a-b;

    }
    public static boolean endIs(String suffix, char ch){
        //endsWith
        int howLong = suffix.length();

        if(suffix.charAt(howLong-1) == ch){
            return true;
        }
        else{
            return false;
        }


    }


    public static void main(String args[]){

        /*//CompareTo************************
        System.out.println(compareStr("Marcin","Andrzej"));
        //endsWith**************************
        System.out.println(endIs("abcd", 'd'));
        */
        int x = 5;
        String baba = "dasdasdasd";
        String babe = "sdsd";

        System.out.println(baba.compareTo(babe));
        System.out.println(compareStr(baba,babe));




    }

 }
