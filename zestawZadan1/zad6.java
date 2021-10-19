package zestawZadan1;
import java.lang.String;

public class zad6 {

    public static String[] Splitter(String str, char[] ch){

       char[] tab = str.toCharArray();
       int strleng = 0;
       for(int i = 0; i<ch.length;i++){

           for(int j =0;j<tab.length;j++){

               if (tab[j] == ch[i]){
                   tab[j] = '\0';
                   strleng++;

               }
           }

       }

       char[] help = new char[50];

        String[] result = new String[15];
       for(int i = 0;i<tab.length;i++){

           for(int j = 0;j<tab.length; j++){
               if (tab[j]== '\0'){
                   continue;
               }
               else{
                   help[j] = tab[j];

               }

           }
           result[i] = String.valueOf(help);

       }

       return result;
     }



    public static void main(String[] Args){

        char[] arr = { 'c', 'b'};
        String[] sas = Splitter("abcdfdssdfga", arr);
         for (String x:sas){
             System.out.println(x);
         }
    }
}
