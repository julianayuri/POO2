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
public abstract class Canal {
    private Canal nextState;

    public Canal getNextState() {
        tela();     
        return nextState;
    }

    public void setNextState(Canal nextState) {
        this.nextState = nextState;
    }
    
    public abstract void tela();
    
    
}
