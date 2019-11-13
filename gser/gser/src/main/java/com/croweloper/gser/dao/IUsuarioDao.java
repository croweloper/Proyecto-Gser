 package com.croweloper.gser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.croweloper.gser.model.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
	
	@Query(value = "call sp_UsuarioLogin(?,?)", nativeQuery = true)
	List<Object[]> LoginUsuario(String usuario,String pass);
	
	@Query(value = "call sp_listarUsuario(?)", nativeQuery = true)
	List<Object[]> listarUsuario(Long id);
	
	

}
