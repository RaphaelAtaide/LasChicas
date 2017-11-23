/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.fachada;

import java.util.ArrayList;
import projeto.laschicas.domain.Acompanhante;
import projeto.laschicas.regranegocio.AcompanhanteRegraNegocio;

/**
 *
 * @author lggui
 */
public class AcompanhanteFachada {
    
    private static AcompanhanteRegraNegocio regraNegocio = new AcompanhanteRegraNegocio();


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
 
    public void removeAcompanhante(Integer id) throws Exception{
        try {
            regraNegocio.removeAcompanhante(id);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
     
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
    
    public Acompanhante getAcompanhanteById(Integer id) throws Exception{
        Acompanhante acompanhante = null;
        try {
            acompanhante = regraNegocio.getAcompanhanteById(id);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }    
            return acompanhante;
        }
    
    
    public Acompanhante getAcompanhanteByName(String nome) throws Exception{
        Acompanhante acompanhante = null;
        try {
            acompanhante = regraNegocio.getAcompanhanteByName(nome);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }    
            return acompanhante;
        }
    
    
    public ArrayList<Acompanhante> getAllAcompanhantes() throws Exception{
        
        ArrayList<Acompanhante> acompanhantesList =  new ArrayList<>();
        acompanhantesList.addAll(regraNegocio.getAllAcompanhantes());
        return acompanhantesList;
        
    }
    }
  
  
