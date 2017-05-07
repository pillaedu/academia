package br.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.Professor;
import br.edu.entity.ProfessorM;
import br.edu.swing.MensagemErro;
import br.edu.swing.MensagemOK;
import br.edu.tools.ExibeMensagens;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    //insere um aluno no banco

    public int inserir(ProfessorM p) throws SQLException, ClassNotFoundException {
        Connection con;
        int i = 0;
        con = br.edu.DAO.AppConnection.getConnection();
        String insert = "insert into professor (nome)"
                + "valueS (?) ;";

        PreparedStatement ps;
        ps = (PreparedStatement) con.prepareStatement(insert);
        ps.setString(1, p.getNome());
        i = ps.executeUpdate();

        con.close();
        return i;
    }

    public List<ProfessorM> listartodos() throws SQLException, ClassNotFoundException {

        ArrayList<ProfessorM> list = new ArrayList<ProfessorM>();
        ProfessorM p = new ProfessorM();
        Connection con = br.edu.DAO.AppConnection.getConnection();

        Statement stmt = (Statement) con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select id,nome from professor;");
        while (rs.next()) {
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));

            list.add(p);
        }

        return list;

    }

    public ProfessorM buscar(int id) throws SQLException, ClassNotFoundException {
        ProfessorM p = new ProfessorM();

        Connection con = br.edu.DAO.AppConnection.getConnection();
        Statement stmt = (Statement) con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select id,nome from professor "
                + "where id =" + id + ";");
        while (rs.next()) {

            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));

        }
        return p;
    }

    public int excluir(int id) throws SQLException, ClassNotFoundException {

        Connection con = br.edu.DAO.AppConnection.getConnection();
        String delete = "delete from professor "
                + "where id = ? ";

        PreparedStatement ps;
        ps = (PreparedStatement) con.prepareStatement(delete);
        ps.setInt(1, id);
        int excluidos = ps.executeUpdate();

        con.close();

        return excluidos;
    }

}
