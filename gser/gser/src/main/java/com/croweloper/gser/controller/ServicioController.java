package com.croweloper.gser.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.croweloper.gser.model.Servicio;
import com.croweloper.gser.service.IServicioService;


@RestController
@RequestMapping("/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService service;
	
	@GetMapping
	public ResponseEntity<List<Servicio>>  listar() throws IOException
	{
		List<Servicio> lista =service.ListarServicios();  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}	
	
	@GetMapping(value="listar/{id}")
	public ResponseEntity<Servicio>  listarID(@PathVariable("id") Long id) throws IOException
	{
		Servicio _p =service.listarId(id);
		if(_p == null) {
			_p = new Servicio();
			//throw new IOException("Error al obtener persona");
		}
		return new ResponseEntity<>(_p, HttpStatus.OK);		
	}

	/*
	@GetMapping(value="listarcategorias/{id}")
	public ResponseEntity<List<Servicio>>  listarCategoria(@PathVariable("id") Long id) throws IOException
	{
		List<Servicio> lista =service.ListarServiciosCategoria(id);  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	*/
	
	/*
	@GetMapping(value="listarusuario/{id}")
	public ResponseEntity<List<Servicio>>  listarUsuario(@PathVariable("id") Long id) throws IOException
	{
		List<Servicio> lista =service.ListaServiciosUsuario(id);  
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	*/
	
	@GetMapping(value="listarcat/{id}")
	public ResponseEntity<List<Servicio>> listarxCat(@PathVariable("id") Long id) throws IOException
	{
		List<Servicio> lista =service.listarServicioXCat(id);  
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	@GetMapping(value="listarusu/{id}")
	public ResponseEntity<List<Servicio>> listarxUsu(@PathVariable("id") Long id) throws IOException
	{
		List<Servicio> lista =service.listarServicioXUsu(id);  
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	@PostMapping(value="registrarServicio")
	public ResponseEntity<Servicio> registrarServicio(@RequestBody Servicio s) throws IOException
	{
		Servicio servi=service.registroServicio(s.getSer_codusu(),Integer.parseInt(s.getSer_catsercod().toString()), s.getSer_titulo(), s.getSer_incluye(), s.getSer_noincluye(), s.getSer_servadicionales(), s.getServ_preciominimo(), s.getSer_foto(), s.getSer_etiquetas());
		
		if(servi == null) {
			servi = new Servicio();			
		}
						
		return new ResponseEntity<>(servi, HttpStatus.OK);
		
	}
	
	
}
