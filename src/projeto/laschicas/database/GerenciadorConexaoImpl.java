
package projeto.laschicas.database;

/**
 *
 * @author lggui
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import projeto.laschicas.database.ConexaoException;

public class GerenciadorConexaoImpl implements GerenciadorConexao {
    private static GerenciadorConexaoImpl instancia;
    private final String url;
    private final String usu;
    private final String sen;
    
    
    private GerenciadorConexaoImpl(){
    ResourceBundle rb = ResourceBundle.getBundle("projeto2.util.banco");
    url = rb.getString("localhost");
    usu = rb.getString("root");
    sen = rb.getString("grupo4");
    }
    

     public static GerenciadorConexaoImpl getInstancia(){
        if(instancia==null){
            instancia = new GerenciadorConexaoImpl();
        }
        return instancia;
    }

    @Override
    public com.mysql.jdbc.Connection abrirConexao() throws ConexaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fecharConexao(com.mysql.jdbc.Connection c) throws ConexaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
