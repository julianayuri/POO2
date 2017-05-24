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
public class Verde implements SemaforoSetupState {
    private SemaforoSetup semaforoSetup;
    
    public Verde(SemaforoSetup semaforoSetup){
        this.semaforoSetup = semaforoSetup;
    }
    
    @Override
    public void selectValue(){
        semaforoSetup.setState(semaforoSetup.getAmarelo());
    }
    @Override
    public void getInstructions(){
        try {
            System.out.println("Corre!! O sinal esta verde!");
            Thread.sleep(60000);
            semaforoSetup.pushKnob();
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Vermelho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
