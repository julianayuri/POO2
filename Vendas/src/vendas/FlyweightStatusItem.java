/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import java.util.ArrayList;

/**
 *
 * @author 20151bsi0266
 */
public class FlyweightStatusItem {
    protected ArrayList<StatusItem> flyweights;
    
    public FlyweightStatusItem (){
        flyweights = new ArrayList<StatusItem>();
        flyweights.add(new StatusItem(StatusItem.Estado.CARRINHO, true, false));
        flyweights.add(new StatusItem(StatusItem.Estado.FECHADO, true, false));
        flyweights.add(new StatusItem(StatusItem.Estado.PAGO, true, true));
        flyweights.add(new StatusItem(StatusItem.Estado.ENVIADO, false, true));
        flyweights.add(new StatusItem(StatusItem.Estado.ENTREGUE, false, true));
    }
    
    public StatusItem getFlyweights(StatusItem.Estado e){
        switch(e){
            case CARRINHO:
                return flyweights.get(0);
            case FECHADO:
                return flyweights.get(1);
            case PAGO:
                return flyweights.get(2);
            case ENVIADO:
                return flyweights.get(3);
            default:
                return flyweights.get(4);
        }
    }
}