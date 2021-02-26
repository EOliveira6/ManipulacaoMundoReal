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
public class Saudacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pessoa1 pessoa1 = new Pessoa1();
        pessoa1.setAcompanhante("Pai");
        pessoa1.setNome("Marcos");
        pessoa1.setIdade(35);

        Pessoa2 pessoa2 = new Pessoa2();
        pessoa2.setNome("Carla");
        pessoa2.setIdade(18);
        pessoa2.setAtividade("Caminhada");

        Pessoa3 pessoa3 = new Pessoa3();
        pessoa3.setNome("Maria");
        pessoa3.setIdade(25);

        System.out.println(pessoa3.saudacao(pessoa2));
        System.out.println(pessoa2.saudacao(pessoa3));
        System.out.println(pessoa1.saudacao(pessoa3));

    }

}
