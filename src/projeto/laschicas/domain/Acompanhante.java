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
public class Acompanhante extends Pessoa {
    private Integer id;
    private Double valorHora;
    private String descricao;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the valorHora
     */
    public Double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public String validar()   {
        // validações feitas pelo elemento antes de salvar
        
        String errorMsg = "";
        
        if(getNome() == null || "".equals(getNome().trim())){
            errorMsg +=" Nome não pode ser vazio \n";
        }
        if (getCpf() == null || "".equals(getCpf().trim())) {
            errorMsg +=" Cpf não pode ser vazio \n";
        }
        if ( getIdade() == null || getIdade() <= 0){
            errorMsg +=" Idade não pode ser menor ou igual a 0 \n";
        }
        if (true) {
            
        }
        if (true) {
            
        }
        if (true) {
            
        }
        if (true) {
            
        }
        if (true) {
            
        }
        
        return errorMsg;
    
    }
    
    
    
    
    
}
