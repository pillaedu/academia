package br.edu.entity;

import java.util.Date;

public class Mensalidade {
	private String mes;
	private String data_vencimento;
	private int id_aluno;
	private String data_pagamento;
	private float valor;
	
	
	
	public String getData_vencimento() {
		return data_vencimento;
	}
	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getData_pagamento() {
		return data_pagamento;
	}
	public void setData_pagamento(String data_pagamento) {
          
		this.data_pagamento = data_pagamento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
