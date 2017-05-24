/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforostate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20151bsi0266
 */
public class Vermelho implements SemaforoSetupState {
    private SemaforoSetup semaforoSetup;
    
    public Vermelho(SemaforoSetup semaforoSetup){
        this.semaforoSetup = semaforoSetup;
    }
    
    public void selectValue(){
        semaforoSetup.setState(semaforoSetup.getVerde());
    }
    public void getInstructions(){
        try {
            System.out.println("Pare!! O sinal esta Vermelho!");
            Thread.sleep(30000);
            semaforoSetup.pushKnob();
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Vermelho.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}


