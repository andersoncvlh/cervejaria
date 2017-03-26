package br.com.oak.controlefinanceiro.model.recebimento;

import br.com.oak.controlefinanceiro.model.AbstractModel;

public class CategoriaRecebimento extends AbstractModel {

	private static final long serialVersionUID = -7130661232281521875L;
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
