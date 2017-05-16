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
public class MembroEmail implements Observer{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo cx = (CaixaEntradaGrupo)obs;
        if (this.email.equals(cx.getEmail())){
            System.out.println("Email " + email + " estou sendo notificado");
        }
    }
}
