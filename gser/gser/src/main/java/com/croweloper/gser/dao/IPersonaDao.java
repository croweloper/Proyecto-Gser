package com.croweloper.gser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.croweloper.gser.model.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

	
	List<Persona> findByNombresAndApellidos(String nombres, String apellidos);
	
	@Query(value = "from Persona p where p.idPersona =:id_persona")
	List<Persona> listarPersonas(@Param("id_persona") long id);
	
	@Query(value = "SELECT id_persona, nombres, apellidos FROM tbl_persona", nativeQuery = true)
	List<Object[]> listarPersonasNativo();
	
	@Query(value = "call sp_listarpersona(?)", nativeQuery = true)
	List<Object[]> listarPersonasProcedure(Long id);
	
}
