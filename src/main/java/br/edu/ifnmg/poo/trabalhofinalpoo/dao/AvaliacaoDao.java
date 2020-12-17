/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.dao;

import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Avaliacao;
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
public class AvaliacaoDao extends AbstractDao<Avaliacao, Long> {

    /**
     * Recupera a sentença SQL específica para a inserção da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para inserção.
     */
    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO avaliacao(id,notaParteEscrita,notaParteOral,comentario, idDiscente, idAula) VALUES (default,?,?, ?, ?, ?);";
    }

    /**
     * Recupera a sentença SQL específica para a busca da entidade no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidade.
     */
    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM avaliacao WHERE id = ?";
    }

    /**
     * Recupera a sentença SQL específica para a busca das entidades no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidades.
     */
    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM avaliacao";
    }

    /**
     * Recupera a sentença SQL específica para a atualização da entidade no
     * banco de dados.
     *
     * @return Sentença SQl para atualização.
     */
    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE avaliacao SET notaParteEscrita = ?, notaParteOral = ?, comentario = ?, idDiscente = ?, idAula = ? WHERE id = ?;";
    }

    /**
     * Recupera a sentença SQL específica para a exclusão da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para exclusão.
     */
    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM avaliacao WHERE id = ?";
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
     * @param avaliacao
     */
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Avaliacao avaliacao) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            if (avaliacao.getId() == null || avaliacao.getId() == 0) {
                pstmt.setInt(1, avaliacao.getNotaParteEscrita());
                pstmt.setString(2, avaliacao.getNotaParteOral());
                pstmt.setString(3, avaliacao.getComentario());
                pstmt.setInt(4, avaliacao.getIdDiscente());
                pstmt.setInt(5, avaliacao.getIdAula());
            } else {
                pstmt.setInt(1, avaliacao.getNotaParteEscrita());
                pstmt.setString(2, avaliacao.getNotaParteOral());
                pstmt.setString(3, avaliacao.getComentario());
                pstmt.setInt(4, avaliacao.getIdDiscente());
                pstmt.setInt(5, avaliacao.getIdAula());
                pstmt.setLong(6, avaliacao.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cria objeto a partir do registro fornecido pelo banco de dados.
     *
     * @param resultSet Resultado proveniente do banco de dados relacional.
     * @return Objeto constituído.
     */
    @Override
    public Avaliacao extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem da tarefa
        Avaliacao avaliacao = new Avaliacao();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado da tarefa a ser mapeada
        try {
            avaliacao.setId(resultSet.getLong("id"));
            avaliacao.setNotaParteEscrita(resultSet.getInt("notaParteEscrita"));
            avaliacao.setNotaParteOral(resultSet.getString("notaParteOral"));
            avaliacao.setComentario(resultSet.getString("comentario"));
            avaliacao.setIdDiscente(resultSet.getInt("idDiscente"));
            avaliacao.setIdAula(resultSet.getInt("idAula"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolve a tarefa mapeada
        return avaliacao;
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
    public List<Avaliacao> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das tarefas a serem mapeadas
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem da tarefa
                Avaliacao avaliacao = new Avaliacao();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado da tarefa a ser mapeada
                avaliacao.setId(resultSet.getLong("id"));
                avaliacao.setNotaParteEscrita(resultSet.getInt("notaParteEscrita"));
                avaliacao.setNotaParteOral(resultSet.getString("notaParteOral"));
                avaliacao.setComentario(resultSet.getString("comentario"));
                avaliacao.setIdDiscente(resultSet.getInt("idDiscente"));
                avaliacao.setIdAula(resultSet.getInt("idAula"));

                // Insere a tarefa na lista de tarefas recuperadas
                avaliacoes.add(avaliacao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AvaliacaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de tarefas reconstituídas dos registros do banco 
        // de dados
        return avaliacoes;
    }
}
