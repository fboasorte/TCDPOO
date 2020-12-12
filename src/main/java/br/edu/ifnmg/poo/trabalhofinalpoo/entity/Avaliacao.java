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
public class Avaliacao extends Entidade {

    private int notaParteEscrita;

    private String notaParteOral;

    private String comentario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Avaliacao() {
    }

    public Avaliacao(Long id, int notaParteEscrita, String notaParteOral, String comentario) {
        super(id);
        this.notaParteEscrita = notaParteEscrita;
        this.notaParteOral = notaParteOral;
        this.comentario = comentario;
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
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equals/HashCode">
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.notaParteEscrita;
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
        final Avaliacao other = (Avaliacao) obj;
        if (this.notaParteEscrita != other.notaParteEscrita) {
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

    @Override
    public String toString() {
        return "Avaliacao{" + "notaParteEscrita=" + notaParteEscrita
                + ", notaParteOral=" + notaParteOral
                + ", comentario=" + comentario + '}';
    }

}
