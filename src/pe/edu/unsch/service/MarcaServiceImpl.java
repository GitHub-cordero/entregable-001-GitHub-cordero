package pe.edu.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.MarcaDao;
import pe.edu.unsch.entities.Marca;

@Service("marcaService")
@Transactional
public class MarcaServiceImpl implements MarcaService{
	@Autowired
	private MarcaDao marcaDao;
	
	@Override
	public List<Marca> findAll() {
		return marcaDao.findAll();
	}
}
