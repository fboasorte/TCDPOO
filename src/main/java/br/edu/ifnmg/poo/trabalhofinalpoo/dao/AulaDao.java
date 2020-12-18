/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.dao;

import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para representar uma aula no banco de dados
 * @author Andre Vinicius
 */
public class AulaDao extends AbstractDao<Aula, Long> {
    /**
     * Recupera a sentença SQL específica para a inserção da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para inserção.
     */
    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO aula(id,nome,conteudo, idProfessor, data, hora) VALUES (default, ?, ?, ?, ?, ?);";
    }

    /**
     * Recupera a sentença SQL específica para a busca da entidade no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidade.
     */
    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM aula WHERE id = ?";
    }

    /**
     * Recupera a sentença SQL específica para a busca das entidades no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidades.
     */
    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM aula";
    }

    /**
     * Recupera a sentença SQL específica para a atualização da entidade no
     * banco de dados.
     *
     * @return Sentença SQl para atualização.
     */
    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE aula SET nome = ?, conteudo = ?, idProfessor = ?, data = ?, hora = ? WHERE id = ?;";
    }

    /**
     * Recupera a sentença SQL específica para a exclusão da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para exclusão.
     */
    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM aula WHERE id = ?";
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
     * @param aula
     */
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Aula aula) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            if (aula.getId() == null || aula.getId() == 0) {
                pstmt.setString(1, aula.getNome());
                pstmt.setString(2, aula.getConteudo());
                pstmt.setInt(3, aula.getIdProfessor());
                pstmt.setString(4, aula.getData());
                pstmt.setString(5, aula.getHora());       
            } else {
                pstmt.setString(1, aula.getNome());
                pstmt.setString(2, aula.getConteudo());
                pstmt.setInt(3, aula.getIdProfessor());
                pstmt.setString(4, aula.getData());
                pstmt.setString(5, aula.getHora());  
                pstmt.setLong(6, aula.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AulaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cria objeto a partir do registro fornecido pelo banco de dados.
     *
     * @param resultSet Resultado proveniente do banco de dados relacional.
     * @return Objeto constituído.
     */
    @Override
    public Aula extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem da tarefa
        Aula aula = new Aula();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado da tarefa a ser mapeada
        try {
            aula.setId(resultSet.getLong("id"));
            aula.setNome(resultSet.getString("nome"));
            aula.setConteudo(resultSet.getString("conteudo"));
            aula.setIdProfessor(resultSet.getInt("idProfessor"));
            aula.setData(resultSet.getString("data"));
            aula.setHora(resultSet.getString("hora"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolve a tarefa mapeada
        return aula;
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
    public List<Aula> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das tarefas a serem mapeadas
        ArrayList<Aula> aulas = new ArrayList<>();
        
        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem da tarefa
                Aula aula = new Aula();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado da tarefa a ser mapeada
                aula.setId(resultSet.getLong("id"));
                aula.setNome(resultSet.getString("nome"));
                aula.setConteudo(resultSet.getString("conteudo"));
                aula.setIdProfessor(resultSet.getInt("idProfessor"));
                aula.setData(resultSet.getString("data"));
                aula.setHora(resultSet.getString("hora"));
                
                // Insere a tarefa na lista de tarefas recuperadas
                aulas.add(aula);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AulaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de tarefas reconstituídas dos registros do banco 
        // de dados
        return aulas;
    }
}