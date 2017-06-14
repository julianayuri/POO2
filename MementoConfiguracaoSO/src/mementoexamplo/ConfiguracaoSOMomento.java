/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementoexamplo;

/**
 *
 * @author Juliana Yuri
 */
public class ConfiguracaoSOMomento {
    private ConfiguracaoSO configuracao;
    private boolean copyUsb;
    private boolean copyWifi;
    private double copyVersaoSO;
    
    public ConfiguracaoSOMomento(ConfiguracaoSO configuracao){
        this.configuracao = configuracao;
        copyUsb = configuracao.isUsb();
        copyWifi = configuracao.isWifi();
        copyVersaoSO = configuracao.getVersaoSO();
    }
    
    public void restaurar(){
        configuracao.setUsb(copyUsb);
        configuracao.setWifi(copyWifi);
        configuracao.setVersaoSO(copyVersaoSO);
    }
}
