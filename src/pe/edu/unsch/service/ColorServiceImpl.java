package pe.edu.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.ColorDao;
import pe.edu.unsch.entities.Color;

@Service("colorService")
@Transactional
public class ColorServiceImpl implements ColorService {
	@Autowired
	private ColorDao colorDao;

	@Override
	public List<Color> findAll() {
		return colorDao.findAll();
	}
}
