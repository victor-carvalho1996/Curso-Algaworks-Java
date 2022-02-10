package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {

	@NotBlank(message = "NOME e um campo obrigatório.")
	private String nome;
	
	@NotBlank(message = "E-MAIL e um campo obrigatório.")
	private String email;
	
	private String dataNascimento;
	
	private String senha;
	
	private String confirmacaoSenha;
	
	private Boolean status;
	
	private Boolean administrador;
	
	private Boolean vendedor;

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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Boolean administrador) {
		this.administrador = administrador;
	}

	public Boolean getVendedor() {
		return vendedor;
	}

	public void setVendedor(Boolean vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
}
