/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.dao;

import java.util.ArrayList;
import projeto.laschicas.domain.Acompanhante;

/**
 *
 * @author lggui
 */
public interface AcompanhanteDAO {
    
    public void insertOrUpdadte(Acompanhante acompanhante) throws Exception; 
    
    public void deleteById(Integer id) throws Exception;
    
    public Acompanhante findById(Integer id) throws Exception;
    
    public ArrayList<Acompanhante> findAcompanhantes(Acompanhante acompanhante)  throws Exception;
    
}
