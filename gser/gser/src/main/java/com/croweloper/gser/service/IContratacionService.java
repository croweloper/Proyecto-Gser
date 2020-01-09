package com.croweloper.gser.service;

import java.util.List;

import com.croweloper.gser.model.Contratacion;


public interface IContratacionService {
	
	Contratacion registrar(Contratacion t);
	
	Contratacion modificar(Contratacion t);

	boolean eliminar(Long id);

	Contratacion listarId(Long id);
	
	List<Contratacion> ListarContrataciones();
	
	List<Contratacion> ListarContratacionesxUsuario(Long codusuario);
	
	List<Contratacion> ListarContratacionesxPrestador(Long codprestador);
	
	Contratacion RegistrarContratacion(Long cser_usucod ,Long cser_sercod ,Long cser_datosfac,Long cser_tarjeta);
	

}
