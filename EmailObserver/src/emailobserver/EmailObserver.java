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
public class EmailObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MembroWhatsApp w = new MembroWhatsApp();
        MembroEmail e = new MembroEmail();
        
        w.setNumero(988180769);
        e.setEmail("julianakanezaki@gmail.com");
        
        CaixaEntradaGrupo cx = new CaixaEntradaGrupo();
        cx.setCelular(988180769);
        cx.setEmail("julianakanezaki@gmail.com");
        
        cx.addObserver(w);
        cx.addObserver(e);
        
        cx.setNovaMensagem("juliana kanezaki cade vc");
        
        cx.setEmail("julianakanezaki@hotmail.com");
        
        cx.setNovaMensagem("juliana kanezaki cade vc");

    }
    
}
