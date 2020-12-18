/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

import java.util.Objects;

/**
 * Classe que representa uma avaliação no sistema escolar
 * @author felipe
 */
public class Avaliacao extends Entidade {

    /**
     * Nota da parte escrita de uma avaliação
     */
    private int notaParteEscrita;
    /**
     * Nota da parte oral de uma avaliação
     * O resultado será um caracter:
     * D =
     * Y =
     * T =
     */
    private String notaParteOral;

    /**
     * Comentario escrito por um professor em uma avaliação
     */
    private String comentario;
    
    /**
     * Id do aluno que fez a avaliação
     */
    private int idDiscente;
    
    /**
     * Id da aula que aconteceu a avaliação
     */
    private int idAula;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    /**
     * Construtor padrão da classe
     */
    public Avaliacao() {
    }
    
    /**
     * Construtor sobrecarregado da classe 
     * @param id Id de uma avaliação
     * @param notaParteEscrita Nota da parte escrita de uma avaliação
     * @param notaParteOral Nota da parte oral de uma avaliação
     * @param comentario Comentario escrito por um professor em uma avaliação
     * @param idDiscente Id do aluno (discente) que fez a avaliação
     * @param idAula Id da aula que aconteceu a avaliação
     */
    public Avaliacao(Long id, int notaParteEscrita, String notaParteOral
            , String comentario, int idDiscente, int idAula) {
        super(id);
        this.notaParteEscrita = notaParteEscrita;
        this.notaParteOral = notaParteOral;
        this.comentario = comentario;
        this.idDiscente = idDiscente;
        this.idAula = idAula;
    }

//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public int getNotaParteEscrita() {
        return notaParteEscrita;
    }

    public void setNotaParteEscrita(int notaParteEscrita) {
        this.notaParteEscrita = notaParteEscrita;
    }

    public String getNotaParteOral() {
        return notaParteOral;
    }

    public void setNotaParteOral(String notaParteOral) {
        this.notaParteOral = notaParteOral;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdDiscente() {
        return idDiscente;
    }

    public void setIdDiscente(int idDiscente) {
        this.idDiscente = idDiscente;
    }

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equals/HashCode">

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.notaParteEscrita;
        hash = 53 * hash + Objects.hashCode(this.notaParteOral);
        hash = 53 * hash + Objects.hashCode(this.comentario);
        hash = 53 * hash + this.idDiscente;
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
        final Avaliacao other = (Avaliacao) obj;
        if (this.notaParteEscrita != other.notaParteEscrita) {
            return false;
        }
        if (this.idDiscente != other.idDiscente) {
            return false;
        }
        if (!Objects.equals(this.notaParteOral, other.notaParteOral)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
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
        return notaParteEscrita 
                + ", " + notaParteOral 
                + ", " + comentario 
                + ", " + idDiscente 
                + ", " + idAula;
    }
}
