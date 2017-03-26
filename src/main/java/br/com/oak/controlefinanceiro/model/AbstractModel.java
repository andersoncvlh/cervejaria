package br.com.oak.controlefinanceiro.model;

import java.io.Serializable;

public class AbstractModel implements Serializable {

	private static final long serialVersionUID = 4161932997428281L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
