package br.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.entity.MedicoesM;

public class MedicoesDAO {
    //insere uma medicao no banco
    public int inserir(MedicoesM m) throws SQLException, ClassNotFoundException {
        Connection con = AppConnection.getConnection();
        String insert = "insert into medicoes (data,id_aluno,peso,altura)"
                + "values (curdate(),?,?,?)";

        PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);
        //ps.setDate(1, m.getData());
        ps.setInt(1, m.getId_aluno());
        ps.setFloat(2, m.getPeso());
        ps.setFloat(3, m.getAltura());

        int resultado = ps.executeUpdate();
        ps.close();
        con.close();
        return resultado;
    }

}
