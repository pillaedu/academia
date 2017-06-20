package br.edu.controller;

import br.edu.DAO.AlunoDAO;
import br.edu.DAO.MedicoesDAO;
import br.edu.entity.AlunoM;
import br.edu.entity.MedicoesM;
import br.edu.tools.ExibeMensagens;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MedicaoC {
    public void inserir(String aluno,String peso, String altura){
        MedicoesM m = new MedicoesM();
        m.setId_aluno(Integer.parseInt(aluno));
        m.setPeso(Float.parseFloat(peso));
        m.setAltura(Float.parseFloat(altura));

        MedicoesDAO dao = new MedicoesDAO();
        int n = 0;
        try {
            n = dao.inserir(m);
        } catch (SQLException ex) {
            ExibeMensagens msg = new ExibeMensagens();
            msg.mostaerro("Erro ao inserir Medição", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens msg = new ExibeMensagens();
            msg.erroconexao("Erro ao abrir conexâo", ex);
        }
        if(n > 0){
            ExibeMensagens msg = new ExibeMensagens();
            msg.mensagemok("Medição inserida");
        }
    }
    
    public String buscar(String id){
        AlunoM a = new AlunoM();
        int n = Integer.parseInt(id);
        AlunoDAO dao = new AlunoDAO();
        try {
            a = dao.buscar(n);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MedicaoC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MedicaoC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a.getNome();
    }
}
