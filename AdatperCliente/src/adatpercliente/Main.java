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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here 
        ClienteS2 c2 = new ClienteS2();
        c2.setCelular("1111");
        c2.setDddCelular("027");
        c2.setTelefone("3333");
        c2.setDddTelefone("027"); 
        c2.setEmail("email"); 
        c2.setNome("jose"); 
        c2.setSobreNome("Silva");
        
        SalvaCliente.salva(new AdapterCliente(c2));
    }
    
}
