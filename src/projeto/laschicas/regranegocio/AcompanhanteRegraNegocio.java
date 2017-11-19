/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.regranegocio;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.laschicas.dao.AcompanhanteDaoImpl;
import projeto.laschicas.domain.Acompanhante;

/**
 *
 * @author lggui
 */
public class AcompanhanteRegraNegocio {
    private static AcompanhanteDaoImpl acompanhanteDaoImpl = new AcompanhanteDaoImpl();
    
    
    public void validaAcompanhante(Acompanhante acompanhante) throws Exception{
        String exceptionMsg = "";
        
        if(acompanhante.getNome() == null || "".equals(acompanhante.getNome().trim())){
            exceptionMsg +=" Nome não pode ser vazio \n";
        }
        if (acompanhante.getCpf() == null || "".equals(acompanhante.getCpf().trim())) {
            exceptionMsg +=" Cpf não pode ser vazio \n";
        }
        if (acompanhante.getIdade() == null || acompanhante.getIdade() <= 0){
            exceptionMsg +=" Idade não pode ser menor ou igual a 0 \n";
        }
        //if (acompanhante.getSexo() == null || "".equals(this.getSexo()) ) {
        //    errorMsg+="Sexo não pode ser vazio \n";
        //}
        if (acompanhante.getValorHora() == null || acompanhante.getValorHora() <= 0.0) {
            exceptionMsg+="Valor hora não pode ser menor ou igual a 0";
        }
	//Fim da validação
        
        if (!exceptionMsg.isEmpty()) {
		throw new RuntimeException(exceptionMsg);
	}       
    }

    public void cadastraAcompanhante(Acompanhante acompanhante) throws Exception{
        try {   
            acompanhanteDaoImpl.inserir(acompanhante);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public void removeAcompanhante(Integer id) throws Exception{
        try {
            acompanhanteDaoImpl.deletar(id);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }
    
    public void alteraAcompanhante(Acompanhante acompanhante) throws Exception{
        try {
            acompanhanteDaoImpl.atualizar(acompanhante);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public Acompanhante getAcompanhanteById(Integer id) throws Exception{
        Acompanhante acompanhante = null;
        try {
            acompanhante = acompanhanteDaoImpl.getAcompanhanteById(id);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        return acompanhante;
    }
    
    
    public Acompanhante getAcompanhanteByName(String nome) throws Exception{
        Acompanhante acompanhante = null;
        try {
            acompanhante = acompanhanteDaoImpl.getAcompanhanteByName(nome);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        return acompanhante;
    }
    
    public ArrayList<Acompanhante> getAllAcompanhantes() throws Exception{
        
        ArrayList<Acompanhante> acompanhantesList = new ArrayList<>();
        acompanhantesList.addAll(acompanhanteDaoImpl.getAllAcompanhantes());
        return acompanhantesList;
    }

    
}
