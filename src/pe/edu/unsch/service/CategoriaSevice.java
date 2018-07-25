package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.*;

public interface CategoriaSevice {
	public List<Categoria> findAll();
	public Categoria find(Integer id);
}
