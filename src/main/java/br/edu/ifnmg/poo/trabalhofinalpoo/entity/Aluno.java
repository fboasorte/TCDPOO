/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

import java.util.Objects;
import java.time.LocalDate;

/**
 *
 * @author felipe
 */
public class Aluno extends Entidade{
    
    private int cpf;
    
    private String nome;
    
    private LocalDate nascimento;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Aluno(){
    }

    public Aluno(Long id, int cpf, String nome, LocalDate nascimento) {
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
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
        final Aluno other = (Aluno) obj;
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

    @Override
    public String toString() {
        return "Aluno{" + "cpf=" + cpf 
                + ", nome=" + nome 
                + ", nascimento=" + nascimento + '}';
    }
    
}
