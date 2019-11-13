package com.croweloper.gser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.croweloper.gser.dao.IPersonaDao;
import com.croweloper.gser.model.Persona;

//Ctrl + 1 --> para implementar los metodos de la interfaz
@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	public Persona registrar(Persona t) {
		System.out.println(t.toString());
		return personaDao.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		return personaDao.save(t);
	}

	@Override
	public boolean eliminar(Long id) {
		Persona _p = personaDao.findOne(id);
		if(_p != null) {
			personaDao.delete(id);
			return true;
		}
		return false;
	}

	@Override
	public Persona listarId(Long id) {
		return personaDao.findOne(id);
	}

	@Override
	public List<Persona> listar() {
		return personaDao.findAll();
	}

	@Override
	public Page<Persona> listarPageable(Pageable pageable) {
		return personaDao.findAll(pageable);
	}

	
	
	@Override
	public List<Persona> buscar(String nombres, String apellidos) {
		return personaDao.findByNombresAndApellidos(nombres, apellidos);
	}

	@Override
	public List<Persona> listarPersonas(Long id) {
		return personaDao.listarPersonas(id);
	}

	@Override
	public List<Persona> listarPersonasNativo() {
		List<Persona> personas = new ArrayList<>();
		List<Object[]> lista =   personaDao.listarPersonasNativo();
		for (Object[] obj : lista) {
			Persona p = new Persona();
			p.setIdPersona(Long.valueOf(obj[0].toString()));
			p.setNombres(obj[1].toString());
			p.setApellidos(obj[2].toString());
			personas.add(p);
		}
		return personas;
	}

	@Override
	public List<Persona> listarPersonasProcedure(Long id) {
		List<Persona> personas = new ArrayList<>();
		List<Object[]> lista =   personaDao.listarPersonasProcedure(id);
		for (Object[] obj : lista) {
			Persona p = new Persona();
			p.setIdPersona(Long.valueOf(obj[0].toString()));
			p.setNombres(obj[1].toString());
			p.setApellidos(obj[2].toString());
			personas.add(p);
		}
		return personas;
	}

	
	
}



