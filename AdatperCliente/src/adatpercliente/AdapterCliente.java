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
public class AdapterCliente {
    
    public static ClienteS1 adapter(ClienteS2 c){
        ClienteS1 c1 = new ClienteS1();
        c1.setNomeCompleto(c.getNome() + ' ' + c.getSobreNome());
        c1.setEmail(c.getEmail());
        c1.setCelular(c.getDddCelular() + c.getCelular());
        c1.setTelefone(c.getDddTelefone() + c.getTelefone());
        return c1;
    }
}
