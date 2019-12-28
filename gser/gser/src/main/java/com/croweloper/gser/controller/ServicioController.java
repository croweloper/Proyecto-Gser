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

import com.croweloper.gser.model.Persona;
import com.croweloper.gser.model.Servicio;
import com.croweloper.gser.model.Usuario;
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

}
