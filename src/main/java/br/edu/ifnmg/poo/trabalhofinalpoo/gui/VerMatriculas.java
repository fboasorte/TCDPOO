/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.MatriculaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Matricula;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fellipe
 */
public class VerMatriculas extends javax.swing.JDialog {

    /**
     * Modelo para manutenção da lista de matrículas a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Matricula> lstMatriculasModel;
    
    /**
     * Retém o índice da matrícula selecionada para referências de processamentos
     * entre vários métodos.
     */
    private int indiceMatriculaSelecionada;
    
    
    /**
     * Creates new form VerMatriculas
     */
    public VerMatriculas(TelaPrincipal tela, boolean modal) {
        super(tela, modal);
        
        lstMatriculasModel = new DefaultListModel<>();
        List<Matricula> matriculas = new MatriculaDao().localizarTodos();
        lstMatriculasModel.addAll(matriculas);
        
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
        jPanel1 = new javax.swing.JPanel();
        lblAlunosAvaliacao = new javax.swing.JLabel();
        scrListaMatriculas = new javax.swing.JScrollPane();
        lstMatriculas = new javax.swing.JList<>();
        lblDetalhesMatricula = new javax.swing.JLabel();
        pnlDetalhesMatricula = new javax.swing.JPanel();
        lblNotasMatricula = new javax.swing.JLabel();
        pnlNotasMatricula = new javax.swing.JPanel();
        lblParteEscrita = new javax.swing.JLabel();
        lblParteOral = new javax.swing.JLabel();
        lblComentarios1 = new javax.swing.JLabel();
        txtParteEscrita = new javax.swing.JTextField();
        txtParteOral = new javax.swing.JTextField();
        scrComentario = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        lblObservacao1 = new javax.swing.JLabel();
        lblObservacao2 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblAlunosAvaliacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAlunosAvaliacao.setForeground(new java.awt.Color(0, 0, 0));
        lblAlunosAvaliacao.setText("Marcações cadastradas");

        lstMatriculas.setBackground(new java.awt.Color(255, 255, 255));
        lstMatriculas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstMatriculas.setForeground(new java.awt.Color(0, 0, 0));
        lstMatriculas.setModel(lstMatriculasModel);
        lstMatriculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstMatriculasMouseReleased(evt);
            }
        });
        scrListaMatriculas.setViewportView(lstMatriculas);

        lblDetalhesMatricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDetalhesMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lblDetalhesMatricula.setText("Detalhes da marcação");

        pnlDetalhesMatricula.setBackground(new java.awt.Color(255, 255, 255));
        pnlDetalhesMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        pnlDetalhesMatricula.setForeground(new java.awt.Color(112, 112, 112));

        lblNotasMatricula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNotasMatricula.setForeground(new java.awt.Color(0, 0, 0));
        lblNotasMatricula.setText("Notas");

        pnlNotasMatricula.setBackground(new java.awt.Color(204, 204, 204));
        pnlNotasMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        lblParteEscrita.setForeground(new java.awt.Color(0, 0, 0));
        lblParteEscrita.setText("Parte escrita");

        lblParteOral.setForeground(new java.awt.Color(0, 0, 0));
        lblParteOral.setText("Parte oral");

        lblComentarios1.setForeground(new java.awt.Color(0, 0, 0));
        lblComentarios1.setText("Comentários");

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

        txtComentario.setBackground(new java.awt.Color(255, 255, 255));
        txtComentario.setForeground(new java.awt.Color(0, 0, 0));
        scrComentario.setViewportView(txtComentario);

        javax.swing.GroupLayout pnlNotasMatriculaLayout = new javax.swing.GroupLayout(pnlNotasMatricula);
        pnlNotasMatricula.setLayout(pnlNotasMatriculaLayout);
        pnlNotasMatriculaLayout.setHorizontalGroup(
            pnlNotasMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasMatriculaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlNotasMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComentarios1)
                    .addGroup(pnlNotasMatriculaLayout.createSequentialGroup()
                        .addComponent(lblParteEscrita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParteEscrita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblParteOral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParteOral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlNotasMatriculaLayout.setVerticalGroup(
            pnlNotasMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasMatriculaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlNotasMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParteEscrita)
                    .addComponent(txtParteEscrita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParteOral)
                    .addComponent(txtParteOral, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lblComentarios1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout pnlDetalhesMatriculaLayout = new javax.swing.GroupLayout(pnlDetalhesMatricula);
        pnlDetalhesMatricula.setLayout(pnlDetalhesMatriculaLayout);
        pnlDetalhesMatriculaLayout.setHorizontalGroup(
            pnlDetalhesMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesMatriculaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDetalhesMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNotasMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotasMatricula))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        pnlDetalhesMatriculaLayout.setVerticalGroup(
            pnlDetalhesMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesMatriculaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblNotasMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNotasMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblObservacao1.setForeground(new java.awt.Color(102, 102, 102));
        lblObservacao1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblObservacao1.setText("Para excluir ou editar, clique com o botão direito na seleção.");

        lblObservacao2.setForeground(new java.awt.Color(102, 102, 102));
        lblObservacao2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblObservacao2.setText("Para visualizar e modificar o Aluno e a Aula da marcação, selecione Editar.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlunosAvaliacao)
                            .addComponent(scrListaMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetalhesMatricula)
                            .addComponent(pnlDetalhesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblObservacao1)
                        .addGap(39, 39, 39)
                        .addComponent(lblObservacao2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetalhesMatricula)
                    .addComponent(lblAlunosAvaliacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDetalhesMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrListaMatriculas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObservacao1)
                    .addComponent(lblObservacao2))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtParteEscritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteEscritaActionPerformed

    }//GEN-LAST:event_txtParteEscritaActionPerformed

    private void txtParteOralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteOralActionPerformed

    }//GEN-LAST:event_txtParteOralActionPerformed

    private void lstMatriculasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMatriculasMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3
                && lstMatriculas.getModel().getSize() > 0) {
            indiceMatriculaSelecionada = lstMatriculas.locationToIndex(evt.getPoint());
            lstMatriculas.setSelectedIndex(indiceMatriculaSelecionada);
            popUpMenu.show(lstMatriculas, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lstMatriculasMouseReleased

    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
         new MatriculaDao().excluir(lstMatriculasModel.get(indiceMatriculaSelecionada));

        // Exclui graficamente 
        lstMatriculasModel.remove(lstMatriculas.getSelectedIndex());
    }//GEN-LAST:event_mnuExcluirActionPerformed

    private void mnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarActionPerformed
        EditarMatriculas editarMatricula = 
                new EditarMatriculas(lstMatriculas.getSelectedValue(), this, true);
        
        // this -> referencia a janela principal
        editarMatricula.setLocationRelativeTo(this);
        editarMatricula.setVisible(true);
    }//GEN-LAST:event_mnuEditarActionPerformed

    void atualizarModelo(Matricula matricula){
        lstMatriculasModel.set(indiceMatriculaSelecionada, matricula);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlunosAvaliacao;
    private javax.swing.JLabel lblComentarios1;
    private javax.swing.JLabel lblDetalhesMatricula;
    private javax.swing.JLabel lblNotasMatricula;
    private javax.swing.JLabel lblObservacao1;
    private javax.swing.JLabel lblObservacao2;
    private javax.swing.JLabel lblParteEscrita;
    private javax.swing.JLabel lblParteOral;
    private javax.swing.JList<Matricula> lstMatriculas;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JPanel pnlDetalhesMatricula;
    private javax.swing.JPanel pnlNotasMatricula;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JScrollPane scrComentario;
    private javax.swing.JScrollPane scrListaMatriculas;
    private javax.swing.JTextPane txtComentario;
    private javax.swing.JTextField txtParteEscrita;
    private javax.swing.JTextField txtParteOral;
    // End of variables declaration//GEN-END:variables
}
