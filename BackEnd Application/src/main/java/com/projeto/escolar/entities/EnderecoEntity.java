package com.projeto.escolar.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class EnderecoEntity {

	private Long cdEndereco;
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	@ManyToOne
	@JoinColumn(name ="cd_escola")
	private UnidadeEntity unidade;
	
	public EnderecoEntity() {
		
	}

	public EnderecoEntity(Long cdEndereco, String rua, 
						  String bairro, String cidade, 
						  String uf, String cep) {
		this.cdEndereco = cdEndereco;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getCdEndereco() {
		return cdEndereco;
	}
	
	
	
	
}
