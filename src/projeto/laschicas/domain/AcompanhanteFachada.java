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
public class AcompanhanteFachada {
    
    private static AcompanhanteRegraNegocio regraNegocio = new AcompanhanteRegraNegocio();


    public String cadastraAcompanhante(Acompanhante acompanhante){
        String errorMsg  = "";
        errorMsg = regraNegocio.validaAcompanhante(acompanhante);
        return errorMsg;
        }
    
     public void removeAcompanhante(Integer id){
         regraNegocio.removeAcompanhante(id);
     }
    }
    

