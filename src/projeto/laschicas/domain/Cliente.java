package projeto.laschicas.domain;
import projeto.laschicas.domain.Pessoa;

/**
 *
 * @author Igor
 */
public class Cliente extends Pessoa{
    private Integer idCliente;
    private String cartaoId;
    
    
    /**
    * @return the IdCliente
    * @param id the id to set
    */
    public Integer getIdCliente() {
        return idCliente;
    }
    
    /**
     * @param idCliente the id to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    /**
     * @return the CartaoId
     */
    public String getCartaoId() {
        return cartaoId;
    }
    
    /**
     * @param CartaoId the id to set
     */
    public void setCartaoId(String cartaoId) {
        this.cartaoId = cartaoId;
    }
}
