/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.dao;

import projeto.laschicas.domain.Acompanhante;

/**
 *
 * @author lggui
 */
public interface AcompanhanteDAO {
    
    public void inserir(Acompanhante acompanhante) throws Exception; 
    
    public void deletar(Integer id) throws Exception;
    
    public void atualizar(Acompanhante acompanhante) throws Exception;
    
    public Acompanhante getAcompanhanteById(Integer id) throws Exception;
    
    public Acompanhante getAcompanhanteByName(String nome) throws Exception;
}
