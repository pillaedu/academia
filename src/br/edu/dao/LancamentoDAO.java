package br.edu.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.Lancamento;
import br.edu.tools.ExibeMensagens;

public class LancamentoDAO {

    //insere um lancamento no banco
    public void inserir(Lancamento l) {

        try {
            String insert = "insert into lancamento(tipo,valor,data)"
                    + "values (?,?,?)";
            Connection con = AppConnection.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);
            ps.setString(1, l.getTipo());
            ps.setFloat(2, l.getValor());
            ps.setDate(3, (Date) l.getData());

            int resultado = ps.executeUpdate();
            if (resultado != 0) {
                ExibeMensagens.mensagemok("Lançamento incluido com sucesso");
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao inserir lancamento", e);
        }
    }

}
