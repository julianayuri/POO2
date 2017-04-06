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
public class Pedido {
    private ArrayList<Item> pedido;  
    
    public Pedido(){
        this.pedido = new ArrayList();  
    }
    
    public void addItemPedido(Item i){
        pedido.add(i);
    }
    
    public Item getItemPedido(int i){
        return pedido.get(i);
    }
}
