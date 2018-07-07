package pe.edu.unsch.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Categoria;

@Repository("categoriaDao")
public class CategoriaDaoImpl implements CategoriaDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Categoria> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Categoria where parentid=0").list();
	}
}
