package projeto.laschicas.fachada;

import java.util.ArrayList;
import projeto.laschicas.domain.Acompanhante;
import projeto.laschicas.domain.Usuario;

public interface SystemFacade {

	public void insertUsuario(Usuario user) throws Exception;

	public void findUsuario(Usuario user) throws Exception;
        
        public void cadastraAcompanhante(Acompanhante acompanhante) throws Exception;
        
        public void removeAcompanhante(Integer id) throws Exception;
        
        public void alteraAcompanhante(Acompanhante acompanhante) throws Exception;
        
        public Acompanhante getAcompanhanteById(Integer id) throws Exception;
        
        public Acompanhante getAcompanhanteByName(String nome) throws Exception;
        
        public ArrayList<Acompanhante> getAllAcompanhantes() throws Exception;
	
}
