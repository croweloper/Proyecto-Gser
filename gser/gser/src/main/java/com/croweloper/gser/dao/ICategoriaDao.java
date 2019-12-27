package com.croweloper.gser.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.croweloper.gser.model.Categoria;


public interface ICategoriaDao extends JpaRepository<Categoria, Long> {
	
	

}
