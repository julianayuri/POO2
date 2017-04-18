package cafe.dominio.adicionais;

import cafe.dominio.Adicionais;
import cafe.dominio.Cafe;


public class Chocolate extends Adicionais {

    public Chocolate(Cafe festa) {
        this.cafe = cafe;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", Chocolate";
    }
    @Override
    public double cost() {
        return 2 + cafe.cost();
    }
}
