
package br.edu.controller;

import br.edu.DAO.LancamentoDAO;
import br.edu.entity.LancamentoM;
import java.sql.SQLException;
import br.edu.tools.ExibeMensagens;

public class LancamentoC {
    public void incluir(String tipo, String valor, String descricao) {
        LancamentoM model = new LancamentoM();
        model.setTipo(tipo);
        model.setValor(Integer.parseInt(valor));
        model.setDescricao(descricao);

        LancamentoDAO dao = new LancamentoDAO();

        try {
            int i = dao.inserir(model);
            if (i > 0) {
                ExibeMensagens m = new ExibeMensagens();
                m.mensagemok("Lançamento incluido com sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.mostaerro("Erro ao inserir lancamento", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens m = new ExibeMensagens();
            m.erroconexao("Erro ao abrir a conexao", ex);
        }
    }
    
    
}
