package br.edu.dao;

import br.edu.entity.MensalidadeM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensalidadeDAO {

    //insere um aluno no banco

    public int inserir(MensalidadeM men) throws SQLException, ClassNotFoundException {
        Connection con = br.edu.DAO.AppConnection.getConnection();
        String insert = "insert into mensalidade(mes,id_aluno,data_pagamento,valor)"
                + " values (?,?,curdate(),?);";
        PreparedStatement ps = (PreparedStatement) con.prepareStatement(insert);
        ps.setString(1, men.getMes());
        ps.setInt(2, men.getId_aluno());
        ps.setFloat(3, men.getValor());
        int incluido = ps.executeUpdate();
        con.close();
        return incluido;
    }
   
}
