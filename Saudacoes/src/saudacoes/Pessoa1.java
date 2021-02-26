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
public class Pessoa1 extends Ola {
    

    private String _acompanhante;

    /**
     * @return the _acompanhante
     */
    public String getAcompanhante() {
        return _acompanhante;
    }

    /**
     * @param _acompanhante the _acompanhante to set
     */
    public void setAcompanhante(String _acompanhante) {
        this._acompanhante = _acompanhante;
    }

    @Override
    public String saudacao(Ola padrao) {
        if (padrao == null) {
            return "Oi Amigo(a) !";
        }

        return "Oi Amigo(a) " + padrao.getNome();
    }
}
   
