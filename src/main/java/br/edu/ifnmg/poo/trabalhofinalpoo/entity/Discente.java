/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

import java.util.Objects;

/**
 * Classe para representação de um discente no sistema escolar
 * @author felipe
 */
public class Discente extends Entidade {

    /**
     * CPF do discente
     */
    private int cpf;

    /** 
     * Nome do discente
     */
    private String nome;

    /**
     * Data de nascimento do discente
     * Formato "01/01/2000"
     */
    private String nascimento;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    /**
     * Construtor padrão da classe
     */
    public Discente() {
    }

    /**
     * Construtor sobrecarregado da classe
     * @param id Id do discente (gerado automaricamente)
     * @param cpf CPF do discente
     * @param nome Nome do discente
     * @param nascimento Data de nascimento do discente
     */
    public Discente(Long id, int cpf, String nome, String nascimento) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equals/HashCode">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.cpf;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.nascimento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Discente other = (Discente) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    /**
     * Gera representação textual do objeto atual.
     * @return Texto representativo do objeto atual 
     */
    @Override
    public String toString() {
        return cpf
                + ", " + nome
                + ", " + nascimento;

    }

}
