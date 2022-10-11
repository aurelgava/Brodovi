package more;
import java.lang.*;

public class Brod {
    int brojposade;
    String naziv;
    Mornar kapetan = new Mornar();

    private static class Mornar{

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

    public Mornar dohvMorn(int poz){
        
    }

}
