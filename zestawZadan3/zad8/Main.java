package zestawZadan3.zad8;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main (String[] args) throws IOException, EOFException {

        RandomAccessFile raf = new RandomAccessFile( "file.txt","rw");
        raf.writeByte(65);
        raf.writeByte(77);
        raf.writeByte(66);
        raf.writeByte(65);
        raf.writeInt(1);
        raf.writeDouble(506.50);

        raf.writeByte(121);
        raf.writeByte(88);
        raf.writeByte(54);
        raf.writeByte(23);
        raf.writeInt(5);
        raf.writeDouble(707.5);

        raf.writeByte(64);
        raf.writeByte(34);
        raf.writeByte(47);
        raf.writeByte(56);
        raf.writeInt(2);
        raf.writeDouble(505.5);


        int pointer = 0;
        int maxFloor = 0;
        String finalString = "";
        int in = 0;
        double d = 0;
        String str = "";

        while(pointer<raf.length()){


            raf.seek(pointer);
            if(raf.readByte() >= 33 && raf.readByte() <=126){
                raf.seek(pointer);
                char z = (char) raf.readByte();
                str+= "" + z;
                pointer++;

            }
            else {
                raf.seek(pointer);
                in = raf.readInt();
                d = raf.readDouble();
                pointer += 12;

                if(in == 1){

                    raf.seek(pointer -8);
                    raf.writeDouble(d - (d * 0.10));

                }
                if(in > maxFloor){

                    maxFloor = in;
                    finalString = str;

                }
                pointer += 12 +8;
            }

            System.out.println(str);
            System.out.println(raf.length());
        }




    }
}