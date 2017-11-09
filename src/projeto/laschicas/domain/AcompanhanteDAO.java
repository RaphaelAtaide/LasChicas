/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.domain;

/**
 *
 * @author lggui
 */
public interface AcompanhanteDAO {
     public void inserir(Acompanhante acompanhante);
    
    public void deletar(Integer id);
    
    public void atualizar(Acompanhante acompanhante);
    
    public Acompanhante getAcompanhanteById(Integer id);
    
    public Acompanhante getAcompanhanteByName(String nome);
}
