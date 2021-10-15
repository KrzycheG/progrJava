
package zestawZadan1;
import java.lang.*;


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

    public static String placeRe(String str, char charToReplace, char charToPlace){

        char [] strArray = str.toCharArray();

        for (int i = 0; i<strArray.length ; i++){

            if(strArray[i] == charToReplace){
                strArray[i] = charToPlace;
            }

        }
        return new String(strArray);
    }

    public static String stringSub(String str, int beginIndex)
    {
        char[] Storage = new char[str.length()-beginIndex];
        char[] Storage2 = str.toCharArray();
        int j = 0;
        for (int i = beginIndex; i<Storage2.length; i++){

            Storage[j] = Storage2[i];
            j++;
        }

        return new String(Storage);
    }


    public static void main(String[] args){

        //******************CompareTo*************************
        System.out.println(compareStr("Marcin","Andrzej"));
        //******************endsWith**************************
        System.out.println(endIs("abcd", 'd'));

        //******************IndexOF***************************
        String a = "abc";
        String b = "abdcsdasdadaab";
        System.out.println(ofIndex(b,a));

        //******************Replace***************************
        System.out.println(placeRe("aaabbbccc",'a','b'));
        //******************substring*************************
        System.out.println(stringSub("alaMaKota",4));
    }

 }
