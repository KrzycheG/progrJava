package zestawZadan1;

public class zad4 {

   public static String caseToLower(String str){
       byte a = 32;
       char[] table = str.toCharArray();

       for(int i = 0;i<str.length();i++){

           if((byte) table[i] < 97 ){


            table[i] = (char) (table[i]+ a);

           }

       }

       return new String(table);

    }

    public static String caseToUpper(String str){
        byte a = 32;
        char[] table = str.toCharArray();

        for(int i = 0;i<str.length();i++){

            if((byte) table[i] > 97 ){


                table[i] = (char) (table[i]- a);

            }

        }

        return new String(table);

    }

    public static void main(String[] args){


        System.out.println(caseToLower("AAAbbbbCCCZZZZ"));
        System.out.println(caseToUpper("AAAbbbbCCCZZZZ"));
    }
}
