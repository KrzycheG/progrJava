package zestawZadan3.zad7;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void Change(String filePath)throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String string = reader.readLine();
        char[] temp = string.toCharArray();

        for(int i = 0 ; i<temp.length;i++){

            if(temp[i]=='.'){

                temp[i] = ',';
            }

        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(String.valueOf(temp));
        writer.close();
        reader.close();

    }

    public static void reverseChange(String filePath)throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String string = reader.readLine();
        char[] temp = string.toCharArray();

        for(int i = 0 ; i<temp.length;i++){

            if(temp[i]==','){

                temp[i] = '.';
            }

        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(String.valueOf(temp));
        writer.close();
        reader.close();

    }

    public static void newFile(String filePath) throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String string = reader.readLine();
        char[] temp = string.toCharArray();

        for(int i = 0 ; i<temp.length;i++){

            if(temp[i]==','){

                temp[i] = '.';
            }
            if(temp[i] == ':'){

                temp[i]= ' ';
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("tabSpace.txt"));
        writer.write(String.valueOf(temp));
        writer.close();
        reader.close();

    }

    public static void main(String[] args) throws Exception {



        newFile("tab.txt");

    }
}
