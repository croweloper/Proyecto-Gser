package com.croweloper.gser.service;

import java.util.List;

import com.croweloper.gser.model.Categoria;


public interface ICategoriaService {
	
	List<Categoria> listarCategorias();
	
	Categoria listarId(Long id);

}
