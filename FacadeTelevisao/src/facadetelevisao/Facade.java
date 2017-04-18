/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetelevisao;

/**
 *
 * @author Juliana Yuri
 */
public class Facade {
    protected Som som;
    protected Sincronizador sincro;
    protected Video video;
    
    public Facade() {
        video = new Video();
        sincro = new Sincronizador();
        som = new Som();
    }
    
    public void ligarTelevisao(){
        sincro.sintonizarCanal();
        video.ligar();
        video.exibirImagem();
        som.ligar();
        som.emitirSom();    
    }
    
    public void desligarTelevisao(){
        video.desligar();
        som.desligar();  
    }
    public void aumentarVolume(){
        som.aumentar();
        som.emitirSom();
    }
    public void diminuirVolume(){
        som.diminuir();
        som.emitirSom();
    }
    public void trocarCanal(){
        sincro.sintonizarCanal();
    }
    
}
