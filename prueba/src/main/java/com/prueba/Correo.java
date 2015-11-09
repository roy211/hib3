package com.prueba;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;


@Entity
@Table(name = "correo")


@NamedNativeQuery(name=Correo.BUSCAR_TODOS, query="SELECT c.* from correo c inner join estatus e on c.id = e.idEstatus where e.codigo ='abierto'  ",resultClass=Correo.class) 
public class Correo {
	
	public static final String BUSCAR_TODOS = "Correo.buscar"; 
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = true)
	private Usuario cliente;

	@ManyToOne( optional = false)
	private Proveedor prove;
	
	
	@Column(name = "direccion")
	private String direccion;
	
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Proveedor getProve() {
		return prove;
	}

	public void setProve(Proveedor prove) {
		this.prove = prove;
	}
	
}
