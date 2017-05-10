/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.hibernate.persistencia;

import example.hibernate.model.Usuario;
import java.util.List;

/**
 *
 * @author Juliana Yuri
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO {
    

    public Usuario buscaUsuarioPorNome(String nome) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        
        List lista = sessao.createQuery("from Usuario where nome= '" + nome + "'").list();
        
        sessao.flush();
        transacao.commit();
        sessao.close();
        
        if(lista.isEmpty()) return null;
        return (Usuario)lista.get(0);
    }
}
