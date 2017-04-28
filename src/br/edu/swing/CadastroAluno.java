/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.swing;

import br.edu.entity.Aluno;
import br.edu.entity.Professor;
import br.edu.DAO.AlunoDAO;
import br.edu.DAO.AulaDAO;
import br.edu.dao.ProfessorDAO;
import br.edu.entity.Aula;
import java.awt.Component;
import java.awt.Window;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Calendar;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;


/**
 *
 * @author EduardoPatricia
 */
public class CadastroAluno extends javax.swing.JFrame {
    Aluno a = new Aluno();
    AlunoDAO adao = new AlunoDAO();
           
    /**
     * Creates new form CadastroAluno
     */
    public CadastroAluno() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelAlunos = new javax.swing.JPanel();
        jLabelFundoAlunos = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jFormattedTextFieldIdade = new javax.swing.JFormattedTextField();
        jPanelProfessores = new javax.swing.JPanel();
        jLabelIconeProfessorres = new javax.swing.JLabel();
        jPanelProfessor = new javax.swing.JPanel();
        jLabelProfFundo = new javax.swing.JLabel();
        jLabelProfNome = new javax.swing.JLabel();
        jTextFieldProfNome = new javax.swing.JTextField();
        jButtonProfGravar = new javax.swing.JButton();
        jPanelAulas = new javax.swing.JPanel();
        jTextFieldConteudo = new javax.swing.JTextField();
        jLabelNome1 = new javax.swing.JLabel();
        jLabelEmail1 = new javax.swing.JLabel();
        jTextFieldAulaMatricula = new javax.swing.JTextField();
        jButtonAulaPesquisar = new javax.swing.JButton();
        jTextFieldAulaProfNome = new javax.swing.JTextField();
        jLabelProfNome1 = new javax.swing.JLabel();
        jLabelAulaCapacidade = new javax.swing.JLabel();
        jTextFieldAulaCapacidade = new javax.swing.JTextField();
        jButtonAulaGravar = new javax.swing.JButton();
        jLabelAulaCapacidade1 = new javax.swing.JLabel();
        jFormattedTextFieldHora_inicio = new javax.swing.JFormattedTextField();
        jFormattedTextHora_fim = new javax.swing.JFormattedTextField();
        jLabelAulaCapacidade2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inclusao no Cadastro");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 255));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(670, 470));
        getContentPane().setLayout(null);

        jPanelAlunos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelFundoAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/imagens/novoaluno.jpg"))); // NOI18N

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

        jLabelIdade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelIdade.setText("Idade");

        jButtonGravar.setText("Gravar e Fazer Medição");
        jButtonGravar.setToolTipText("Concluir e Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jFormattedTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldIdadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlunosLayout = new javax.swing.GroupLayout(jPanelAlunos);
        jPanelAlunos.setLayout(jPanelAlunosLayout);
        jPanelAlunosLayout.setHorizontalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFundoAlunos))
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                                .addComponent(jLabelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAlunosLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );
        jPanelAlunosLayout.setVerticalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlunosLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabelFundoAlunos))
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAlunosLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Alunos", null, jPanelAlunos, "Inserir novo aluno no cadastro");

        jPanelProfessores.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIconeProfessorres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/imagens/novoaluno.jpg"))); // NOI18N

        jPanelProfessor.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelProfFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/imagens/novoaluno.jpg"))); // NOI18N

        jLabelProfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelProfNome.setText("Nome do Professor");

        jTextFieldProfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProfNomeActionPerformed(evt);
            }
        });

        jButtonProfGravar.setText("Gravar");
        jButtonProfGravar.setToolTipText("Concluir e Gravar");
        jButtonProfGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProfessorLayout = new javax.swing.GroupLayout(jPanelProfessor);
        jPanelProfessor.setLayout(jPanelProfessorLayout);
        jPanelProfessorLayout.setHorizontalGroup(
            jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfessorLayout.createSequentialGroup()
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelProfFundo))
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButtonProfGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 274, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfessorLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabelProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(463, Short.MAX_VALUE)))
        );
        jPanelProfessorLayout.setVerticalGroup(
            jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessorLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jTextFieldProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabelProfFundo))
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButtonProfGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfessorLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabelProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelProfessoresLayout = new javax.swing.GroupLayout(jPanelProfessores);
        jPanelProfessores.setLayout(jPanelProfessoresLayout);
        jPanelProfessoresLayout.setHorizontalGroup(
            jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessoresLayout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(jLabelIconeProfessorres)
                .addContainerGap())
            .addGroup(jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfessoresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelProfessoresLayout.setVerticalGroup(
            jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessoresLayout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jLabelIconeProfessorres)
                .addContainerGap())
            .addGroup(jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfessoresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Professores", null, jPanelProfessores, "Inserir novo professor no cadastro");

        jPanelAulas.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConteudoActionPerformed(evt);
            }
        });

        jLabelNome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNome1.setText("Conteúdo");

        jLabelEmail1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEmail1.setText("Matricula Professor");

        jTextFieldAulaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAulaMatriculaActionPerformed(evt);
            }
        });

        jButtonAulaPesquisar.setText("Pesquisar");
        jButtonAulaPesquisar.setToolTipText("Concluir e Gravar");
        jButtonAulaPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulaPesquisarActionPerformed(evt);
            }
        });

        jTextFieldAulaProfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAulaProfNomeActionPerformed(evt);
            }
        });

        jLabelProfNome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelProfNome1.setText("Nome do Professor");

        jLabelAulaCapacidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAulaCapacidade.setText("Capacidade");

        jTextFieldAulaCapacidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAulaCapacidadeActionPerformed(evt);
            }
        });

        jButtonAulaGravar.setText("Gravar");
        jButtonAulaGravar.setToolTipText("Concluir e Gravar");
        jButtonAulaGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulaGravarActionPerformed(evt);
            }
        });

        jLabelAulaCapacidade1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAulaCapacidade1.setText("Hora Inicio");

        try {
            jFormattedTextFieldHora_inicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHora_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldHora_inicioActionPerformed(evt);
            }
        });

        try {
            jFormattedTextHora_fim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextHora_fim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextHora_fimActionPerformed(evt);
            }
        });

        jLabelAulaCapacidade2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAulaCapacidade2.setText("Hora Fim");

        javax.swing.GroupLayout jPanelAulasLayout = new javax.swing.GroupLayout(jPanelAulas);
        jPanelAulas.setLayout(jPanelAulasLayout);
        jPanelAulasLayout.setHorizontalGroup(
            jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAulasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                        .addComponent(jLabelProfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAulaProfNome))
                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                        .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAulaCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAulaCapacidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAulasLayout.createSequentialGroup()
                                .addComponent(jTextFieldAulaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButtonAulaPesquisar))
                            .addGroup(jPanelAulasLayout.createSequentialGroup()
                                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jButtonAulaGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAulasLayout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldHora_inicio)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabelAulaCapacidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(jFormattedTextHora_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAulaCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanelAulasLayout.setVerticalGroup(
            jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAulasLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAulaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAulaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAulaProfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAulaCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAulaCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAulaCapacidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldHora_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAulaCapacidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextHora_fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButtonAulaGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aula", null, jPanelAulas, "Cadastrar uma nova aula");

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 40, 650, 430);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Inclusão no Cadastro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 250, 30);

        setSize(new java.awt.Dimension(663, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed

        a.setNome(jTextFieldNome.getText());
        a.setEmail(jTextFieldNome.getText());
        a.setIdade(Integer.parseInt(jFormattedTextFieldIdade.getText()));
        //a.setPeso(Float.parseFloat(jFormattedTextFieldIdade.getText()));
        //a.setAltura(Float.parseFloat(jFormattedTextFieldIdade.getText()));
        
        adao.inserir(a);
        //Medicao m = new Medicao();
        //m.setVisible(true);
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
        
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jFormattedTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldIdadeActionPerformed

    private void jTextFieldProfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProfNomeActionPerformed

    private void jButtonProfGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfGravarActionPerformed
        // TODO add your handling code here:
        Professor p = new Professor();
        System.out.println("criado classe");
        p.setNome(jTextFieldProfNome.getText());
        System.out.println("atribuido campo");
        ProfessorDAO dao = new ProfessorDAO();
        System.out.println("metodo chamado");
        dao.inserir(p);
        
    }//GEN-LAST:event_jButtonProfGravarActionPerformed

    private void jTextFieldConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConteudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConteudoActionPerformed

    private void jTextFieldAulaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAulaMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAulaMatriculaActionPerformed

    private void jButtonAulaPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulaPesquisarActionPerformed
        // botao que pesquisa no form professor excluir
        if (jTextFieldAulaMatricula.getText().isEmpty()){
            MensagemErro m = new MensagemErro();
            MensagemErro.jLabelErro.setText("Preencha a Matricula");
            m.setVisible(true);
        }

        br.edu.dao.ProfessorDAO consulta = new br.edu.dao.ProfessorDAO();
        Professor ret = new Professor();
        //ret.setNome("ze");
        ret = consulta.buscar(Integer.parseInt(jTextFieldAulaMatricula.getText()));
        jTextFieldAulaProfNome.setText(ret.getNome());

    }//GEN-LAST:event_jButtonAulaPesquisarActionPerformed

    private void jTextFieldAulaProfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAulaProfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAulaProfNomeActionPerformed

    private void jTextFieldAulaCapacidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAulaCapacidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAulaCapacidadeActionPerformed

    
    //Botao que insere aula
    private void jButtonAulaGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulaGravarActionPerformed
        AulaDAO dao = new AulaDAO();
        Aula a = new Aula();
        a.setId_professor(Integer.parseInt(jTextFieldAulaMatricula.getText()));
        a.setConteudo(jTextFieldConteudo.getText());
        a.setCapacidade_alunos(Integer.parseInt(jTextFieldAulaCapacidade.getText()));
        String horainicio = jFormattedTextFieldHora_inicio.getText()+":00";
        a.setHora_inicio(horainicio);
        String horafim = jFormattedTextHora_fim.getText()+":00";
        a.setHora_fim(horafim);
        
        
        dao.inserir(a);
        
        
        
        
        
    }//GEN-LAST:event_jButtonAulaGravarActionPerformed

    private void jFormattedTextFieldHora_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHora_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldHora_inicioActionPerformed

    private void jFormattedTextHora_fimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextHora_fimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextHora_fimActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAulaGravar;
    private javax.swing.JButton jButtonAulaPesquisar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonProfGravar;
    private javax.swing.JFormattedTextField jFormattedTextFieldHora_inicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdade;
    private javax.swing.JFormattedTextField jFormattedTextHora_fim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAulaCapacidade;
    private javax.swing.JLabel jLabelAulaCapacidade1;
    private javax.swing.JLabel jLabelAulaCapacidade2;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelFundoAlunos;
    private javax.swing.JLabel jLabelIconeProfessorres;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelProfFundo;
    private javax.swing.JLabel jLabelProfNome;
    private javax.swing.JLabel jLabelProfNome1;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelAulas;
    private javax.swing.JPanel jPanelProfessor;
    private javax.swing.JPanel jPanelProfessores;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAulaCapacidade;
    private javax.swing.JTextField jTextFieldAulaMatricula;
    private javax.swing.JTextField jTextFieldAulaProfNome;
    private javax.swing.JTextField jTextFieldConteudo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldProfNome;
    // End of variables declaration//GEN-END:variables
}
