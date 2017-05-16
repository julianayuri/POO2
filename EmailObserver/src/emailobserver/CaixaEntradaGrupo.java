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
public class CaixaEntradaGrupo extends Observable{
    private String mensagem;
    private String email;
    private int celular;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    

    
    public String getMensagem() {
        return mensagem;
    }

    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;
        notifyObservers();
    }
}
