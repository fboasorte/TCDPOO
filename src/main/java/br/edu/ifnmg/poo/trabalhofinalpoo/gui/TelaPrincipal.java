/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

/**
 * Classe para representar uma tela principal que dá acesso a todas as outras 
 * telas no sistema.
 * 
 * @author Mateus Felipe Mendes <mfdjm at aluno dot ifnmg dot edu dot br>
 * @author Felipe Rocha Boa-Sorte <frb at aluno dot ifnmg dot edu dot br>
 * @author André Vinicius Mendes Barros <avmb at aluno dot ifnmg dot edu dot br>
 * @version 0.1.0, 18/12/2020
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Construtor padrão de TelaPrincipal
     */
    public TelaPrincipal() {
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

        jLabel3 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblTituloMenu = new javax.swing.JLabel();
        btnAulas = new javax.swing.JButton();
        btnMatriculas = new javax.swing.JButton();
        btnProvas = new javax.swing.JButton();
        btnAlunos = new javax.swing.JButton();
        btnProfessores = new javax.swing.JButton();
        SeparatorMenu = new javax.swing.JSeparator();
        lblRodape = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloMenu.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblTituloMenu.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloMenu.setText("MENU");

        btnAulas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnAulas.setForeground(new java.awt.Color(51, 51, 51));
        btnAulas.setText("Aulas");
        btnAulas.setBorder(null);
        btnAulas.setBorderPainted(false);
        btnAulas.setContentAreaFilled(false);
        btnAulas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAulas.setIconTextGap(13);
        btnAulas.setSelected(true);
        btnAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAulasActionPerformed(evt);
            }
        });

        btnMatriculas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnMatriculas.setForeground(new java.awt.Color(51, 51, 51));
        btnMatriculas.setText("Matrículas");
        btnMatriculas.setBorder(null);
        btnMatriculas.setBorderPainted(false);
        btnMatriculas.setContentAreaFilled(false);
        btnMatriculas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMatriculas.setIconTextGap(13);
        btnMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculasActionPerformed(evt);
            }
        });

        btnProvas.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnProvas.setForeground(new java.awt.Color(51, 51, 51));
        btnProvas.setText("Provas");
        btnProvas.setBorder(null);
        btnProvas.setBorderPainted(false);
        btnProvas.setContentAreaFilled(false);
        btnProvas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProvas.setIconTextGap(13);
        btnProvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvasActionPerformed(evt);
            }
        });

        btnAlunos.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnAlunos.setForeground(new java.awt.Color(51, 51, 51));
        btnAlunos.setText("Alunos");
        btnAlunos.setBorder(null);
        btnAlunos.setBorderPainted(false);
        btnAlunos.setContentAreaFilled(false);
        btnAlunos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlunos.setIconTextGap(13);
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });

        btnProfessores.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        btnProfessores.setForeground(new java.awt.Color(51, 51, 51));
        btnProfessores.setText("Professores");
        btnProfessores.setBorder(null);
        btnProfessores.setBorderPainted(false);
        btnProfessores.setContentAreaFilled(false);
        btnProfessores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfessores.setIconTextGap(13);
        btnProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparatorMenu)
                    .addComponent(btnAulas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloMenu)
                            .addComponent(btnAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProvas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloMenu)
                .addGap(2, 2, 2)
                .addComponent(SeparatorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlunos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlunos, btnAulas, btnProfessores, btnProvas});

        lblRodape.setText("IFNMG © Todos os direitos reservados.");

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(112, 112, 112));
        lblTitulo1.setText("Seja bem vindo ao");

        lblTitulo2.setFont(new java.awt.Font("Segoe UI Black", 0, 128)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(237, 179, 74));
        lblTitulo2.setText("SISTEMA");

        lblTitulo3.setFont(new java.awt.Font("Segoe UI", 1, 128)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(76, 196, 212));
        lblTitulo3.setText("EDUCACIONAL");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo1)
                .addGap(402, 402, 402))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTitulo2))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblTitulo3))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(lblRodape))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblRodape)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao clicar no botão Alunos, convoca a tela CadastrarDiscente, onde se pode
     * cadastrar, editar, visualizar e excluir discentes.
     * @param evt Evento capturado.
     */
    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed
        // TODO add your handling code here:
        new CadastrarDiscente().setVisible(true);
    }//GEN-LAST:event_btnAlunosActionPerformed

    /**
     * Ao clicar no botão Aulas, convoca a tela GerenciarAula, onde se faz a
     * matrícula e onde as aulas podem ser criadas, editadas, excluídas e 
     * visualizadas.
     * @param evt Evento capturado.
     */
    private void btnAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAulasActionPerformed
        new GerenciarAula(this, true).setVisible(true);
    }//GEN-LAST:event_btnAulasActionPerformed

    /**
     * Ao clicar no botão Professores, convoca a tela CadastrarProfessor, onde
     * se pode cadastrar, editar, visualizar e excluir professores. 
     * @param evt Evento capturado.
     */
    private void btnProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessoresActionPerformed
        new CadastrarProfessor(this, true).setVisible(true);
    }//GEN-LAST:event_btnProfessoresActionPerformed

    /**
     * Ao clicar no botão Provas, convoca a tela CadastrarAvaliacao, onde se 
     * pode onde se pode cadastrar, editar, visualizar e excluir avaliações.
     * @param evt Evento capturado.
     */
    private void btnProvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvasActionPerformed
        new CadastrarAvaliacao().setVisible(true);
    }//GEN-LAST:event_btnProvasActionPerformed

    /**
     * Ao clicar no botão Matrículas, convoca a tela VerMatrículas, onde se pode
     * cadastrar, editar, visualizar e excluir as matrículas.
     * @param evt 
     */
    private void btnMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculasActionPerformed
        new VerMatriculas(this, true).setVisible(true);
    }//GEN-LAST:event_btnMatriculasActionPerformed

    /**
     * Executa o arquivo, que convoca TelaPrincipal.
     * @param args Argumentos da linha de comando.
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparatorMenu;
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnAulas;
    private javax.swing.JButton btnMatriculas;
    private javax.swing.JButton btnProfessores;
    private javax.swing.JButton btnProvas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblRodape;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTituloMenu;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
