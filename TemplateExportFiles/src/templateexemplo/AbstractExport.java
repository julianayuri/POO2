/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

/**
 *
 * @author Juliana Yuri
 */
public abstract class AbstractExport {
    
    public final void export(String txt){
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save(); 
    }
    protected abstract void printLine(String linha);
    protected abstract void save();
}
