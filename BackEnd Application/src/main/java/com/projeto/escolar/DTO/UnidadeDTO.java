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

	
	public UnidadeDTO() {
		
	}

	public UnidadeDTO(Long cd_escola, String nm_escola, 
					  int cnpj, Date dt_inscricao, 
					  String sn_ativa ) {
		
		this.cd_escola = cd_escola;
		this.nm_escola = nm_escola;
		this.cnpj = cnpj;
		this.dt_inscricao = dt_inscricao;
		this.sn_ativa = sn_ativa;
		
	}
	
	public UnidadeDTO(UnidadeEntity entity) {
		this.cd_escola = entity.getCd_escola();
		this.nm_escola = entity.getNm_escola();
		this.cnpj = entity.getCnpj();
		this.sn_ativa = entity.getSn_ativa();
		this.dt_inscricao = entity.getDataInscricao();
		
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

}
