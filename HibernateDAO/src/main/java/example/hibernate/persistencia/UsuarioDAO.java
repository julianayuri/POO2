package example.hibernate.persistencia;

import example.hibernate.model.Usuario;

/**
 *
 * @author Juliana Yuri
 */
public interface UsuarioDAO extends GenericDAO<Usuario> {

    public Usuario buscaUsuarioPorNome(String nome) throws Exception;
}
