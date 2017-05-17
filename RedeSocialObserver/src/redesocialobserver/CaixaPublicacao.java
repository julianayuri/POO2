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
public class CaixaPublicacao extends Observable{
    private String mensagem;
    private String twitter;
    private String facebook;
    private String blog;

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }


    
    public String getMensagem() {
        return mensagem;
    }

    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;
        notifyObservers();
    }
}
