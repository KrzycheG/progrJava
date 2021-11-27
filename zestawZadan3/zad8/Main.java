package zestawZadan3.zad8;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static String housesDiscount(String fileName) throws IOException {

        RandomAccessFile raf = new RandomAccessFile( fileName,"rw");

        int maxFloor = 0;
        String nazwDom = "";
        int IKondygn;
        double cena;
        String str = "";

        int pointer = 0;
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
                IKondygn = raf.readInt();
                cena = raf.readDouble();
                pointer += 12;

                if(IKondygn == 1){

                    raf.seek(pointer -8);
                    raf.writeDouble(cena - (cena * 0.10));

                }
                if(IKondygn > maxFloor){

                    maxFloor = IKondygn;
                    nazwDom = str;

                }

                str= "";
            }

        }

        return "House with the most floors: " + nazwDom;
    }

    public static void main (String[] args) throws IOException {

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
        raf.writeByte(36);
        raf.writeByte(56);
        raf.writeInt(5);
        raf.writeDouble(707.5);
        raf.writeByte(64);
        raf.writeByte(34);
        raf.writeByte(47);
        raf.writeByte(56);
        raf.writeInt(2);
        raf.writeDouble(505.5);

        raf.seek(8);
        System.out.println("Price of house with 1 floor: " + raf.readDouble());
        System.out.println(housesDiscount("file.txt"));
        raf.seek(8);
        System.out.println("Price of house with 1 floor after 10% discount:  " + raf.readDouble());



    }
}