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
public class Piscina {
    
    private String cor;
    
    public void setCor(){ cor = "azul"; System.out.println("Pintando a piscina de azul");}
    public void tratamento() {System.out.println("Aplicando tratando anti vazamento na piscina");}
    public void escada() {System.out.println("Colocando escada na piscina");}
    public void corpo(){System.out.print("Corpo: ");}
}
