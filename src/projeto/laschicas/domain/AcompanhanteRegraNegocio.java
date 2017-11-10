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
public class AcompanhanteRegraNegocio {
    
    public String validaAcompanhante(Acompanhante acompanhante){
        String errorMsg = "";
        
        if(acompanhante.getNome() == null || "".equals(acompanhante.getNome().trim())){
            errorMsg +=" Nome não pode ser vazio \n";
        }
        if (acompanhante.getCpf() == null || "".equals(acompanhante.getCpf().trim())) {
            errorMsg +=" Cpf não pode ser vazio \n";
        }
        if (acompanhante.getIdade() == null || acompanhante.getIdade() <= 0){
            errorMsg +=" Idade não pode ser menor ou igual a 0 \n";
        }
        //if (acompanhante.getSexo() == null || "".equals(this.getSexo()) ) {
        //    errorMsg+="Sexo não pode ser vazio \n";
        //}
        if (acompanhante.getValorHora() == null || acompanhante.getValorHora() <= 0.0) {
            errorMsg+="Valor hora não pode ser menor ou igual a 0";
        }
        
        return errorMsg;
    }
    
    
    public void removeAcompanhante(Integer id){
        //
    }
}
