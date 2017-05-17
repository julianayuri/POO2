/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesocialobserver;

import java.util.ArrayList;

/**
 *
 * @author 20151bsi0266
 */
public class Observable {
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer ob){
        monitores.add(ob);
    }
    
    public void deleteObserver(Observer ob){
        monitores.remove(ob);
    }
    
    public void notifyObservers(){
        for(Observer ob : monitores){
            ob.update(this);
        }
    }
}
