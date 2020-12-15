/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.dao;

import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Matricula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devin
 */
public class MatriculaDao extends AbstractDao<Matricula, Long> {
    /**
     * Recupera a sentença SQL específica para a inserção da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para inserção.
     */
    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO matricula(id,notaParteEscrita,notaParteOral,comentario) VALUES (default, ?, ?,?);";
    }

    /**
     * Recupera a sentença SQL específica para a busca da entidade no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidade.
     */
    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM matricula WHERE id = ?";
    }

    /**
     * Recupera a sentença SQL específica para a busca das entidades no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidades.
     */
    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM matricula";
    }

    /**
     * Recupera a sentença SQL específica para a atualização da entidade no
     * banco de dados.
     *
     * @return Sentença SQl para atualização.
     */
    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE matricula SET notaParteEscrita = ?, notaParteOral = ?, comentario = ? WHERE id = ?;";
    }

    /**
     * Recupera a sentença SQL específica para a exclusão da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para exclusão.
     */
    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM matricula WHERE id = ?";
    }

    /**
     * Insere o valor da chave primária na senteça SQL específica para seu uso.
     *
     * @param pstmt Declaração previamente preparada.
     * @param id Chave primária a ser inserida na sentença SQL.
     */
    @Override
    public void ajustarIdDeclaracao(PreparedStatement pstmt, Long id) {
        try {
            // TODO Rever procedimento para suportar tipo genérico "K"
            pstmt.setLong(1, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Insere os valores do objeto na senteça SQL específica para inserção ou
     * atualização de registros no banco de dados.
     *
     * @param pstmt Declaração previamente preparada.
     * @param matricula
     */
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Matricula matricula) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            if (matricula.getId() == null || matricula.getId() == 0) {
                pstmt.setInt(1, matricula.getNotaParteEscrita());
                pstmt.setString(2, matricula.getNotaParteOral());
                pstmt.setString(3, matricula.getComentario());
            } else {
                pstmt.setInt(1, matricula.getNotaParteEscrita());
                pstmt.setString(2, matricula.getNotaParteOral());
                pstmt.setString(3, matricula.getComentario());
                pstmt.setLong(4, matricula.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cria objeto a partir do registro fornecido pelo banco de dados.
     *
     * @param resultSet Resultado proveniente do banco de dados relacional.
     * @return Objeto constituído.
     */
    @Override
    public Matricula extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem da tarefa
        Matricula matricula = new Matricula();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado da tarefa a ser mapeada
        try {
            matricula.setId(resultSet.getLong("id"));
            matricula.setNotaParteEscrita(resultSet.getInt("notaParteEscrita"));
            matricula.setNotaParteOral(resultSet.getString("notaParteOral"));
            matricula.setComentario(resultSet.getString("comentario"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolve a tarefa mapeada
        return matricula;
    }

    /**
     * Cria objeto(s) a partir do(s) registro(s) fornecido(s) pelo banco de
     * dados.
     *
     * @param resultSet Resultado(s) proveniente(s) do banco de dados
     * relacional.
     * @return Lista de objeto(s) constituído(s).
     */
    @Override
    public List<Matricula> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das tarefas a serem mapeadas
        ArrayList<Matricula> matriculas = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem da tarefa
                Matricula matricula = new Matricula();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado da tarefa a ser mapeada
                matricula.setId(resultSet.getLong("id"));
                matricula.setNotaParteEscrita(resultSet.getInt("notaParteEscrita"));
                matricula.setNotaParteOral(resultSet.getString("notaParteOral"));
                matricula.setComentario(resultSet.getString("comentario"));

                // Insere a tarefa na lista de tarefas recuperadas
                matriculas.add(matricula);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MatriculaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de tarefas reconstituídas dos registros do banco 
        // de dados
        return matriculas;
    }
}