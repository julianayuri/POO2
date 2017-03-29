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
public class GeraTelefone {
    
    public static void main(String[] args) {
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();
        usingThreads();


    }
    
    public static void usingThreads(){
        Runnable hello = new ThreadTel();
        Thread thread1 = new Thread(hello);                  
        thread1.start(); 
    }
    
}
