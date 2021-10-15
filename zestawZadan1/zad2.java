
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

    public static int ofIndex(String str1, String subS){

        for(int i =0; i< str1.length(); i++){
            int count = 0;
            if(str1.charAt(i) == subS.charAt(0)){
                for(int j = 0; j<subS.length();j++) {

                    if(subS.charAt(j)== str1.charAt(i)){
                        count ++;
                        i++;
                        if(count == subS.length()){
                            return i-subS.length();
                        }
                    }
                    else{
                        break;
                    }

                }
            }
        }
        return -1;


    }


    public static void main(String args[]){

        //CompareTo*************************
        //System.out.println(compareStr("Marcin","Andrzej"));
        //endsWith**************************
        //System.out.println(endIs("abcd", 'd'));
        /*
        //IndexOF***************************
        String a = "abc";
        String b = "abdcsdasdadaab";
        System.out.println(ofIndex(b,a));
        */


    }

 }
