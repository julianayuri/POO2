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
public class Blog implements Observer {
    private String email;

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void update(Observable obs) {
        CaixaPublicacao cx = (CaixaPublicacao)obs;
        if (this.email.equals(cx.getBlog())){
            System.out.println("Publicando no Blog");
        }
        
    }
    
    
    
}
