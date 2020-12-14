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
public class DisponibilidadeHorario extends Entidade {

    private String data;

    private String hora;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public DisponibilidadeHorario() {
    }

    public DisponibilidadeHorario(Long id, String data, String hora) {
        super(id);
        this.data = data;
        this.hora = hora;
    }

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
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
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Objects.hashCode(this.hora);
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
        final DisponibilidadeHorario other = (DisponibilidadeHorario) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        return true;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "DisponibilidadeHorario{" + "data=" + data
                + ", hora=" + hora + '}';
    }

}
