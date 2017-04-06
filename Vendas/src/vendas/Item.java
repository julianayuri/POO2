/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

/**
 *
 * @author 20151bsi0266
 */
public class Item {
    private String nome;
    private String descricao;
    private StatusItem st;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getNome(){
        return nome;
    }
    public void setStatus(StatusItem st){
        this.st = st;
    }
}
