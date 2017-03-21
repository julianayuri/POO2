/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpiscina;

/**
 *
 * @author Juliana Yuri
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiretorPiscina criaPiscina = new DiretorPiscina();      
        //controi uma refeicao.
        Piscina piscina1 = criaPiscina.controiPiscina("redonda");                
        Piscina piscina2 = criaPiscina.controiPiscina("retangular");  
        Piscina piscina3 = criaPiscina.controiPiscina("hexagonal");  
    }
    
}
