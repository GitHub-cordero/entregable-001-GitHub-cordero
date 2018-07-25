package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.edu.unsch.entities.*;
import pe.edu.unsch.service.*;


@Controller
@RequestMapping("categoria")
public class Producto {
	
	@Autowired
	private CategoriaSevice categoriaService;
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private MarcaService marcaService;
	
	@Autowired
	private ColorService colorService;
	
	@RequestMapping(value="productos/{id}",method = RequestMethod.GET)
	public String productos(@PathVariable("id") Integer id, ModelMap modelMap) {
		
		Categoria categoria = categoriaService.find(id);
		
		modelMap.put("title", "Nuestros productoss");
		modelMap.put("productos", categoria.getProductos());
		
		modelMap.put("categrias", categoriaService.findAll());
		modelMap.put("marcas", marcaService.findAll());
		modelMap.put("colores", colorService.findAll());
		//modelMap.put("titulo", "Nuestros producto0s");
		//modelMap.put("subtitulo", "Lista de categorias y productos");
		//modelMap.put("url", "productos");
		System.out.println(categoria.getProductos().size());
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
