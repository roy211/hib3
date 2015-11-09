package com.prueba;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	
	@Id
	@Column(name = "idp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idp;
	
	@Column(name = "empresa", nullable = false)
	private String empresa;
	
	@ManyToOne
	private Lacalidad local;

	public Long getIdp() {
		return idp;
	}

	public void setIdp(Long idp) {
		this.idp = idp;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Lacalidad getLocal() {
		return local;
	}

	public void setLocal(Lacalidad local) {
		this.local = local;
	}
	
	
	
	

}
