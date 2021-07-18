package com.projeto.escolar.DTO;

import java.util.Date;

import com.projeto.escolar.entities.EnderecoEntity;
import com.projeto.escolar.entities.UnidadeEntity;

public class TesteTDO {
	
	private Long cd_escola;
	private String nm_escola;
	private int cnpj;
	private Date dt_inscricao;
	private String sn_ativa;
	private String rua;
	private String bairro;
	private String cidade;
	
	public TesteTDO() {
		
	}

	public TesteTDO(Long cd_escola, String nm_escola,
				   int cnpj, Date dt_inscricao, String sn_ativa,
				   String rua, String bairro, String cidade) {
		this.cd_escola = cd_escola;
		this.nm_escola = nm_escola;
		this.cnpj = cnpj;
		this.dt_inscricao = dt_inscricao;
		this.sn_ativa = sn_ativa;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public TesteTDO(UnidadeEntity unidade, EnderecoEntity endereco) {
		this.cd_escola = unidade.getCd_escola();
		this.nm_escola = unidade.getNm_escola();
		this.cnpj = unidade.getCnpj();
		this.sn_ativa = unidade.getSn_ativa();
		this.dt_inscricao = unidade.getDataInscricao();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.rua = endereco.getRua();
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
	
	
	
}
