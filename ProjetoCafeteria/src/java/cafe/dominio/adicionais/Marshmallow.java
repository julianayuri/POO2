package cafe.dominio.adicionais;
import cafe.dominio.Adicionais;
import cafe.dominio.Cafe;

public class Marshmallow extends Adicionais{
    public Marshmallow(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", Marshmallow";
    }
    @Override
    public double cost() {
        return 1+ cafe.cost();
    }
}
