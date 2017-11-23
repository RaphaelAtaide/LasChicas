package projeto.laschicas.fachada;

import java.util.ArrayList;
import java.util.List;

import projeto.laschicas.dao.UsuarioDAO;
import projeto.laschicas.dao.UsuarioDAOImpl;
import projeto.laschicas.domain.Acompanhante;
import projeto.laschicas.domain.Usuario;
import projeto.laschicas.regranegocio.AcompanhanteRegraNegocio;
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
    
        
    private static AcompanhanteRegraNegocio regraNegocio = new AcompanhanteRegraNegocio();
        
    @Override
    public void cadastraAcompanhante(Acompanhante acompanhante) throws Exception{
        // Faz a validação da acompanhante antes de inserir no banco
        try{
            regraNegocio.validaAcompanhante(acompanhante);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        //Inserção da acompanhante no banco
        try{
            regraNegocio.validaAcompanhante(acompanhante);
            regraNegocio.cadastraAcompanhante(acompanhante);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
 
    @Override
    public void removeAcompanhante(Integer id) throws Exception{
        try {
            regraNegocio.removeAcompanhante(id);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
     
    @Override
    public void alteraAcompanhante(Acompanhante acompanhante) throws Exception{
        
        // Faz a validação da acompanhante antes de atualizar no banco
        try{
            regraNegocio.validaAcompanhante(acompanhante);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        // Atualização da acompanhante no banco
        try {
            regraNegocio.alteraAcompanhante(acompanhante);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    @Override
    public Acompanhante getAcompanhanteById(Integer id) throws Exception{
        Acompanhante acompanhante = null;
        try {
            acompanhante = regraNegocio.getAcompanhanteById(id);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }    
            return acompanhante;
        }
    
   
   @Override
   public Acompanhante getAcompanhanteByName(String nome) throws Exception{
        Acompanhante acompanhante = null;
        try {
            acompanhante = regraNegocio.getAcompanhanteByName(nome);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }    
            return acompanhante;
        }
    
    
    @Override
    public ArrayList<Acompanhante> getAllAcompanhantes() throws Exception{
        
        ArrayList<Acompanhante> acompanhantesList =  new ArrayList<>();
        acompanhantesList.addAll(regraNegocio.getAllAcompanhantes());
        return acompanhantesList;
        
    }
    }
