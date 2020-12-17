/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.trabalhofinalpoo.gui;

import br.edu.ifnmg.poo.trabalhofinalpoo.dao.AvaliacaoDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.DiscenteDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.DisciplinaDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.dao.DisponibilidadeHorarioDao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Avaliacao;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Discente;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.Disciplina;
import br.edu.ifnmg.poo.trabalhofinalpoo.entity.DisponibilidadeHorario;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fellipe
 */
public class CadastrarProva extends javax.swing.JFrame {
    
    private DefaultListModel<Avaliacao> lstAvaliacaoModel;
    
    private DefaultListModel<Discente> lstDiscentesModel;
    
    private DefaultListModel<DisponibilidadeHorario> lstDisponibilidadeHorarioModel;
    
    private DefaultListModel<Disciplina> lstDisciplinasModel;
    
    private int indiceAvaliacaoSelecionada;

    /**
     * Creates new form CadastrarProva
     */
    public CadastrarProva() {
        lstAvaliacaoModel = new DefaultListModel<>();
        List<Avaliacao> avaliacoes = new AvaliacaoDao().localizarTodos();
        lstAvaliacaoModel.addAll(avaliacoes);
        
        // exibindo os alunos
        lstDiscentesModel = new DefaultListModel<>();
        List<Discente> discentes = new DiscenteDao().localizarTodos();
        lstDiscentesModel.addAll(discentes);
        
        lstDisponibilidadeHorarioModel = new DefaultListModel<>();
        List<DisponibilidadeHorario> disponibilidadeHorarios = new DisponibilidadeHorarioDao().localizarTodos();
        lstDisponibilidadeHorarioModel.addAll(disponibilidadeHorarios);
        
        lstDisciplinasModel = new DefaultListModel<>();
        List<Disciplina> disciplinas = new DisciplinaDao().localizarTodos();
        lstDisciplinasModel.addAll(disciplinas);
        
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
        pnlCadastroProva = new javax.swing.JPanel();
        pnlPesquisaAluno = new javax.swing.JPanel();
        pnlProva = new javax.swing.JPanel();
        pnlDetalhesProva = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblAula = new javax.swing.JLabel();
        txtAula = new javax.swing.JTextField();
        lblDataHora = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        lblNotas = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlNotas = new javax.swing.JPanel();
        scrComentario = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        lblComentarios = new javax.swing.JLabel();
        lblParteEscrita = new javax.swing.JLabel();
        txtParteEscrita = new javax.swing.JTextField();
        txtParteOral = new javax.swing.JTextField();
        lblParteOral = new javax.swing.JLabel();
        scrAprovado = new javax.swing.JScrollPane();
        txpAprovado = new javax.swing.JTextPane();
        lblDetalhesProva = new javax.swing.JLabel();
        scrListaProvas = new javax.swing.JScrollPane();
        lstAvaliacoes = new javax.swing.JList<>();
        lblProvasAplicadas = new javax.swing.JLabel();
        scrListaAlunos = new javax.swing.JScrollPane();
        lstDisponibilidadeHorarios = new javax.swing.JList<>();
        lblListaAlunos = new javax.swing.JLabel();
        scrListaAlunos1 = new javax.swing.JScrollPane();
        lstDiscentes = new javax.swing.JList<>();
        scrListaAlunos2 = new javax.swing.JScrollPane();
        lstDisponibilidadeHorarios1 = new javax.swing.JList<>();

        mnuEditar.setText("Editar");
        popUpMenu.add(mnuEditar);

        mnuExcluir.setText("Excluir");
        mnuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExcluirActionPerformed(evt);
            }
        });
        popUpMenu.add(mnuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Provas");
        setResizable(false);

        pnlCadastroProva.setBackground(new java.awt.Color(255, 255, 255));

        pnlPesquisaAluno.setBackground(new java.awt.Color(255, 255, 255));

        pnlProva.setBackground(new java.awt.Color(255, 255, 255));

        pnlDetalhesProva.setBackground(new java.awt.Color(255, 255, 255));
        pnlDetalhesProva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        pnlDetalhesProva.setForeground(new java.awt.Color(112, 112, 112));

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("ID");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        lblAula.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAula.setForeground(new java.awt.Color(0, 0, 0));
        lblAula.setText("Prova");

        txtAula.setEditable(false);
        txtAula.setBackground(new java.awt.Color(255, 255, 255));
        txtAula.setForeground(new java.awt.Color(0, 0, 0));
        txtAula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        lblDataHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataHora.setForeground(new java.awt.Color(0, 0, 0));
        lblDataHora.setText("Data/Hora");

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtHora.setEditable(false);
        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        lblNotas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNotas.setForeground(new java.awt.Color(0, 0, 0));
        lblNotas.setText("Notas");

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlNotas.setBackground(new java.awt.Color(245, 245, 245));
        pnlNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));

        txtComentario.setBackground(new java.awt.Color(255, 255, 255));
        txtComentario.setForeground(new java.awt.Color(0, 0, 0));
        scrComentario.setViewportView(txtComentario);

        lblComentarios.setForeground(new java.awt.Color(0, 0, 0));
        lblComentarios.setText("Comentários");

        lblParteEscrita.setForeground(new java.awt.Color(0, 0, 0));
        lblParteEscrita.setText("Parte escrita");

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

        lblParteOral.setForeground(new java.awt.Color(0, 0, 0));
        lblParteOral.setText("Parte oral");

        scrAprovado.setHorizontalScrollBar(null);

        txpAprovado.setEditable(false);
        txpAprovado.setBackground(new java.awt.Color(0, 204, 102));
        txpAprovado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txpAprovado.setForeground(new java.awt.Color(0, 0, 0));
        scrAprovado.setViewportView(txpAprovado);

        javax.swing.GroupLayout pnlNotasLayout = new javax.swing.GroupLayout(pnlNotas);
        pnlNotas.setLayout(pnlNotasLayout);
        pnlNotasLayout.setHorizontalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComentarios)
                    .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNotasLayout.createSequentialGroup()
                            .addComponent(lblParteEscrita)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtParteEscrita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(lblParteOral)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtParteOral, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrAprovado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrComentario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlNotasLayout.setVerticalGroup(
            pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblParteEscrita)
                        .addComponent(txtParteEscrita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblParteOral)
                        .addComponent(txtParteOral, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrAprovado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlNotasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {scrAprovado, txtParteOral});

        javax.swing.GroupLayout pnlDetalhesProvaLayout = new javax.swing.GroupLayout(pnlDetalhesProva);
        pnlDetalhesProva.setLayout(pnlDetalhesProvaLayout);
        pnlDetalhesProvaLayout.setHorizontalGroup(
            pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesProvaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetalhesProvaLayout.createSequentialGroup()
                        .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDetalhesProvaLayout.createSequentialGroup()
                                    .addComponent(lblID)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(lblAula))
                            .addComponent(lblDataHora)
                            .addComponent(lblNotas))
                        .addGap(27, 27, 27)
                        .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAula, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDetalhesProvaLayout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDetalhesProvaLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        pnlDetalhesProvaLayout.setVerticalGroup(
            pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetalhesProvaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAula)
                    .addComponent(txtAula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNotas)
                    .addComponent(pnlNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDetalhesProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lblDetalhesProva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDetalhesProva.setForeground(new java.awt.Color(0, 0, 0));
        lblDetalhesProva.setText("Detalhes da prova");

        lstAvaliacoes.setBackground(new java.awt.Color(255, 255, 255));
        lstAvaliacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstAvaliacoes.setForeground(new java.awt.Color(0, 0, 0));
        lstAvaliacoes.setModel(lstAvaliacaoModel);
        lstAvaliacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstAvaliacoesMouseReleased(evt);
            }
        });
        scrListaProvas.setViewportView(lstAvaliacoes);

        lblProvasAplicadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProvasAplicadas.setForeground(new java.awt.Color(0, 0, 0));
        lblProvasAplicadas.setText("Provas aplicadas");

        javax.swing.GroupLayout pnlProvaLayout = new javax.swing.GroupLayout(pnlProva);
        pnlProva.setLayout(pnlProvaLayout);
        pnlProvaLayout.setHorizontalGroup(
            pnlProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProvaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrListaProvas, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProvasAplicadas))
                .addGap(18, 18, 18)
                .addGroup(pnlProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetalhesProva)
                    .addComponent(pnlDetalhesProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlProvaLayout.setVerticalGroup(
            pnlProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProvaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetalhesProva)
                    .addComponent(lblProvasAplicadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDetalhesProva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrListaProvas))
                .addGap(15, 15, 15))
        );

        lstDisponibilidadeHorarios.setBackground(new java.awt.Color(255, 255, 255));
        lstDisponibilidadeHorarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstDisponibilidadeHorarios.setForeground(new java.awt.Color(0, 0, 0));
        lstDisponibilidadeHorarios.setModel(lstDisponibilidadeHorarioModel);
        scrListaAlunos.setViewportView(lstDisponibilidadeHorarios);

        lblListaAlunos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblListaAlunos.setForeground(new java.awt.Color(0, 0, 0));
        lblListaAlunos.setText("Lista de alunos");

        lstDiscentes.setBackground(new java.awt.Color(255, 255, 255));
        lstDiscentes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstDiscentes.setForeground(new java.awt.Color(0, 0, 0));
        lstDiscentes.setModel(lstDiscentesModel);
        scrListaAlunos1.setViewportView(lstDiscentes);

        lstDisponibilidadeHorarios1.setBackground(new java.awt.Color(255, 255, 255));
        lstDisponibilidadeHorarios1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstDisponibilidadeHorarios1.setForeground(new java.awt.Color(0, 0, 0));
        lstDisponibilidadeHorarios1.setModel(lstDisciplinasModel);
        scrListaAlunos2.setViewportView(lstDisponibilidadeHorarios1);

        javax.swing.GroupLayout pnlPesquisaAlunoLayout = new javax.swing.GroupLayout(pnlPesquisaAluno);
        pnlPesquisaAluno.setLayout(pnlPesquisaAlunoLayout);
        pnlPesquisaAlunoLayout.setHorizontalGroup(
            pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblListaAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPesquisaAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrListaAlunos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrListaAlunos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(scrListaAlunos1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );
        pnlPesquisaAlunoLayout.setVerticalGroup(
            pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblListaAlunos)
                .addGap(16, 16, 16)
                .addComponent(scrListaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(scrListaAlunos2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(pnlProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlPesquisaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlPesquisaAlunoLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(scrListaAlunos1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlCadastroProvaLayout = new javax.swing.GroupLayout(pnlCadastroProva);
        pnlCadastroProva.setLayout(pnlCadastroProvaLayout);
        pnlCadastroProvaLayout.setHorizontalGroup(
            pnlCadastroProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPesquisaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCadastroProvaLayout.setVerticalGroup(
            pnlCadastroProvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroProvaLayout.createSequentialGroup()
                .addComponent(pnlPesquisaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtParteEscritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteEscritaActionPerformed
        if(estaAprovadoEscrita(Integer.parseInt(txtParteEscrita.getText())) && 
                estaAprovadoOral(txtParteOral.getText())){
            txpAprovado.setText("APROVADO");
        }
        else {
            txpAprovado.setText("REPROVADO");
        }
    }//GEN-LAST:event_txtParteEscritaActionPerformed

    private void txtParteOralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteOralActionPerformed
        if(estaAprovadoEscrita(Integer.parseInt(txtParteEscrita.getText())) && 
                estaAprovadoOral(txtParteOral.getText())){
            txpAprovado.setText("APROVADO");
        }
        else {
            txpAprovado.setText("REPROVADO");
        }
    }//GEN-LAST:event_txtParteOralActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNotaParteEscrita(Integer.parseInt(txtParteEscrita.getText()));
        avaliacao.setNotaParteOral(txtParteOral.getText());
        avaliacao.setComentario(txtComentario.getText());
        avaliacao.setIdDiscente(lstDiscentes.getSelectedValue().getId().intValue());
        avaliacao.setIdDisciplina(1);
        avaliacao.setIdDisponibilidadeHorario(lstDisponibilidadeHorarios.getSelectedValue().getId().intValue());
        
        Long id = new AvaliacaoDao().salvar(avaliacao);
        
        avaliacao.setId(id);
        
        lstAvaliacaoModel.addElement(avaliacao);
        
        limparCampos();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lstAvaliacoesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAvaliacoesMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3
                && lstAvaliacoes.getModel().getSize() > 0) {
            indiceAvaliacaoSelecionada = lstAvaliacoes.locationToIndex(evt.getPoint());
            lstAvaliacoes.setSelectedIndex(indiceAvaliacaoSelecionada);
            popUpMenu.show(lstAvaliacoes, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_lstAvaliacoesMouseReleased

    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
        new AvaliacaoDao().excluir(lstAvaliacaoModel.get(indiceAvaliacaoSelecionada));

        // Exclui graficamente 
        lstAvaliacaoModel.remove(lstAvaliacoes.getSelectedIndex());
    }//GEN-LAST:event_mnuExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProva().setVisible(true);
            }
        });
    }
    
    private void limparCampos() {
        // "Descrição" vazia
        txtParteEscrita.setText(null);
        txtParteOral.setText(null);
        txtComentario.setText(null);
        
        // Seleção da "Descrição" para nova digitação
        txtParteEscrita.requestFocus();
    }
    
    private boolean estaAprovadoEscrita(int parteEscrita){
        if(parteEscrita >= 98 && parteEscrita <= 100){
                return true;
        }
        return false;
    }
    
    private boolean estaAprovadoOral(String parteOral){
        return ("D".equals(parteOral) 
                || "YD".equals(parteOral)
                || "T".equals(parteOral));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblAula;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblDetalhesProva;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblListaAlunos;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblParteEscrita;
    private javax.swing.JLabel lblParteOral;
    private javax.swing.JLabel lblProvasAplicadas;
    private javax.swing.JList<Avaliacao> lstAvaliacoes;
    private javax.swing.JList<Discente> lstDiscentes;
    private javax.swing.JList<DisponibilidadeHorario> lstDisponibilidadeHorarios;
    private javax.swing.JList<Disciplina> lstDisponibilidadeHorarios1;
    private javax.swing.JMenuItem mnuEditar;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JPanel pnlCadastroProva;
    private javax.swing.JPanel pnlDetalhesProva;
    private javax.swing.JPanel pnlNotas;
    private javax.swing.JPanel pnlPesquisaAluno;
    private javax.swing.JPanel pnlProva;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JScrollPane scrAprovado;
    private javax.swing.JScrollPane scrComentario;
    private javax.swing.JScrollPane scrListaAlunos;
    private javax.swing.JScrollPane scrListaAlunos1;
    private javax.swing.JScrollPane scrListaAlunos2;
    private javax.swing.JScrollPane scrListaProvas;
    private javax.swing.JTextPane txpAprovado;
    private javax.swing.JTextField txtAula;
    private javax.swing.JTextPane txtComentario;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtParteEscrita;
    private javax.swing.JTextField txtParteOral;
    // End of variables declaration//GEN-END:variables
}
