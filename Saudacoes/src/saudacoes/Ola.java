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
public class Ola {

    private String _nome;
    private int _idade;

    /**
     * @return the _nome
     */
    public String getNome() {
        return _nome;
    }

    /**
     * @param _nome the _nome to set
     */
    public void setNome(String _nome) {
        this._nome = _nome;
    }

    /**
     * @return the _idade
     */
    public int getIdade() {
        return _idade;
    }

    /**
     * @param _idade the _idade to set
     */
    public void setIdade(int _idade) {
        this._idade = _idade;
    }

    public String saudacao(Ola padrao) {
        if (padrao == null) {
            return "Olá!";
        }

        return "Olá " + padrao.getNome();
    }
}
