/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.ProfessorDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Professor;

/**
 * Dialogo modal para a edição de professor
 * 
 * @author devin
 */
public class EditarProfessor extends javax.swing.JDialog {

    /**
     * Referência à janela de cadastro que invocou esta janela de edição.
     */
    private final CadastrarProfessor cadastroProfessor;
    
    /**
     * Tarefa recebida para edicao.
     */
    private Professor professorEmEdicao;
    
    /**
     * Cria um novo formulario para edicao de professor
     * 
     * @param professor a ser editado
     * @param cadastroProfessor janela de cadastrar professor
     * @param modal booleano se a tela é modal ou nao
     */
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

        pnlEditarProfessor = new javax.swing.JPanel();
        lblDadosProfessor = new javax.swing.JLabel();
        pnlDadosEditar = new javax.swing.JPanel();
        lblContratoEditar = new javax.swing.JLabel();
        lblNomeEditar = new javax.swing.JLabel();
        lblCPFEditar = new javax.swing.JLabel();
        lblNascimentoEditar = new javax.swing.JLabel();
        chkAtivoEditar = new javax.swing.JCheckBox();
        txtCodigoEditar = new javax.swing.JTextField();
        txtNomeEditar = new javax.swing.JTextField();
        txtCPFEditar = new javax.swing.JTextField();
        txtNascimentoEditar = new javax.swing.JTextField();
        btnSalvarEditar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlEditarProfessor.setBackground(new java.awt.Color(255, 255, 255));

        lblDadosProfessor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosProfessor.setForeground(new java.awt.Color(0, 0, 0));
        lblDadosProfessor.setText("Dados do professor");

        pnlDadosEditar.setBackground(new java.awt.Color(255, 255, 255));
        pnlDadosEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        lblContratoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContratoEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblContratoEditar.setText("Código");

        lblNomeEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeEditar.setText("Nome");

        lblCPFEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCPFEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblCPFEditar.setText("CPF");

        lblNascimentoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNascimentoEditar.setForeground(new java.awt.Color(0, 0, 0));
        lblNascimentoEditar.setText("Data de nasc.");

        chkAtivoEditar.setBackground(new java.awt.Color(255, 255, 255));
        chkAtivoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkAtivoEditar.setForeground(new java.awt.Color(0, 0, 0));
        chkAtivoEditar.setText("Ativo");
        chkAtivoEditar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkAtivoEditar.setMargin(new java.awt.Insets(2, 2, 2, 4));

        txtCodigoEditar.setEditable(false);
        txtCodigoEditar.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoEditar.setForeground(new java.awt.Color(0, 0, 0));

        txtNomeEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeEditar.setForeground(new java.awt.Color(0, 0, 0));

        txtCPFEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtCPFEditar.setForeground(new java.awt.Color(0, 0, 0));
        txtCPFEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFEditarActionPerformed(evt);
            }
        });

        txtNascimentoEditar.setBackground(new java.awt.Color(255, 255, 255));
        txtNascimentoEditar.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlDadosEditarLayout = new javax.swing.GroupLayout(pnlDadosEditar);
        pnlDadosEditar.setLayout(pnlDadosEditarLayout);
        pnlDadosEditarLayout.setHorizontalGroup(
            pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEditarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeEditar)
                    .addComponent(lblCPFEditar)
                    .addComponent(lblContratoEditar))
                .addGap(50, 50, 50)
                .addGroup(pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosEditarLayout.createSequentialGroup()
                        .addComponent(txtCPFEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNascimentoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNascimentoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkAtivoEditar)
                    .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlDadosEditarLayout.setVerticalGroup(
            pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosEditarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContratoEditar)
                    .addComponent(txtCodigoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEditar)
                    .addComponent(txtNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPFEditar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPFEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNascimentoEditar)
                        .addComponent(txtNascimentoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAtivoEditar)
                .addContainerGap(20, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pnlEditarProfessorLayout = new javax.swing.GroupLayout(pnlEditarProfessor);
        pnlEditarProfessor.setLayout(pnlEditarProfessorLayout);
        pnlEditarProfessorLayout.setHorizontalGroup(
            pnlEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarProfessorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosProfessor)
                    .addComponent(pnlDadosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEditarProfessorLayout.createSequentialGroup()
                        .addComponent(btnSalvarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlEditarProfessorLayout.setVerticalGroup(
            pnlEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarProfessorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDadosProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEditarProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarEditar)
                    .addComponent(btnSalvarEditar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditarProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditarProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFEditarActionPerformed

    /**
     * Resposta ao clique no botão "Salvar".
     * 
     * @param evt Evento capturado
     */
    private void btnSalvarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditarActionPerformed
        // Recupera descrição fornecida e atualiza o objeto recebido
        professorEmEdicao.setCpf(Integer.parseInt(txtCPFEditar.getText()));
        professorEmEdicao.setNome(txtNomeEditar.getText());
        professorEmEdicao.setNascimento(txtNascimentoEditar.getText());
        
        // Salva o objeto atualizado no banco de dados.
        // A "id" possui valor (o original)  e isso acarreta 
        // a invocação da operação de atualização do método "salvar"
        new ProfessorDao().salvar(professorEmEdicao);
        
        // Atualiza a tarefa que foi editada na janela "CadastroTarefa"
        cadastroProfessor.atualizarModelo(professorEmEdicao);
        
        // Fecha a janela corrente
        dispose();
    }//GEN-LAST:event_btnSalvarEditarActionPerformed

    /**
     * Resposta ao clique no botão "Cancelar"
     * 
     * @param evt evento capturado
     */
    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        // Fecha a janela corrente sem efetivar nenhuma operacao
        dispose();
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    /**
     * Extrai dados do professor recebido e popula os componentes da janela
     * com seus respectivos valores.
     * 
     * @param professor Objeto "Professor" recebido
     */
    public void preencherProfessor(Professor professor){
        txtCPFEditar.setText(Integer.toString(professor.getCpf()));
        txtNomeEditar.setText(professor.getNome());
        txtNascimentoEditar.setText(professor.getNascimento());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnSalvarEditar;
    private javax.swing.JCheckBox chkAtivoEditar;
    private javax.swing.JLabel lblCPFEditar;
    private javax.swing.JLabel lblContratoEditar;
    private javax.swing.JLabel lblDadosProfessor;
    private javax.swing.JLabel lblNascimentoEditar;
    private javax.swing.JLabel lblNomeEditar;
    private javax.swing.JPanel pnlDadosEditar;
    private javax.swing.JPanel pnlEditarProfessor;
    private javax.swing.JTextField txtCPFEditar;
    private javax.swing.JTextField txtCodigoEditar;
    private javax.swing.JTextField txtNascimentoEditar;
    private javax.swing.JTextField txtNomeEditar;
    // End of variables declaration//GEN-END:variables
}
