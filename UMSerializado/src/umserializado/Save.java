/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umserializado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Juliana Yuri
 */
public class Save {
    
       public static void main(String[] args) {
        try{
        String current = new java.io.File( "." ).getCanonicalPath();        

        Usuario usuarioSerializado = new Usuario("Juliana");
        Usuario usuarioSerializado2 = new Usuario("Joao");
        usuarioSerializado.EnviarMensagem("Quem eh vc?",usuarioSerializado2);
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\usuario_serializado.ser");                
        ObjectOutputStream arquivo;        
           arquivo = new ObjectOutputStream(fileSerializado);
        arquivo.writeObject(usuarioSerializado);
        arquivo.close();
        
        System.out.println("Usuario Salvo");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\usuario_serializado.ser");
        
        }
        catch (IOException e){e.printStackTrace();}
    }
    
}
