package br.edu.entity;

import java.util.Date;

public class Participacao {
	private int id_aluno;
	private int id_aula;
	private int id_professor;
	private Date data;
	
	
	
	
	
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public int getId_aula() {
		return id_aula;
	}
	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}
	public int getId_professor() {
		return id_professor;
	}
	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

}
