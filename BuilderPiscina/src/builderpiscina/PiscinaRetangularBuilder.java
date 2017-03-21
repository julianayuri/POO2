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
public class PiscinaRetangularBuilder extends PiscinaBuilder{

    public PiscinaRetangularBuilder(Piscina novapiscina){
        this.piscina = novapiscina;
    }  
 
    @Override
    public void colocaEscada(){this.piscina.escada();}
    @Override
    public void defineForma(){this.piscina.corpo();System.out.println("Retangular");}
}
