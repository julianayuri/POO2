/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author 20151bsi0266
 */
public interface NotaHandler {
    public void setNextHandler(NotaHandler handler);
    public void processHandler(int nota);

}
