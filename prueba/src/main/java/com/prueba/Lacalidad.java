package com.prueba;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
public class Lacalidad {
	
	@Id
	@Column(name = "idl")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idl;
	
	@Column(name = "lugar", nullable = false)
	private String lugar;

	public Long getIdl() {
		return idl;
	}

	public void setIdl(Long idl) {
		this.idl = idl;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	

}
