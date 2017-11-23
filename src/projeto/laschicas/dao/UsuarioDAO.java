package projeto.laschicas.dao;

import java.util.List;

import projeto.laschicas.domain.Usuario;

public interface UsuarioDAO {

	public void insert(Usuario user) throws Exception;

	public  List<Usuario>  find(Usuario user) throws Exception;

}
