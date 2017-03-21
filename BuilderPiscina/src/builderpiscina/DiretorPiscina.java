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
        
        PiscinaBuilder piscinaBuilder;
        
        if(formato.equalsIgnoreCase("redonda")){
            PiscinaRedonda piscina = new PiscinaRedonda();
            piscinaBuilder = new PiscinaRedondaBuilder( piscina);
            
            piscinaBuilder.adicionaCor();
            piscinaBuilder.realizaTratamento();
            piscinaBuilder.defineForma();
            return piscina;
        }
        else if(formato.equalsIgnoreCase("retangular")){
            PiscinaRetangular piscina = new PiscinaRetangular();
            piscinaBuilder = new PiscinaRetangularBuilder( piscina); 
            
            piscinaBuilder.adicionaCor();
            piscinaBuilder.realizaTratamento();
            piscinaBuilder.defineForma();
            piscinaBuilder.colocaEscada();
            return piscina;
            
         } 
        else{ 
            PiscinaHexagonal piscina = new PiscinaHexagonal();
            piscinaBuilder = new PiscinaHexagonalBuilder ( piscina);
            
            piscinaBuilder.adicionaCor();
            piscinaBuilder.realizaTratamento();
            piscinaBuilder.defineForma();
            return piscina;
        }
        
        
        
        
        
    }
}
        
         
            
       
    

