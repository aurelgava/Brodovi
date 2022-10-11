package more;
import java.lang.*;

public abstract class Brod {
    public int brojposade;
    public String naziv;
    public Mornar kapetan = new Mornar();

    public int kapacitet;

    private static class MornarElement{
        Mornar x;
        MornarElement next;
    }

    public Brod() {
    }

    public Brod(int brojposade, String naziv, Mornar kapetan) {
        this.brojposade = brojposade;
        this.naziv = naziv;
        this.kapetan = kapetan;
    }

    public int dohvBr(){
        return this.brojposade;
    }

    public Mornar dohvatiKapetana(){
        return this.kapetan;
    }

    /*public Mornar dohvMorn(int poz){

    }*/

    public Mornar dodajMorn(Mornar a){

    }

    public abstract Brod napadni(Brod a);

}
