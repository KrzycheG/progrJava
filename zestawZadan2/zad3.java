package zestawZadan2;

import java.math.BigInteger;

public class zad3 {

    public static BigInteger[] fibonnaci(){

        BigInteger x=BigInteger.ZERO ,y= BigInteger.ONE , z;
        BigInteger[] tab= new BigInteger[100];
        tab[0] = x;
        tab[1] = y;
        tab[2] = y;

        for(int i  = 2; i<tab.length; i++){

            z = x.add(y);
            tab[i] = z;
            x = y;
            y = z;

        }
        return tab;
    }

    public static void main(String[] args){

        BigInteger[] bla = fibonnaci();

        System.out.println(bla[99]);

    }
}
