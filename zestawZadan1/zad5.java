package zestawZadan1;



public class zad5 {


    public static String cesarCipher(String str, int key){

        // W odróznieniu od tradycyjnego szyfru cezara, metoda ta działa na znakach od
        // Dec 33-126 z Tablicy kodu ASCII i przesuwając litery do tyłu.

        byte key1 =(byte) key;
        char[] table = str.toCharArray();

        for(int i = 0; i<str.length();i++){

            byte Dif = (byte) (table[i]-key1);

            if(Dif < 33){                 // Zejście poniżej ustalonego zakresu 33- 126

                if( key1 > 33 ){          // tu cos nie trybi

                    table[i] = (char) (126 -(Math.abs(Dif)+33));

                }
                else{

                    table[i] = (char) (126- ((Dif)- 33));

                }


            }
            else{

                table[i] = (char)(Dif); ;

            }
        }
        String result = new String(table);

            return result;
    }
    public static void main(String[] Args){

        System.out.println(cesarCipher("AprytnyCezar", 40));

    }
}
