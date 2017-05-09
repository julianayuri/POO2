/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brigdepersistencia;

/**
 *
 * @author Juliana Yuri
 */
public class DataBase implements PersistenciaDeDados {

    @Override
    public void salvar(Object object) {
        System.out.println("Objeto salvo com DataBase");
    }
    
}
