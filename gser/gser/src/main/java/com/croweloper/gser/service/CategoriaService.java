package com.croweloper.gser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croweloper.gser.dao.ICategoriaDao;
import com.croweloper.gser.model.Categoria;

@Service
public class CategoriaService implements ICategoriaService {
	
	@Autowired
	private ICategoriaDao catDAO;

	@Override
	public List<Categoria> listarCategorias() {
		// TODO Auto-generated method stub
		return catDAO.findAll();
	}

	@Override
	public Categoria listarId(Long id) {
		// TODO Auto-generated method stub
		return catDAO.findOne(id);
	}

}
