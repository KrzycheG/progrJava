package zestawZadan3.zad2AndZad3;

public class Lancuch {

    String lancuch;
    String koncowka;
    char pierwszaLitera;

    public Lancuch() {
        this.lancuch = "abcdefghij";
        this.koncowka = lancuch.substring(lancuch.length()-3);
        this.pierwszaLitera = lancuch.charAt(0);
    }

    public Lancuch(String lancuch) {


        if(lancuch.length() <5){

            char[] tab = new char[5];

            for(int i = 0;i<5;i++){

                if(i < lancuch.length()){
                    tab[i] = lancuch.charAt(i);

                }
                else{
                    System.out.println(+1);
                    tab[i] =(char) (tab[i-1] + 1);
                }
            }
            lancuch = String.valueOf(tab);

        }
        this.lancuch = lancuch;
        this.koncowka = lancuch.substring(lancuch.length()-3);
        this.pierwszaLitera = lancuch.charAt(0);
    }

    public String getLancuch() {
        return lancuch;
    }

    public void setLancuch(String lancuch) {
        this.lancuch = lancuch;
    }

    public String getKoncowka() {
        return koncowka;
    }

    public void setKoncowka(String koncowka) {
        this.koncowka = koncowka;
    }

    public char getPierwszaLitera() {
        return pierwszaLitera;
    }

    public void setPierwszaLitera(char pierwszaLitera) {
        this.pierwszaLitera = pierwszaLitera;
    }

    public void Merge(Lancuch l){

        char[] ch = new char[lancuch.length() + l.lancuch.length()];
        int j =0;
        int i = 0;
        int z = 0;
        while(j!=ch.length){

            if(j%2 ==0){
                ch[j] = lancuch.charAt(i);
                i++;
            }
            else{
                ch[j] = l.lancuch.charAt(z);
                z++;
            }

            j++;
        }
        lancuch = String.valueOf(ch);

    }

    public int IleASCII(){
        int result = 0;

        for(int i = 0 ; i<lancuch.length();i++){

            result+= lancuch.charAt(i);

        }
        return result;

    }
    @Override
    public String toString() {
        return
                "Lancuch=" + lancuch +'\n'+
                "Koncowka=" + koncowka +'\n'+
                "PierwszaLitera=" + pierwszaLitera ;
    }


}
