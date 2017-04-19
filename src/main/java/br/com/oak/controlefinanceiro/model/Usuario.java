package br.com.oak.controlefinanceiro.model;

import java.util.Date;
import java.util.List;

public class Usuario extends AbstractModel {

	private static final long serialVersionUID = 1468858404881240624L;

	private String nome;
	
	private String email;
	
	private Date dataNascimento;
	
	private Date dataCadastro;
	
	private String password;
	
	private String confirmPass;
	
	private Integer status;
	
	private List<String> grupoPermissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<String> getGrupoPermissao() {
		return grupoPermissao;
	}

	public void setGrupoPermissao(List<String> grupoPermissao) {
		this.grupoPermissao = grupoPermissao;
	}
	
}
