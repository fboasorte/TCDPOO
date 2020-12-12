/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

import java.util.Objects;

/**
 *
 * @author felipe
 */
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/br/edu/ifnmg/poo/trabalhofinalpoo/entity/Discente.java
public class Discente extends Entidade {

=======
public class Discente extends Entidade{
    
>>>>>>> feature/discente:src/main/java/br/edu/ifnmg/poo/trabalhofinalpoo/entity/Aluno.java
    private int cpf;

    private String nome;
<<<<<<< HEAD:src/main/java/br/edu/ifnmg/poo/trabalhofinalpoo/entity/Discente.java

    private LocalDate nascimento;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Discente() {
    }

    public Discente(Long id, int cpf, String nome, LocalDate nascimento) {
=======
=======

public class Discente extends Entidade {

    private int cpf;

    private String nome;
>>>>>>> feature/professorDao
    
    private String nascimento;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Discente(){
    }

    public Discente(Long id, int cpf, String nome, String nascimento) {
<<<<<<< HEAD
>>>>>>> feature/discente:src/main/java/br/edu/ifnmg/poo/trabalhofinalpoo/entity/Aluno.java
=======
>>>>>>> feature/professorDao
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

    @Override
    public String toString() {
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/br/edu/ifnmg/poo/trabalhofinalpoo/entity/Discente.java
        return "Aluno{" + "cpf=" + cpf
                + ", nome=" + nome
=======
        return cpf 
                + ", " + nome 
                + ", " + nascimento;
        /*
        return "Aluno{" + "cpf=" + cpf 
                + ", nome=" + nome 
>>>>>>> feature/discente:src/main/java/br/edu/ifnmg/poo/trabalhofinalpoo/entity/Aluno.java
                + ", nascimento=" + nascimento + '}';
*/
=======
        return cpf 
                + ", " + nome 
                + ", " + nascimento;

>>>>>>> feature/professorDao
    }

}
