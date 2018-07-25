package pe.edu.unsch.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Color;

@Repository("colorDao")
public class ColorDaoImpl implements ColorDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Color> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Color.class).list();
	}
	
	
}
