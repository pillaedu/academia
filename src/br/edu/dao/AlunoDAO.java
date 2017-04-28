package br.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.entity.Aluno;
import br.edu.swing.MensagemErro;
import br.edu.swing.MensagemOK;
import br.edu.tools.ExibeMensagens;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunoDAO {

    //insere um aluno no banco

    public void inserir(Aluno a) {
        
        
        try {
            Connection con = AppConnection.getConnection();
            String insert = "insert into aluno (nome,email,idade,peso,altura)"
                    + "valueS (?,?,?,?,?)";

            try (PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert)) {
                ps.setString(1, a.getNome());
                ps.setString(2, a.getEmail());
                ps.setInt(3, a.getIdade());
                ps.setFloat(4, a.getPeso());
                ps.setFloat(5, a.getAltura());

                int incluido = ps.executeUpdate();
                if (incluido > 0) {
                    ExibeMensagens.mostramensagemaluno(retornaultimo());
                }
            }
            con.close();

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao inserir Aluno", e);

        }
    }

    public List<Aluno> listartodos() {
        
        ArrayList<Aluno> list = new ArrayList<Aluno>();
        try {
         Connection con = AppConnection.getConnection();

            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select id,nome,email,idade,peso,altura from aluno;");
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEmail(rs.getString("email"));
                a.setIdade(rs.getInt("idade"));
                a.setPeso(rs.getFloat("peso"));
                a.setAltura(rs.getFloat("altura"));
                list.add(a);

            }

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao buscar alunos", e);
        }

        if (list.isEmpty()) {
            ExibeMensagens.mostramensagem("Não ha alunos");
            return null;
        } else {
            return list;
        }

    }

    public int retornaultimo() {
        int id = 0;
        try {
            Connection con = AppConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select max(id) as id from aluno;");
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao Buscao Aluno", e);
        }
        if (id > 0) {
            return id;
        } else {
            ExibeMensagens.mostramensagem("Não foi possivel cadastrar o aluno " + id);
            return 0;
        }

    }

    public Aluno buscar(int id) {
        Aluno a = new Aluno();
        
        try {
            Connection con = AppConnection.getConnection();
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select id,nome,email,idade,peso,altura from aluno "
                    + "where id =" + id + ";");
            while (rs.next()) {

                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEmail(rs.getString("email"));
                a.setIdade(rs.getInt("idade"));
                a.setPeso(rs.getFloat("peso"));
                a.setAltura(rs.getFloat("altura"));
            }

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao Buscao Aluno", e);
        }
        if (a.getId() > 0) {
            return a;
        } else {
            ExibeMensagens.mostramensagem("Não ha aluno com id " + id);
            return null;
        }

    }

    public void excluir(int id) {
        
        try {
            String delete = "delete from aluno "
                    + "where id = ?;";
            Connection con = AppConnection.getConnection();
            try (PreparedStatement ps = (PreparedStatement) con.prepareStatement(delete)) {
                ps.setInt(1, id);
                int excluidos = ps.executeUpdate();
                if (excluidos > 0) {
                    ExibeMensagens.mensagemok("Aluno excluido com sucesso");
                } else {
                    ExibeMensagens.mostramensagem("Não ha aluno com esse id");
                }
            }
            con.close();

        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao excluir aluno", e);
        }
    }

}
