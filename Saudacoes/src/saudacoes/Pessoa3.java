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
public class Pessoa3 extends Ola {
    
    
     // protected String _passeio;

   

    @Override
    public String saudacao(Ola padrao) {
        if (padrao == null) {
            return "Olá";
        }

        return "Olá: " + padrao.getNome();
    }
}
