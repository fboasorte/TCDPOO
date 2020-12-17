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
public class Aula extends Entidade {

    private String nome;

    private String conteudo;
    
    private int idProfessor;
    
    private String data;
    
    private String hora;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Aula() {
    }

    public Aula(Long id, String nome, String conteudo, int idProfessor,
            String data, String hora) {
        super(id);
        this.nome = nome;
        this.conteudo = conteudo;
        this.idProfessor = idProfessor;
        this.data = data;
        this.hora = hora;
    }

//</editor-fold>
    
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

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals/HashCode">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.conteudo);
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
        final Aula other = (Aula) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudo, other.conteudo)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    @Override
    public String toString() {
        return nome 
                + ", " + conteudo 
                + ", " + idProfessor 
                + ", " + data 
                + ", " + hora;
    }

    

}
