package com.nttdata.models;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="proyectos")
public class Proyecto {
	
	@Id // clave primaria
	@GeneratedValue(strategy= GenerationType.IDENTITY) //auto incrementable
	private Long id;
	
	private String nombre;
	private String description;
	
	
	@Column(updatable =false)
	private Date createAt;
	
	public Proyecto() {
		super();
	}

	private Date updateAt;

	public Proyecto( String nombre, String description, Date createAt, Date updateAt) {
		super();
		this.nombre = nombre;
		this.description = description;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	

	
	
	

}
