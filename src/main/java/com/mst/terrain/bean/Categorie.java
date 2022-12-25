package com.mst.terrain.bean;

import javax.persistence.*;

@Entity
public class Categorie {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "label")
	private String label;
	@Column(name = "code", unique = true)
	private String code;

	public Categorie() {
	}

	public Categorie(String label, String code) {
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

	@Override
	public String toString() {
		return "Categorie{" +
				"id=" + id +
				", label='" + label + '\'' +
				'}';
	}
}
