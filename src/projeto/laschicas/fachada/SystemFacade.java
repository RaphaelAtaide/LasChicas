package projeto.laschicas.fachada;

import projeto.laschicas.domain.Usuario;

public interface SystemFacade {

	public void insertUsuario(Usuario user) throws Exception;

	public void findUsuario(Usuario user) throws Exception;
	
}
