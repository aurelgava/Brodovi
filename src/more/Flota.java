package more;

public class Flota {
    private String naziv;
    private static class Elem {
        Brod b; Elem sled;
        Elem(Brod b) { this.b = b; }
    }
    private Elem prvi, posl;
    public Flota(String naziv) { this.naziv = naziv; }
    public void dodaj(Brod b) throws GNeadekvatan {
        if(prvi!=null && prvi.b.vrsta()!=b.vrsta())
            throw new GNeadekvatan();
        Elem novi = new Elem(b);
        if(prvi!=null) posl.sled = novi; else prvi = novi;
        posl = novi;
    }
    public Brod dohvBrod(int ind) throws GIndeks {
        Elem tmp = prvi;
        while(tmp!=null && ind>0) { tmp = tmp.sled; ind--; }
        if(tmp==null) throw new GIndeks();
        return tmp.b;
    }
    public double kvalitet() {
        double k = 0; int br = 0; Elem tmp = prvi;
        while(tmp!=null) {
            k += tmp.b.kvalitet(); tmp = tmp.sled; br++;
        }
        return prvi!=null?k/br:0;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Flota(" + (prvi!=null?prvi.b.vrsta():"")
                + ") " + naziv + " : " + kvalitet() + "\n");
        Elem tmp = prvi;
        while(tmp!=null) {
            sb.append(tmp.b);
            if(tmp.sled!=null) sb.append("\n");
            tmp = tmp.sled;
        }
        return sb.toString();
    }
}
