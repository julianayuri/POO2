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
public abstract class PiscinaBuilder {
    
    Piscina piscina;
    public void adicionaCor(){ piscina.setCor();}
    public void realizaTratamento(){piscina.tratamento();}
    public void defineForma(){piscina.corpo();}
    public void colocaEscada(){}
    
}
