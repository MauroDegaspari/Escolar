package com.projeto.escolar.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="unidade")
public class UnidadeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long cd_escola;
	
	@Column(name="nm_escola", nullable = false)
	private String nm_escola;
	
	@Column(name="CNPJ", nullable = false)
	private int cnpj;
	
	@Column(name="sn_ativa", nullable = false)
	private String sn_ativa;
	
	@Column(name="dt_inscricao")
	private Date dataInscricao;
	
	@OneToMany(mappedBy = "Unidade")
	private EnderecoEntity endereco;
	
	public UnidadeEntity() {
		
	}

	public UnidadeEntity(Long cd_escola, String nm_escola, int cnpj, Date dataInscricao, 
						 String sn_ativa, int cd_endereco,int cd_turma, int cd_professor) {
		
		this.cd_escola = cd_escola;
		this.nm_escola = nm_escola;
		this.cnpj = cnpj;
		this.dataInscricao = dataInscricao;
		this.sn_ativa = sn_ativa;
		
		
	}

	public Long getCd_escola() {
		return cd_escola;
	}

	public void setCd_escola(Long cd_escola) {
		this.cd_escola = cd_escola;
	}

	public String getNm_escola() {
		return nm_escola;
	}

	public void setNm_escola(String nm_escola) {
		this.nm_escola = nm_escola;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getSn_ativa() {
		return sn_ativa;
	}

	public void setSn_ativa(String sn_ativa) {
		this.sn_ativa = sn_ativa;
	}
	
	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}



	
	
	
	
}
