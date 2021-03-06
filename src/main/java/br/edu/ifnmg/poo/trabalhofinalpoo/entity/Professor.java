/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

import java.util.Objects;

/**
 * Repesenta a entidade Professor num sistema escolar.
 * 
 * @author Mateus Felipe Mendes <mfdjm at aluno dot ifnmg dot edu dot br>
 * @author Felipe Rocha Boa-Sorte <frb at aluno dot ifnmg dot edu dot br>
 * @author André Vinicius Mendes Barros <avmb at aluno dot ifnmg dot edu dot br>
 * @version 0.1.0, 18/12/2020
 */
public class Professor extends Entidade {

    /**
     * CPF do professor
     */
    private int cpf;

    /**
     * Nome do professor
     */
    private String nome;

    /**
     * Data de nascimento do professor
     */
    private String nascimento;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Professor() {
    }

    /**
     * Construtor sobrecarregado
     * 
     * @param id Identidade do professor
     * @param cpf CPF do professor
     * @param nome Nome do professor
     * @param nascimento Data de nascimento do professor
     */
    public Professor(Long id, int cpf, String nome, String nascimento) {
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
        int hash = 3;
        hash = 89 * hash + this.cpf;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.nascimento);
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
        final Professor other = (Professor) obj;
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
     * 
     * @return Texto representativo do objeto atual
     */
    @Override
    public String toString() {
        return cpf 
                + ", " + nome 
                + ", " + nascimento + '}';
    }

}
