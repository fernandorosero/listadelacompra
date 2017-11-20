package com.lastmonkey.listacompra.model;

public class ProductoModel {
	
	private int id_producto;
	private String producto;
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
	public ProductoModel(int id_producto, String producto, int cantidad) {
		super();
		this.id_producto = id_producto;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "ProductoModel [id_producto=" + id_producto + ", producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	public ProductoModel(){}
}
