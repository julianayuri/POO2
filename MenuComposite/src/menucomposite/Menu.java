/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucomposite;

import java.util.ArrayList;

/**
 *
 * @author 20151bsi0266
 */
public class Menu extends AllMenu {
    
    private ArrayList<AllMenu> menu;
    private int num;
    private String descricao;
    
    public Menu(String descricao){
        menu = new ArrayList<AllMenu>();
        num = 0;
        this.descricao = descricao;
    }
    
    public void addMenu(AllMenu m){
        menu.add(m);
        num++;
    }
    
    @Override
    public void printPreco(){
        int i;
        printDescricao();
        for(i=0;i<num;i++){
            menu.get(i).printPreco();
        }
    
    }
    @Override
    public void printDescricao(){
        System.out.println("Menu: " + descricao);
        
    }
}
