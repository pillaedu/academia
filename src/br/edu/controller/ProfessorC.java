
package br.edu.controller;

import br.edu.dao.ProfessorDAO;
import br.edu.entity.ProfessorM;
import br.edu.tools.ExibeMensagens;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProfessorC {
    public void gravar(String nome){
        
        ProfessorM model = new ProfessorM();
        model.setNome(nome);
        
        ProfessorDAO dao = new ProfessorDAO();
        try {
            int i = dao.inserir(model);
            if (i > 0){
                ExibeMensagens m = new ExibeMensagens();
                m.mensagemok("Operação Realizada com Sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao inserir Professor",ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.erroconexao("Erro ao Abrir Conexão",ex);
        }

    }

    public void excluir(int id) {
        ProfessorM m = new ProfessorM();
        m.setId(id);

        ProfessorDAO dao = new ProfessorDAO();
        try {
            int i = dao.excluir(id);
            if (i > 0) {
                ExibeMensagens msg = new ExibeMensagens();
                msg.mensagemok("Professor excluido com sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens novo = new ExibeMensagens();
            novo.mostaerro("Erro ao inserir Professor", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens msg = new ExibeMensagens();
            msg.erroconexao("Erro ao Abrir Conexão", ex);
        }
    }

    public ProfessorM buscar(int id){
        ProfessorM model = new ProfessorM();
        ProfessorDAO dao = new ProfessorDAO();
        
        try {
            model = dao.buscar(id);
            if(model.getId()< 0){
                ExibeMensagens m = new ExibeMensagens();
                m.mostramensagem("Não há professores com essa matricula");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao inserir Professor",ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.erroconexao("Erro ao Abrir Conexão",ex);
        }
        
        return model;
    }
    
    public List<ProfessorM> listartodos() {
        ArrayList<ProfessorM> list = new ArrayList<ProfessorM>();
        ProfessorDAO dao = new ProfessorDAO();

        try {
            list = (ArrayList<ProfessorM>) dao.listartodos();
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao inserir Professor", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.erroconexao("Erro ao Abrir Conexão", ex);
        }

        return list;
    }
}
