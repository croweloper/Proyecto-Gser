package com.croweloper.gser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.croweloper.gser.model.Servicio;


public interface IServicioDao extends JpaRepository<Servicio, Long> {
	
	/*
	@Query(value = "call sp_UsuarioLogin(?,?)", nativeQuery = true)
	List<Object[]> LoginUsuario(String usuario,String pass);
	*/
		
	@Query(value = "call sp_ListarServiciosUsuario(?)", nativeQuery = true)
	List<Object[]> listarServicioUsuario(Long usuarioid);
	
	@Query(value = "call sp_ListarServiciosCategoria(?)", nativeQuery = true)
	List<Object[]> listarServicioCategoria(Long catid);
	
	@Query(value = "call sp_ListarServicios(?)", nativeQuery = true)
	List<Object[]> listarServicios();
	
	@Query(value = "call sp_RegistrarServicio(?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	List<Object[]> registrarServicio(Long codusu ,int catsercod ,String incluye ,String noincluye ,String servadicionales ,double preciominimo ,String foto ,String etiquetas);
	
	 

}
