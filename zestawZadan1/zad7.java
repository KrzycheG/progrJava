package zestawZadan1;

import java.util.Locale;

public class zad7 {

    public static boolean palindrom(String str){


        str = str.toLowerCase();
        str = str.replaceAll("\\s","");  // usunięcie spacji w stringu dzięki czemu można sprawdzać całe zdania np "Was it a cat I saw"
        for(int i = 0 ; i<str.length() ; i++){

            if(str.length()== 1){
                return true;
            }

            else if(str.charAt(0)== str.charAt(str.length()-1)){

                str = str.substring(1,str.length()-1);

            }
            else{

                return false;

            }
        }

        return true;
    }


    public static void main(String[]args){

            String lol = "Was it a cat I saw" ;

           System.out.println(palindrom(lol));
    }
}
