package com.projeto.escolar.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tutor")
public class TutorEntity {
	 
	private Long cdTutor;
	private String nomeTutor;
	private String senhaTutor;
	private long foneTutor;
	private Date dataNacTutor;
	private EnderecoEntity endereco;
	
	public TutorEntity() {
		
	}

	public TutorEntity(Long cdTutor, String nomeTutor, 
			String senhaTutor, long foneTutor, Date dataNacTutor,
			EnderecoEntity endereco) {
		this.cdTutor = cdTutor;
		this.nomeTutor = nomeTutor;
		this.senhaTutor = senhaTutor;
		this.foneTutor = foneTutor;
		this.dataNacTutor = dataNacTutor;
		this.endereco = endereco;
	}

	//gettes & settes
	public Long getCdTutor() {
		return cdTutor;
	}

	public void setCdTutor(Long cdTutor) {
		this.cdTutor = cdTutor;
	}

	public String getNomeTutor() {
		return nomeTutor;
	}

	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	public String getSenhaTutor() {
		return senhaTutor;
	}

	public void setSenhaTutor(String senhaTutor) {
		this.senhaTutor = senhaTutor;
	}

	public long getFoneTutor() {
		return foneTutor;
	}

	public void setFoneTutor(long foneTutor) {
		this.foneTutor = foneTutor;
	}

	public Date getDataNacTutor() {
		return dataNacTutor;
	}

	public void setDataNacTutor(Date dataNacTutor) {
		this.dataNacTutor = dataNacTutor;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
