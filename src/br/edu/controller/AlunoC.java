
package br.edu.controller;

import br.edu.entity.AlunoM;
import br.edu.DAO.AlunoDAO;
import br.edu.entity.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoC {
    
    public int gravaraluno(String nome, String email, int idade, int mes){
        int idultimo = 0;
        
        AlunoM model = new AlunoM();
        model.setNome(nome);
        model.setEmail(email);
        model.setIdade(idade);
        model.setMes(mes);
        
        
        AlunoDAO dao = new AlunoDAO();
        
        int res = dao.inserir(model);
        
        if (res >0){
            idultimo = dao.retornaultimo();
        }
        return idultimo;
    }
    
    public AlunoM pesquisaraluno(int id){
        AlunoM m = new AlunoM();
        AlunoDAO dao = new AlunoDAO();
        m = dao.buscar(id);
        
        return m;
    }
    
    public void excluiraluno(int id){
      
        AlunoDAO dao = new AlunoDAO();
        dao.excluir(id);
    }

    public List<AlunoM> listartodos(){
        ArrayList<AlunoM> list = new ArrayList<AlunoM>();
        
        AlunoDAO dao = new AlunoDAO();
        list = dao.listartodos();
        
        return list;
    } 
}
