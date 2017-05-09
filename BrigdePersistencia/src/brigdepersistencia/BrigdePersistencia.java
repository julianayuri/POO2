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
public class BrigdePersistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersistenciaDeDados implementor = null;
        if(databaseDriverExists()){
            implementor = new DataBase();
        }
        else{
            implementor = new FileSystem(); 
        }
        Persistencia persistenceAPI = new ImplementacaoPersistencia(implementor);
        persistenceAPI.save(implementor);
    }

    private static boolean databaseDriverExists() {
        return false;
    }
    
}
