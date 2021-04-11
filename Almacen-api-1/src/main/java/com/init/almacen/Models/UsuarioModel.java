package com.init.almacen.Models;


import javax.persistence.*;


@Entity
@Table(name= "productos")
public class UsuarioModel {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable=false, length=30)
	private String name;
	
	@Column(name="precio",nullable=false)
	private Integer precio;
	
	@Column(name="cantidad",nullable=false)
	private Integer cantidad;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}


	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	
	
}