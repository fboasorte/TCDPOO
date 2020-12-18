/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AulaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.DiscenteDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Discente;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe
 */
public class EditarMatriculas extends javax.swing.JDialog {

     /**
     * Modelo para manutenção da lista de aulas a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Aula> lstAulasModel;
    
    /**
     * Modelo para manutenção da lista de discentes a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Discente> lstDiscentesModel;
    
    /**
     * Retém o índice da aula selecionada para referências de processamentos
     * entre vários métodos.
     */
    private int indiceAulaSelecionada;
    
    /**
     * Retém o índice do discente selecionado para referências de processamentos
     * entre vários métodos.
     */
    private int indiceDiscenteSelecionado;
    
    /**
     * Creates new form EditarMatriculas
     */
    public EditarMatriculas(VerMatriculas verMatriculas, boolean modal) {
        super(verMatriculas, modal);
        
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

        pnlEditarMatriculas = new javax.swing.JPanel();
        pnlDadosNota = new javax.swing.JPanel();
        lblComentariosNota = new javax.swing.JLabel();
        lblParteEscritaNota = new javax.swing.JLabel();
        lblParteOralNota = new javax.swing.JLabel();
        txtParteEscritaNota = new javax.swing.JTextField();
        txtParteOralNota = new javax.swing.JTextField();
        scrComentariosNota = new javax.swing.JScrollPane();
        txtComentariosNota = new javax.swing.JTextPane();
        lblNota = new javax.swing.JLabel();
        btnSalvarNota = new javax.swing.JButton();
        btnCancelarNota = new javax.swing.JButton();
        scrListaDiscentes = new javax.swing.JScrollPane();
        lstDiscentes = new javax.swing.JList<>();
        lblSelecionarAluno = new javax.swing.JLabel();
        lblAulasDisponiveis = new javax.swing.JLabel();
        scrListaAulas = new javax.swing.JScrollPane();
        lstAulas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlEditarMatriculas.setBackground(new java.awt.Color(255, 255, 255));

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

        lblNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNota.setForeground(new java.awt.Color(0, 0, 0));
        lblNota.setText("Notas");

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

        lstDiscentes.setBackground(new java.awt.Color(255, 255, 255));
        lstDiscentes.setForeground(new java.awt.Color(0, 0, 0));
        lstDiscentes.setModel(lstDiscentesModel);
        scrListaDiscentes.setViewportView(lstDiscentes);

        lblSelecionarAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSelecionarAluno.setForeground(new java.awt.Color(0, 0, 0));
        lblSelecionarAluno.setText("Selecionar aluno");

        lblAulasDisponiveis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAulasDisponiveis.setForeground(new java.awt.Color(0, 0, 0));
        lblAulasDisponiveis.setText("Aulas disponíveis");

        lstAulas.setBackground(new java.awt.Color(255, 255, 255));
        lstAulas.setForeground(new java.awt.Color(0, 0, 0));
        lstAulas.setModel(lstAulasModel);
        lstAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAulasMouseClicked(evt);
            }
        });
        scrListaAulas.setViewportView(lstAulas);

        javax.swing.GroupLayout pnlEditarMatriculasLayout = new javax.swing.GroupLayout(pnlEditarMatriculas);
        pnlEditarMatriculas.setLayout(pnlEditarMatriculasLayout);
        pnlEditarMatriculasLayout.setHorizontalGroup(
            pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarMatriculasLayout.createSequentialGroup()
                .addGroup(pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditarMatriculasLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblSelecionarAluno)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarMatriculasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAulasDisponiveis)
                            .addComponent(scrListaDiscentes, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrListaAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNota)
                    .addGroup(pnlEditarMatriculasLayout.createSequentialGroup()
                        .addComponent(btnSalvarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDadosNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlEditarMatriculasLayout.setVerticalGroup(
            pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditarMatriculasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEditarMatriculasLayout.createSequentialGroup()
                        .addComponent(lblSelecionarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrListaDiscentes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAulasDisponiveis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrListaAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEditarMatriculasLayout.createSequentialGroup()
                        .addComponent(lblNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDadosNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEditarMatriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarNota)
                            .addComponent(btnCancelarNota))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditarMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEditarMatriculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNotaActionPerformed

        matricula.setNotaParteEscrita(Integer.parseInt(txtParteEscritaNota.getText()));
        matricula.setNotaParteOral(txtParteOralNota.getText());
        matricula.setComentario(txtComentariosNota.getText());
        matricula.setIdDiscente(idDiscente);
        matricula.setIdAula(idAula);

        Long id = new MatriculaDao().salvar(matricula);

        matricula.setId(id);

        dispose();

        JOptionPane.showConfirmDialog(null,"Marcação concluída", "Editar aula",
            JOptionPane.DEFAULT_OPTION);

    }//GEN-LAST:event_btnSalvarNotaActionPerformed

    private void lstAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAulasMouseClicked

        indiceAulaSelecionada = lstAulas.getSelectedIndex();

        txtNomeAula.setText(lstAulasModel.get(indiceAulaSelecionada).getNome());
        txtConteudoAula.setText(lstAulasModel.get(indiceAulaSelecionada).getConteudo());
        txtDataAula.setText(lstAulasModel.get(indiceAulaSelecionada).getData());
        txtHoraAula.setText(lstAulasModel.get(indiceAulaSelecionada).getHora());
    }//GEN-LAST:event_lstAulasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarNota;
    private javax.swing.JButton btnSalvarNota;
    private javax.swing.JLabel lblAulasDisponiveis;
    private javax.swing.JLabel lblComentariosNota;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblParteEscritaNota;
    private javax.swing.JLabel lblParteOralNota;
    private javax.swing.JLabel lblSelecionarAluno;
    private javax.swing.JList<Aula> lstAulas;
    private javax.swing.JList<Discente> lstDiscentes;
    private javax.swing.JPanel pnlDadosNota;
    private javax.swing.JPanel pnlEditarMatriculas;
    private javax.swing.JScrollPane scrComentariosNota;
    private javax.swing.JScrollPane scrListaAulas;
    private javax.swing.JScrollPane scrListaDiscentes;
    private javax.swing.JTextPane txtComentariosNota;
    private javax.swing.JTextField txtParteEscritaNota;
    private javax.swing.JTextField txtParteOralNota;
    // End of variables declaration//GEN-END:variables
}
