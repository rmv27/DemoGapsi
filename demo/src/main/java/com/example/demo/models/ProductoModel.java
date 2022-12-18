package com.example.demo.models;

import javax.persistance.*;

@Entity
@Table(name="PRODUCTO")
public class ProductoModel {
	
	@Id
	@GeneratedValue(strategy=GenertionType.IDENTITY)
	@Column(unique=true, nullable=false)
	
	private String idProducto;
	private String nombre;
	private String descripcion;
	private String modelo;
	private Double precio;
	
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
