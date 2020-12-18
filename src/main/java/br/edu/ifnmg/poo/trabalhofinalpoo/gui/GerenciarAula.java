/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.DiscenteDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AulaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Discente;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula;
import java.util.List;
import javax.swing.DefaultListModel;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Entidade;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe
 */
public class GerenciarAula extends javax.swing.JFrame {
    
    private DefaultListModel<Aula> lstAulasModel;
    private DefaultListModel<Discente> lstDiscentesModel;
    
    private int indiceAulaSelecionada;
    private int indiceDiscenteSelecionado;
    
    public GerenciarAula() {
        
        lstAulasModel = new DefaultListModel<>();
        lstDiscentesModel = new DefaultListModel<>();
        
        List<Aula> aulas = new AulaDao().localizarTodos();
        List<Discente> discentes = new DiscenteDao().localizarTodos();
        
        lstAulasModel.addAll(aulas);
        lstDiscentesModel.addAll(discentes);
        
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

        pnlMarcacaoAula = new javax.swing.JPanel();
        lblSelecionarAluno = new javax.swing.JLabel();
        lblAulasDisponiveis = new javax.swing.JLabel();
        btnMarcarAula = new javax.swing.JButton();
        pnlDetalhesAula = new javax.swing.JPanel();
        pnlAulaDetalhes = new javax.swing.JPanel();
        lblNomeAula = new javax.swing.JLabel();
        lblConteudoAula = new javax.swing.JLabel();
        lblProfessorAula = new javax.swing.JLabel();
        lblDataHoraAula = new javax.swing.JLabel();
        txtNomeAula = new javax.swing.JTextField();
        txtConteudoAula = new javax.swing.JTextField();
        txtProfessorAula = new javax.swing.JTextField();
        txtDataAula = new javax.swing.JTextField();
        txtHoraAula = new javax.swing.JTextField();
        lblDetalhesAulaMarcacao = new javax.swing.JLabel();
        scrListaAulas = new javax.swing.JScrollPane();
        lstAulas = new javax.swing.JList<>();
        scrListaDiscentes = new javax.swing.JScrollPane();
        lstDiscentes = new javax.swing.JList<>();
        btnNovoAula = new javax.swing.JButton();
        btnEditarAula = new javax.swing.JButton();
        btnExcluirAula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlMarcacaoAula.setBackground(new java.awt.Color(255, 255, 255));

        lblSelecionarAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSelecionarAluno.setForeground(new java.awt.Color(0, 0, 0));
        lblSelecionarAluno.setText("Selecionar aluno");

        lblAulasDisponiveis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAulasDisponiveis.setForeground(new java.awt.Color(0, 0, 0));
        lblAulasDisponiveis.setText("Aulas disponíveis");

        btnMarcarAula.setBackground(new java.awt.Color(255, 255, 255));
        btnMarcarAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMarcarAula.setForeground(new java.awt.Color(0, 0, 0));
        btnMarcarAula.setText("Marcar");
        btnMarcarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarAulaActionPerformed(evt);
            }
        });

        pnlDetalhesAula.setBackground(new java.awt.Color(252, 252, 252));

        pnlAulaDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        pnlAulaDetalhes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        pnlAulaDetalhes.setForeground(new java.awt.Color(112, 112, 112));

        lblNomeAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeAula.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeAula.setText("Aula");

        lblConteudoAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConteudoAula.setForeground(new java.awt.Color(0, 0, 0));
        lblConteudoAula.setText("Conteúdo");

        lblProfessorAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProfessorAula.setForeground(new java.awt.Color(0, 0, 0));
        lblProfessorAula.setText("Professor");

        lblDataHoraAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataHoraAula.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHoraAula.setText("Data/Hora");

        txtNomeAula.setBackground(new java.awt.Color(204, 204, 204));
        txtNomeAula.setForeground(new java.awt.Color(0, 0, 0));

        txtConteudoAula.setBackground(new java.awt.Color(204, 204, 204));
        txtConteudoAula.setForeground(new java.awt.Color(0, 0, 0));

        txtProfessorAula.setBackground(new java.awt.Color(204, 204, 204));
        txtProfessorAula.setForeground(new java.awt.Color(0, 0, 0));

        txtDataAula.setBackground(new java.awt.Color(204, 204, 204));
        txtDataAula.setForeground(new java.awt.Color(0, 0, 0));

        txtHoraAula.setBackground(new java.awt.Color(204, 204, 204));
        txtHoraAula.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlAulaDetalhesLayout = new javax.swing.GroupLayout(pnlAulaDetalhes);
        pnlAulaDetalhes.setLayout(pnlAulaDetalhesLayout);
        pnlAulaDetalhesLayout.setHorizontalGroup(
            pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAulaDetalhesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeAula)
                    .addComponent(lblConteudoAula)
                    .addComponent(lblProfessorAula)
                    .addComponent(lblDataHoraAula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProfessorAula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConteudoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAulaDetalhesLayout.createSequentialGroup()
                        .addComponent(txtDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraAula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlAulaDetalhesLayout.setVerticalGroup(
            pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAulaDetalhesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAula)
                    .addComponent(txtNomeAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConteudoAula)
                    .addComponent(txtConteudoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorAula)
                    .addComponent(txtProfessorAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlAulaDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataHoraAula)
                    .addComponent(txtDataAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        txtDataAula.getAccessibleContext().setAccessibleName("");

        lblDetalhesAulaMarcacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDetalhesAulaMarcacao.setForeground(new java.awt.Color(0, 0, 0));
        lblDetalhesAulaMarcacao.setText("Detalhes da aula");

        javax.swing.GroupLayout pnlDetalhesAulaLayout = new javax.swing.GroupLayout(pnlDetalhesAula);
        pnlDetalhesAula.setLayout(pnlDetalhesAulaLayout);
        pnlDetalhesAulaLayout.setHorizontalGroup(
            pnlDetalhesAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetalhesAulaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(pnlDetalhesAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetalhesAulaMarcacao)
                    .addComponent(pnlAulaDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        pnlDetalhesAulaLayout.setVerticalGroup(
            pnlDetalhesAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesAulaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblDetalhesAulaMarcacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAulaDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lstAulas.setBackground(new java.awt.Color(255, 255, 255));
        lstAulas.setForeground(new java.awt.Color(0, 0, 0));
        lstAulas.setModel(lstAulasModel);
        lstAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAulasMouseClicked(evt);
            }
        });
        scrListaAulas.setViewportView(lstAulas);

        lstDiscentes.setBackground(new java.awt.Color(255, 255, 255));
        lstDiscentes.setForeground(new java.awt.Color(0, 0, 0));
        lstDiscentes.setModel(lstDiscentesModel);
        scrListaDiscentes.setViewportView(lstDiscentes);

        btnNovoAula.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovoAula.setForeground(new java.awt.Color(0, 0, 0));
        btnNovoAula.setText("Novo");
        btnNovoAula.setToolTipText("");
        btnNovoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAulaActionPerformed(evt);
            }
        });

        btnEditarAula.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarAula.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarAula.setText("Editar");
        btnEditarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAulaActionPerformed(evt);
            }
        });

        btnExcluirAula.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluirAula.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirAula.setText("Excluir");
        btnExcluirAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMarcacaoAulaLayout = new javax.swing.GroupLayout(pnlMarcacaoAula);
        pnlMarcacaoAula.setLayout(pnlMarcacaoAulaLayout);
        pnlMarcacaoAulaLayout.setHorizontalGroup(
            pnlMarcacaoAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcacaoAulaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlMarcacaoAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMarcacaoAulaLayout.createSequentialGroup()
                        .addComponent(btnNovoAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(btnMarcarAula))
                    .addGroup(pnlMarcacaoAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSelecionarAluno)
                        .addComponent(lblAulasDisponiveis)
                        .addComponent(scrListaAulas, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .addComponent(scrListaDiscentes)))
                .addGap(25, 25, 25)
                .addComponent(pnlDetalhesAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMarcacaoAulaLayout.setVerticalGroup(
            pnlMarcacaoAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcacaoAulaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblSelecionarAluno)
                .addGap(3, 3, 3)
                .addComponent(scrListaDiscentes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblAulasDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrListaAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(pnlMarcacaoAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMarcarAula)
                    .addComponent(btnExcluirAula)
                    .addComponent(btnEditarAula)
                    .addComponent(btnNovoAula))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(pnlDetalhesAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlMarcacaoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMarcacaoAula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAulaActionPerformed
        
        if(lstAulas.getModel().getSize() > 0) {
            indiceAulaSelecionada = lstAulas.getSelectedIndex();
            EditarAula editarAula;
            editarAula = new EditarAula(lstAulasModel.get(indiceAulaSelecionada),
                    this, true);
            
            editarAula.setLocationRelativeTo(this);
            editarAula.setVisible(true);
        }
    }//GEN-LAST:event_btnEditarAulaActionPerformed

    private void btnExcluirAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAulaActionPerformed
        
        if(lstAulas.getModel().getSize() > 0) {
            
            // JOptionPane de confirmação de exclusão
            Object[] opcoes = {"Sim", "Não"};
            Object opcaoPadrao = opcoes[0];
            var input = JOptionPane.showOptionDialog(null, "Você tem certeza "
                    + "que deseja excluir esta aula?", "Excluir aula",  
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                    null, opcoes, opcaoPadrao);
            
            // Exclui se o usuário respondeu sim 
            if(input == JOptionPane.YES_OPTION) {
                indiceAulaSelecionada = lstAulas.getSelectedIndex();
                new AulaDao().excluir(lstAulasModel.get(indiceAulaSelecionada));
                lstAulasModel.remove(lstAulas.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_btnExcluirAulaActionPerformed

    private void lstAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAulasMouseClicked
        
        indiceAulaSelecionada = lstAulas.getSelectedIndex();
        
        txtNomeAula.setText(lstAulasModel.get(indiceAulaSelecionada).getNome());
        txtConteudoAula.setText(lstAulasModel.get(indiceAulaSelecionada).getConteudo());
        txtProfessorAula.setText(String.valueOf(lstAulasModel.get(indiceAulaSelecionada).getIdProfessor()));
        txtDataAula.setText(lstAulasModel.get(indiceAulaSelecionada).getData());
        txtHoraAula.setText(lstAulasModel.get(indiceAulaSelecionada).getHora());
    }//GEN-LAST:event_lstAulasMouseClicked

    private void btnNovoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAulaActionPerformed
        NovoAula novoAula = new NovoAula(this, true);
        
        novoAula.setLocationRelativeTo(this);
        novoAula.setVisible(true);
        
    }//GEN-LAST:event_btnNovoAulaActionPerformed

    private void btnMarcarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarAulaActionPerformed
        if(lstDiscentes.getModel().getSize() > 0) {
            if(lstAulas.getModel().getSize() > 0) {
                indiceDiscenteSelecionado = lstDiscentes.getSelectedIndex();
                indiceAulaSelecionada = lstAulas.getSelectedIndex();

                // Verifica se foram selecionados nas listas
                if(indiceDiscenteSelecionado >= 0) {
                    if(indiceAulaSelecionada >= 0) {
                        LancarNota lancarNota;
                        lancarNota = new LancarNota(
                                lstDiscentesModel.get(indiceDiscenteSelecionado).
                                        getId().intValue(),
                                lstAulasModel.get(indiceAulaSelecionada).
                                        getId().intValue(),
                                this, true);
                        
                        lancarNota.setLocationRelativeTo(this);
                        lancarNota.setVisible(true);                     
                    }
                    else {
                        // Mensagem de erro caso aula não selecionada
                        JOptionPane.showConfirmDialog(null,
                                "Selecione uma aula!", 
                                "Aula não selecionada", 
                                JOptionPane.DEFAULT_OPTION);
                    }
                }
                else {
                    // Mensagem de erro caso aluno não selecionado
                    JOptionPane.showConfirmDialog(null,
                            "Selecione um aluno!", 
                            "Aluno não selecionada", 
                            JOptionPane.DEFAULT_OPTION);
                } 
            }   
        }
    }//GEN-LAST:event_btnMarcarAulaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarAula().setVisible(true);
            }
        });
    }
    
    void AtualizarModelo(Aula aula) {
        lstAulasModel.set(indiceAulaSelecionada, aula);
    }
    
    void NovoModelo(Aula aula) {
        lstAulasModel.addElement(aula);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarAula;
    private javax.swing.JButton btnExcluirAula;
    private javax.swing.JButton btnMarcarAula;
    private javax.swing.JButton btnNovoAula;
    private javax.swing.JLabel lblAulasDisponiveis;
    private javax.swing.JLabel lblConteudoAula;
    private javax.swing.JLabel lblDataHoraAula;
    private javax.swing.JLabel lblDetalhesAulaMarcacao;
    private javax.swing.JLabel lblNomeAula;
    private javax.swing.JLabel lblProfessorAula;
    private javax.swing.JLabel lblSelecionarAluno;
    private javax.swing.JList<Aula> lstAulas;
    private javax.swing.JList<Discente> lstDiscentes;
    private javax.swing.JPanel pnlAulaDetalhes;
    private javax.swing.JPanel pnlDetalhesAula;
    private javax.swing.JPanel pnlMarcacaoAula;
    private javax.swing.JScrollPane scrListaAulas;
    private javax.swing.JScrollPane scrListaDiscentes;
    private javax.swing.JTextField txtConteudoAula;
    private javax.swing.JTextField txtDataAula;
    private javax.swing.JTextField txtHoraAula;
    private javax.swing.JTextField txtNomeAula;
    private javax.swing.JTextField txtProfessorAula;
    // End of variables declaration//GEN-END:variables
}
