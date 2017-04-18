/*
 Adicional de Flores
 */
package cafe.dominio.adicionais;

import cafe.dominio.Adicionais;
import cafe.dominio.Cafe;

public class Creme extends Adicionais {

    public Creme(Cafe festa) {
        this.cafe = cafe;
    }

    @Override
    public String getDescription() {
        return cafe.getDescription() + ", Creme";
    }
    @Override
    public double cost() {
        return 1+ cafe.cost();
    }
}
