/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.entity;

import java.util.Objects;

/**
 * Representa a matricula de um aluno em uma aula
 * @author felipe
 */
public class Matricula extends Entidade {

    /**
     * Nota na parte escrita na matricula da aula
     */
    private Integer notaParteEscrita;

    /**
     * Nota na parte oral na matricula da aula
     */
    private String notaParteOral;

    /**
     * Comentario sobre a matricula
     */
    private String comentario;
    
    /**
     * Identificador do discente que fez a matricula
     */
    private int idDiscente;
    
    /**
     * Identificador da aula que foi feita a matricula
     */
    private int idAula;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Matricula() {
    }

    /**
     * Construtor sobre carregado
     * 
     * @param id Identidade da matricula
     * @param notaParteEscrita Nota na parte escrita na matricula da aula
     * @param notaParteOral Nota na parte oral na matricula da aula
     * @param comentarios Comentario sobre a matricula
     * @param idDiscente Identificador do discente que fez a matricula
     * @param idAula Identificador da aula que foi feita a matricula
     */
    public Matricula(Long id, Integer notaParteEscrita, String notaParteOral, String comentarios,
            int idDiscente, int idAula) {
        super(id);
        this.notaParteEscrita = notaParteEscrita;
        this.notaParteOral = notaParteOral;
        this.comentario = comentarios;
        this.idDiscente = idDiscente;
        this.idAula = idAula;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Integer getNotaParteEscrita() {
        return notaParteEscrita;
    }

    public void setNotaParteEscrita(Integer notaParteEscrita) {
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
        hash = 79 * hash + Objects.hashCode(this.notaParteEscrita);
        hash = 79 * hash + Objects.hashCode(this.notaParteOral);
        hash = 79 * hash + Objects.hashCode(this.comentario);
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
        final Matricula other = (Matricula) obj;
        if (this.notaParteOral != other.notaParteOral) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.notaParteEscrita, other.notaParteEscrita)) {
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
        return notaParteEscrita 
                + ", " + notaParteOral 
                + ", " + comentario 
                + ", " + idDiscente 
                + ", " + idAula;
    }
}
