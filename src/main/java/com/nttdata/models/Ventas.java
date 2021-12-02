package com.nttdata.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas") 
public class Ventas {

	@Id // clave primaria
	@GeneratedValue(strategy= GenerationType.IDENTITY) //auto incrementable
	private Long id;
	
	private String nombreProducto;
	private String codigo;
	private Integer precio;
	public Ventas() {
		super();
	}
	public Ventas(Long id, String nombreProducto, String codigo, Integer precio) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.codigo = codigo;
		this.precio = precio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
}
