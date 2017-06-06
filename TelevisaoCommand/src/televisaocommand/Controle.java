/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisaocommand;

import java.util.ArrayList;

/**
 *
 * @author Juliana Yuri
 */
public class Controle {
    ArrayList listaCanais = new ArrayList();
    int canalIndice = 0;
    String canalCorrente;
    
    public void configuraControle(ArrayList listaCanais){
       this.listaCanais = listaCanais; 
    }
    
    public void aumentaCanal(){
        canalIndice++;
        canalCorrente = (String) listaCanais.get(canalIndice);
    }
    
    public void diminuiCanal(){
        canalIndice--;
        canalCorrente = (String) listaCanais.get(canalIndice);
    }
}
