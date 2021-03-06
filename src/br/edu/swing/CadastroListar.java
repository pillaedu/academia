/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.swing;


import br.edu.entity.*;
import br.edu.DAO.AlunoDAO;
import br.edu.DAO.AulaDAO;
import br.edu.dao.ProfessorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.edu.controller.AlunoC;
import br.edu.controller.ProfessorC;
import br.edu.tools.ExibeMensagens;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author EduardoPatricia
 */
public class CadastroListar extends javax.swing.JFrame {
    /**
     * Creates new form CadastroAluno
     */
    public CadastroListar() {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        jPanelProfessores = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProfessores = new javax.swing.JTable();
        jPanelAulas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inclusao no Cadastro");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 153, 255));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(670, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jTabbedPaneExcluir.setToolTipText("Excluir Professores");
        jTabbedPaneExcluir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPaneExcluirFocusGained(evt);
            }
        });

        jPanelAlunos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listagem de Alunos Cadastrados");

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Emai", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.setFocusCycleRoot(true);
        jTableAlunos.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTableAlunos);

        javax.swing.GroupLayout jPanelAlunosLayout = new javax.swing.GroupLayout(jPanelAlunos);
        jPanelAlunos.setLayout(jPanelAlunosLayout);
        jPanelAlunosLayout.setHorizontalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                .addGroup(jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(jPanelAlunosLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelAlunosLayout.setVerticalGroup(
            jPanelAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPaneExcluir.addTab("Alunos", null, jPanelAlunos, "Inserir novo aluno no cadastro");

        jPanelProfessores.setBackground(new java.awt.Color(255, 255, 255));

        jTableProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Matrícula", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableProfessores);

        javax.swing.GroupLayout jPanelProfessoresLayout = new javax.swing.GroupLayout(jPanelProfessores);
        jPanelProfessores.setLayout(jPanelProfessoresLayout);
        jPanelProfessoresLayout.setHorizontalGroup(
            jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessoresLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanelProfessoresLayout.setVerticalGroup(
            jPanelProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfessoresLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPaneExcluir.addTab("Professores", null, jPanelProfessores, "Inserir novo professor no cadastro");

        jPanelAulas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Listagem de Aulas Cadastradas");

        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Professor", "Conteudo", "Capacidade", "Inicio", "Fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableAula);

        javax.swing.GroupLayout jPanelAulasLayout = new javax.swing.GroupLayout(jPanelAulas);
        jPanelAulas.setLayout(jPanelAulasLayout);
        jPanelAulasLayout.setHorizontalGroup(
            jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAulasLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAulasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAulasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(146, 146, 146))))
        );
        jPanelAulasLayout.setVerticalGroup(
            jPanelAulasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAulasLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jTabbedPaneExcluir.addTab("Aula", null, jPanelAulas, "Cadastrar uma nova aula");

        getContentPane().add(jTabbedPaneExcluir);
        jTabbedPaneExcluir.setBounds(0, 40, 650, 430);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Listagem");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 10, 110, 30);

        setSize(new java.awt.Dimension(669, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //carrega a tabela de alunos
        AlunoC c = new AlunoC();

        DefaultTableModel val = (DefaultTableModel) jTableAlunos.getModel();
        List<AlunoM> list = new ArrayList<AlunoM>();
        list = c.listartodos();

        if (list.isEmpty()) {
            br.edu.tools.ExibeMensagens exibe = new ExibeMensagens();
            exibe.mostramensagem("Nâo há alunos");
        } else {
            for (AlunoM list1 : list) {
                int i = 0;
                val.addRow(new Object[]{list1.getId(), list1.getNome(), list1.getEmail(), list1.getIdade()});
                if (val.getValueAt(i, 0) == null) {
                    val.removeRow(i);
                }
                i++;
            }
        }

        //carrega a tabela de professor
        ProfessorM p = new ProfessorM();
        ProfessorC control = new ProfessorC();
        List<ProfessorM> proflist = new ArrayList<ProfessorM>();

        proflist = control.listartodos();

        DefaultTableModel prof = (DefaultTableModel) jTableProfessores.getModel();

        if (proflist.isEmpty()) {
            br.edu.tools.ExibeMensagens exibe = new ExibeMensagens();
            exibe.mostramensagem("Nâo há professores");
        } else {

            for (ProfessorM list1 : proflist) {
                int i = 0;
                prof.addRow(new Object[]{list1.getId(), list1.getNome()});
                if (prof.getValueAt(i, 0) == null) {
                    prof.removeRow(i);
                }
                i++;
            }
        }
        //carrega a tabela aulas
        AulaM aula = new AulaM();
        AulaDAO adao = new AulaDAO();

        DefaultTableModel tableaula = (DefaultTableModel) jTableAula.getModel();
        List<AulaM> aulalist = new ArrayList<AulaM>();
        try {
            aulalist = adao.listartodos();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroListar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroListar.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (AulaM list1 : aulalist) {
            int i = 0;
            tableaula.addRow(new Object[]{list1.getId(), list1.getNome_professor(), list1.getConteudo(), list1.getCapacidade_alunos(), list1.getHora_inicio(), list1.getHora_fim()});
            System.out.println(list1.getId());
            if (tableaula.getValueAt(i, 0) == null) {
                tableaula.removeRow(i);
            }
            i++;
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTabbedPaneExcluirFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPaneExcluirFocusGained
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTabbedPaneExcluirFocusGained

    /*
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
            java.util.logging.Logger.getLogger(CadastroListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroListar().setVisible(true);
            }
        });
    }
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelAlunos;
    private javax.swing.JPanel jPanelAulas;
    private javax.swing.JPanel jPanelProfessores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPaneExcluir;
    private javax.swing.JTable jTableAlunos;
    private javax.swing.JTable jTableAula;
    private javax.swing.JTable jTableProfessores;
    // End of variables declaration//GEN-END:variables
}
