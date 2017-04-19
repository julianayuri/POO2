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
public class MenuComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menuJantar = new Menu("Jantar");
        MenuItem item1 = new MenuItem("Carne", 8.5f);
        MenuItem item2 = new MenuItem("Sopa", 8f);
        MenuItem item3 = new MenuItem("Curry", 10f);
        Menu menuSobremesa = new Menu("Sobremesa");
        MenuItem item4 = new MenuItem("Bolo de Cenoura", 5f);
        MenuItem item5 = new MenuItem("Salada de Fruta", 4f);
        MenuItem item6 = new MenuItem("Pudim", 3.5f);
        
        menuJantar.addMenu(item1);
        menuJantar.addMenu(item2);
        menuJantar.addMenu(item3);
        menuJantar.addMenu(menuSobremesa);
        menuSobremesa.addMenu(item4);
        menuSobremesa.addMenu(item5);
        menuSobremesa.addMenu(item6);
        
        menuJantar.printPreco();
        
        
    }
    
}
