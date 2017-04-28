package br.edu.dao;

import br.edu.entity.Mensalidade;
import br.edu.tools.ExibeMensagens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDAO {

    //insere um aluno no banco

    public void inserir(Mensalidade men) {        
        try {
            Connection con = br.edu.DAO.AppConnection.getConnection();
            String insert = "insert into mensalidade(data_vencimento,mes,id_aluno,data_pagamento,valor)"
                    + " values (str_to_date(?,'%d/%m/%Y'),?,?,curdate(),?);";

            try (PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert)) {

                ps.setString(1, men.getData_vencimento());
                ps.setString(2, men.getMes());
                ps.setInt(3, men.getId_aluno());
                //ps.setString(4, men.getData_pagamento());
                ps.setFloat(4, men.getValor());
                int incluido = ps.executeUpdate();
                if (incluido > 0) {
                    ExibeMensagens.mensagemok("Pagamento inserido");
                }
            }
            con.close();
        } catch (SQLException e) {
            ExibeMensagens.mostaerro("Erro ao inserir pagamento", e);
        }
    }
}
