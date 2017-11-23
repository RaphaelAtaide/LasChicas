package projeto.laschicas.regranegocio;

import javax.swing.JOptionPane;
import projeto.laschicas.domain.Cliente;

/**
 *
 * @author Igor
 */
public class ClienteRegraNegocio {
    public String validaCampos(Cliente c){
        String errorMsg = "Cadastrado com sucesso!";
        
        //Verifica se algum campo não foi preenchido.
        if(c.getNome().equals("")){
            errorMsg = "É necessário preencher o campo nome \n";            
        }
        if(c.getCpf().equals("")){
            errorMsg += "É necessário preencher o campo cpf \n";
        }
        if(c.getIdade().equals("")){
            errorMsg += "É necessário preencher o campo idade \n";
        }
        return errorMsg;
    }
}
