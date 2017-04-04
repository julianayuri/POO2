/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adatpercliente;

/**
 *
 * @author 20151bsi0266
 */
public class AdapterCliente extends ClienteS1 {
    private ClienteS2 c;
    
    public AdapterCliente (ClienteS2 c){
        this.c = c;
    }
    
    @Override
   public String getNomeCompleto() {
        return c.getNome() + ' ' + c.getSobreNome();
    }

    @Override
    public String getTelefone() {
        return c.getDddTelefone() + c.getTelefone();
    }

    @Override
    public String getCelular() {
        return c.getDddCelular() + c.getCelular();
    }
    
    @Override
    public String getEmail() {
        return c.getEmail();
    }

}
