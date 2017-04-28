/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tools;

import br.edu.DAO.AppConnection;
import br.edu.swing.Medicao;
import br.edu.swing.MensagemAviso;
import br.edu.swing.MensagemErro;
import br.edu.swing.MensagemOK;
import br.edu.swing.MensagemokAluno;
import java.sql.SQLException;

/**
 *
 * @author EduardoPatricia
 */
public class ExibeMensagens {

    /**
     *
     * @param mensagem
     * @param e
     */
    public static void mostaerro(String mensagem, SQLException e){
    // TODO Auto-generated catch block
        MensagemErro m = new MensagemErro();
        MensagemErro.jLabelErro.setText(mensagem);
        MensagemErro.jLabelDetalhes.setText(e.toString());
        m.setVisible(true);
        System.out.println(e.getStackTrace());
    
    }
 public static void mostramensagem(String mensagem){
     br.edu.swing.MensagemAviso m = new MensagemAviso();
     MensagemAviso.jLabelStatus.setText(mensagem);
     m.setVisible(true);
 }
 
 public static void mostramensagemaluno(int id){
     br.edu.swing.MensagemokAluno m = new MensagemokAluno();
     MensagemokAluno.jLabelErro.setText("Aluno com ID "+id+" inserido com sucesso");
     m.setVisible(true);
 }
 
 public static void mensagemok(String mensagem){
     MensagemOK m = new MensagemOK();
     m.setVisible(true);
 }
 
}
