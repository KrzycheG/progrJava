package zestawZadan3.zad5;

import java.io.*;


public class Ksiazka implements Serializable {

    public String tytul;
    public String autor;
    public int rokWydania;
    public int liczbaStron;
    public String gatunek;

    public Ksiazka() {
    }

    public Ksiazka(String tytul, String autor, int rokWydania, int liczbaStron, String gatunek) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.liczbaStron = liczbaStron;
        this.gatunek = gatunek;
    }

    public Ksiazka(Ksiazka ksiazka) {
        this.tytul = ksiazka.tytul;
        this.autor = ksiazka.autor;
        this.rokWydania = ksiazka.rokWydania;
        this.liczbaStron = ksiazka.liczbaStron;
        this.gatunek = ksiazka.gatunek;
    }

    public String PrzedstawSie() {
        return "Ksiazka: " +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                ", liczbaStron=" + liczbaStron +
                ", gatunek='" + gatunek + '\'' ;

    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                ", liczbaStron=" + liczbaStron +
                ", gatunek='" + gatunek + '\'' +
                '}';
    }



}
