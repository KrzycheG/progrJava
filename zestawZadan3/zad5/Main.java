package zestawZadan3.zad5;

import java.io.*;
import java.util.ArrayList;

public class Main implements Serializable {

    public static void saveObjTab(Object[] obj) throws IOException{

        String path = "myObjectsTab.obj";

        FileOutputStream fi = new FileOutputStream(new File(path));
        ObjectOutputStream oi = new ObjectOutputStream(fi);
        System.out.println(0);
        for(Object x :obj){
            oi.writeObject(x);

        }
        fi.close();
        oi.close();
    }

    public static void readObjTab(String fileName) throws IOException,ClassNotFoundException{

        FileInputStream fi = new FileInputStream(fileName+".obj");
        ObjectInputStream input = new ObjectInputStream(fi);
        ArrayList<Object> objectsList = new ArrayList<>();
        boolean cont = true;
        while (cont) {

                Object obj = input.readObject();
                if (obj != null) {
                    objectsList.add(obj);

                } else {
                    cont = false;
                }

        }
        fi.close();
        input.close();
        for (Object x : objectsList){

            if(x instanceof Ksiazka){
                Ksiazka ks = (Ksiazka) x;
                System.out.println(ks.PrzedstawSie());

            }
            else{

                Film fm = (Film) x;
                System.out.println("Nazwisko Reżysera: "+ fm.rezyser);
                System.out.println("Tytul filmu: "+ fm.tytul);
            }
            System.out.println();
        }


    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{

        String[] aktorzy = {"Andrzej", "Marcin", "zenu","Pienu"};
        Object[] obiekty = new Object[5];
        obiekty[0] = new Film("Whatever","Marcin Kamil",2015,aktorzy);
        obiekty[1] = new Film("WhoCares","Andrzej Zenek",1999,aktorzy);
        obiekty[2] = new Ksiazka("Nevermind","Rowling",1993,500,"Czary mary");
        obiekty[3] = new Film("Mission impossible","Kama hama",1200,aktorzy);

        saveObjTab(obiekty);

        readObjTab("myObjectsTab");

    }
}
