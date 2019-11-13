package com.croweloper.gser.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croweloper.gser.model.Persona;
import com.croweloper.gser.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public ResponseEntity<List<Persona>>  listar() throws IOException
	{
		List<Persona> lista =service.listar();  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	@GetMapping(value="listar/{id}")
	public ResponseEntity<Persona>  listarID(@PathVariable("id") Long id) throws IOException
	{
		Persona _p =service.listarId(id);
		if(_p == null) {
			_p = new Persona();
			//throw new IOException("Error al obtener persona");
		}
		return new ResponseEntity<>(_p, HttpStatus.OK);
		
	}
	
	@GetMapping(value="paginar")
	public ResponseEntity<Page<Persona>> pageable(Pageable pageable){
		Page<Persona> personas;
		personas = service.listarPageable(pageable);
		return new ResponseEntity<>(personas, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="crear")
	public ResponseEntity<Persona> save(@Valid @RequestBody Persona p)
	{
		System.out.println(p.toString());
		Persona _p = service.registrar(p);
		if(_p == null)
			return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(_p, HttpStatus.CREATED);
	}
	
	@PutMapping(value="actualizar")
	public ResponseEntity<Persona> update(@Valid @RequestBody Persona p)
	{
		
		Persona _p = service.modificar(p);
		if(_p == null)
			return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(_p, HttpStatus.OK);
	}
	
	@DeleteMapping(value="eliminar/{id}")
	public boolean delete(@PathVariable("id") Long id)
	{
		
		return service.eliminar(id);
		
		
	}
	
	@GetMapping(value="buscar")
	public ResponseEntity<List<Persona>>  listar(String nombres, String apellidos) throws IOException
	{
		List<Persona> lista =service.buscar(nombres, apellidos);  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value="listarpersonas")
	public ResponseEntity<List<Persona>>  listarpersonas(Long id) throws IOException
	{
		List<Persona> lista =service.listarPersonas(id);  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value="listarpersonasnativo")
	public ResponseEntity<List<Persona>>  listarpersonasnativo() throws IOException
	{
		List<Persona> lista =service.listarPersonasNativo();  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value="listarpersonasprocedure")
	public ResponseEntity<List<Persona>>  listarpersonasprocedure(Long id) throws IOException
	{
		List<Persona> lista =service.listarPersonasProcedure(id);  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	@Autowired
	private MessageSource messageSource;

	
	@GetMapping(value="saludar")
	public String  saludar(@RequestHeader(name ="Content-Language", required = false) Locale locale) {
		return messageSource.getMessage("buenos.dias.mensaje", null, locale);
	}

	//public String  saludar(@RequestHeader(name ="Content-Language", required = false) Locale locale) {
	//public String  saludar(@RequestHeader(name ="Accept-Language", required = false) Locale locale) {
	
	
}
