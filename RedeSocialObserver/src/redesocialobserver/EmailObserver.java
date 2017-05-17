/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesocialobserver;

/**
 *
 * @author 20151bsi0266
 */
public class EmailObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blog b = new Blog();
        Twitter t = new Twitter();
        Facebook f = new Facebook();
        
        b.setEmail("julianakanezaki@gmail.com");
        t.setEmail("julianakanezaki@gmail.com");
        f.setEmail("juliana@facebook.com");
        
        CaixaPublicacao cx = new CaixaPublicacao();
        cx.addObserver(b);
        cx.addObserver(t);
        cx.addObserver(f);
        
        cx.setFacebook("juliana@facebook.com");
        cx.setTwitter("julianakanezaki@gmail.com");
        cx.setBlog("julianakanezaki@gmail.com");
        
        cx.setNovaMensagem("juliana kanezaki cade vc");


    }
    
}
