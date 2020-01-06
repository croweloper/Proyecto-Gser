package com.croweloper.gser.service;

import java.util.List;


import com.croweloper.gser.model.Servicio;


public interface IServicioService {
	
	Servicio registrar(Servicio t);
	
	Servicio modificar(Servicio t);

	boolean eliminar(Long id);

	Servicio listarId(Long id);
	
	List<Servicio> ListarServicios();
	
	/*
	List<Servicio> ListarServiciosCategoria(Long idCategoria);
	
	List<Servicio> ListaServiciosUsuario(Long idUsuario);
	*/
		
	Servicio registroServicio(Long codusu ,int catsercod,String titulo ,String incluye ,String noincluye ,String servadicionales ,double preciominimo ,String foto ,String etiquetas);
	//call sp_RegistrarServicio(?,?,?,?,?,?,?,?,?);
	
	List<Servicio> listarServicioXCat(Long catid);
	List<Servicio> listarServicioXUsu(Long usuid);

}
