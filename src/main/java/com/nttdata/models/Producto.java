package com.nttdata.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="productos") 
public class Producto {

	@Id // clave primaria
	@GeneratedValue(strategy= GenerationType.IDENTITY) //auto incrementable
	private Long id;
	
	private String nombreProducto;
	private String codigo;
	private Integer precio;
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="categorias_productos",//tabla intermedia
		joinColumns = @JoinColumn(name="producto_id"),
		inverseJoinColumns = @JoinColumn(name="categoria_id")
	)
	private List<Categoria> categoria;
	
	public Producto() {
		super();
	}
	public Producto(Long id, String nombreProducto, String codigo, Integer precio) {
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

	public List<Categoria> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	
}
