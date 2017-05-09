/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author 20151bsi0266
 */
public abstract class ATMHandler {
    private ATMHandler nextHandler;
    
    public void setNextHandler(ATMHandler handler){
        nextHandler = handler;
    }
    
    public void processHandler(int nota){
        
        if (nota != 0){
            handleHere(nota);
            nota = (nota%valorNota());
            if (nota != 0){
                nextHandler.processHandler(nota);
            }
        
        
        }
    }
    
    protected abstract int valorNota();
    protected abstract void handleHere(int n);
    
    
}
