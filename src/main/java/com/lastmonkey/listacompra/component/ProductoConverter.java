package com.lastmonkey.listacompra.component;

import org.springframework.stereotype.Component;

import com.lastmonkey.listacompra.entity.Producto;
import com.lastmonkey.listacompra.model.ProductoModel;

@Component("productoConverter")
public class ProductoConverter {
	
	
	/**
	 * Convertir de ProductoModel a Producto
	 */
	public Producto convertProductoModel2Producto(ProductoModel productoModel) {
		Producto producto = new Producto();
		
		producto.setId(productoModel.getId());
		producto.setProducto(productoModel.getProducto());
		producto.setCantidad(productoModel.getCantidad());
		
		return producto;
	}
	
	/***
	 * Convertir de Producto a ProductoModel
	 * 
	 */
	public ProductoModel convertProducto2ProductoModel(Producto producto) {
		ProductoModel productoModel = new ProductoModel();
		
		productoModel.setId(producto.getId());
		productoModel.setProducto(producto.getProducto());
		productoModel.setCantidad(producto.getCantidad());
		
		return productoModel;
	}
}
