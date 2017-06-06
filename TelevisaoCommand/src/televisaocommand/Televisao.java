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
public class Televisao {
    private ArrayList listaComandos = new ArrayList();
    private Command upCommand, downCommand;
    
    public ArrayList getListaComandos(){
        return this.listaComandos;
    }

    public void setCommands(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }
    
    public void aumentar(){
        this.listaComandos.add(upCommand);
        this.upCommand.execute();
    }
    
    public void diminuir(){
        this.listaComandos.add(downCommand);
        this.downCommand.execute();
    }

    
    
}
