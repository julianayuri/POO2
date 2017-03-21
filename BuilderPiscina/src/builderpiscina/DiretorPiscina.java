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
public class DiretorPiscina {
    
 
    public Piscina controiPiscina(String formato){
        Piscina piscina = new Piscina();
        PiscinaBuilder piscinaBuilder;
        
        if(formato.equalsIgnoreCase("redonda")){piscinaBuilder = new PiscinaRedondaBuilder( piscina);}
        else if(formato.equalsIgnoreCase("retangular")){
            piscinaBuilder = new PiscinaRetangularBuilder( piscina); 
            
         } 
        else{ piscinaBuilder = new PiscinaHexagonalBuilder ( piscina);}
        
        piscinaBuilder.adicionaCor();
        piscinaBuilder.realizaTratamento();
        piscinaBuilder.defineForma();
        piscinaBuilder.colocaEscada();
        
        
        return piscina;
    }
}
        
         
            
       
    

