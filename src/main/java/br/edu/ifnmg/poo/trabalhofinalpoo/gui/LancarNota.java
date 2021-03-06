/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.MatriculaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Matricula;
import javax.swing.JOptionPane;

/**
 * Classe para representar a tela de lançar notas ao fazer a matrícula em uma
 * aula num sistema escolar. 
 * 
 * @author Mateus Felipe Mendes <mfdjm at aluno dot ifnmg dot edu dot br>
 * @author Felipe Rocha Boa-Sorte <frb at aluno dot ifnmg dot edu dot br>
 * @author André Vinicius Mendes Barros <avmb at aluno dot ifnmg dot edu dot br>
 * @version 0.1.0, 18/12/2020
 */
public class LancarNota extends javax.swing.JDialog {
    
    private GerenciarAula gerenciarAula;
    private Matricula matricula;
    private int idDiscente;
    private int idAula;

    /**
     * Construtor padrão de LancarNota.
     */
    public LancarNota(int idDiscente, int idAula, GerenciarAula gerenciarAula, 
            boolean modal) {
        super(gerenciarAula, modal);
        initComponents();
        
        this.gerenciarAula = gerenciarAula;
        this.matricula = new Matricula();
        
        this.idDiscente = idDiscente;
        this.idAula = idAula;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNota = new javax.swing.JPanel();
        btnSalvarNota = new javax.swing.JButton();
        btnCancelarNota = new javax.swing.JButton();
        lblNota = new javax.swing.JLabel();
        pnlDadosNota = new javax.swing.JPanel();
        lblComentariosNota = new javax.swing.JLabel();
        lblParteEscritaNota = new javax.swing.JLabel();
        lblParteOralNota = new javax.swing.JLabel();
        txtParteEscritaNota = new javax.swing.JTextField();
        txtParteOralNota = new javax.swing.JTextField();
        scrComentariosNota = new javax.swing.JScrollPane();
        txtComentariosNota = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marcar aula");

        pnlNota.setBackground(new java.awt.Color(255, 255, 255));
        pnlNota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        btnSalvarNota.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarNota.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarNota.setText("Salvar");
        btnSalvarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNotaActionPerformed(evt);
            }
        });

        btnCancelarNota.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarNota.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarNota.setText("Cancelar");
        btnCancelarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNotaActionPerformed(evt);
            }
        });

        lblNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNota.setForeground(new java.awt.Color(0, 0, 0));
        lblNota.setText("Notas");

        pnlDadosNota.setBackground(new java.awt.Color(255, 255, 255));
        pnlDadosNota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        lblComentariosNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblComentariosNota.setForeground(new java.awt.Color(0, 0, 0));
        lblComentariosNota.setText("Comentários");

        lblParteEscritaNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParteEscritaNota.setForeground(new java.awt.Color(0, 0, 0));
        lblParteEscritaNota.setText("Parte escrita");

        lblParteOralNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblParteOralNota.setForeground(new java.awt.Color(0, 0, 0));
        lblParteOralNota.setText("Parte oral");

        txtParteEscritaNota.setBackground(new java.awt.Color(255, 255, 255));
        txtParteEscritaNota.setForeground(new java.awt.Color(0, 0, 0));

        txtParteOralNota.setBackground(new java.awt.Color(255, 255, 255));
        txtParteOralNota.setForeground(new java.awt.Color(0, 0, 0));

        txtComentariosNota.setBackground(new java.awt.Color(255, 255, 255));
        txtComentariosNota.setForeground(new java.awt.Color(0, 0, 0));
        scrComentariosNota.setViewportView(txtComentariosNota);

        javax.swing.GroupLayout pnlDadosNotaLayout = new javax.swing.GroupLayout(pnlDadosNota);
        pnlDadosNota.setLayout(pnlDadosNotaLayout);
        pnlDadosNotaLayout.setHorizontalGroup(
            pnlDadosNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosNotaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDadosNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosNotaLayout.createSequentialGroup()
                        .addComponent(lblParteEscritaNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParteEscritaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblParteOralNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParteOralNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblComentariosNota)
                    .addComponent(scrComentariosNota, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlDadosNotaLayout.setVerticalGroup(
            pnlDadosNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosNotaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlDadosNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParteEscritaNota)
                    .addComponent(lblParteOralNota)
                    .addComponent(txtParteEscritaNota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParteOralNota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComentariosNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrComentariosNota, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNotaLayout = new javax.swing.GroupLayout(pnlNota);
        pnlNota.setLayout(pnlNotaLayout);
        pnlNotaLayout.setHorizontalGroup(
            pnlNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota)
                    .addGroup(pnlNotaLayout.createSequentialGroup()
                        .addComponent(btnSalvarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDadosNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlNotaLayout.setVerticalGroup(
            pnlNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarNota)
                    .addComponent(btnCancelarNota))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao clicar no botão Salvar, armazena os campos preenchidos na tela 
     * referente a Matrícula, salva essa avaliação no banco de dados e a 
     * adiciona na lista presente em VerMatriculas.
     * @param evt Evento capturado.
     */
    private void btnSalvarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNotaActionPerformed
        
        matricula.setNotaParteEscrita(Integer.parseInt(txtParteEscritaNota.getText()));
        matricula.setNotaParteOral(txtParteOralNota.getText());
        matricula.setComentario(txtComentariosNota.getText());
        matricula.setIdDiscente(idDiscente);
        matricula.setIdAula(idAula);
        
        // Executa o salvamento do estado do objeto no banco de dados
        Long id = new MatriculaDao().salvar(matricula);
        
        // Importante! Se o objeto criado não for atrelado a seu id no banco
        // de dados, o objeto fica desconexo e as futuras alterações de seu
        // estado gerarão um novo registro
        matricula.setId(id);
                
        dispose();
        
        // Exibe uma caixa de diálogo confirmando a marcação.        
        JOptionPane.showConfirmDialog(null,"Marcação concluída", "Marcar aula",
                JOptionPane.DEFAULT_OPTION);
        
    }//GEN-LAST:event_btnSalvarNotaActionPerformed

    /**
     * Ao clicar no botão Cancelar, fecha a tela atual. 
     * @param evt Evento capturado
     */
    private void btnCancelarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNotaActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarNotaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarNota;
    private javax.swing.JButton btnSalvarNota;
    private javax.swing.JLabel lblComentariosNota;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblParteEscritaNota;
    private javax.swing.JLabel lblParteOralNota;
    private javax.swing.JPanel pnlDadosNota;
    private javax.swing.JPanel pnlNota;
    private javax.swing.JScrollPane scrComentariosNota;
    private javax.swing.JTextPane txtComentariosNota;
    private javax.swing.JTextField txtParteEscritaNota;
    private javax.swing.JTextField txtParteOralNota;
    // End of variables declaration//GEN-END:variables
}
