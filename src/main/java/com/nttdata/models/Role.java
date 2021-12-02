package com.nttdata.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	
	@Id //clave primaria o PK
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto incrementable
	private Long id;
	private String nombre;
	
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;
	
	
	public Role() {
		super();
	}


	public Long getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	

}
