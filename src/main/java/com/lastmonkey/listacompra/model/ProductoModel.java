package com.lastmonkey.listacompra.model;

public class ProductoModel {
	
	private int id;
	private String producto;
	private int cantidad;
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public ProductoModel(int id, String producto, int cantidad) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "ProductoModel [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + "]";
	}



	public ProductoModel(){}
}
