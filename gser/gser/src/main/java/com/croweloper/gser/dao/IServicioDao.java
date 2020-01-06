package com.croweloper.gser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.croweloper.gser.model.Servicio;


public interface IServicioDao extends JpaRepository<Servicio, Long> {
	
	
	//List<Servicio> listarServicioXCat(Long catid);
		
	
	@Query(value = "call sp_RegistrarServicio(?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	List<Object[]> registrarServicio(Long codusu ,int catsercod ,String titulo,String incluye ,String noincluye ,String servadicionales ,double preciominimo ,String foto ,String etiquetas);
	


	/*@Query(value = "call sp_ListarServiciosUsuario(?)", nativeQuery = true)
	List<Object[]> listarServicioUsuario(Long usuarioid);
	
	@Query(value = "call sp_ListarServiciosCategoria(?)", nativeQuery = true)
	List<Object[]> listarServicioCategoria(Long catid);
	
	@Query(value = "call sp_ListarServicios(?)", nativeQuery = true)
	List<Object[]> listarServicios();*/
	 

}
