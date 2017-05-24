/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforostate;

/**
 *
 * @author 20151bsi0266
 */
public class SemaforoSetup {
    private SemaforoSetupState currentState;
    private Verde verde;
    private Amarelo amarelo;
    private Vermelho vermelho;
    
    public SemaforoSetup(){
        verde = new Verde(this);
        amarelo = new Amarelo(this);
        vermelho = new Vermelho(this);
        setState(verde);
    }

    public Verde getVerde() {
        return verde;
    }

    public Amarelo getAmarelo() {
        return amarelo;
    }

    public Vermelho getVermelho() {
        return vermelho;
    }
   
    
    public void setState(SemaforoSetupState state){
        currentState = state;
        currentState.getInstructions();
    }
    public void pushKnob(){
        currentState.selectValue();
    }
}
