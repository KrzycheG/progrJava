package zestawZadan3.zad6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws  IOException {

            Random rand = new Random();
            RandomAccessFile file = new RandomAccessFile(new File("file.txt"),"rw");

            file.seek(0);
            for(int i = 0; i<20;i++){

                int number = rand.nextInt(50);
                System.out.println(number);
                file.writeInt(number);

            }
        System.out.println("Zamiana: ");
            for (int i = 0; i < file.length()/4; i++)
            {
                file.seek(i*4);
                int number= file.readInt();
                number = number+1;
                file.seek(i*4);
                file.writeInt(number);
                System.out.println(number);

            }

    }
}
