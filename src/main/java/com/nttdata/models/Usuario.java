package com.nttdata.models;

import java.sql.Date;
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
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usuarios") 
public class Usuario {

	
	@Id // clave primaria
	@GeneratedValue(strategy= GenerationType.IDENTITY) //auto incrementable
	private Long id;
	@NotNull
	@NotEmpty
	private String nombre;
	private String email;
	private String password;
	@Transient
	private String passwordConfirmation;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
		name="roles_usuarios",//tabla intermedia
		joinColumns = @JoinColumn(name="usuario_id"),
		inverseJoinColumns = @JoinColumn(name="role_id")
	)
	private List<Role> roles;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	public Usuario() {
		super();
	}
	
	
	public Usuario(Long id, @NotNull @NotEmpty String nombre, String email, String password,
			String passwordConfirmation, List<Role> roles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
		this.roles = roles;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}


	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}