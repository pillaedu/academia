package br.edu.DAO;

import br.edu.swing.MensagemErro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AppConnection {

    private static Connection con;

    /**
     * Recupera a conex�o. Se n�o estiver aberta, tenta abrir.
     *
     * @return conex�o.
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if (con == null || con.isClosed()) {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "aluno", "aluno");

        }
        return con;
    }

    public static void closeConnection() {
        if (con != null) {
            try {
                con = null;
                con.close();

            } catch (Exception ex) {
                System.err.print("Erro ao fechar a conex�o:" + ex.getLocalizedMessage());
            }

        }
    }

}
