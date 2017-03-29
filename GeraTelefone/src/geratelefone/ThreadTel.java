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
public class ThreadTel implements Runnable
{
   @Override
   public void run()
   {
       System.out.println("Proximo telefone: " + SerialNumberGenerator.INSTANCE.getNextSerial());
   }
}   
