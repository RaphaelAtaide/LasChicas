/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.database;

import com.mysql.jdbc.Connection;

/**
 *
 * @author lggui
 */
public interface GerenciadorConexao {
    
    /**
     * Abre uma conexao com o BD
     * @return Objeto da conexao
     * @exception ConexaoException
     */
    public Connection abrirConexao()throws ConexaoException ;
    
    /**
     * Fecha a conexao com o BD
     * @param c Objeto contendo a conexao aberta
     * @exception ConexaoException
     */
    public void fecharConexao(Connection c)throws ConexaoException;
}