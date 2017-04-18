package cafe.dominio;

public class Expresso extends Cafe {
    
    public Expresso() {
        description = "Expresso";
    }

    public double cost() {
        return 6;
    }
}
