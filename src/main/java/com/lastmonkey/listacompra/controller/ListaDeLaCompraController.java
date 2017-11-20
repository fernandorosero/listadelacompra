package com.lastmonkey.listacompra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lastmonkey.listacompra.service.ProductoService;

@Controller
@RequestMapping("/listacompraweb")
public class ListaDeLaCompraController {

	@Autowired
	@Qualifier("productoServiceImpl")
	private ProductoService productoService;
	
	@GetMapping("/listado")
	public ModelAndView showProductos(){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("productos", productoService.listaTodosProductos());
		
		return mav;
	}
}
