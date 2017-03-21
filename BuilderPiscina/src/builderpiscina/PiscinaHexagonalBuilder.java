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
public class PiscinaHexagonalBuilder extends PiscinaBuilder{

    
    public PiscinaHexagonalBuilder(Piscina novapiscina){
        this.piscina = novapiscina;
    }  
 
    public void defineForma(){this.piscina.corpo();System.out.println("Exagonal");}
}
