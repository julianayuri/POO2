/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

/**
 *
 * @author 20151bsi0266
 */
public class StatusItem {
    private boolean podeCancelar;
    private boolean compraConcluida;
    public enum Estado{CARRINHO, FECHADO, PAGO, ENVIADO, ENTREGUE }
    Estado estado;
    
    public StatusItem(Estado estado, boolean cancelar, boolean concluida ){
        podeCancelar = cancelar;
        compraConcluida = concluida;
        this.estado = estado;
    }
    
    
}
