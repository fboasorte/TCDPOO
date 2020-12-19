/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AvaliacaoDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.DiscenteDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AulaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Avaliacao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Discente;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * Classe para representar a tela de uma avaliação no sistema escolar
 * 
 * @author Mateus Felipe Mendes <mfdjm at aluno dot ifnmg dot edu dot br>
 * @author Felipe Rocha Boa-Sorte <frb at aluno dot ifnmg dot edu dot br>
 * @author André Vinicius Mendes Barros <avmb at aluno dot ifnmg dot edu dot br>
 * @version 0.1.0, 18/12/2020
 */
public class CadastrarAvaliacao extends javax.swing.JFrame {
    
    /**
     * Modelo para manutenção da lista de avaliações a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Avaliacao> lstAvaliacaoModel;
    
    /**
     * Modelo para manutenção da lista de discentes a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Discente> lstDiscentesModel;
    
    /**
     * Modelo para manutenção da lista de aulas a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Aula> lstAulasModel;
    
    /**
     * Retém o índice da avaliação selecionada para referências de processamentos
     * entre vários métodos.
     */
    private int indiceAvaliacaoSelecionada;

    /**
     * Construtor padrão de CadastrarAvaliação
     */
    public CadastrarAvaliacao() {
        lstAvaliacaoModel = new DefaultListModel<>();
        List<Avaliacao> avaliacoes = new AvaliacaoDao().localizarTodos();
        lstAvaliacaoModel.addAll(avaliacoes);
        
        // exibindo os alunos
        lstDiscentesModel = new DefaultListModel<>();
        List<Discente> discentes = new DiscenteDao().localizarTodos();
        lstDiscentesModel.addAll(discentes);
        
        lstAulasModel = new DefaultListModel<>();
        List<Aula> aulas = new AulaDao().localizarTodos();
        lstAulasModel.addAll(aulas);
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        mnuEditar = new javax.swing.JMenuItem();
        mnuExcluir = new javax.swing.JMenuItem();
        pnlCadastroAvaliacao = new javax.swing.JPanel();
        pnlPesquisaAluno = new javax.swing.JPanel();
        lblListaAlunos = new javax.swing.JLabel();
        scrListaDiscentes = new javax.swing.JScrollPane();
        lstDiscentes = new javax.swing.JList<>();
        scrListaAulas = new javax.swing.JScrollPane();
        lstAulas = new javax.swing.JList<>();
        lblProvasAplicadas = new javax.swing.JLabel();
        lblDetalhesProva = new javax.swing.JLabel();
        lblListaAulas = new javax.swing.JLabel();
        scrListaAvaliacoes = new javax.swing.JScrollPane();
        lstAvaliacoes = new javax.swing.JList<>();
        pnlDetalhesAvaliacao = new javax.swing.JPanel();
        lblNotas = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlNotas = new javax.swing.JPanel();
        scrComentario = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        lblComentarios = new javax.swing.JLabel();
        lblParteEscrita = new javax.swing.JLabel();
        txtParteEscrita = new javax.swing.JTextField();
        txtParteOral = new javax.swing.JTextField();
        lblParteOral = new javax.swing.JLabel();
        scrAprovado = new javax.swing.JScrollPane();
        txpAprovado = new javax.swing.JTextPane();
        lblObservacao = new javax.swing.JLabel();
        lblObservacao1 = new javax.swing.JLabel();

        mnuEditar.setText("Editar");
        mnuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditarActionPerformed(evt);
            }
        });
        popUpMenu.add(mnuEditar);

        mnuExcluir.setText("Excluir");
        mnuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExcluirActionPerformed(evt);
            }
        });
        popUpMenu.add(mnuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Provas");
        setResizable(false);

        pnlCadastroAvaliacao.setBackground(new java.awt.Color(255, 255, 255));

        pnlPesquisaAluno.setBackground(new java.awt.Color(255, 255, 255));

        lblListaAlunos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblListaAlunos.setForeground(new java.awt.Color(0, 0, 0));
        lblListaAlunos.setText("Lista de alunos");

        lstDiscentes.setBackground(new java.awt.Color(255, 255, 255));
        lstDiscentes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstDiscentes.setForeground(new java.awt.Color(0, 0, 0));
        lstDiscentes.setModel(lstDiscentesModel);
        scrListaDiscentes.setViewportView(lstDiscentes);

        lstAulas.setBackground(new java.awt.Color(255, 255, 255));
        lstAulas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstAulas.setForeground(new java.awt.Color(0, 0, 0));
        lstAulas.setModel(lstAulasModel);
        scrListaAulas.setViewportView(lstAulas);

        lblProvasAplicadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProvasAplicadas.setForeground(new java.awt.Color(0, 0, 0));
        lblProvasAplicadas.setText("Provas aplicadas");

        lblDetalhesProva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDetalhesProva.setForeground(new java.awt.Color(0, 0, 0));
        lblDetalhesProva.setText("Cadastrar nova prova");

        lblListaAulas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblListaAulas.setForeground(new java.awt.Color(0, 0, 0));
        lblListaAulas.setText("Lista de aulas");

        lstAvaliacoes.setBackground(new java.awt.Color(255, 255, 255));
        lstAvaliacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstAvaliacoes.setForeground(new java.awt.Color(0, 0, 0));
        lstAvaliacoes.setModel(lstAvaliacaoModel);
        lstAvaliacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstAvaliacoesMouseReleased(evt);
            }
        });
        scrListaAvaliacoes.setViewportView(lstAvaliacoes);

        pnlDetalhesAvaliacao.setBackground(new java.awt.Color(255, 255, 255));
        pnlDetalhesAvaliacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        pnlDetalhesAvaliacao.setForeground(new java.awt.Color(112, 112, 112));

        lblNotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNotas.setForeground(new java.awt.Color(0, 0, 0));
        lblNotas.setText("Notas");

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlNotas.setBackground(new java.awt.Color(245, 245, 245));
        pnlNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        txtComentario.setBackground(new java.awt.Color(255, 255, 255));
        txtComentario.setForeground(new java.awt.Color(0, 0, 0));
        scrComentario.setViewportView(txtComentario);

        lblComentarios.setForeground(new java.awt.Color(0, 0, 0));
        lblComentarios.setText("Comentários");

        lblParteEscrita.setForeground(new java.awt.Color(0, 0, 0));
        lblParteEscrita.setText("Parte escrita");

        txtParteEscrita.setBackground(new java.awt.Color(255, 255, 255));
        txtParteEscrita.setForeground(new java.awt.Color(0, 0, 0));
        txtParteEscrita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParteEscrita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        txtParteEscrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteEscritaActionPerformed(evt);
            }
        });

        txtParteOral.setBackground(new java.awt.Color(255, 255, 255));
        txtParteOral.setForeground(new java.awt.Color(0, 0, 0));
        txtParteOral.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParteOral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        txtParteOral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteOralActionPerformed(evt);
            }
        });

        lblParteOral.setForeground(new java.awt.Color(0, 0, 0));
        lblParteOral.setText("Parte oral");

        scrAprovado.setHorizontalScrollBar(null);

        txpAprovado.setEditable(false);
        txpAprovado.setBackground(new java.awt.Color(0, 204, 102));
        txpAprovado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txpAprovado.setForeground(new java.awt.Color(0, 0, 0));
        scrAprovado.setViewportView(txpAprovado);

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblComentarios)
                    .addGroup(pnlNotasLayout.createSequentialGroup()
                        .addComponent(lblParteEscrita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParteEscrita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblParteOral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParteOral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(scrAprovado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrComentario))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblParteEscrita)
                        .addComponent(txtParteEscrita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParteOral)
                        .addComponent(txtParteOral, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrAprovado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlNotasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {scrAprovado, txtParteOral});

        javax.swing.GroupLayout pnlDetalhesAvaliacaoLayout = new javax.swing.GroupLayout(pnlDetalhesAvaliacao);
        pnlDetalhesAvaliacao.setLayout(pnlDetalhesAvaliacaoLayout);
        pnlDetalhesAvaliacaoLayout.setHorizontalGroup(
            pnlDetalhesAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesAvaliacaoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNotas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDetalhesAvaliacaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetalhesAvaliacaoLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(pnlNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlDetalhesAvaliacaoLayout.setVerticalGroup(
            pnlDetalhesAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesAvaliacaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDetalhesAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNotas)
                    .addComponent(pnlNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalhesAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblObservacao.setForeground(new java.awt.Color(102, 102, 102));
        lblObservacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblObservacao.setText("Para excluir ou editar, clique com o botão direito na seleção.");

        lblObservacao1.setForeground(new java.awt.Color(102, 102, 102));
        lblObservacao1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblObservacao1.setText("Para cadastrar novas provas, selecione Aluno e Aula, e em seguida, preencha os campos em Cadastrar Nova Prova.");

        javax.swing.GroupLayout pnlPesquisaAlunoLayout = new javax.swing.GroupLayout(pnlPesquisaAluno);
        pnlPesquisaAluno.setLayout(pnlPesquisaAlunoLayout);
        pnlPesquisaAlunoLayout.setHorizontalGroup(
            pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                        .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProvasAplicadas)
                            .addComponent(scrListaAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObservacao))
                        .addGap(16, 16, 16)
                        .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDetalhesAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDetalhesProva)))
                    .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                        .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrListaDiscentes, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblListaAlunos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListaAulas)
                            .addComponent(scrListaAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblObservacao1)
                .addGap(150, 150, 150))
        );
        pnlPesquisaAlunoLayout.setVerticalGroup(
            pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaAlunos)
                    .addComponent(lblListaAulas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrListaDiscentes)
                    .addComponent(scrListaAulas))
                .addGap(8, 8, 8)
                .addComponent(lblObservacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProvasAplicadas)
                    .addComponent(lblDetalhesProva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrListaAvaliacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDetalhesAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCadastroAvaliacaoLayout = new javax.swing.GroupLayout(pnlCadastroAvaliacao);
        pnlCadastroAvaliacao.setLayout(pnlCadastroAvaliacaoLayout);
        pnlCadastroAvaliacaoLayout.setHorizontalGroup(
            pnlCadastroAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroAvaliacaoLayout.createSequentialGroup()
                .addComponent(pnlPesquisaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCadastroAvaliacaoLayout.setVerticalGroup(
            pnlCadastroAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroAvaliacaoLayout.createSequentialGroup()
                .addComponent(pnlPesquisaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroAvaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroAvaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao clicar no botão cancelar, fecha a tela atual
     * @param evt Evento capturado
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Verifica se o discente foi aprovado na parte escrita,e caso seja,
     * coloca o campo como "APROVADO", caso contrário, "REPROVADO"
     * @param evt Evento capturado
     */
    private void txtParteEscritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteEscritaActionPerformed
        if(estaAprovadoEscrita(Integer.parseInt(txtParteEscrita.getText())) && 
                estaAprovadoOral(txtParteOral.getText())){
            txpAprovado.setText("APROVADO");
        }
        else {
            txpAprovado.setText("REPROVADO");
        }
    }//GEN-LAST:event_txtParteEscritaActionPerformed

    /**
     * Verifica se o discente foi aprovado na parte oral,e caso seja,
     * coloca o campo como "APROVADO", caso contrário, "REPROVADO"
     * @param evt Evento capturado
     */
    private void txtParteOralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteOralActionPerformed
        if(estaAprovadoEscrita(Integer.parseInt(txtParteEscrita.getText())) && 
                estaAprovadoOral(txtParteOral.getText())){
            txpAprovado.setText("APROVADO");
        }
        else {
            txpAprovado.setText("REPROVADO");
        }
    }//GEN-LAST:event_txtParteOralActionPerformed

    /**
     * Ao clicar no botão Salvar, armazena os campos preenchidos em avaliação,
     * salva essa avaliação no bando de dados e adiciona-a na lista.
     * @param evt Evento capturado
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNotaParteEscrita(Integer.parseInt(txtParteEscrita.getText()));
        avaliacao.setNotaParteOral(txtParteOral.getText());
        avaliacao.setComentario(txtComentario.getText());
        avaliacao.setIdDiscente(lstDiscentes.getSelectedValue().getId().intValue());
        avaliacao.setIdAula(lstAulas.getSelectedValue().getId().intValue());
                
        Long id = new AvaliacaoDao().salvar(avaliacao);
        
        avaliacao.setId(id);
        
        lstAvaliacaoModel.addElement(avaliacao);
        
        limparCampos();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * Verifica o indice da avaliação que foi clicada com o botão direito
     * e seleciona aquela avaliação na lista
     * @param evt Evento capturado
     */
    private void lstAvaliacoesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAvaliacoesMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3
                && lstAvaliacoes.getModel().getSize() > 0) {
            indiceAvaliacaoSelecionada = lstAvaliacoes.locationToIndex(evt.getPoint());
            lstAvaliacoes.setSelectedIndex(indiceAvaliacaoSelecionada);
            popUpMenu.show(lstAvaliacoes, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lstAvaliacoesMouseReleased

    /**
     * Resposta ao clique sobre a opção "Excluir" do menu de contexto.
     * @param evt Evento capturado 
     */
    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
        new AvaliacaoDao().excluir(lstAvaliacaoModel.get(indiceAvaliacaoSelecionada));

        // Exclui graficamente 
        lstAvaliacaoModel.remove(lstAvaliacoes.getSelectedIndex());
    }//GEN-LAST:event_mnuExcluirActionPerformed

    /**
     * Resposta ao clique sobre a opção "Editar" do menu de contexto.
     * @param evt Evento capturado 
     */
    private void mnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarActionPerformed
        EditarAvaliacao editarProva = new 
        EditarAvaliacao(lstAvaliacaoModel.get(indiceAvaliacaoSelecionada), this, true);
        
        editarProva.setLocationRelativeTo(this);
        editarProva.setVisible(true);
    }//GEN-LAST:event_mnuEditarActionPerformed

    /**
     * Restaura o estado inicial dos campos do formulário.
     */
    private void limparCampos() {
        txtParteEscrita.setText(null);
        txtParteOral.setText(null);
        txtComentario.setText(null);

        txtParteEscrita.requestFocus();
    }
    
    /**
     * Verifica se o discente que realizou determinada avaliação
     * foi reprovado ou aprovado na parte escrita
     * @param parteEscrita Nota referente a parte escrita
     * @return Se o aluno foi aprovado (true) ou reprovado (false)
     */
    private boolean estaAprovadoEscrita(int parteEscrita){
        if(parteEscrita >= 98 && parteEscrita <= 100){
                return true;
        }
        return false;
    }
    
    /**
     * Verifica se o discente que realizou determinada avaliação
     * foi reprovado ou aprovado na parte oral
     * @param parteOral Nota referente a parte oral
     * @return Se o aluno foi aprovado (true) ou reprovado (false)
     */
    private boolean estaAprovadoOral(String parteOral){
        return ("D".equals(parteOral) 
                || "YD".equals(parteOral)
                || "T".equals(parteOral));
    }
    
    /**
     * Permite a atualização de uma avaliação que foi editada em outra janela.
     * 
     * @param avaliacao Avaliação que será acrescentada na listagem de avaliações
     */
    void atualizarModelo(Avaliacao avaliacao) {
        lstAvaliacaoModel.set(indiceAvaliacaoSelecionada, avaliacao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblDetalhesProva;
    private javax.swing.JLabel lblListaAlunos;
    private javax.swing.JLabel lblListaAulas;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblObservacao1;
    private javax.swing.JLabel lblParteEscrita;
    private javax.swing.JLabel lblParteOral;
    private javax.swing.JLabel lblProvasAplicadas;
    private javax.swing.JList<br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula> lstAulas;
    private javax.swing.JList<Avaliacao> lstAvaliacoes;
    private javax.swing.JList<Discente> lstDiscentes;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JPanel pnlCadastroAvaliacao;
    private javax.swing.JPanel pnlDetalhesAvaliacao;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JPanel pnlPesquisaAluno;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JScrollPane scrAprovado;
    private javax.swing.JScrollPane scrComentario;
    private javax.swing.JScrollPane scrListaAulas;
    private javax.swing.JScrollPane scrListaAvaliacoes;
    private javax.swing.JScrollPane scrListaDiscentes;
    private javax.swing.JTextPane txpAprovado;
    private javax.swing.JTextPane txtComentario;
    private javax.swing.JTextField txtParteEscrita;
    private javax.swing.JTextField txtParteOral;
    // End of variables declaration//GEN-END:variables
}
