/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.dao;

import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Discente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Operações de persistência com a entidade Tarefa.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 30/11/2020
 */
public class DiscenteDao extends AbstractDao<Discente, Long> {

    /**
     * Recupera a sentença SQL específica para a inserção da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para inserção.
     */
    @Override
    public String getDeclaracaoInsert() {
        return "INSERT INTO discente(id,cpf,nome,nascimento) VALUES (default, ?, ?, ?);";
    }

    /**
     * Recupera a sentença SQL específica para a busca da entidade no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidade.
     */
    @Override
    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM discente WHERE id = ?";
    }

    /**
     * Recupera a sentença SQL específica para a busca das entidades no banco de
     * dados.
     *
     * @return Sentença SQl para busca por entidades.
     */
    @Override
    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM discente";
    }

    /**
     * Recupera a sentença SQL específica para a atualização da entidade no
     * banco de dados.
     *
     * @return Sentença SQl para atualização.
     */
    @Override
    public String getDeclaracaoUpdate() {
        return "UPDATE discente SET cpf = ?, nome = ?, nascimento = ? WHERE id = ?;";
    }

    /**
     * Recupera a sentença SQL específica para a exclusão da entidade no banco
     * de dados.
     *
     * @return Sentença SQl para exclusão.
     */
    @Override
    public String getDeclaracaoDelete() {
        return "DELETE FROM discente WHERE id = ?";
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
     * @param id Chave primária a ser inserida na sentença SQL.
     */
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Discente discente) {
        // Tenta definir valores junto à sentença SQL preparada para execução 
        // no banco de dados.
        try {
            if (discente.getId() == null || discente.getId() == 0) {
                pstmt.setInt(1, discente.getCpf());
                pstmt.setString(2, discente.getNome());
                pstmt.setString(3, discente.getNascimento());
            } else {
                pstmt.setInt(1, discente.getCpf());
                pstmt.setString(2, discente.getNome());
                pstmt.setString(3, discente.getNascimento());
                pstmt.setLong(4, discente.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiscenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cria objeto a partir do registro fornecido pelo banco de dados.
     *
     * @param resultSet Resultado proveniente do banco de dados relacional.
     * @return Objeto constituído.
     */
    @Override
    public Discente extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem da tarefa
        Discente discente = new Discente();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado da tarefa a ser mapeada
        try {
            discente.setId(resultSet.getLong("id"));
            discente.setCpf(resultSet.getInt("cpf"));
            discente.setNome(resultSet.getString("nome"));
            discente.setNascimento(resultSet.getString("nascimento"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolve a tarefa mapeada
        return discente;
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
    public List<Discente> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das tarefas a serem mapeadas
        ArrayList<Discente> discentes = new ArrayList<>();
        
        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Cria referência para montagem da tarefa
                Discente discente = new Discente();

                // Tenta recuperar dados do registro retornado pelo banco 
                // de dados e ajustar o estado da tarefa a ser mapeada
                discente.setId(resultSet.getLong("id"));
                discente.setCpf(resultSet.getInt("cpf"));
                discente.setNome(resultSet.getString("nome"));
                discente.setNascimento(resultSet.getString("nascimento"));
                
                // Insere a tarefa na lista de tarefas recuperadas
                discentes.add(discente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiscenteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de tarefas reconstituídas dos registros do banco 
        // de dados
        return discentes;
    }
}
