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
public class Nota20Handler extends ATMHandler {
    
    protected int valorNota(){
        return 20;
    }

    protected void handleHere(int n){
        int i = (int)(n/20);
        if (i > 0) System.out.println("Notas de 20: " + i);
    } 
    
    
}
