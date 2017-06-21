/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.observer;

import java.util.ArrayList;

/**
 *
 * @author Juliana Yuri
 */
public class PersonagemAutonomo  implements PersonagemVisitor {

    ArrayList<String> comandosDestino = new ArrayList();
    public PersonagemAutonomo(ArrayList comandos){
        this.comandosDestino = comandos;
    }
    @Override
    public void visit(PersonagemPadrao personagem) {        
        for(String comando: comandosDestino){
            if(comando.equalsIgnoreCase("Frente")){
                personagem.andarParaFrente(); 
            }else if(comando.equalsIgnoreCase("Direita")){
                personagem.virarDireita();  
            }else if(comando.equalsIgnoreCase("Esquerda")){
                personagem.virarEsquerda();  
            }else if(comando.equalsIgnoreCase("Parar")){
                personagem.parar();    
            }else{
                personagem.andarParaTras();
            }
        }
    }
    
}

