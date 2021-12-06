package zestawZadan3.zad8;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class readByte {

    public static void main (String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile( "file.txt","rw");
        raf.writeChars("asddsa");
        raf.writeInt(4);
        raf.writeDouble(506467576575.50);




        raf.seek(0);
        int j = 0;
        while(j< raf.length()){

            String str = "";
            raf.seek(j);
            if(raf.readChar() != '\0'){
                raf.seek(j);
                str += raf.readChar();
                j+=2 ;
                System.out.println(str);

            }
            else if(raf.readInt() == '\0'){

                raf.seek(j);
                int b = raf.readInt();
                System.out.println(b);

            }
        }






    }
}
