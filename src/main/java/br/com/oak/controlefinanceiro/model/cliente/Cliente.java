package br.com.oak.controlefinanceiro.model.cliente;

import br.com.oak.controlefinanceiro.model.AbstractModel;

public class Cliente extends AbstractModel {

	private static final long serialVersionUID = 1688152161587772810L;

	private String nome;
	
	private String tipoPessoa;
	
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
