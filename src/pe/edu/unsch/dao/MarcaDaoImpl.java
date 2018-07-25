package pe.edu.unsch.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Marca;

@Repository("MarcaDao")
public class MarcaDaoImpl implements MarcaDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Marca> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Marca.class).list();
	}

}
