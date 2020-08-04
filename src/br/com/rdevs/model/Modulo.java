package br.com.rdevs.model;

import java.util.Date;

public class Modulo {
	private String nome;
	private String instrutorTitular;
	private String instrutorAuxiliar;
	private Date dtInicio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstrutorTitular() {
		return instrutorTitular;
	}
	public void setInstrutorTitular(String instrutor) {
		this.instrutorTitular = instrutor;
	}
	public String getInstrutorAuxiliar() {
		return instrutorAuxiliar;
	}
	public void setInstrutorAuxiliar(String instrutorAux) {
		this.instrutorAuxiliar = instrutorAux;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date date) {
		this.dtInicio = date;
	}
	
}
