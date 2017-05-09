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
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ATMHandler nota100 = new Nota100Handler();
       ATMHandler nota50 = new Nota50Handler();
       ATMHandler nota20 = new Nota20Handler();
       ATMHandler nota10 = new Nota10Handler();
       ATMHandler nota5 = new Nota5Handler();
       ATMHandler nota1 = new Nota1Handler();
       
       
       nota100.setNextHandler(nota50);
       nota50.setNextHandler(nota20);
       nota20.setNextHandler(nota10);
       nota10.setNextHandler(nota5);
       nota5.setNextHandler(nota1);
       
       nota100.processHandler(125);
    }
    
}
