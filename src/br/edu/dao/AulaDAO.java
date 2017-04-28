package br.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.Aula;
import br.edu.swing.MensagemErro;
import br.edu.swing.MensagemOK;
import br.edu.tools.ExibeMensagens;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AulaDAO {

    //insere uma aula no banco

    public void inserir(Aula al) {

        int incluido = 0;
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();//comentario para testar git
            String insert = "insert into aula (id_professor, conteudo, capacidade_alunos, hora_inicio,hora_fim)"
                    + "values (?,?,?, STR_TO_DATE(?,'%H:%i:%s'),STR_TO_DATE(?,'%H:%i:%s'));";

            PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);
            ps.setInt(1, al.getId_professor());
            ps.setString(2, al.getConteudo());
            ps.setInt(3, al.getCapacidade_alunos());
            ps.setString(4, al.getHora_inicio());
            ps.setString(5, al.getHora_fim());
            incluido = ps.executeUpdate();

            if (incluido > 0) {
                ExibeMensagens.mensagemok("Aula grava com sucesso");
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao inserir aula", e);
        }

    }

    public List<Aula> listartodos() {

        ArrayList<Aula> list = new ArrayList<Aula>();
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery("select a.id, p.nome, a.conteudo, a.capacidade_alunos, date_format(a.hora_inicio,'%h:%i:%s') as hora_inicio,  date_format(a.hora_fim,'%h:%i:%s') as hora_fim"
                    + " from aula a , professor p"
                    + " where a.id_professor = p.id;");
            while (rs.next()) {
                Aula a = new Aula();
                a.setId(rs.getInt("a.id"));
                a.setNome_professor(rs.getString("p.nome"));
                a.setConteudo(rs.getString("a.conteudo"));
                a.setCapacidade_alunos(rs.getInt("a.capacidade_alunos"));
                a.setHora_inicio(rs.getString("hora_inicio"));
                a.setHora_fim(rs.getString("hora_fim"));
                list.add(a);

            }

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao buscar Aulas Tente Novamente ", e);
        }

        if (list.isEmpty()) {
            ExibeMensagens.mostramensagem("Não há aulas com esse ID, favor tentar novamente");
            return null;
        } else {
            return list;
        }

    }

}
