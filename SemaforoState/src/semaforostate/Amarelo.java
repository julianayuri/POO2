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
public class Amarelo implements SemaforoSetupState {
    private SemaforoSetup semaforoSetup;
    
    public Amarelo(SemaforoSetup semaforoSetup){
        this.semaforoSetup = semaforoSetup;
    }
    
    public void selectValue(){
        semaforoSetup.setState(semaforoSetup.getVermelho());
    }
    public void getInstructions(){
        try {
            System.out.println("Atenção!! O sinal esta Amarelo!");
            Thread.sleep(3000);
            semaforoSetup.pushKnob();
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Vermelho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

