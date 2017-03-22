/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umserializado;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Juliana Yuri
 */
public class Recupera {
    
        public static void main(String[] args) throws Exception 
        {
            Usuario user = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\usuario_serializado.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (Usuario) in.readObject();
            in.close();

            System.out.println("Deserializando Usuario...");
            System.out.println("De: " + user.getNome());
            System.out.println("Email: " + user.getMensagem(0).getTexto());
            System.out.println("Para: " + user.getMensagem(0).getPara());

        }
    
}
