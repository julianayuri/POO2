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
public class PiscinaRedonda extends Piscina{
    @Override
    public void corpo(){
       super.corpo();
       System.out.println("Redonda");
    }
}
