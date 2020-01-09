package com.croweloper.gser.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croweloper.gser.model.Contratacion;
import com.croweloper.gser.model.Servicio;
import com.croweloper.gser.service.IContratacionService;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


@RestController
@RequestMapping("/contratacion")
public class ContratacionController {
	
	@Autowired
	private IContratacionService service;
	
	@GetMapping
	public ResponseEntity<List<Contratacion>>  listar() throws IOException
	{
		List<Contratacion> lista =service.ListarContrataciones();  //null;
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	
	@GetMapping(value="listarusuario/{id}")
	public ResponseEntity<List<Contratacion>> listarxUsuario(@PathVariable("id") Long id) throws IOException
	{
		List<Contratacion> lista =service.ListarContratacionesxUsuario(id);  
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	@GetMapping(value="listarproveedor/{id}")
	public ResponseEntity<List<Contratacion>> listarxProveedor(@PathVariable("id") Long id) throws IOException
	{
		List<Contratacion> lista =service.ListarContratacionesxPrestador(id);  
		if(lista == null) {
			lista = new ArrayList<>();
			//throw new IOException("Error al listar");
		}
		return new ResponseEntity<>(lista, HttpStatus.OK);
		
	}
	
	
	@PostMapping(value="registrarServicio")
	public ResponseEntity<Contratacion> registrarServicio(@RequestBody Contratacion s) throws IOException
	{
		Contratacion servi=service.RegistrarContratacion(s.getCser_usucod(),s.getCser_sercod(),	s.getCser_datosfac(),s.getCser_tarjeta()); 
		
		if(servi == null) {
			servi = new Contratacion();			
		}
						
		return new ResponseEntity<>(servi, HttpStatus.OK);
		
	}
	

}
