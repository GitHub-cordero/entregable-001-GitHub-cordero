package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("categoria")
public class Producto {
	
	@RequestMapping(value="productos",method = RequestMethod.GET)
	public String productos(ModelMap modelMap) {
		modelMap.put("title", "Nuestros productos");
		modelMap.put("titulo", "Nuestros productos");
		modelMap.put("subtitulo", "Lista de categorias y productos");
		modelMap.put("url", "productos");
		return "categoria.producto";
	}
	
	
	@RequestMapping(value="detalleproducto",method = RequestMethod.GET)
	public String detalle(ModelMap modelMap) {
		modelMap.put("title", "Detalle y descripcion del producto");
		modelMap.put("titulo", "Detalle del producto");
		modelMap.put("subtitulo", "Mira los detalles de tu producto");
		modelMap.put("url", "detalleproducto");
		return "categoria.detalleproducto";
	}
}
