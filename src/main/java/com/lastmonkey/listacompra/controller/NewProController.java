package com.lastmonkey.listacompra.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lastmonkey.listacompra.constants.ViewConstants;
import com.lastmonkey.listacompra.model.ProductoModel;
import com.lastmonkey.listacompra.service.ProductoService;

@Controller
@RequestMapping("/nuevopro")
public class NewProController {

	private static final Log LOG = LogFactory.getLog(NewProController.class);
	
	@Autowired
	@Qualifier("productoServiceImpl")
	private ProductoService productoServicio;
	
	@GetMapping("/nuevo")
	public ModelAndView showProductos(Model model){
		//ProductoModel productoModel = new ProductoModel();
		ModelAndView mav = new ModelAndView(ViewConstants.NEW_PRO);
		//mav.addObject("productos", productoService.listaTodosProductos());
		model.addAttribute("productoModel", new ProductoModel());
		return mav;
	}
	
	@PostMapping("/agregarDoc")
	public String addDoc(@ModelAttribute(name="productoModel")ProductoModel productoModel, Model model){
		LOG.info("METHOD: addDoc() -- PARAMS: " + productoModel.toString());
		
		if(null != productoServicio.addProducto(productoModel)){
			model.addAttribute("result", 1);
		}else {
			model.addAttribute("result", 0);
		}
		
		
		return "redirect:/listacompraweb/listado";
		
	}

}
