package pe.edu.unsch.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.unsch.dao.*;
import pe.edu.unsch.entities.Producto;

@Service("productoService")
@Transactional
public class ProductoServiceImpl  implements ProductoService{
	@Autowired
	private  ProductoDao productDAO;
	
	@Override
	public Producto find(Integer id) {
		return  productDAO.find(id);
	}
}
