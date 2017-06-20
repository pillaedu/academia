package br.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.LancamentoM;
import br.edu.tools.ExibeMensagens;

public class LancamentoDAO {

    //insere um lancamento no banco
    public int inserir(LancamentoM l) throws SQLException, ClassNotFoundException {

        String insert = "insert into lancamento(tipo,valor,data)"
                + "values (?,?,curdate())";
        Connection con = AppConnection.getConnection();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);
        ps.setString(1, l.getTipo());
        ps.setInt(2, l.getValor());

        int resultado = ps.executeUpdate();
        ps.close();
        con.close();

        return resultado;
    }
}