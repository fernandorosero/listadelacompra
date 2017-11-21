package com.lastmonkey.listacompra.service;

import java.util.List;

import com.lastmonkey.listacompra.entity.Producto;
import com.lastmonkey.listacompra.model.ProductoModel;

public interface ProductoService {
	
	public abstract List<ProductoModel> listaTodosProductos();
	
	public abstract Producto findProductoById(int id);
	
	public abstract ProductoModel addProducto(ProductoModel productoModel);
	
	public abstract void borrarContacto(int id);
	
	public abstract ProductoModel findProductoByIdByModel(int id);
}
