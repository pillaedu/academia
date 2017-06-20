
package br.edu.controller;

import br.edu.DAO.AulaDAO;
import br.edu.dao.ProfessorDAO;
import br.edu.entity.AulaM;
import br.edu.tools.ExibeMensagens;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class AulaC {

    public void insere(String matricula, String conteudo, String capacidade, String horainicio, String horafim) {
        AulaM model = new AulaM();
        model.setId_professor(Integer.parseInt(matricula));
        model.setConteudo(conteudo);
        model.setCapacidade_alunos(Integer.parseInt(capacidade));
        model.setHora_inicio(horainicio + ":00");
        model.setHora_fim(horafim + ":00");

        AulaDAO dao = new AulaDAO();
        try {
            int i = dao.inserir(model);
            if (i > 0) {
                ExibeMensagens m = new ExibeMensagens();
                m.mensagemok("Aula Inserida com Sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao inserir aula", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens n = new ExibeMensagens();
            n.erroconexao("Erro ao Abrir a Conexâo", ex);
        }
    }

    public void excluir(String id) {
        ProfessorDAO dao = new ProfessorDAO();
        try {
            int i = dao.excluir(Integer.parseInt(id));
            if (i > 0) {
                ExibeMensagens m = new ExibeMensagens();
                m.mensagemok("Aula Excluida com sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao excluir Aula", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens n = new ExibeMensagens();
            n.erroconexao("Erro ao Abrir a Conexâo", ex);
        }
    }

    public AulaM buscar(String id) {
        AulaM model = new AulaM();
        AulaDAO dao = new AulaDAO();

        try {
            model = dao.buscar(Integer.parseInt(id));
            if (model.getId() < 0) {
                ExibeMensagens m = new ExibeMensagens();
                m.mostramensagem("Não há aula com esse ID");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao excluir aluno", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens n = new ExibeMensagens();
            n.erroconexao("Erro ao Abrir a Conexâo", ex);
        }

        return model;
    }

    public List<AulaM> listartodos() {
        List<AulaM> list = new ArrayList();
        AulaDAO dao = new AulaDAO();

        try {
            list = dao.listartodos();
            if (list.isEmpty()) {
                ExibeMensagens m = new ExibeMensagens();
                m.mostramensagem("Não há aulas");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao buscar Aulas", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.erroconexao("Erro ao Abrir conexão", ex);
        }

        return list;
    }

}
