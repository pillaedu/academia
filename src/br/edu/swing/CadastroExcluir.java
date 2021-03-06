/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.swing;


import br.edu.entity.*;
import br.edu.DAO.AlunoDAO;
import br.edu.DAO.AulaDAO;
import br.edu.controller.AlunoC;
import br.edu.controller.AulaC;
import br.edu.controller.ProfessorC;
import br.edu.dao.ProfessorDAO;
import br.edu.tools.ExibeMensagens;
import javax.swing.JOptionPane;
//import br.edu.dao.ProfessorDAO;


/**
 *
 * @author EduardoPatricia
 */
public class CadastroExcluir extends javax.swing.JFrame {

    AlunoDAO adao = new AlunoDAO();
           
    /**
     * Creates new form CadastroAluno
     */
    public CadastroExcluir() {
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

        jTabbedPaneExcluir = new javax.swing.JTabbedPane();
        jPanelAlunos = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonLista = new javax.swing.JButton();
        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jPanelProfessores = new javax.swing.JPanel();
        jPanelProfessor = new javax.swing.JPanel();
        jLabelProfNome = new javax.swing.JLabel();
        jTextFieldProfNome = new javax.swing.JTextField();
        jButtonProfListar = new javax.swing.JButton();
        jButtonProfExcluir = new javax.swing.JButton();
        jLabelProfMatricula = new javax.swing.JLabel();
        jTextFieldProfMatricula = new javax.swing.JTextField();
        jButtonProfPesquisar = new javax.swing.JButton();
        jPanelAulas = new javax.swing.JPanel();
        jTextFiedAulaid = new javax.swing.JTextField();
        jLabelMatricula1 = new javax.swing.JLabel();
        jButtonAulaPesq = new javax.swing.JButton();
        jTextFieldAulaNomeProf = new javax.swing.JTextField();
        jLabelNome1 = new javax.swing.JLabel();
        jLabelNome2 = new javax.swing.JLabel();
        jTextFieldAulaConteudo = new javax.swing.JTextField();
        jButtonAulaListar = new javax.swing.JButton();
        jButtonAulaExcluir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inclusao no Cadastro");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 255));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(670, 470));
        getContentPane().setLayout(null);

        jTabbedPaneExcluir.setToolTipText("Excluir Professores");

        jPanelAlunos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEmail.setText("Email");

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNome.setText("Nome do Aluno");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jButtonLista.setText("Ir para Listagem");
        jButtonLista.setToolTipText("Ir para listagem de Cadastrados");
        jButtonLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaActionPerformed(evt);
            }
        });

        jLabelMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelMatricula.setText("Matrícula");

        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir aluno Selecionado");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setToolTipText("Buscar Matricula Digitada");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlunosLayout = new javax.swing.GroupLayout(jPanelAlunos);
        jPanelAlunos.setLayout(jPanelAlunosLayout);
        jPanelAlunosLayout.setHorizontalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                                .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))))
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButtonLista, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanelAlunosLayout.setVerticalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPaneExcluir.addTab("Alunos", null, jPanelAlunos, "Inserir novo aluno no cadastro");

        jPanelProfessores.setBackground(new java.awt.Color(255, 255, 255));

        jPanelProfessor.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelProfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelProfNome.setText("Nome do Professor");

        jTextFieldProfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProfNomeActionPerformed(evt);
            }
        });

        jButtonProfListar.setText("Ir para Listagem");
        jButtonProfListar.setToolTipText("Concluir e Gravar");
        jButtonProfListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfListarActionPerformed(evt);
            }
        });

        jButtonProfExcluir.setText("Excuir");
        jButtonProfExcluir.setToolTipText("Concluir e Gravar");
        jButtonProfExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfExcluirActionPerformed(evt);
            }
        });

        jLabelProfMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelProfMatricula.setText("Matrícula");

        jTextFieldProfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProfMatriculaActionPerformed(evt);
            }
        });

        jButtonProfPesquisar.setText("Pesquisar");
        jButtonProfPesquisar.setToolTipText("Concluir e Gravar");
        jButtonProfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProfessorLayout = new javax.swing.GroupLayout(jPanelProfessor);
        jPanelProfessor.setLayout(jPanelProfessorLayout);
        jPanelProfessorLayout.setHorizontalGroup(
            jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfessorLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addComponent(jButtonProfListar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonProfExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addComponent(jTextFieldProfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonProfPesquisar))
                    .addComponent(jTextFieldProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanelProfessorLayout.setVerticalGroup(
            jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessorLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProfListar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProfExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProfessoresLayout = new javax.swing.GroupLayout(jPanelProfessores);
        jPanelProfessores.setLayout(jPanelProfessoresLayout);
        jPanelProfessoresLayout.setHorizontalGroup(
            jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfessoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanelProfessoresLayout.setVerticalGroup(
            jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfessoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPaneExcluir.addTab("Professores", null, jPanelProfessores, "Inserir novo professor no cadastro");

        jPanelAulas.setBackground(new java.awt.Color(255, 255, 255));

        jTextFiedAulaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiedAulaidActionPerformed(evt);
            }
        });

        jLabelMatricula1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelMatricula1.setText("ID");

        jButtonAulaPesq.setText("Pesquisar");
        jButtonAulaPesq.setToolTipText("Buscar Matricula Digitada");
        jButtonAulaPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulaPesqActionPerformed(evt);
            }
        });

        jTextFieldAulaNomeProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAulaNomeProfActionPerformed(evt);
            }
        });

        jLabelNome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNome1.setText("Nome do Professor");

        jLabelNome2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNome2.setText("Conteúdo");

        jTextFieldAulaConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAulaConteudoActionPerformed(evt);
            }
        });

        jButtonAulaListar.setText("Ir para Listagem");
        jButtonAulaListar.setToolTipText("Concluir e Gravar");
        jButtonAulaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulaListarActionPerformed(evt);
            }
        });

        jButtonAulaExcluir1.setText("Excuir");
        jButtonAulaExcluir1.setToolTipText("Concluir e Gravar");
        jButtonAulaExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulaExcluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAulasLayout = new javax.swing.GroupLayout(jPanelAulas);
        jPanelAulas.setLayout(jPanelAulasLayout);
        jPanelAulasLayout.setHorizontalGroup(
            jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAulasLayout.createSequentialGroup()
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAulasLayout.createSequentialGroup()
                                .addComponent(jLabelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAulaConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAulasLayout.createSequentialGroup()
                                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAulaNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                                        .addComponent(jTextFiedAulaid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAulaPesq))))))
                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButtonAulaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonAulaExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelAulasLayout.setVerticalGroup(
            jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAulasLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFiedAulaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAulaPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAulaNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAulaConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAulaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAulaExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPaneExcluir.addTab("Aula", null, jPanelAulas, "Cadastrar uma nova aula");

        getContentPane().add(jTabbedPaneExcluir);
        jTabbedPaneExcluir.setBounds(0, 40, 650, 430);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Exclusão do Cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 250, 30);

        setSize(new java.awt.Dimension(669, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaActionPerformed


    }//GEN-LAST:event_jButtonListaActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldProfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProfNomeActionPerformed

    private void jButtonProfListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfListarActionPerformed
        // TODO add your handling code here:
        Professor p = new Professor();
        p.setNome(jTextFieldProfNome.getText());
        
  //      ProfessorDAO dao = new ProfessorDAO();
        //dao.inserir(p);
        
    }//GEN-LAST:event_jButtonProfListarActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       
        //exclui aluno
        if (jTextFieldMatricula.getText().isEmpty()){
            MensagemErro m = new MensagemErro();
            MensagemErro.jLabelErro.setText("Preencha a Matricula");
            m.setVisible(true);
        }
        AlunoC c = new AlunoC();
        c.excluiraluno(Integer.parseInt(jTextFieldMatricula.getText()));
        
        //limpa campos
        jTextFieldMatricula.setText(null);
        jTextFieldNome.setText(null);
        jTextFieldEmail.setText(null);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldMatricula.getText().isEmpty()){
            MensagemErro m = new MensagemErro();
            MensagemErro.jLabelErro.setText("Preencha a Matricula");
            m.setVisible(true);
        }
        
        br.edu.controller.AlunoC c = new AlunoC();
        AlunoM m = new AlunoM();
        
        m = c.pesquisaraluno(Integer.parseInt(jTextFieldMatricula.getText()));
        if (m.getId() > 0){
            jTextFieldNome.setText(m.getNome());
            jTextFieldEmail.setText(m.getEmail());
        }else{
            br.edu.tools.ExibeMensagens ex = new ExibeMensagens();
            ex.mostramensagem("Não há aluno com esse ID");
        }
      
       
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    
    //botao excluir professores
    private void jButtonProfExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfExcluirActionPerformed
        // excluir professores 
        if (jTextFieldProfMatricula.getText().isEmpty()){
            MensagemErro m = new MensagemErro();
            MensagemErro.jLabelErro.setText("Preencha a Matricula");
            m.setVisible(true);
        }
        ProfessorC c = new ProfessorC();
        c.excluir(Integer.parseInt(jTextFieldProfMatricula.getText()));
        
        // limpa campos
        jTextFieldProfMatricula.setText(null);
    }//GEN-LAST:event_jButtonProfExcluirActionPerformed

    private void jTextFieldProfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProfMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProfMatriculaActionPerformed

    private void jButtonProfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfPesquisarActionPerformed
        // botao que pesquisa no form professor excluir
       

        if (jTextFieldProfMatricula.getText().isEmpty()){
            MensagemErro m = new MensagemErro();
            MensagemErro.jLabelErro.setText("Preencha a Matricula");
            m.setVisible(true);
        }
        
        ProfessorC c = new ProfessorC();
        ProfessorM model = new ProfessorM();
        model = c.buscar(Integer.parseInt(jTextFieldProfMatricula.getText()));
        
        if(model.getId() >0){
            jTextFieldProfNome.setText(model.getNome()); 
        }else{
            ExibeMensagens ex = new ExibeMensagens();
            ex.mostramensagem("Não ha professor com esse id");
        }
        
    }//GEN-LAST:event_jButtonProfPesquisarActionPerformed

    private void jTextFiedAulaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiedAulaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiedAulaidActionPerformed

    private void jButtonAulaPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulaPesqActionPerformed
        // TODO add your handling code here:
        if (jTextFiedAulaid.getText().isEmpty()){
            MensagemErro m = new MensagemErro();
            MensagemErro.jLabelErro.setText("Preencha o ID da Aula");
            m.setVisible(true);
        }
        AulaM model = new AulaM();
        
        AulaC control = new AulaC();
        model = control.buscar(jTextFiedAulaid.getText());
        
        jTextFieldAulaNomeProf.setText(model.getNome_professor());
        jTextFieldAulaConteudo.setText(model.getConteudo());
        
    }//GEN-LAST:event_jButtonAulaPesqActionPerformed

    private void jTextFieldAulaNomeProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAulaNomeProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAulaNomeProfActionPerformed

    private void jTextFieldAulaConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAulaConteudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAulaConteudoActionPerformed

    private void jButtonAulaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulaListarActionPerformed
        // TODO add your handling code here:
        CadastroListar c = new CadastroListar();
        c.setVisible(true);
        
    }//GEN-LAST:event_jButtonAulaListarActionPerformed

    private void jButtonAulaExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulaExcluir1ActionPerformed
        AulaC control = new AulaC();
        control.excluir(jTextFiedAulaid.getText());
        
        //limpa campos
        jTextFiedAulaid.setText(null);
        jTextFieldAulaConteudo.setText(null);
        jTextFieldAulaNomeProf.setText(null);
    }//GEN-LAST:event_jButtonAulaExcluir1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroExcluir().setVisible(true);
            }
        });
    }
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAulaExcluir1;
    private javax.swing.JButton jButtonAulaListar;
    private javax.swing.JButton jButtonAulaPesq;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLista;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonProfExcluir;
    private javax.swing.JButton jButtonProfListar;
    private javax.swing.JButton jButtonProfPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelMatricula1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelProfMatricula;
    private javax.swing.JLabel jLabelProfNome;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelAulas;
    private javax.swing.JPanel jPanelProfessor;
    private javax.swing.JPanel jPanelProfessores;
    private javax.swing.JTabbedPane jTabbedPaneExcluir;
    private javax.swing.JTextField jTextFiedAulaid;
    private javax.swing.JTextField jTextFieldAulaConteudo;
    private javax.swing.JTextField jTextFieldAulaNomeProf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldProfMatricula;
    private javax.swing.JTextField jTextFieldProfNome;
    // End of variables declaration//GEN-END:variables
}
