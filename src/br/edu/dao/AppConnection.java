package br.edu.DAO;

import br.edu.swing.MensagemErro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AppConnection {
private static Connection con;
	
	
	/**
	 * Recupera a conex�o.  Se n�o estiver aberta, tenta abrir.
	 * @return conex�o.
	 */
	public static Connection getConnection() throws SQLException {
		if (con == null || con.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				  con = DriverManager.getConnection
				    ("jdbc:mysql://localhost:3306/cadastro", "aluno", "aluno");
			} catch (ClassNotFoundException | SQLException ex) {
                             MensagemErro m = new MensagemErro();
                                            m.jLabelErro.setText("Erro ao abrir conexao com banco");
                                            m.jLabelDetalhes.setText(ex.toString());
                                          m.setVisible(true);
				System.err.print("Erro na conex�o:" + ex.getLocalizedMessage());
			}
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
