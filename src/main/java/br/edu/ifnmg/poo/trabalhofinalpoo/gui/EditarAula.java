/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AulaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula;

/**
 *
 * @author Fellipe
 */
public class EditarAula extends javax.swing.JDialog {
    
    private GerenciarAula gerenciarAula;
    private Aula aulaEmEdicao;

    /**
     * Creates new form EditarAula
     */
    public EditarAula(Aula aula, GerenciarAula gerenciarAula, boolean modal) {
        super(gerenciarAula, modal);
        initComponents();
        
        this.gerenciarAula = gerenciarAula;
        this.aulaEmEdicao = aula;
        
        preencherAula(aula);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEditar = new javax.swing.JPanel();
        pnlEditarDetalhes = new javax.swing.JPanel();
        lblAulaEditar = new javax.swing.JLabel();
        lblConteudoEditar = new javax.swing.JLabel();
        lblProfessorEditar = new javax.swing.JLabel();
        lblDataHoraEditar = new javax.swing.JLabel();
        txtAulaEditar = new javax.swing.JTextField();
        scrConteudoEditar = new javax.swing.JScrollPane();
        txtConteudoEditar = new javax.swing.JTextPane();
        txtProfessorEditar = new javax.swing.JTextField();
        txtDataEditar = new javax.swing.JTextField();
        txtHoraEditar = new javax.swing.JTextField();
        btnSalvarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlEditar.setBackground(new java.awt.Color(255, 255, 255));

        pnlEditarDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        pnlEditarDetalhes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        pnlEditarDetalhes.setForeground(new java.awt.Color(112, 112, 112));

        lblAulaEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAulaEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblAulaEditar.setText("Aula");

        lblConteudoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConteudoEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblConteudoEditar.setText("Conteúdo");

        lblProfessorEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProfessorEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblProfessorEditar.setText("Professor");

        lblDataHoraEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataHoraEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHoraEditar.setText("Data/Hora");

        txtAulaEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtAulaEditar.setForeground(new java.awt.Color(0, 0, 0));

        txtConteudoEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtConteudoEditar.setForeground(new java.awt.Color(0, 0, 0));
        scrConteudoEditar.setViewportView(txtConteudoEditar);

        txtProfessorEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtProfessorEditar.setForeground(new java.awt.Color(0, 0, 0));

        txtDataEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtDataEditar.setForeground(new java.awt.Color(0, 0, 0));

        txtHoraEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraEditar.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlEditarDetalhesLayout = new javax.swing.GroupLayout(pnlEditarDetalhes);
        pnlEditarDetalhes.setLayout(pnlEditarDetalhesLayout);
        pnlEditarDetalhesLayout.setHorizontalGroup(
            pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarDetalhesLayout.createSequentialGroup()
                .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarDetalhesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProfessorEditar)
                            .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblConteudoEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblDataHoraEditar, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18))
                    .addGroup(pnlEditarDetalhesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAulaEditar)
                        .addGap(55, 55, 55)))
                .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProfessorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAulaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditarDetalhesLayout.createSequentialGroup()
                        .addComponent(txtDataEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrConteudoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlEditarDetalhesLayout.setVerticalGroup(
            pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarDetalhesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAulaEditar)
                    .addComponent(txtAulaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarDetalhesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblConteudoEditar))
                    .addGroup(pnlEditarDetalhesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrConteudoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfessorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfessorEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(pnlEditarDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataHoraEditar))
                .addGap(20, 20, 20))
        );

        btnSalvarEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarEditar.setText("Salvar");
        btnSalvarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEditarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEditarLayout = new javax.swing.GroupLayout(pnlEditar);
        pnlEditar.setLayout(pnlEditarLayout);
        pnlEditarLayout.setHorizontalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarLayout.createSequentialGroup()
                        .addComponent(btnSalvarEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarEditar))
                    .addComponent(pnlEditarDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlEditarLayout.setVerticalGroup(
            pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnlEditarDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarEditar)
                    .addComponent(btnSalvarEditar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditarActionPerformed
        aulaEmEdicao.setNome(txtAulaEditar.getText());
        aulaEmEdicao.setConteudo(txtConteudoEditar.getText());
        aulaEmEdicao.setIdProfessor(Integer.parseInt(txtProfessorEditar.getText()));
        aulaEmEdicao.setData(txtDataEditar.getText());
        aulaEmEdicao.setHora(txtHoraEditar.getText());
        
        new AulaDao().salvar(aulaEmEdicao);
        
        gerenciarAula.AtualizarModelo(aulaEmEdicao);
        
        dispose();
    }//GEN-LAST:event_btnSalvarEditarActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
       
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void preencherAula(Aula aula) {
        txtAulaEditar.setText(aula.getNome());
        txtConteudoEditar.setText(aula.getConteudo());
        txtProfessorEditar.setText(String.valueOf(aula.getIdProfessor()));
        txtDataEditar.setText(aula.getData());
        txtHoraEditar.setText(aula.getHora());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnSalvarEditar;
    private javax.swing.JLabel lblAulaEditar;
    private javax.swing.JLabel lblConteudoEditar;
    private javax.swing.JLabel lblDataHoraEditar;
    private javax.swing.JLabel lblProfessorEditar;
    private javax.swing.JPanel pnlEditar;
    private javax.swing.JPanel pnlEditarDetalhes;
    private javax.swing.JScrollPane scrConteudoEditar;
    private javax.swing.JTextField txtAulaEditar;
    private javax.swing.JTextPane txtConteudoEditar;
    private javax.swing.JTextField txtDataEditar;
    private javax.swing.JTextField txtHoraEditar;
    private javax.swing.JTextField txtProfessorEditar;
    // End of variables declaration//GEN-END:variables
}
