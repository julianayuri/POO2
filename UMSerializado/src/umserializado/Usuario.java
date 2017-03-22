/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umserializado;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juliana Yuri
 */
public class Usuario implements Serializable {
    private String nome;
    private ArrayList<Mensagem> enviar;
    private ArrayList<Mensagem> receber;
    
    public Usuario(String nome){
        this.nome = nome;
        enviar = new ArrayList<Mensagem>();
        receber = new ArrayList<Mensagem>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void EnviarMensagem(String txt, Usuario destinatario){
        Mensagem msg = new Mensagem(txt, nome, destinatario.getNome());
        enviar.add(msg);
        destinatario.setReceber(msg);
    }
    
    public void setReceber(Mensagem msg){
        receber.add(msg);
    }
    
    public Mensagem getMensagem(int i){
        return enviar.get(i);
    }
}