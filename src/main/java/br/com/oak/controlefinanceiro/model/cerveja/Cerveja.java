package br.com.oak.controlefinanceiro.model.cerveja;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import br.com.oak.controlefinanceiro.model.AbstractModel;

public class Cerveja extends AbstractModel {

	private static final long serialVersionUID = -3599283149561906880L;

	@NotBlank(message="SKU é obrigatório.")
	private String sku;
	
	@NotBlank(message="Nome é obrigatório.")
	private String nome;
	
	@NotBlank(message="Descrição é obrigatório.")
	@Size(max=50, message="O tamanho da descrição deve estar entre 1 e 50.")
	private String descricao;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
