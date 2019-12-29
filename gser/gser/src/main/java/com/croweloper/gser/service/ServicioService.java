package com.croweloper.gser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croweloper.gser.dao.IServicioDao;
import com.croweloper.gser.dao.IUsuarioDao;
import com.croweloper.gser.model.Servicio;
import com.croweloper.gser.model.Usuario;

@Service
public class ServicioService implements IServicioService{
	
	@Autowired
	private IServicioDao servicioDAO;

	@Override
	public Servicio registrar(Usuario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servicio modificar(Usuario t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Servicio listarId(Long id) {
		// TODO Auto-generated method stub
		return servicioDAO.findOne(id);
	}

	@Override
	public List<Servicio> ListarServicios() {
		// TODO Auto-generated method stub
		return servicioDAO.findAll();
	}

	@Override
	public List<Servicio> ListarServiciosCategoria(Long idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Servicio> ListaServiciosUsuario(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servicio registroServicio(Long codusu, int catsercod,String titulo, String incluye, String noincluye,
			String servadicionales, double preciominimo, String foto, String etiquetas) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
