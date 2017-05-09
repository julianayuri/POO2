/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Juliana Yuri
 */
public class Nota1Handler extends ATMHandler {
    
    protected int valorNota(){
        return 1;
    }

    protected void handleHere(int n){
        int i = (int)(n/1);
        if (i > 0) System.out.println("Notas de 1: " + i);
    } 
    
    
}
