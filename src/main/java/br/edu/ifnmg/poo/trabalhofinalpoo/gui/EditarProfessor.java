/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.ProfessorDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Professor;

/**
 *
 * @author devin
 */
public class EditarProfessor extends javax.swing.JDialog {

    private final CadastrarProfessor cadastroProfessor;
    
    private Professor professorEmEdicao;
    
    public EditarProfessor(Professor professor,
        CadastrarProfessor cadastroProfessor, boolean modal) {
        super(cadastroProfessor, modal);
        initComponents();
        
        this.cadastroProfessor = cadastroProfessor;
        this.professorEmEdicao = professor;
        
        preencherProfessor(professor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDadosProfessor = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        lblContrato = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        chkAtivo = new javax.swing.JCheckBox();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        btnSalvarDados = new javax.swing.JButton();
        btnCancelarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDadosProfessor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosProfessor.setForeground(new java.awt.Color(0, 0, 0));
        lblDadosProfessor.setText("Dados do professor");

        pnlDados.setBackground(new java.awt.Color(255, 255, 255));
        pnlDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        lblContrato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContrato.setForeground(new java.awt.Color(0, 0, 0));
        lblContrato.setText("Código");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome");

        lblCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF");

        lblNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNascimento.setForeground(new java.awt.Color(0, 0, 0));
        lblNascimento.setText("Data de nasc.");

        chkAtivo.setBackground(new java.awt.Color(255, 255, 255));
        chkAtivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkAtivo.setForeground(new java.awt.Color(0, 0, 0));
        chkAtivo.setText("Ativo");
        chkAtivo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkAtivo.setMargin(new java.awt.Insets(2, 2, 2, 4));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        txtCPF.setBackground(new java.awt.Color(255, 255, 255));
        txtCPF.setForeground(new java.awt.Color(0, 0, 0));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtDataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNascimento.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCPF)
                    .addComponent(lblContrato))
                .addGap(50, 50, 50)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkAtivo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrato)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNascimento)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAtivo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnSalvarDados.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarDados.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarDados.setText("Salvar");
        btnSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosActionPerformed(evt);
            }
        });

        btnCancelarDados.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarDados.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarDados.setText("Cancelar");
        btnCancelarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosProfessor)
                    .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblDadosProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarDados)
                    .addComponent(btnSalvarDados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosActionPerformed
        professorEmEdicao.setCpf(Integer.parseInt(txtCPF.getText()));
        professorEmEdicao.setNome(txtNome.getText());
        professorEmEdicao.setNascimento(txtDataNascimento.getText());
        
        new ProfessorDao().salvar(professorEmEdicao);
        cadastroProfessor.atualizarModelo(professorEmEdicao);
        dispose();
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    private void btnCancelarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDadosActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarDadosActionPerformed

    public void preencherProfessor(Professor professor){
        txtCPF.setText(Integer.toString(professor.getCpf()));
        txtNome.setText(professor.getNome());
        txtDataNascimento.setText(professor.getNascimento());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarDados;
    private javax.swing.JButton btnSalvarDados;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblDadosProfessor;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}