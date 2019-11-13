package com.croweloper.gser.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.croweloper.gser.model.Persona;
public interface IPersonaService {

	Persona registrar(Persona t);
	
	Persona modificar(Persona t);

	boolean eliminar(Long id);

	Persona listarId(Long id);

	List<Persona> listar();
	
	Page<Persona> listarPageable(Pageable pageable);
	
	List<Persona> buscar(String nombres, String apellidos);
	
	List<Persona> listarPersonas(Long id);
	
	List<Persona> listarPersonasNativo();
	
	List<Persona> listarPersonasProcedure(Long id);
	
}