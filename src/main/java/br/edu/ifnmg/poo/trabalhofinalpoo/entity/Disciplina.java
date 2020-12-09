/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

/**
 *
 * @author felipe
 */
public class Disciplina extends Entidade {

    private String nome;

    private String conteudo;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, String conteudo) {
        super(id);
        this.nome = nome;
        this.conteudo = conteudo;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

//</editor-fold>
    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", conteudo=" + conteudo + '}';
    }

}
