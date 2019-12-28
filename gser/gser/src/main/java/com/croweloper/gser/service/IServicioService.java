package com.croweloper.gser.service;

import java.util.List;


import com.croweloper.gser.model.Servicio;
import com.croweloper.gser.model.Usuario;

public interface IServicioService {
	
	Servicio registrar(Usuario t);
	
	Servicio modificar(Usuario t);

	boolean eliminar(Long id);

	Servicio listarId(Long id);
	
	List<Servicio> ListarServicios();
	
	List<Servicio> ListarServiciosCategoria(Long idCategoria);
	
	List<Servicio> ListaServiciosUsuario(Long idUsuario);
		
	Servicio registroServicio(Long codusu ,int catsercod ,String incluye ,String noincluye ,String servadicionales ,double preciominimo ,String foto ,String etiquetas);
	

}
