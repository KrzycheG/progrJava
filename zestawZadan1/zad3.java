package zestawZadan1;

public class zad3 {


    public static String simplify(String str) {

        char[] table = str.toCharArray();
        char[] table1 = new char[str.length()];
        table1[0]= table[0];
        int j = 1;

        for (int i = 0; i < table.length-1; i++) {

            if(table[i] != table[i+1]){

                table1[j] = table[i+1];
                j++;
            }
        }

        String result = new String(table1);

        return result.substring(0,result.indexOf('\0'));

    }

    public static void main(String[] args){

        System.out.println(simplify("aaabbbbbbbaaaccd"));
    }
 }
