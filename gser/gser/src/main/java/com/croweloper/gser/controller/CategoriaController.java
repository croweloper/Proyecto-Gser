package com.croweloper.gser.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croweloper.gser.model.Categoria;
import com.croweloper.gser.service.ICategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private ICategoriaService service;
	
	
	@GetMapping
	public ResponseEntity<List<Categoria>>  listar() throws IOException
	{
		List<Categoria> lista =service.listarCategorias();  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	@GetMapping(value="listar/{id}")
	public ResponseEntity<Categoria>  listarID(@PathVariable("id") Long id) throws IOException
	{
		Categoria _p =service.listarId(id);
		if(_p == null) {
			_p = new Categoria();
			//throw new IOException("Error al obtener categoria");
		}
		return new ResponseEntity<>(_p, HttpStatus.OK);		
	}
	
	

}
