package com.lastmonkey.listacompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lastmonkey.listacompra.constants.ViewConstants;

@Controller
@RequestMapping("/nuevopro")
public class NewProController {
	
	@GetMapping("/nuevo")
	public ModelAndView showProductos(){
		
		ModelAndView mav = new ModelAndView(ViewConstants.NEW_PRO);
		//mav.addObject("productos", productoService.listaTodosProductos());
		
		return mav;
	}

}
