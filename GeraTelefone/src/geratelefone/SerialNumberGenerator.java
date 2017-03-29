/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geratelefone;

/**
 *
 * @author Juliana Yuri
 */
public enum SerialNumberGenerator{
        INSTANCE;
        
        private int cont = 32432500 ;
        
        public synchronized int getNextSerial(){
            return ++cont;
        }
        
    }
