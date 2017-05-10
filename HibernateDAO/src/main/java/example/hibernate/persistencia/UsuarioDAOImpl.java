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
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();            
        
        List<Usuario> listar2 = usuarioDAO.listar(Usuario.class);
           

           for(Usuario printUsuario : listar2){
               if (printUsuario.getNome().equals(nome)) {
                   return printUsuario;
               }
           }
        System.out.println("Nao achamos essa pessoa") ;  
         
         return null;
    }
}
