package com.projeto.escolar.DTO;

import java.io.Serializable;
import java.util.Date;

import com.projeto.escolar.entities.UnidadeEntity;

public class UnidadeDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long cd_escola;
	private String nm_escola;
	private int cnpj;
	private Date dt_inscricao;
	private String sn_ativa;
	private int cd_endereco;
	private int cd_turma;
	private int cd_professor;
	
	public UnidadeDTO() {
		
	}

	public UnidadeDTO(Long cd_escola, String nm_escola, int cnpj, Date dt_inscricao, 
						 String sn_ativa, int cd_endereco,int cd_turma, int cd_professor) {
		
		this.cd_escola = cd_escola;
		this.nm_escola = nm_escola;
		this.cnpj = cnpj;
		this.dt_inscricao = dt_inscricao;
		this.sn_ativa = sn_ativa;
		this.cd_endereco = cd_endereco;
		this.cd_turma = cd_turma;
		this.cd_professor = cd_professor;
	}
	
	public UnidadeDTO(UnidadeEntity entity) {
		this.cd_escola = entity.getCd_escola();
		this.nm_escola = entity.getNm_escola();
		this.cnpj = entity.getCnpj();
		this.sn_ativa = entity.getSn_ativa();
		
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

	public Date getDt_inscricao() {
		return dt_inscricao;
	}

	public void setDt_inscricao(Date dt_inscricao) {
		this.dt_inscricao = dt_inscricao;
	}

	public String getSn_ativa() {
		return sn_ativa;
	}

	public void setSn_ativa(String sn_ativa) {
		this.sn_ativa = sn_ativa;
	}

	public int getCd_endereco() {
		return cd_endereco;
	}

	public int getCd_turma() {
		return cd_turma;
	}

	public int getCd_professor() {
		return cd_professor;
	}
}
