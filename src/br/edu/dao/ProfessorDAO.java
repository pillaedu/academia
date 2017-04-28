package br.edu.dao;

import br.edu.entity.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.Professor;
import br.edu.swing.MensagemErro;
import br.edu.swing.MensagemOK;
import br.edu.tools.ExibeMensagens;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    //insere um aluno no banco

    public void inserir(Professor p) {
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();
            String insert = "insert into professor (nome)"
                    + "valueS (?) ;";

            try (PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert)) {
                ps.setString(1, p.getNome());
                int incluido = ps.executeUpdate();
                if (incluido > 0) {
                    ExibeMensagens.mensagemok("Professor inserido com sucesso");
                }
            }
            con.close();

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao inserir professor", e);
        }

    }

    public List<Professor> listartodos() {

        ArrayList<Professor> list = new ArrayList<Professor>();
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();

            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select id,nome from professor;");
            while (rs.next()) {
                Professor p = new Professor();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));

                list.add(p);

            }

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao buscar professor", e);
        }
        if (list.isEmpty()) {
            ExibeMensagens.mostramensagem("Não ha professores");
            return null;

        } else {
            return list;
        }

    }

    public Professor buscar(int id) {
        Professor p = new Professor();
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select id,nome from professor "
                    + "where id =" + id + ";");
            while (rs.next()) {

                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));

            }

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao buscar ID " + id, e);
        }
        if (p.getId() > 0) {
            return p;
        } else {
            ExibeMensagens.mostramensagem("Não ha professor com o ID " + id);
            return null;
        }

    }

    public void excluir(int id) {      
        try {
              Connection con = br.edu.DAO.AppConnection.getConnection();
            String delete = "delete from professor "
                    + "where id = ? ";

            try (PreparedStatement ps = (PreparedStatement) con.prepareStatement(delete)) {
                ps.setInt(1, id);
                int excluidos = ps.executeUpdate();
                if (excluidos > 0) {
                    ExibeMensagens.mensagemok("Professor excluido com sucesso");
                }
            }
            con.close();

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao excluir professor", e);
        }

    }

}
