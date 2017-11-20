package com.lastmonkey.listacompra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@Column(name="id_producto", unique = true, nullable =  false, length = 10)
	private int id_producto;
	
	@Column(name="producto", nullable = false, length = 30)
	private String producto;
	
	@Column(name="cantidad", nullable = false, length = 10)
	private int cantidad;

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto(int id_producto, String producto, int cantidad) {
		super();
		this.id_producto = id_producto;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto() {}
	
	
	
}
