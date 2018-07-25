package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.*;;

public interface CategoriaDao {
	public List<Categoria> findAll();
	public Categoria find(Integer id);
}
