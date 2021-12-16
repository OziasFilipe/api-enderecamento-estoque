package com.laborsil.start.model;

import javax.persistence.*;

@Entity
@Table(name = "PCPRODUT")
public class ControllerEntity {
	
	@Id
	@Column(name = "CODPROD")
	private Long CODPROD;


	@Column(name = "DESCRICAO")
	private Long DESCRICAO;
	
	@Column(name = "CODMARCA")
	private String CODMARCA;

	
	public Long getCODPROD() {
		return CODPROD;
	}

	public void setCODPROD(Long cODPROD) {
		CODPROD = cODPROD;
	}

	public Long getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(Long dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}

	public String getCODMARCA() {
		return CODMARCA;
	}

	public void setCODMARCA(String cODMARCA) {
		CODMARCA = cODMARCA;
	}
	
	

	
}