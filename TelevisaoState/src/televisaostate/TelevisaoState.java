/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisaostate;

/**
 *
 * @author Juliana Yuri
 */
public class TelevisaoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Canal[] canal = {new Canal4(),new Canal5(),new Canal6(),new Canal7()}; 
       Canal c = canal[0];
        
        canal[0].setNextState(canal[1]);
        canal[1].setNextState(canal[2]);
        canal[2].setNextState(canal[3]);
        canal[3].setNextState(canal[0]);
        
        c = c.getNextState();
        c = c.getNextState();
        c = c.getNextState();
        c = c.getNextState();
        c = c.getNextState();
        c = c.getNextState();
        
        
        
        
        
        
        
    }
    
}
