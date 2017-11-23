/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.database;

/**
 *
 * @author lggui
 */
public class ConexaoException  extends Exception {
    public ConexaoException(String texto) {
        super(texto);
    }
    
    public ConexaoException(){
    }
    
}

