package br.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.AulaM;
import br.edu.tools.ExibeMensagens;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AulaDAO {

    //insere uma aula no banco
    public int inserir(AulaM al) throws SQLException, ClassNotFoundException {
        int incluido = 0;
        Connection con = br.edu.DAO.AppConnection.getConnection();
        String insert = "insert into aula (id_professor, conteudo, capacidade_alunos, hora_inicio,hora_fim)"
                + "values (?,?,?, STR_TO_DATE(?,'%H:%i:%s'),STR_TO_DATE(?,'%H:%i:%s'));";

        PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);
        ps.setInt(1, al.getId_professor());
        ps.setString(2, al.getConteudo());
        ps.setInt(3, al.getCapacidade_alunos());
        ps.setString(4, al.getHora_inicio());
        ps.setString(5, al.getHora_fim());
        incluido = ps.executeUpdate();

        ps.close();
        con.close();

        return incluido;
    }

    public List<AulaM> listartodos() {

        ArrayList<AulaM> list = new ArrayList<AulaM>();
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery("select a.id, p.nome, a.conteudo, a.capacidade_alunos, date_format(a.hora_inicio,'%h:%i:%s') as hora_inicio,  date_format(a.hora_fim,'%h:%i:%s') as hora_fim"
                    + " from aula a , professor p"
                    + " where a.id_professor = p.id;");
            while (rs.next()) {
                AulaM a = new AulaM();
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
    
    public int excluir(int id) throws SQLException, ClassNotFoundException {
        int excluidos = 0;
        String delete = "delete from aula "
                + "where id = ?;";
        Connection con = AppConnection.getConnection();
        try (PreparedStatement ps = (PreparedStatement) con.prepareStatement(delete)) {
            ps.setInt(1, id);
            excluidos = ps.executeUpdate();
        }
        con.close();
        return excluidos;
    }
    
    
    public AulaM buscar(int id) throws SQLException, ClassNotFoundException {
        AulaM a = new AulaM();
        Connection con = AppConnection.getConnection();
        Statement stmt = (Statement) con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select a.id as id, p.nome as nome_professor, conteudo, capacidade_alunos, hora_inicio, hora_fim"
                + " from aula a , professor p"
                + " where p.id = " + id + ";");
        while (rs.next()) {

            a.setId(rs.getInt("id"));
            a.setNome_professor(rs.getString("nome_professor"));
            a.setConteudo(rs.getString("conteudo"));
            a.setCapacidade_alunos(rs.getInt("capacidade_alunos"));
            a.setHora_inicio(rs.getString("hora_inicio"));
            a.setHora_fim(rs.getString("hora_fim"));
        }

        return a;
    }
}
