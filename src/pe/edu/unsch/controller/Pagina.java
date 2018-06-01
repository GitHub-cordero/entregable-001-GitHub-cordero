package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("paginas")
public class Pagina {
	
	@RequestMapping(value="sobre-nosotros",method = RequestMethod.GET)
	public String nosotros(ModelMap modelMap) {
		modelMap.put("title", "Infomacion sobre nosotros");
		modelMap.put("titulo", "Sobre nosotros");
		modelMap.put("subtitulo", "¿Quieres sabes mas de nostros?");
		modelMap.put("url", "sobre-nosotros");
		return "pagina.nosotros";
	}
	
	@RequestMapping(value="contactos",method = RequestMethod.GET)
	public String contactos(ModelMap modelMap) {
		modelMap.put("title", "Contactos");
		modelMap.put("titulo", "Contactos");
		modelMap.put("subtitulo", "Sin compromiso");
		modelMap.put("url", "contactos");
		return "pagina.contactos";
	}
}
