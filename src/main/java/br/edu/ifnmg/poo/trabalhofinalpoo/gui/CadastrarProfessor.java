/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.ProfessorDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Professor;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * Janela para inclusao, edição e exclusão de professores
 * 
 * @author Fellipe
 */
public class CadastrarProfessor extends javax.swing.JFrame {

    /**
     * Modelo para manutenção de dados a serem apresentado na listagem da
     * interface gráfica.
     */
    private DefaultListModel<Professor> lstProfessoresModel;
    
    /**
     * Retém o índice da tarefa selecionada para referências de processamentos
     * entre vários métodos.
     */
    private int indiceProfessorSelecionado;
    
    /**
     * Iniciliza elementos da nova janela
     */
    public CadastrarProfessor() {
        // Modelo padrão para elementos em listagens
        lstProfessoresModel = new DefaultListModel<>();

        // Recupera todos os registros do banco de dados
        List<Professor> professores = new ProfessorDao().localizarTodos();

        // Acrescente objetos do tipo Tarefa recuperados do banco de dados
        // ao elemento de listagem. Aqui são incluídas as referências completas
        // aos estados de cada objeto (id, descrição e concluída)
        lstProfessoresModel.addAll(professores);
        
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
        pnlCadastroProfessor = new javax.swing.JPanel();
        pnlListaProfessores = new javax.swing.JPanel();
        lblPesquisa = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        pnlAreaDados = new javax.swing.JPanel();
        pnlDados = new javax.swing.JPanel();
        lblContrato = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        chkAtivo = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        lblDadosProfessor = new javax.swing.JLabel();
        btnSalvarDados = new javax.swing.JButton();
        btnCancelarDados = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        lblListaProfessores = new javax.swing.JLabel();
        scrListaProfessores = new javax.swing.JScrollPane();
        lstProfessores = new javax.swing.JList<>();

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
        setTitle("Instrutores");
        setResizable(false);

        pnlCadastroProfessor.setBackground(new java.awt.Color(255, 255, 255));

        pnlListaProfessores.setBackground(new java.awt.Color(255, 255, 255));

        lblPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        lblPesquisa.setText("Pesquisa");

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        txtPesquisa.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisa.setToolTipText("");
        txtPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        pnlAreaDados.setBackground(new java.awt.Color(255, 255, 255));

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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Gerenciar disponibilidade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(chkAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
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
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAtivo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblDadosProfessor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDadosProfessor.setForeground(new java.awt.Color(0, 0, 0));
        lblDadosProfessor.setText("Dados do professor");

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

        javax.swing.GroupLayout pnlAreaDadosLayout = new javax.swing.GroupLayout(pnlAreaDados);
        pnlAreaDados.setLayout(pnlAreaDadosLayout);
        pnlAreaDadosLayout.setHorizontalGroup(
            pnlAreaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAreaDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlAreaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDadosProfessor)
                    .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAreaDadosLayout.createSequentialGroup()
                        .addComponent(btnSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlAreaDadosLayout.setVerticalGroup(
            pnlAreaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAreaDadosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblDadosProfessor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAreaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarDados)
                    .addComponent(btnSalvarDados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 0, 0));
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        lblListaProfessores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblListaProfessores.setForeground(new java.awt.Color(0, 0, 0));
        lblListaProfessores.setText("Lista de professores");

        lstProfessores.setBackground(new java.awt.Color(255, 255, 255));
        lstProfessores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstProfessores.setForeground(new java.awt.Color(0, 0, 0));
        lstProfessores.setModel(lstProfessoresModel);
        lstProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstProfessoresMouseReleased(evt);
            }
        });
        scrListaProfessores.setViewportView(lstProfessores);

        javax.swing.GroupLayout pnlListaProfessoresLayout = new javax.swing.GroupLayout(pnlListaProfessores);
        pnlListaProfessores.setLayout(pnlListaProfessoresLayout);
        pnlListaProfessoresLayout.setHorizontalGroup(
            pnlListaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaProfessoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlAreaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaProfessoresLayout.createSequentialGroup()
                .addGroup(pnlListaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlListaProfessoresLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlListaProfessoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlListaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListaProfessores)
                            .addComponent(scrListaProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );
        pnlListaProfessoresLayout.setVerticalGroup(
            pnlListaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaProfessoresLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblListaProfessores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrListaProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListaProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisa)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAreaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout pnlCadastroProfessorLayout = new javax.swing.GroupLayout(pnlCadastroProfessor);
        pnlCadastroProfessor.setLayout(pnlCadastroProfessorLayout);
        pnlCadastroProfessorLayout.setHorizontalGroup(
            pnlCadastroProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroProfessorLayout.createSequentialGroup()
                .addComponent(pnlListaProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCadastroProfessorLayout.setVerticalGroup(
            pnlCadastroProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProfessorLayout.createSequentialGroup()
                .addComponent(pnlListaProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    /**
     * Resposta ao clique sobre o botão "Salvar"
     * @param evt Evento capturado
     */
    private void btnSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosActionPerformed
        // Cria um objeto a partir dos dados informados pelo usuário
        Professor professor = new Professor();
        professor.setNome(txtNome.getText());
        professor.setCpf(Integer.parseInt(txtCPF.getText()));
        professor.setNascimento(txtDataNascimento.getText());

        // Executa o salvamento do estado do objeto no banco de dados
        Long id = new ProfessorDao().salvar(professor);

        // Importante! Se o objeto criado não for atrelado a seu id no banco
        // de dados, o objeto fica desconexo e as futuras alterações de seu
        // estado gerarão um novo registro
        professor.setId(id);

        // Atualiza a listagem por meio da inserção direta do elemento recém-criado.
        // Poderia ser uma nova consulta ao banco de dados para recuperar todos
        // os registros. (!!!) Isto seria útil em um sistema multiusuário.
        lstProfessoresModel.addElement(professor);

        // Restaura o estado inicial dos componentes da janela.
        limparCampos();
    }//GEN-LAST:event_btnSalvarDadosActionPerformed

    private void btnCancelarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarDadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    /**
     * Resposta ao clique sobre a opção "Editar" do menu de contexto.
     * 
     * @param evt Evento capturado
     */
    private void mnuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarActionPerformed
        EditarProfessor editarProfessor
                = new EditarProfessor(lstProfessores.getSelectedValue(), this, true);
        // this -> referencia a janela principal
        editarProfessor.setLocationRelativeTo(this);
        editarProfessor.setVisible(true);
    }//GEN-LAST:event_mnuEditarActionPerformed

    /**
     * Resposta ao clique sobre a opção "Excluir" do menu de contexto.
     * 
     * @param evt Evento capturado
     */
    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
        new ProfessorDao().excluir(lstProfessoresModel.get(indiceProfessorSelecionado));

        // Exclui graficamente 
        lstProfessoresModel.remove(lstProfessores.getSelectedIndex());
    }//GEN-LAST:event_mnuExcluirActionPerformed

    /**
     * Resposta ao clique com botão direito sobre elementos da listagem de professores.
     * 
     * @param evt Evento capturado
     */
    private void lstProfessoresMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstProfessoresMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3
                && lstProfessores.getModel().getSize() > 0) {
            indiceProfessorSelecionado = lstProfessores.locationToIndex(evt.getPoint());
            lstProfessores.setSelectedIndex(indiceProfessorSelecionado);
            popUpMenu.show(lstProfessores, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lstProfessoresMouseReleased

    /**
     * Execução do projeto.
     * 
     * @param args Argumentos da linha de comando
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
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProfessor().setVisible(true);
            }
        });
    }
    
    /**
     * Restaura estado inicial dos campos do formulário.
     */
    private void limparCampos() {
        // "Descrição" vazia
        txtCPF.setText(null);
        txtDataNascimento.setText(null);
        txtNome.setText(null);
        
        // Seleção da "Descrição" para nova digitação
        txtNome.requestFocus();
    }
    
    /**
     * Permite a atualização de um professor que foi editada em outra janela.
     * 
     * @param professor A ser acrescentado a listagem de tarefas
     */
    void atualizarModelo(Professor professor) {
        lstProfessoresModel.set(indiceProfessorSelecionado, professor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarDados;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarDados;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblDadosProfessor;
    private javax.swing.JLabel lblListaProfessores;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JList<Professor> lstProfessores;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JPanel pnlAreaDados;
    private javax.swing.JPanel pnlCadastroProfessor;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlListaProfessores;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JScrollPane scrListaProfessores;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
