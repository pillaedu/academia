package br.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.entity.AlunoM;
import br.edu.tools.ExibeMensagens;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
    //insere um aluno no banco
    public int inserir(AlunoM a) throws SQLException, ClassNotFoundException {
        SQLException e = null;
        int incluido = 0;

        Connection con = AppConnection.getConnection();
        String insert = "insert into aluno (nome,email,idade,mes)"
                + "valueS (?,?,?,?)";

        PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);

        ps.setString(1, a.getNome());
        ps.setString(2, a.getEmail());
        ps.setInt(3, a.getIdade());
        ps.setInt(4, a.getMes());

        incluido = ps.executeUpdate();

        con.close();

        return incluido;
    }

    public ArrayList<AlunoM> listartodos() throws SQLException, ClassNotFoundException {

        ArrayList<AlunoM> list = new ArrayList<AlunoM>();
        Connection con = AppConnection.getConnection();

        Statement stmt = (Statement) con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select id,nome,email,idade from aluno;");
        while (rs.next()) {
            AlunoM a = new AlunoM();
            a.setId(rs.getInt("id"));
            a.setNome(rs.getString("nome"));
            a.setEmail(rs.getString("email"));
            a.setIdade(rs.getInt("idade"));
            list.add(a);

        }

        return list;
    }

    public int retornaultimo() throws SQLException, ClassNotFoundException {
        int id = 0;
        Connection con = AppConnection.getConnection();
        Statement stmt = (Statement) con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "select max(id) as id from aluno;");
        while (rs.next()) {
            id = rs.getInt("id");
        }
        return id;
   }

    public AlunoM buscar(int id) throws ClassNotFoundException, SQLException {
        AlunoM a = new AlunoM();
            Connection con = AppConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select id,nome,email from aluno "
                    + "where id =" + id + ";");
            while (rs.next()) {

                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEmail(rs.getString("email"));

            }
            return a;
     }

    public int excluir(int id) throws SQLException, ClassNotFoundException {

        String delete = "delete from aluno "
                + "where id = ?;";
        Connection con = AppConnection.getConnection();
        PreparedStatement ps;
        ps = (PreparedStatement) con.prepareStatement(delete);
        ps.setInt(1, id);
        int excluidos = ps.executeUpdate();

        con.close();
        return excluidos;
    }

/*
    public List<AlunoM> listardevedores(String mes) {

        ArrayList<Alunoold> list = new ArrayList<Alunoold>();
        try {
            Connection con = AppConnection.getConnection();

            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select a.id as id,a.nome as nome,a.email as email"
                    + " from aluno a, mensalidade m, vencimento_aluno v"
                    + " where 'janeiro' not in (select mes from mensalidade where id_aluno = a.id)"
                    + " and a.mes <  (Select Month(now()));");
            while (rs.next()) {
                Alunoold a = new Alunoold();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEmail(rs.getString("email"));

                list.add(a);
            }

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao buscar devedores", e);
        }

        if (list.isEmpty()) {
            ExibeMensagens.mostramensagem("Não ha devedores para o mes de " + mes);
            return null;
        } else {
            return list;
        }

    }
*/
}
