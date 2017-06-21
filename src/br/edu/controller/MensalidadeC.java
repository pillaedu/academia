
package br.edu.controller;

import br.edu.dao.MensalidadeDAO;
import br.edu.entity.MensalidadeM;
import br.edu.tools.ExibeMensagens;
import java.sql.SQLException;

public class MensalidadeC {
    public void gravar(String mes, String id_aluno, String valor){
        MensalidadeM model = new MensalidadeM();
        model.setMes(mes);
        model.setId_aluno(Integer.parseInt(id_aluno));
        model.setValor(Float.parseFloat(valor));
        
        MensalidadeDAO dao = new MensalidadeDAO();
        try {
            int n = dao.inserir(model);
            if(n > 0){
                ExibeMensagens msg = new ExibeMensagens();
                msg.mensagemok("Recebido com Sucesso");
            }
        } catch (SQLException ex) {
            ExibeMensagens msg = new ExibeMensagens();
            msg.mostaerro("Erro ao inserir aluno", ex);
        } catch (ClassNotFoundException ex) {
            ExibeMensagens msg = new ExibeMensagens();
            msg.erroconexao("Erro ao inserir aluno", ex);
        }
    }
}
