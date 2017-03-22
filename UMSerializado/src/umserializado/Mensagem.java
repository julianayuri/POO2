/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umserializado;

import java.io.Serializable;

/**
 *
 * @author Juliana Yuri
 */
public class Mensagem implements Serializable{
    private String texto;
    private String de;
    private String para;
    
    
    public Mensagem(String texto, String de, String para){
        this.texto = texto;
        this.de = de;
        this.para = para;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }
    public String getDe(){
        return de;
    }
    public String getPara(){
        return para;
    }
}
