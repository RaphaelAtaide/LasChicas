package projeto.laschicas.fachada;

import java.util.List;

import projeto.laschicas.dao.UsuarioDAO;
import projeto.laschicas.dao.UsuarioDAOImpl;
import projeto.laschicas.domain.Usuario;
import projeto.laschicas.regranegocio.UsuarioRegraNegocio;

public class SystemFacadeImpl implements SystemFacade {

	@Override
	public void insertUsuario(Usuario user) throws Exception {

		if (user != null) {
			UsuarioRegraNegocio.validate(user);
			UsuarioDAO dao = new UsuarioDAOImpl();

			try {
				dao.insert(user);
			} catch (Exception e) {
				// tratar exception tipo banco
				throw e;
			}
		}
	}

	@Override
	public void findUsuario(Usuario user) throws Exception {

		if (user != null) {
			UsuarioRegraNegocio.findValidate(user);
			UsuarioDAO dao = new UsuarioDAOImpl();

			try {
				List<Usuario> findReturn = dao.find(user);
				
				if (findReturn == null && findReturn.isEmpty()) {
					throw new RuntimeException("Usuario nao cadastrado!");
				}
			} catch (Exception e) {
				// tratar exception tipo banco
				throw e;
			}
		}
	}
}
