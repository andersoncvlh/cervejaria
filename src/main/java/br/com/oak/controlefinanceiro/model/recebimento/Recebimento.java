package br.com.oak.controlefinanceiro.model.recebimento;

import br.com.oak.controlefinanceiro.model.AbstractModel;

public class Recebimento extends AbstractModel{

	private static final long serialVersionUID = -13863914246989281L;
	
	
	private String descricao;
	
	private Double valor;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
