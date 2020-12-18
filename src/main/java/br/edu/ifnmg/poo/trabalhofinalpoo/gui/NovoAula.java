/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AulaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.ProfessorDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Aula;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Professor;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe
 */
public class NovoAula extends javax.swing.JDialog {
    
    private GerenciarAula gerenciarAula;
    private Aula aulaNovo;
    
    /**
     * Modelo para manutenção da lista de professores a serem apresentadas na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Professor> lstProfessoresModel;
    
    /**
     * Retém o índice do porofessor selecionado para referências de processamentos
     * entre vários métodos.
     */
    private int indiceProfessorSelecionado;

    /**
     * Creates new form NovoAula
     */
    public NovoAula(GerenciarAula gerenciarAula, boolean modal) {
        super(gerenciarAula, modal);
        
        lstProfessoresModel = new DefaultListModel<>();
        List<Professor> professores = new ProfessorDao().localizarTodos();
        lstProfessoresModel.addAll(professores);
        
        initComponents();

        this.gerenciarAula = gerenciarAula;
        this.aulaNovo = new Aula();
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNovo = new javax.swing.JPanel();
        pnlNovoDetalhes = new javax.swing.JPanel();
        lblAulaNovo = new javax.swing.JLabel();
        lblConteudoNovo = new javax.swing.JLabel();
        lblDataHoraNovo = new javax.swing.JLabel();
        txtAulaNovo = new javax.swing.JTextField();
        scrConteudoNovo = new javax.swing.JScrollPane();
        txtConteudoNovo = new javax.swing.JTextPane();
        txtDataNovo = new javax.swing.JTextField();
        txtHoraNovo = new javax.swing.JTextField();
        btnSalvarNovo = new javax.swing.JButton();
        btnCancelarNovo = new javax.swing.JButton();
        lblSelecionarProfessor = new javax.swing.JLabel();
        scrListaProfessores = new javax.swing.JScrollPane();
        lstProfessores = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar nova aula");
        setResizable(false);

        pnlNovo.setBackground(new java.awt.Color(255, 255, 255));

        pnlNovoDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        pnlNovoDetalhes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        pnlNovoDetalhes.setForeground(new java.awt.Color(112, 112, 112));

        lblAulaNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAulaNovo.setForeground(new java.awt.Color(0, 0, 0));
        lblAulaNovo.setText("Aula");

        lblConteudoNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConteudoNovo.setForeground(new java.awt.Color(0, 0, 0));
        lblConteudoNovo.setText("Conteúdo");

        lblDataHoraNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataHoraNovo.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHoraNovo.setText("Data/Hora");

        txtAulaNovo.setBackground(new java.awt.Color(255, 255, 255));
        txtAulaNovo.setForeground(new java.awt.Color(0, 0, 0));

        txtConteudoNovo.setBackground(new java.awt.Color(255, 255, 255));
        txtConteudoNovo.setForeground(new java.awt.Color(0, 0, 0));
        scrConteudoNovo.setViewportView(txtConteudoNovo);

        txtDataNovo.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNovo.setForeground(new java.awt.Color(0, 0, 0));

        txtHoraNovo.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraNovo.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlNovoDetalhesLayout = new javax.swing.GroupLayout(pnlNovoDetalhes);
        pnlNovoDetalhes.setLayout(pnlNovoDetalhesLayout);
        pnlNovoDetalhesLayout.setHorizontalGroup(
            pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoDetalhesLayout.createSequentialGroup()
                .addGroup(pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoDetalhesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblAulaNovo)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNovoDetalhesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConteudoNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataHoraNovo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoDetalhesLayout.createSequentialGroup()
                        .addComponent(txtDataNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAulaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrConteudoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlNovoDetalhesLayout.setVerticalGroup(
            pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoDetalhesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAulaNovo)
                    .addComponent(txtAulaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoDetalhesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblConteudoNovo))
                    .addGroup(pnlNovoDetalhesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrConteudoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNovoDetalhesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataHoraNovo)
                    .addComponent(txtDataNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnSalvarNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvarNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarNovo.setText("Salvar");
        btnSalvarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNovoActionPerformed(evt);
            }
        });

        btnCancelarNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelarNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarNovo.setText("Cancelar");
        btnCancelarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNovoActionPerformed(evt);
            }
        });

        lblSelecionarProfessor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSelecionarProfessor.setForeground(new java.awt.Color(0, 0, 0));
        lblSelecionarProfessor.setText("Selecionar professor");

        lstProfessores.setBackground(new java.awt.Color(255, 255, 255));
        lstProfessores.setForeground(new java.awt.Color(0, 0, 0));
        lstProfessores.setModel(lstProfessoresModel);
        scrListaProfessores.setViewportView(lstProfessores);

        javax.swing.GroupLayout pnlNovoLayout = new javax.swing.GroupLayout(pnlNovo);
        pnlNovo.setLayout(pnlNovoLayout);
        pnlNovoLayout.setHorizontalGroup(
            pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSelecionarProfessor)
                    .addComponent(scrListaProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNovoLayout.createSequentialGroup()
                        .addComponent(btnSalvarNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarNovo))
                    .addComponent(pnlNovoDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlNovoLayout.setVerticalGroup(
            pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlNovoLayout.createSequentialGroup()
                        .addComponent(pnlNovoDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarNovo)
                            .addComponent(btnSalvarNovo)))
                    .addGroup(pnlNovoLayout.createSequentialGroup()
                        .addComponent(lblSelecionarProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrListaProfessores)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNovoActionPerformed
        
        indiceProfessorSelecionado = lstProfessores.getSelectedIndex();
        
        if(lstProfessores.getModel().getSize() > 0) {
            if (indiceProfessorSelecionado >= 0) {
                aulaNovo.setIdProfessor(lstProfessoresModel.get(indiceProfessorSelecionado).getId().intValue());
                aulaNovo.setNome(txtAulaNovo.getText());
                aulaNovo.setConteudo(txtConteudoNovo.getText());
                aulaNovo.setData(txtDataNovo.getText());
                aulaNovo.setHora(txtHoraNovo.getText());

                Long id = new AulaDao().salvar(aulaNovo);

                aulaNovo.setId(id);

                gerenciarAula.NovoModelo(aulaNovo);

                dispose();
            } else {
                JOptionPane.showConfirmDialog(null, "Selecione um professor!",
                        "Professor não selecionado", JOptionPane.DEFAULT_OPTION);
            }
        }
        
    }//GEN-LAST:event_btnSalvarNovoActionPerformed

    private void btnCancelarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNovoActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnCancelarNovoActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarNovo;
    private javax.swing.JButton btnSalvarNovo;
    private javax.swing.JLabel lblAulaNovo;
    private javax.swing.JLabel lblConteudoNovo;
    private javax.swing.JLabel lblDataHoraNovo;
    private javax.swing.JLabel lblSelecionarProfessor;
    private javax.swing.JList<Professor> lstProfessores;
    private javax.swing.JPanel pnlNovo;
    private javax.swing.JPanel pnlNovoDetalhes;
    private javax.swing.JScrollPane scrConteudoNovo;
    private javax.swing.JScrollPane scrListaProfessores;
    private javax.swing.JTextField txtAulaNovo;
    private javax.swing.JTextPane txtConteudoNovo;
    private javax.swing.JTextField txtDataNovo;
    private javax.swing.JTextField txtHoraNovo;
    // End of variables declaration//GEN-END:variables
}
