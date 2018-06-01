package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("compra")
public class Carrito {
	
	@RequestMapping(value="carrito",method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("title", "Carrito de compras");
		modelMap.put("titulo", "Carrito de compras");
		modelMap.put("subtitulo", "Tu carrito de compras");
		modelMap.put("url", "carrito");

		return "compra.carrito";
	}
}
