/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailobserver;

/**
 *
 * @author 20151bsi0266
 */
public class MembroWhatsApp implements Observer {
    private int numero;

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    public void update(Observable obs) {
        CaixaEntradaGrupo cx = (CaixaEntradaGrupo)obs;
        if (this.numero == cx.getCelular()){
            System.out.println("Celular " + numero + " estou sendo notificado");
        }
        
    }
    
    
    
}
