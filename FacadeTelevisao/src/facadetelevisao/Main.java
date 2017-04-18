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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facade televisao = new Facade();
        televisao.ligarTelevisao();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.trocarCanal();
        televisao.desligarTelevisao();
    }
    
}
