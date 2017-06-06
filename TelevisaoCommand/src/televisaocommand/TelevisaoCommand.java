/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisaocommand;

import java.util.ArrayList;

/**
 *
 * @author Juliana Yuri
 */
public class TelevisaoCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList listaCanais = new ArrayList();
        
        listaCanais.add("Globo");
        listaCanais.add("Record");
        listaCanais.add("SBT");
        listaCanais.add("Futura");
        listaCanais.add("Nick");
        listaCanais.add("Cartoon");
        
        Controle controle = new Controle();
        controle.configuraControle(listaCanais);
        
        Televisao televisao = new Televisao();
        televisao.setCommands(new UpCommand(controle), new DownCommand(controle));
        
        televisao.aumentar();
        televisao.aumentar();
        televisao.diminuir();
        
        for (int i=0; i< televisao.getListaComandos().size(); i++)
            System.out.println(televisao.getListaComandos().get(i));
    }
    
}
