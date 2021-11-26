package zestawZadan3.zad5;

import java.io.*;
import java.util.Arrays;

public class Film implements Serializable{

    public String tytul;
    public String rezyser;
    public int rokProdukcji;
    public String[] aktorzy;

    public Film() {
    }

    public Film(String tytul, String rezyser, int rokProdukcji, String[] aktorzy) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.rokProdukcji = rokProdukcji;
        this.aktorzy = aktorzy;
    }

    public Film(Film film) {
        this.tytul = film.tytul;
        this.rezyser = film.rezyser;
        this.rokProdukcji = film.rokProdukcji;
        this.aktorzy = film.aktorzy;
    }

    public String PrzedstawSie() {
        return "Film: " +
                "tytul='" + tytul + '\'' +
                ", rezyser='" + rezyser + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", aktorzy=" + Arrays.toString(aktorzy) +
                '}';
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rezyser='" + rezyser + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", aktorzy=" + Arrays.toString(aktorzy) +
                '}';
    }

    public void saveObj(Film film) {

        String path = "myObjects.obj";

        try {
            FileOutputStream f = new FileOutputStream(new File(path));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(film);
            o.close();
            f.close();

            System.out.println("0");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("-1");

        }
    }


}
