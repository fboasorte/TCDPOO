/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

/**
 *
 * @author Fellipe
 */
public class GerenciarDisponibilidade extends javax.swing.JDialog {

    /**
     * Creates new form GerenciarDisponibilidade
     */
    public GerenciarDisponibilidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        pnlDisponibilidade = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        pnlGerenciar = new javax.swing.JPanel();
        jCalendarDisponibilidade = new com.toedter.calendar.JCalendar();
        scrHorario = new javax.swing.JScrollPane();
        lstHorario = new javax.swing.JList<>();
        btnEditarHorario = new javax.swing.JButton();
        btnExcluirHorario = new javax.swing.JButton();
        ftxtHorario = new javax.swing.JFormattedTextField();
        btnInserirHorario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar disponibilidade");
        setAlwaysOnTop(true);
        setResizable(false);

        pnlDisponibilidade.setBackground(new java.awt.Color(255, 255, 255));
        pnlDisponibilidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        btnFechar.setBackground(new java.awt.Color(255, 255, 255));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(0, 0, 0));
        btnFechar.setText("Fechar");

        pnlGerenciar.setBackground(new java.awt.Color(255, 255, 255));
        pnlGerenciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        jCalendarDisponibilidade.setBackground(new java.awt.Color(255, 255, 255));
        jCalendarDisponibilidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCalendarDisponibilidade.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jCalendarDisponibilidade.setDecorationBackgroundVisible(false);
        jCalendarDisponibilidade.setMinSelectableDate(new java.util.Date(1608001259000L));
        jCalendarDisponibilidade.setTodayButtonVisible(true);
        jCalendarDisponibilidade.setWeekOfYearVisible(false);

        lstHorario.setBackground(new java.awt.Color(255, 255, 255));
        lstHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstHorario.setForeground(new java.awt.Color(0, 0, 0));
        scrHorario.setViewportView(lstHorario);

        btnEditarHorario.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarHorario.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarHorario.setText("Editar");

        btnExcluirHorario.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluirHorario.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirHorario.setText("Excluir");

        ftxtHorario.setBackground(new java.awt.Color(255, 255, 255));
        ftxtHorario.setForeground(new java.awt.Color(0, 0, 0));
        ftxtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        ftxtHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnInserirHorario.setBackground(new java.awt.Color(255, 255, 255));
        btnInserirHorario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInserirHorario.setForeground(new java.awt.Color(0, 0, 0));
        btnInserirHorario.setText("Inserir horário");

        javax.swing.GroupLayout pnlGerenciarLayout = new javax.swing.GroupLayout(pnlGerenciar);
        pnlGerenciar.setLayout(pnlGerenciarLayout);
        pnlGerenciarLayout.setHorizontalGroup(
            pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenciarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jCalendarDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGerenciarLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnEditarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlGerenciarLayout.createSequentialGroup()
                            .addComponent(ftxtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInserirHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(scrHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlGerenciarLayout.setVerticalGroup(
            pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGerenciarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGerenciarLayout.createSequentialGroup()
                        .addGroup(pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInserirHorario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarHorario)
                            .addComponent(btnExcluirHorario)))
                    .addComponent(jCalendarDisponibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDisponibilidadeLayout = new javax.swing.GroupLayout(pnlDisponibilidade);
        pnlDisponibilidade.setLayout(pnlDisponibilidadeLayout);
        pnlDisponibilidadeLayout.setHorizontalGroup(
            pnlDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisponibilidadeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(pnlGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(pnlDisponibilidadeLayout.createSequentialGroup()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlDisponibilidadeLayout.setVerticalGroup(
            pnlDisponibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisponibilidadeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnlGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDisponibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDisponibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GerenciarDisponibilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarDisponibilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarDisponibilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarDisponibilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciarDisponibilidade dialog = new GerenciarDisponibilidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarHorario;
    private javax.swing.JButton btnExcluirHorario;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInserirHorario;
    private javax.swing.JFormattedTextField ftxtHorario;
    private com.toedter.calendar.JCalendar jCalendarDisponibilidade;
    private javax.swing.JList<String> lstHorario;
    private javax.swing.JPanel pnlDisponibilidade;
    private javax.swing.JPanel pnlGerenciar;
    private javax.swing.JScrollPane scrHorario;
    // End of variables declaration//GEN-END:variables
}