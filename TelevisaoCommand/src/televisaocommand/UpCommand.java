/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisaocommand;

/**
 *
 * @author Juliana Yuri
 */
public class UpCommand implements Command {
    private Controle controle;
   
    public UpCommand(Controle controle){
        this.controle = controle;
    }
    
    @Override
    public void execute(){
        this.controle.aumentaCanal();
    }
}
