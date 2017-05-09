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
public abstract class Persistencia {
    private PersistenciaDeDados persistencia;

    public PersistenciaDeDados getPersistencia() {
        return persistencia;
    }

    public void setPersistencia(PersistenciaDeDados persistencia) {
        this.persistencia = persistencia;
    }
    
    public void save(Object object){
        persistencia.salvar(object);
    }  
}
