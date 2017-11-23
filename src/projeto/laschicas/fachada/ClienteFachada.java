package projeto.laschicas.fachada;
import projeto.laschicas.domain.Cliente;
import projeto.laschicas.regranegocio.ClienteRegraNegocio;

/**
 *
 * @author Igor
 */
public class ClienteFachada {
    public ClienteFachada(){       
    }    
    public String cadastrarCliente (Cliente c){
        ClienteRegraNegocio crn = new ClienteRegraNegocio();        
        String errorMsg = crn.validaCampos(c);
        return errorMsg;
    }
}
