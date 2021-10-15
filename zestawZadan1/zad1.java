package zestawZadan1;

import java.util.Scanner;
public class zad1 {

    public static void main(String[] args){

        String userString;
        String longest = null;
        String[] subString;
        int max = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("type few strings: ");
        userString = scan.nextLine();
        subString = userString.split(" ");

        for (var x :subString ){
            if(x.length() >= max){
                max = x.length();
                longest = x;
            }
        }
        System.out.println(max);
        System.out.println(longest);

        userString = null;
        max = 0;
        System.out.println("type any char: ");
        char c = scan.next().charAt(0);
        System.out.println("type your string");
        userString = scan.next();

        for (int i = 0 ; i<userString.length();i++){
            if (userString.charAt(i) == c){
                max++;

            }
        }
        System.out.println("Your char occurs "+ max + " times");



    }
}
