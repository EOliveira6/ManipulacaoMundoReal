/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudacoes;

/**
 *
 * @author Eleni Oliveira
 */
public class Pessoa2 extends Ola{
    
     private String _atividade;

     /**
     * @return the _atividade
     */
    public String getAtividade() {
        return _atividade;
    }

    /**
     * @param _atividade the _atividade to set
     */
    public void setAtividade(String _atividade) {
        this._atividade = _atividade;
    }

    @Override
    public String saudacao(Ola padrao) {
        if (padrao == null) {
            return "Olá!";
        }

        return "Olá! Tudo bem?";
    }

   
    
   
    
}
