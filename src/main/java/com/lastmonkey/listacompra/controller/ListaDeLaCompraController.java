package com.lastmonkey.listacompra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listacompraweb")
public class ListaDeLaCompraController {

	
	@GetMapping("/listadodoc")
	public String helloWorld(){
		
		return "listado";
	}
}
