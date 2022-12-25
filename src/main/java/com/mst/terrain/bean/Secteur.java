package com.mst.terrain.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Secteur {

	@Id @GeneratedValue
	private Long id;
	private String label;
	@Column(name = "code", unique = true)
	private String code;


	public Secteur() {
	}

	public Secteur(String label, String code) {
		this.label = label;
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
