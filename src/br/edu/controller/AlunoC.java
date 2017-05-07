
package br.edu.controller;

import br.edu.entity.AlunoM;
import br.edu.DAO.AlunoDAO;
import br.edu.tools.ExibeMensagens;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoC {
    
    public void gravaraluno(String nome, String email, int idade, int mes) {
        int idultimo = 0;

        AlunoM model = new AlunoM();
        model.setNome(nome);
        model.setEmail(email);
        model.setIdade(idade);
        model.setMes(mes);

        AlunoDAO dao = new AlunoDAO();

        int res = 0;

        try {
            res = dao.inserir(model);
            if (res > 0) {
                idultimo = dao.retornaultimo();
            }
            if (idultimo > 0) {
                ExibeMensagens m = new ExibeMensagens();
                m.mostramensagemaluno(idultimo);
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao Gravar o aluno de nome " + model.getNome(), ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.erroconexao("Erro ao Abrir a Conexâo", ex);
        }
    }
    
    public AlunoM pesquisaraluno(int id){
        AlunoM m = new AlunoM();
        AlunoDAO dao = new AlunoDAO();
        try {
            m = dao.buscar(id);
        } catch (ClassNotFoundException ex) {
           ExibeMensagens n = new ExibeMensagens();
           n.erroconexao("Erro ao Abrir a Conexâo", ex);
        } catch (SQLException ex) {
            ExibeMensagens c = new ExibeMensagens();
            c.mostaerro("Erro ao Buscar id " + m.getNome(), ex);        
        }
        return m;
    }
    
     
    public void excluiraluno(int id) {

        AlunoDAO dao = new AlunoDAO();
        try {
            int e = dao.excluir(id);
            if (e > 0) {
                ExibeMensagens m = new ExibeMensagens();
                m.mensagemok("Aluno id " + id + " excluido com sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao excluir aluno", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens n = new ExibeMensagens();
            n.erroconexao("Erro ao Abrir a Conexâo", ex);
        }
    }

    public List<AlunoM> listartodos(){
        ArrayList<AlunoM> list = new ArrayList<AlunoM>();
        
        AlunoDAO dao = new AlunoDAO();
        try {
            list = dao.listartodos();
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao buscar alunos", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens n = new ExibeMensagens();
            n.erroconexao("Erro ao Abrir a Conexâo", ex);
        }
        
        return list;
    } 
}
