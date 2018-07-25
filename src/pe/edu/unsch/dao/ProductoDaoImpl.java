package pe.edu.unsch.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Producto;



@Repository("productoDao")
public class ProductoDaoImpl implements ProductoDao{

	@Autowired
	private  SessionFactory  sessionFactory;

	@Override
	public Producto find(Integer id) {
		return  (Producto) sessionFactory.getCurrentSession().get(Producto.class, id);
	}
}
