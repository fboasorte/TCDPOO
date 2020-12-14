/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.dao;

import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Disciplina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andre Vinicius
 */
public class DisciplinaDao extends AbstractDao<Disciplina, Long> {
    /**
     * Recupera a sentença SQL específica para a inserção da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para inserção.
     */
    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO disciplina(id,nome,conteudo) VALUES (default, ?, ?);";
    }

    /**
     * Recupera a sentença SQL específica para a busca da entidade no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidade.
     */
    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM disciplina WHERE id = ?";
    }

    /**
     * Recupera a sentença SQL específica para a busca das entidades no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidades.
     */
    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM disciplina";
    }

    /**
     * Recupera a sentença SQL específica para a atualização da entidade no
     * banco de dados.
     *
     * @return Sentença SQl para atualização.
     */
    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE disciplina SET nome = ?, conteudo = ? WHERE id = ?;";
    }

    /**
     * Recupera a sentença SQL específica para a exclusão da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para exclusão.
     */
    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM disciplina WHERE id = ?";
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
     * @param disciplina
     */
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Disciplina disciplina) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            if (disciplina.getId() == null || disciplina.getId() == 0) {
                pstmt.setString(1, disciplina.getNome());
                pstmt.setString(2, disciplina.getConteudo());
            } else {
                pstmt.setString(1, disciplina.getNome());
                pstmt.setString(2, disciplina.getConteudo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cria objeto a partir do registro fornecido pelo banco de dados.
     *
     * @param resultSet Resultado proveniente do banco de dados relacional.
     * @return Objeto constituído.
     */
    @Override
    public Disciplina extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem da tarefa
        Disciplina disciplina = new Disciplina();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado da tarefa a ser mapeada
        try {
            disciplina.setId(resultSet.getLong("id"));
            disciplina.setNome(resultSet.getString("nome"));
            disciplina.setConteudo(resultSet.getString("conteudo"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolve a tarefa mapeada
        return disciplina;
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
    public List<Disciplina> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das tarefas a serem mapeadas
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        
        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem da tarefa
                Disciplina disciplina = new Disciplina();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado da tarefa a ser mapeada
                disciplina.setId(resultSet.getLong("id"));
                disciplina.setNome(resultSet.getString("nome"));
                disciplina.setConteudo(resultSet.getString("conteudo"));
                
                // Insere a tarefa na lista de tarefas recuperadas
                disciplinas.add(disciplina);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de tarefas reconstituídas dos registros do banco 
        // de dados
        return disciplinas;
    }
}
