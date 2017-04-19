/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucomposite;

/**
 *
 * @author 20151bsi0266
 */
public class MenuItem extends AllMenu{
    private String descricao;
    private float preco;

    public MenuItem(String descricao, float preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
     public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }
    
    @Override
    public void printDescricao(){
        System.out.print(descricao);
    }
    @Override
    public void printPreco(){
        printDescricao();
        System.out.println(": R$" + preco);
    }
    
    
}
