package com.lastmonkey.listacompra.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lastmonkey.listacompra.component.ProductoConverter;
import com.lastmonkey.listacompra.entity.Producto;
import com.lastmonkey.listacompra.model.ProductoModel;
import com.lastmonkey.listacompra.repository.ProductoRepository;
import com.lastmonkey.listacompra.service.ProductoService;

@Service("productoServiceImpl")
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepository productoRepository;
	
	@Autowired
	@Qualifier("productoConverter")
	private ProductoConverter productoConverter;
	
	@Override
	public List<ProductoModel> listaTodosProductos() {
		// TODO Auto-generated method stub
		List<Producto> productos =  productoRepository.findAll();
		List<ProductoModel> productosModel = new ArrayList<ProductoModel>();
		for (Producto producto : productos){
			productosModel.add(productoConverter.convertProducto2ProductoModel(producto));
		}
		return productosModel;
	}

	
}
