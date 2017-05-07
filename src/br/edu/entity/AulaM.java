package br.edu.entity;

import java.util.Date;

public class AulaM {
	private int id;
	private int id_professor;
	private String conteudo;
	private int capacidade_alunos;
        private String hora_inicio;
        private String hora_fim;
        private String nome_professor;
        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_professor() {
		return id_professor;
	}
	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public int getCapacidade_alunos() {
		return capacidade_alunos;
	}
	public void setCapacidade_alunos(int capacidade_alunos) {
		this.capacidade_alunos = capacidade_alunos;
	}

    /**
     * @return the hora_inicio
     */
    public String getHora_inicio() {
        return hora_inicio;
    }

    /**
     * @param hora_inicio the hora_inicio to set
     */
    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    /**
     * @return the hora_fim
     */
    public String getHora_fim() {
        return hora_fim;
    }

    /**
     * @param hora_fim the hora_fim to set
     */
    public void setHora_fim(String hora_fim) {
        this.hora_fim = hora_fim;
    }

    /**
     * @return the nome_professor
     */
    public String getNome_professor() {
        return nome_professor;
    }

    /**
     * @param nome_professor the nome_professor to set
     */
    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }
}
