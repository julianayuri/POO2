package example.hibernate;

import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import example.hibernate.model.Usuario;
import example.hibernate.persistencia.UsuarioDAO;
import example.hibernate.persistencia.UsuarioDAOImpl;
import java.util.List;


public class Main {    		
    public static void main(String[] args) throws Exception {                                    
                        
           
           VeiculoDAO veiculoDAO = new VeiculoDAOImpl();            
           Veiculo veiculo = new Veiculo();
           veiculo.setAno("2010");
           veiculo.setMarca("Fiat");
           veiculo.setModelo("Uno");
           veiculo.setQuilometragem("1000");
           veiculo.setTipo("carro");              
           veiculoDAO.inserir(veiculo);           
           List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
           veiculoDAO.deletar(veiculo);           
           listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
            
            
           UsuarioDAO usuarioDAO = new UsuarioDAOImpl();            
           Usuario usuario = new Usuario();
           usuario.setNome("Juliana");
           usuario.setEmail("julianakanezaki@gmail.com");
           usuario.setSenha("minhaSenha123");
           usuario.setLogin("juju");  
           usuarioDAO.inserir(usuario);   
           
           Usuario busca = usuarioDAO.buscaUsuarioPorNome("Juliana");
           if (busca != null) System.out.println(busca.toString());
           
	}                
}
